/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-11")
public class AmountCommission implements org.apache.thrift.TBase<AmountCommission, AmountCommission._Fields>, java.io.Serializable, Cloneable, Comparable<AmountCommission> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AmountCommission");

  private static final org.apache.thrift.protocol.TField COMMISSION_FIELD_DESC = new org.apache.thrift.protocol.TField("commission", org.apache.thrift.protocol.TType.I16, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AmountCommissionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AmountCommissionTupleSchemeFactory();

  public short commission; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMMISSION((short)1, "commission");

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
        case 1: // COMMISSION
          return COMMISSION;
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
  private static final int __COMMISSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMISSION, new org.apache.thrift.meta_data.FieldMetaData("commission", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AmountCommission.class, metaDataMap);
  }

  public AmountCommission() {
    this.commission = (short)0;

  }

  public AmountCommission(
    short commission)
  {
    this();
    this.commission = commission;
    setCommissionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AmountCommission(AmountCommission other) {
    __isset_bitfield = other.__isset_bitfield;
    this.commission = other.commission;
  }

  public AmountCommission deepCopy() {
    return new AmountCommission(this);
  }

  @Override
  public void clear() {
    this.commission = (short)0;

  }

  public short getCommission() {
    return this.commission;
  }

  public AmountCommission setCommission(short commission) {
    this.commission = commission;
    setCommissionIsSet(true);
    return this;
  }

  public void unsetCommission() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMMISSION_ISSET_ID);
  }

  /** Returns true if field commission is set (has been assigned a value) and false otherwise */
  public boolean isSetCommission() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMMISSION_ISSET_ID);
  }

  public void setCommissionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMMISSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COMMISSION:
      if (value == null) {
        unsetCommission();
      } else {
        setCommission((java.lang.Short)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMISSION:
      return getCommission();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COMMISSION:
      return isSetCommission();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AmountCommission)
      return this.equals((AmountCommission)that);
    return false;
  }

  public boolean equals(AmountCommission that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_commission = true;
    boolean that_present_commission = true;
    if (this_present_commission || that_present_commission) {
      if (!(this_present_commission && that_present_commission))
        return false;
      if (this.commission != that.commission)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + commission;

    return hashCode;
  }

  @Override
  public int compareTo(AmountCommission other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCommission()).compareTo(other.isSetCommission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommission()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.commission, other.commission);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountCommission(");
    boolean first = true;

    sb.append("commission:");
    sb.append(this.commission);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'commission' because it's a primitive and you chose the non-beans generator.
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

  private static class AmountCommissionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AmountCommissionStandardScheme getScheme() {
      return new AmountCommissionStandardScheme();
    }
  }

  private static class AmountCommissionStandardScheme extends org.apache.thrift.scheme.StandardScheme<AmountCommission> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AmountCommission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMISSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.commission = iprot.readI16();
              struct.setCommissionIsSet(true);
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
      if (!struct.isSetCommission()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'commission' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AmountCommission struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(COMMISSION_FIELD_DESC);
      oprot.writeI16(struct.commission);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AmountCommissionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AmountCommissionTupleScheme getScheme() {
      return new AmountCommissionTupleScheme();
    }
  }

  private static class AmountCommissionTupleScheme extends org.apache.thrift.scheme.TupleScheme<AmountCommission> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AmountCommission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI16(struct.commission);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AmountCommission struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.commission = iprot.readI16();
      struct.setCommissionIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

