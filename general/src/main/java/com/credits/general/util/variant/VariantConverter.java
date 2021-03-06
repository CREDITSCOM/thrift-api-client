package com.credits.general.util.variant;

import com.credits.general.pojo.Amount;
import com.credits.general.pojo.AmountData;
import com.credits.general.thrift.generated.Variant;
import com.credits.general.thrift.generated.object;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static com.credits.general.serialize.Serializer.deserialize;
import static com.credits.general.serialize.Serializer.serialize;
import static com.credits.general.thrift.generated.Variant._Fields.*;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class VariantConverter {
    public static final Byte NULL_TYPE_VALUE = 0;
    public static final Byte VOID_TYPE_VALUE = 0;

    public static Variant toVariant(String classType, Object object) {
        return new ObjectToVariantConverter().apply(requireNonNull(classType, "classType can't be null"), object);
    }

    public static Object toObject(Variant variant, ClassLoader... classLoader) {
        return new VariantToObjectConverter().apply(requireNonNull(variant, "variant can't be null"), classLoader);
    }

    private static class ObjectToVariantConverter implements BiFunction<String, Object, Variant> {

        @Override
        public Variant apply(String classType, Object object) {
            return map(classType, object);
        }

        @SuppressWarnings("unchecked")
        private Variant map(String classType, Object object) {
            Variant variant;
            if (object == null) {
                return classType.equals(Void.TYPE.getTypeName())
                        ? new Variant(V_VOID, VOID_TYPE_VALUE)
                        : new Variant(V_NULL, classType);
            } else if (object.getClass().isArray()) {
                variant = mapArray(classType, object);
            } else if (object instanceof List) {
                List<Variant> variantCollection =
                        ((List<Object>) object).stream().map(this::map).collect(Collectors.toList());
                variant = new Variant(V_LIST, variantCollection);
            } else if (object instanceof Set) {
                Set<Variant> variantCollection =
                        ((Set<Object>) object).stream().map(this::map).collect(Collectors.toSet());
                variant = new Variant(V_SET, variantCollection);
            } else if (object instanceof Map) {
                Map<Variant, Variant> variantMap = ((Map<Object, Object>) object).entrySet()
                        .stream()
                        .collect(Collectors.toMap(entry -> map(entry.getKey()), entry -> map(entry.getValue())));
                variant = new Variant(V_MAP, variantMap);
            } else {
                variant = mapObject(classType, object);
            }
            return variant;
        }

        private Variant map(Object object) {
            return map("", object);
        }

        private Variant mapObject(String classType, Object object) {
            if (object == Void.TYPE) {
                return new Variant(V_VOID, VOID_TYPE_VALUE);
            } else if (object instanceof Boolean) {
                return new Variant(classType.equals("boolean") ? V_BOOLEAN : V_BOOLEAN_BOX, object);
            } else if (object instanceof Byte) {
                return new Variant(classType.equals("byte") ? V_BYTE : V_BYTE_BOX, object);
            } else if (object instanceof Short) {
                return new Variant(classType.equals("short") ? V_SHORT : V_SHORT_BOX, object);
            } else if (object instanceof Integer) {
                return new Variant(classType.equals("int") ? V_INT : V_INT_BOX, object);
            } else if (object instanceof Long) {
                return new Variant(classType.equals("long") ? V_LONG : V_LONG_BOX, object);
            } else if (object instanceof Float) {
                return new Variant(classType.equals("float") ? V_FLOAT : V_FLOAT_BOX, (double) (float) object);
            } else if (object instanceof Double) {
                return new Variant(classType.equals("double") ? V_DOUBLE : V_DOUBLE_BOX, object);
            } else if (object instanceof String) {
                return new Variant(V_STRING, object);
            } else if (object instanceof Amount) {
                final var amount = (Amount) object;
                return new Variant(V_AMOUNT, new com.credits.general.thrift.generated.Amount(amount.getIntegral(), amount.getFractional()));
            } else if (object instanceof BigDecimal) {
                return new Variant(V_BIG_DECIMAL, ((BigDecimal) object).toPlainString());
            } else {
                return new Variant(V_OBJECT, new object(classType, ByteBuffer.wrap(serialize(object))));
            }
        }

        private Variant mapArray(String classType, Object object) {
            List<Variant> variantCollection = new ArrayList<>();
            if (object instanceof Object[]) {
                variantCollection = Arrays.stream((Object[]) object)
                        .map(obj -> map(classType != null ? object.getClass().getTypeName().replace("[]", "") : "", obj))
                        .collect(Collectors.toList());
            } else if (object instanceof int[]) {
                for (int i : (int[]) object) {
                    variantCollection.add(new Variant(V_INT, i));
                }
            } else if (object instanceof long[]) {
                for (long i : (long[]) object) {
                    variantCollection.add(new Variant(V_LONG, i));
                }
            } else if (object instanceof short[]) {
                for (short s : (short[]) object) {
                    variantCollection.add(new Variant(V_SHORT, s));
                }
            } else if (object instanceof float[]) {
                for (float f : (float[]) object) {
                    variantCollection.add(new Variant(V_FLOAT, f));
                }
            } else if (object instanceof double[]) {
                for (double d : (double[]) object) {
                    variantCollection.add(new Variant(V_DOUBLE, d));
                }
            } else if (object instanceof byte[]) {
                return new Variant(V_BYTE_ARRAY, ByteBuffer.wrap((byte[]) object));
            }
            return new Variant(V_ARRAY, variantCollection);
        }

    }

    private static class VariantToObjectConverter implements BiFunction<Variant, ClassLoader[], Object> {

        @Override
        public Object apply(Variant variant, ClassLoader... classLoader) {
            return map(variant, classLoader);
        }

        @SuppressWarnings("unchecked")
        private Object map(Variant variant, ClassLoader... classLoader) {
            switch (variant.getSetField()) {
                case V_NULL:
                    return null;
                case V_VOID:
                    return Void.TYPE;
                case V_FLOAT:
                case V_FLOAT_BOX:
                    return (float) (double) variant.getFieldValue();
                case V_BYTE_ARRAY:
                    return variant.getV_byte_array();
                case V_ARRAY:
                    return ((Collection<Variant>) variant.getFieldValue()).stream().map(this::map).toArray(Object[]::new);
                case V_LIST:
                    return ((Collection<Variant>) variant.getFieldValue()).stream().map(this::map).collect(toList());
                case V_SET:
                    return ((Collection<Variant>) variant.getFieldValue()).stream().map(this::map).collect(toSet());
                case V_MAP:
                    Map<Object, Object> objectMap = new HashMap<>();
                    for (Map.Entry<Variant, Variant> entry : ((Map<Variant, Variant>) variant.getFieldValue()).entrySet()) {
                        objectMap.put(map(entry.getKey()), map(entry.getValue()));
                    }
                    return objectMap;
                case V_BIG_DECIMAL:
                    return new BigDecimal(variant.getV_big_decimal());
                case V_AMOUNT:
                    return new AmountData(variant.getV_amount().getIntegral(), variant.getV_amount().getFraction());
                case V_OBJECT:
                    return deserialize(variant.getV_object().instance.array(), classLoader.length > 0 ? classLoader[0] : getClass().getClassLoader());
                default:
                    return variant.getFieldValue();
            }
        }

    }
}
