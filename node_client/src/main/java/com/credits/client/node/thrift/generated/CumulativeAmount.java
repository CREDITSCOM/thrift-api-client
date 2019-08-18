/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-18")
public class CumulativeAmount implements org.apache.thrift.TBase<CumulativeAmount, CumulativeAmount._Fields>, java.io.Serializable, Cloneable, Comparable<CumulativeAmount> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CumulativeAmount");

  private static final org.apache.thrift.protocol.TField INTEGRAL_FIELD_DESC = new org.apache.thrift.protocol.TField("integral", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField FRACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("fraction", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CumulativeAmountStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CumulativeAmountTupleSchemeFactory();

  public long integral; // required
  public long fraction; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTEGRAL((short)1, "integral"),
    FRACTION((short)2, "fraction");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INTEGRAL
          return INTEGRAL;
        case 2: // FRACTION
          return FRACTION;
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
    @org.apache.thrift.annotation.Nullable
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

  // isset id assignments
  private static final int __INTEGRAL_ISSET_ID = 0;
  private static final int __FRACTION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTEGRAL, new org.apache.thrift.meta_data.FieldMetaData("integral", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.FRACTION, new org.apache.thrift.meta_data.FieldMetaData("fraction", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CumulativeAmount.class, metaDataMap);
  }

  public CumulativeAmount() {
    this.integral = 0L;

    this.fraction = 0L;

  }

  public CumulativeAmount(
    long integral,
    long fraction)
  {
    this();
    this.integral = integral;
    setIntegralIsSet(true);
    this.fraction = fraction;
    setFractionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CumulativeAmount(CumulativeAmount other) {
    __isset_bitfield = other.__isset_bitfield;
    this.integral = other.integral;
    this.fraction = other.fraction;
  }

  public CumulativeAmount deepCopy() {
    return new CumulativeAmount(this);
  }

  @Override
  public void clear() {
    this.integral = 0L;

    this.fraction = 0L;

  }

  public long getIntegral() {
    return this.integral;
  }

  public CumulativeAmount setIntegral(long integral) {
    this.integral = integral;
    setIntegralIsSet(true);
    return this;
  }

  public void unsetIntegral() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __INTEGRAL_ISSET_ID);
  }

  /** Returns true if field integral is set (has been assigned a value) and false otherwise */
  public boolean isSetIntegral() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __INTEGRAL_ISSET_ID);
  }

  public void setIntegralIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __INTEGRAL_ISSET_ID, value);
  }

  public long getFraction() {
    return this.fraction;
  }

  public CumulativeAmount setFraction(long fraction) {
    this.fraction = fraction;
    setFractionIsSet(true);
    return this;
  }

  public void unsetFraction() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FRACTION_ISSET_ID);
  }

  /** Returns true if field fraction is set (has been assigned a value) and false otherwise */
  public boolean isSetFraction() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FRACTION_ISSET_ID);
  }

  public void setFractionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FRACTION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case INTEGRAL:
      if (value == null) {
        unsetIntegral();
      } else {
        setIntegral((java.lang.Long)value);
      }
      break;

    case FRACTION:
      if (value == null) {
        unsetFraction();
      } else {
        setFraction((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INTEGRAL:
      return getIntegral();

    case FRACTION:
      return getFraction();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INTEGRAL:
      return isSetIntegral();
    case FRACTION:
      return isSetFraction();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CumulativeAmount)
      return this.equals((CumulativeAmount)that);
    return false;
  }

  public boolean equals(CumulativeAmount that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_integral = true;
    boolean that_present_integral = true;
    if (this_present_integral || that_present_integral) {
      if (!(this_present_integral && that_present_integral))
        return false;
      if (this.integral != that.integral)
        return false;
    }

    boolean this_present_fraction = true;
    boolean that_present_fraction = true;
    if (this_present_fraction || that_present_fraction) {
      if (!(this_present_fraction && that_present_fraction))
        return false;
      if (this.fraction != that.fraction)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(integral);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(fraction);

    return hashCode;
  }

  @Override
  public int compareTo(CumulativeAmount other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetIntegral()).compareTo(other.isSetIntegral());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntegral()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.integral, other.integral);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFraction()).compareTo(other.isSetFraction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFraction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fraction, other.fraction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CumulativeAmount(");
    boolean first = true;

    sb.append("integral:");
    sb.append(this.integral);
    first = false;
    if (!first) sb.append(", ");
    sb.append("fraction:");
    sb.append(this.fraction);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'integral' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'fraction' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CumulativeAmountStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CumulativeAmountStandardScheme getScheme() {
      return new CumulativeAmountStandardScheme();
    }
  }

  private static class CumulativeAmountStandardScheme extends org.apache.thrift.scheme.StandardScheme<CumulativeAmount> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CumulativeAmount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTEGRAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.integral = iprot.readI64();
              struct.setIntegralIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FRACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.fraction = iprot.readI64();
              struct.setFractionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIntegral()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'integral' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetFraction()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'fraction' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CumulativeAmount struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INTEGRAL_FIELD_DESC);
      oprot.writeI64(struct.integral);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FRACTION_FIELD_DESC);
      oprot.writeI64(struct.fraction);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CumulativeAmountTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CumulativeAmountTupleScheme getScheme() {
      return new CumulativeAmountTupleScheme();
    }
  }

  private static class CumulativeAmountTupleScheme extends org.apache.thrift.scheme.TupleScheme<CumulativeAmount> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CumulativeAmount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.integral);
      oprot.writeI64(struct.fraction);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CumulativeAmount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.integral = iprot.readI64();
      struct.setIntegralIsSet(true);
      struct.fraction = iprot.readI64();
      struct.setFractionIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

