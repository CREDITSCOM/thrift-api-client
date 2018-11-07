/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.general.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Variant extends org.apache.thrift.TUnion<Variant, Variant._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Variant");
  private static final org.apache.thrift.protocol.TField V_BOOL_FIELD_DESC = new org.apache.thrift.protocol.TField("v_bool", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField V_I8_FIELD_DESC = new org.apache.thrift.protocol.TField("v_i8", org.apache.thrift.protocol.TType.BYTE, (short)2);
  private static final org.apache.thrift.protocol.TField V_I16_FIELD_DESC = new org.apache.thrift.protocol.TField("v_i16", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField V_I32_FIELD_DESC = new org.apache.thrift.protocol.TField("v_i32", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField V_I64_FIELD_DESC = new org.apache.thrift.protocol.TField("v_i64", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField V_DOUBLE_FIELD_DESC = new org.apache.thrift.protocol.TField("v_double", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField V_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("v_string", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField V_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("v_list", org.apache.thrift.protocol.TType.LIST, (short)8);
  private static final org.apache.thrift.protocol.TField V_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("v_set", org.apache.thrift.protocol.TType.SET, (short)9);
  private static final org.apache.thrift.protocol.TField V_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("v_map", org.apache.thrift.protocol.TType.MAP, (short)10);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    V_BOOL((short)1, "v_bool"),
    V_I8((short)2, "v_i8"),
    V_I16((short)3, "v_i16"),
    V_I32((short)4, "v_i32"),
    V_I64((short)5, "v_i64"),
    V_DOUBLE((short)6, "v_double"),
    V_STRING((short)7, "v_string"),
    V_LIST((short)8, "v_list"),
    V_SET((short)9, "v_set"),
    V_MAP((short)10, "v_map");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // V_BOOL
          return V_BOOL;
        case 2: // V_I8
          return V_I8;
        case 3: // V_I16
          return V_I16;
        case 4: // V_I32
          return V_I32;
        case 5: // V_I64
          return V_I64;
        case 6: // V_DOUBLE
          return V_DOUBLE;
        case 7: // V_STRING
          return V_STRING;
        case 8: // V_LIST
          return V_LIST;
        case 9: // V_SET
          return V_SET;
        case 10: // V_MAP
          return V_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.V_BOOL, new org.apache.thrift.meta_data.FieldMetaData("v_bool", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.V_I8, new org.apache.thrift.meta_data.FieldMetaData("v_i8", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.V_I16, new org.apache.thrift.meta_data.FieldMetaData("v_i16", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.V_I32, new org.apache.thrift.meta_data.FieldMetaData("v_i32", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.V_I64, new org.apache.thrift.meta_data.FieldMetaData("v_i64", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.V_DOUBLE, new org.apache.thrift.meta_data.FieldMetaData("v_double", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.V_STRING, new org.apache.thrift.meta_data.FieldMetaData("v_string", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.V_LIST, new org.apache.thrift.meta_data.FieldMetaData("v_list", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Variant"))));
    tmpMap.put(_Fields.V_SET, new org.apache.thrift.meta_data.FieldMetaData("v_set", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Variant"))));
    tmpMap.put(_Fields.V_MAP, new org.apache.thrift.meta_data.FieldMetaData("v_map", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Variant"), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "Variant"))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Variant.class, metaDataMap);
  }

  public Variant() {
    super();
  }

  public Variant(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public Variant(Variant other) {
    super(other);
  }
  public Variant deepCopy() {
    return new Variant(this);
  }

  public static Variant v_bool(boolean value) {
    Variant x = new Variant();
    x.setV_bool(value);
    return x;
  }

  public static Variant v_i8(byte value) {
    Variant x = new Variant();
    x.setV_i8(value);
    return x;
  }

  public static Variant v_i16(short value) {
    Variant x = new Variant();
    x.setV_i16(value);
    return x;
  }

  public static Variant v_i32(int value) {
    Variant x = new Variant();
    x.setV_i32(value);
    return x;
  }

  public static Variant v_i64(long value) {
    Variant x = new Variant();
    x.setV_i64(value);
    return x;
  }

  public static Variant v_double(double value) {
    Variant x = new Variant();
    x.setV_double(value);
    return x;
  }

  public static Variant v_string(java.lang.String value) {
    Variant x = new Variant();
    x.setV_string(value);
    return x;
  }

  public static Variant v_list(java.util.List<Variant> value) {
    Variant x = new Variant();
    x.setV_list(value);
    return x;
  }

  public static Variant v_set(java.util.Set<Variant> value) {
    Variant x = new Variant();
    x.setV_set(value);
    return x;
  }

  public static Variant v_map(java.util.Map<Variant,Variant> value) {
    Variant x = new Variant();
    x.setV_map(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case V_BOOL:
        if (value instanceof java.lang.Boolean) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Boolean for field 'v_bool', but got " + value.getClass().getSimpleName());
      case V_I8:
        if (value instanceof java.lang.Byte) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Byte for field 'v_i8', but got " + value.getClass().getSimpleName());
      case V_I16:
        if (value instanceof java.lang.Short) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Short for field 'v_i16', but got " + value.getClass().getSimpleName());
      case V_I32:
        if (value instanceof java.lang.Integer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Integer for field 'v_i32', but got " + value.getClass().getSimpleName());
      case V_I64:
        if (value instanceof java.lang.Long) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Long for field 'v_i64', but got " + value.getClass().getSimpleName());
      case V_DOUBLE:
        if (value instanceof java.lang.Double) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.Double for field 'v_double', but got " + value.getClass().getSimpleName());
      case V_STRING:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'v_string', but got " + value.getClass().getSimpleName());
      case V_LIST:
        if (value instanceof java.util.List) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.util.List<Variant> for field 'v_list', but got " + value.getClass().getSimpleName());
      case V_SET:
        if (value instanceof java.util.Set) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.util.Set<Variant> for field 'v_set', but got " + value.getClass().getSimpleName());
      case V_MAP:
        if (value instanceof java.util.Map) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.util.Map<Variant,Variant> for field 'v_map', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case V_BOOL:
          if (field.type == V_BOOL_FIELD_DESC.type) {
            java.lang.Boolean v_bool;
            v_bool = iprot.readBool();
            return v_bool;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_I8:
          if (field.type == V_I8_FIELD_DESC.type) {
            java.lang.Byte v_i8;
            v_i8 = iprot.readByte();
            return v_i8;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_I16:
          if (field.type == V_I16_FIELD_DESC.type) {
            java.lang.Short v_i16;
            v_i16 = iprot.readI16();
            return v_i16;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_I32:
          if (field.type == V_I32_FIELD_DESC.type) {
            java.lang.Integer v_i32;
            v_i32 = iprot.readI32();
            return v_i32;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_I64:
          if (field.type == V_I64_FIELD_DESC.type) {
            java.lang.Long v_i64;
            v_i64 = iprot.readI64();
            return v_i64;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_DOUBLE:
          if (field.type == V_DOUBLE_FIELD_DESC.type) {
            java.lang.Double v_double;
            v_double = iprot.readDouble();
            return v_double;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_STRING:
          if (field.type == V_STRING_FIELD_DESC.type) {
            java.lang.String v_string;
            v_string = iprot.readString();
            return v_string;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_LIST:
          if (field.type == V_LIST_FIELD_DESC.type) {
            java.util.List<Variant> v_list;
            {
              org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
              v_list = new java.util.ArrayList<Variant>(_list0.size);
              Variant _elem1;
              for (int _i2 = 0; _i2 < _list0.size; ++_i2)
              {
                _elem1 = new Variant();
                _elem1.read(iprot);
                v_list.add(_elem1);
              }
              iprot.readListEnd();
            }
            return v_list;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_SET:
          if (field.type == V_SET_FIELD_DESC.type) {
            java.util.Set<Variant> v_set;
            {
              org.apache.thrift.protocol.TSet _set3 = iprot.readSetBegin();
              v_set = new java.util.HashSet<Variant>(2*_set3.size);
              Variant _elem4;
              for (int _i5 = 0; _i5 < _set3.size; ++_i5)
              {
                _elem4 = new Variant();
                _elem4.read(iprot);
                v_set.add(_elem4);
              }
              iprot.readSetEnd();
            }
            return v_set;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_MAP:
          if (field.type == V_MAP_FIELD_DESC.type) {
            java.util.Map<Variant,Variant> v_map;
            {
              org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin();
              v_map = new java.util.HashMap<Variant,Variant>(2*_map6.size);
              Variant _key7;
              Variant _val8;
              for (int _i9 = 0; _i9 < _map6.size; ++_i9)
              {
                _key7 = new Variant();
                _key7.read(iprot);
                _val8 = new Variant();
                _val8.read(iprot);
                v_map.put(_key7, _val8);
              }
              iprot.readMapEnd();
            }
            return v_map;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case V_BOOL:
        java.lang.Boolean v_bool = (java.lang.Boolean)value_;
        oprot.writeBool(v_bool);
        return;
      case V_I8:
        java.lang.Byte v_i8 = (java.lang.Byte)value_;
        oprot.writeByte(v_i8);
        return;
      case V_I16:
        java.lang.Short v_i16 = (java.lang.Short)value_;
        oprot.writeI16(v_i16);
        return;
      case V_I32:
        java.lang.Integer v_i32 = (java.lang.Integer)value_;
        oprot.writeI32(v_i32);
        return;
      case V_I64:
        java.lang.Long v_i64 = (java.lang.Long)value_;
        oprot.writeI64(v_i64);
        return;
      case V_DOUBLE:
        java.lang.Double v_double = (java.lang.Double)value_;
        oprot.writeDouble(v_double);
        return;
      case V_STRING:
        java.lang.String v_string = (java.lang.String)value_;
        oprot.writeString(v_string);
        return;
      case V_LIST:
        java.util.List<Variant> v_list = (java.util.List<Variant>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, v_list.size()));
          for (Variant _iter10 : v_list)
          {
            _iter10.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case V_SET:
        java.util.Set<Variant> v_set = (java.util.Set<Variant>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, v_set.size()));
          for (Variant _iter11 : v_set)
          {
            _iter11.write(oprot);
          }
          oprot.writeSetEnd();
        }
        return;
      case V_MAP:
        java.util.Map<Variant,Variant> v_map = (java.util.Map<Variant,Variant>)value_;
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRUCT, v_map.size()));
          for (java.util.Map.Entry<Variant, Variant> _iter12 : v_map.entrySet())
          {
            _iter12.getKey().write(oprot);
            _iter12.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case V_BOOL:
          java.lang.Boolean v_bool;
          v_bool = iprot.readBool();
          return v_bool;
        case V_I8:
          java.lang.Byte v_i8;
          v_i8 = iprot.readByte();
          return v_i8;
        case V_I16:
          java.lang.Short v_i16;
          v_i16 = iprot.readI16();
          return v_i16;
        case V_I32:
          java.lang.Integer v_i32;
          v_i32 = iprot.readI32();
          return v_i32;
        case V_I64:
          java.lang.Long v_i64;
          v_i64 = iprot.readI64();
          return v_i64;
        case V_DOUBLE:
          java.lang.Double v_double;
          v_double = iprot.readDouble();
          return v_double;
        case V_STRING:
          java.lang.String v_string;
          v_string = iprot.readString();
          return v_string;
        case V_LIST:
          java.util.List<Variant> v_list;
          {
            org.apache.thrift.protocol.TList _list13 = iprot.readListBegin();
            v_list = new java.util.ArrayList<Variant>(_list13.size);
            Variant _elem14;
            for (int _i15 = 0; _i15 < _list13.size; ++_i15)
            {
              _elem14 = new Variant();
              _elem14.read(iprot);
              v_list.add(_elem14);
            }
            iprot.readListEnd();
          }
          return v_list;
        case V_SET:
          java.util.Set<Variant> v_set;
          {
            org.apache.thrift.protocol.TSet _set16 = iprot.readSetBegin();
            v_set = new java.util.HashSet<Variant>(2*_set16.size);
            Variant _elem17;
            for (int _i18 = 0; _i18 < _set16.size; ++_i18)
            {
              _elem17 = new Variant();
              _elem17.read(iprot);
              v_set.add(_elem17);
            }
            iprot.readSetEnd();
          }
          return v_set;
        case V_MAP:
          java.util.Map<Variant,Variant> v_map;
          {
            org.apache.thrift.protocol.TMap _map19 = iprot.readMapBegin();
            v_map = new java.util.HashMap<Variant,Variant>(2*_map19.size);
            Variant _key20;
            Variant _val21;
            for (int _i22 = 0; _i22 < _map19.size; ++_i22)
            {
              _key20 = new Variant();
              _key20.read(iprot);
              _val21 = new Variant();
              _val21.read(iprot);
              v_map.put(_key20, _val21);
            }
            iprot.readMapEnd();
          }
          return v_map;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case V_BOOL:
        java.lang.Boolean v_bool = (java.lang.Boolean)value_;
        oprot.writeBool(v_bool);
        return;
      case V_I8:
        java.lang.Byte v_i8 = (java.lang.Byte)value_;
        oprot.writeByte(v_i8);
        return;
      case V_I16:
        java.lang.Short v_i16 = (java.lang.Short)value_;
        oprot.writeI16(v_i16);
        return;
      case V_I32:
        java.lang.Integer v_i32 = (java.lang.Integer)value_;
        oprot.writeI32(v_i32);
        return;
      case V_I64:
        java.lang.Long v_i64 = (java.lang.Long)value_;
        oprot.writeI64(v_i64);
        return;
      case V_DOUBLE:
        java.lang.Double v_double = (java.lang.Double)value_;
        oprot.writeDouble(v_double);
        return;
      case V_STRING:
        java.lang.String v_string = (java.lang.String)value_;
        oprot.writeString(v_string);
        return;
      case V_LIST:
        java.util.List<Variant> v_list = (java.util.List<Variant>)value_;
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, v_list.size()));
          for (Variant _iter23 : v_list)
          {
            _iter23.write(oprot);
          }
          oprot.writeListEnd();
        }
        return;
      case V_SET:
        java.util.Set<Variant> v_set = (java.util.Set<Variant>)value_;
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, v_set.size()));
          for (Variant _iter24 : v_set)
          {
            _iter24.write(oprot);
          }
          oprot.writeSetEnd();
        }
        return;
      case V_MAP:
        java.util.Map<Variant,Variant> v_map = (java.util.Map<Variant,Variant>)value_;
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRUCT, v_map.size()));
          for (java.util.Map.Entry<Variant, Variant> _iter25 : v_map.entrySet())
          {
            _iter25.getKey().write(oprot);
            _iter25.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case V_BOOL:
        return V_BOOL_FIELD_DESC;
      case V_I8:
        return V_I8_FIELD_DESC;
      case V_I16:
        return V_I16_FIELD_DESC;
      case V_I32:
        return V_I32_FIELD_DESC;
      case V_I64:
        return V_I64_FIELD_DESC;
      case V_DOUBLE:
        return V_DOUBLE_FIELD_DESC;
      case V_STRING:
        return V_STRING_FIELD_DESC;
      case V_LIST:
        return V_LIST_FIELD_DESC;
      case V_SET:
        return V_SET_FIELD_DESC;
      case V_MAP:
        return V_MAP_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public boolean getV_bool() {
    if (getSetField() == _Fields.V_BOOL) {
      return (java.lang.Boolean)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_bool' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_bool(boolean value) {
    setField_ = _Fields.V_BOOL;
    value_ = value;
  }

  public byte getV_i8() {
    if (getSetField() == _Fields.V_I8) {
      return (java.lang.Byte)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_i8' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_i8(byte value) {
    setField_ = _Fields.V_I8;
    value_ = value;
  }

  public short getV_i16() {
    if (getSetField() == _Fields.V_I16) {
      return (java.lang.Short)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_i16' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_i16(short value) {
    setField_ = _Fields.V_I16;
    value_ = value;
  }

  public int getV_i32() {
    if (getSetField() == _Fields.V_I32) {
      return (java.lang.Integer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_i32' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_i32(int value) {
    setField_ = _Fields.V_I32;
    value_ = value;
  }

  public long getV_i64() {
    if (getSetField() == _Fields.V_I64) {
      return (java.lang.Long)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_i64' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_i64(long value) {
    setField_ = _Fields.V_I64;
    value_ = value;
  }

  public double getV_double() {
    if (getSetField() == _Fields.V_DOUBLE) {
      return (java.lang.Double)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_double' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_double(double value) {
    setField_ = _Fields.V_DOUBLE;
    value_ = value;
  }

  public java.lang.String getV_string() {
    if (getSetField() == _Fields.V_STRING) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_string' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_string(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_STRING;
    value_ = value;
  }

  public java.util.List<Variant> getV_list() {
    if (getSetField() == _Fields.V_LIST) {
      return (java.util.List<Variant>)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_list' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_list(java.util.List<Variant> value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_LIST;
    value_ = value;
  }

  public java.util.Set<Variant> getV_set() {
    if (getSetField() == _Fields.V_SET) {
      return (java.util.Set<Variant>)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_set' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_set(java.util.Set<Variant> value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_SET;
    value_ = value;
  }

  public java.util.Map<Variant,Variant> getV_map() {
    if (getSetField() == _Fields.V_MAP) {
      return (java.util.Map<Variant,Variant>)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot getObject field 'v_map' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_map(java.util.Map<Variant,Variant> value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_MAP;
    value_ = value;
  }

  public boolean isSetV_bool() {
    return setField_ == _Fields.V_BOOL;
  }


  public boolean isSetV_i8() {
    return setField_ == _Fields.V_I8;
  }


  public boolean isSetV_i16() {
    return setField_ == _Fields.V_I16;
  }


  public boolean isSetV_i32() {
    return setField_ == _Fields.V_I32;
  }


  public boolean isSetV_i64() {
    return setField_ == _Fields.V_I64;
  }


  public boolean isSetV_double() {
    return setField_ == _Fields.V_DOUBLE;
  }


  public boolean isSetV_string() {
    return setField_ == _Fields.V_STRING;
  }


  public boolean isSetV_list() {
    return setField_ == _Fields.V_LIST;
  }


  public boolean isSetV_set() {
    return setField_ == _Fields.V_SET;
  }


  public boolean isSetV_map() {
    return setField_ == _Fields.V_MAP;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof Variant) {
      return equals((Variant)other);
    } else {
      return false;
    }
  }

  public boolean equals(Variant other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Variant other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
