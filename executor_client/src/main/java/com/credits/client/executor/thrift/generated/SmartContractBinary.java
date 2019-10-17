/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-17")
public class SmartContractBinary implements org.apache.thrift.TBase<SmartContractBinary, SmartContractBinary._Fields>, java.io.Serializable, Cloneable, Comparable<SmartContractBinary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartContractBinary");

  private static final org.apache.thrift.protocol.TField CONTRACT_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("contractAddress", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("object", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField STATE_CAN_MODIFY_FIELD_DESC = new org.apache.thrift.protocol.TField("stateCanModify", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartContractBinaryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartContractBinaryTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer contractAddress; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.ClassObject object; // required
  public boolean stateCanModify; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CONTRACT_ADDRESS((short)1, "contractAddress"),
    OBJECT((short)2, "object"),
    STATE_CAN_MODIFY((short)3, "stateCanModify");

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
        case 1: // CONTRACT_ADDRESS
          return CONTRACT_ADDRESS;
        case 2: // OBJECT
          return OBJECT;
        case 3: // STATE_CAN_MODIFY
          return STATE_CAN_MODIFY;
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
  private static final int __STATECANMODIFY_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CONTRACT_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("contractAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.OBJECT, new org.apache.thrift.meta_data.FieldMetaData("object", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.ClassObject.class)));
    tmpMap.put(_Fields.STATE_CAN_MODIFY, new org.apache.thrift.meta_data.FieldMetaData("stateCanModify", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartContractBinary.class, metaDataMap);
  }

  public SmartContractBinary() {
  }

  public SmartContractBinary(
    java.nio.ByteBuffer contractAddress,
    com.credits.general.thrift.generated.ClassObject object,
    boolean stateCanModify)
  {
    this();
    this.contractAddress = org.apache.thrift.TBaseHelper.copyBinary(contractAddress);
    this.object = object;
    this.stateCanModify = stateCanModify;
    setStateCanModifyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartContractBinary(SmartContractBinary other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetContractAddress()) {
      this.contractAddress = org.apache.thrift.TBaseHelper.copyBinary(other.contractAddress);
    }
    if (other.isSetObject()) {
      this.object = new com.credits.general.thrift.generated.ClassObject(other.object);
    }
    this.stateCanModify = other.stateCanModify;
  }

  public SmartContractBinary deepCopy() {
    return new SmartContractBinary(this);
  }

  @Override
  public void clear() {
    this.contractAddress = null;
    this.object = null;
    setStateCanModifyIsSet(false);
    this.stateCanModify = false;
  }

  public byte[] getContractAddress() {
    setContractAddress(org.apache.thrift.TBaseHelper.rightSize(contractAddress));
    return contractAddress == null ? null : contractAddress.array();
  }

  public java.nio.ByteBuffer bufferForContractAddress() {
    return org.apache.thrift.TBaseHelper.copyBinary(contractAddress);
  }

  public SmartContractBinary setContractAddress(byte[] contractAddress) {
    this.contractAddress = contractAddress == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(contractAddress.clone());
    return this;
  }

  public SmartContractBinary setContractAddress(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer contractAddress) {
    this.contractAddress = org.apache.thrift.TBaseHelper.copyBinary(contractAddress);
    return this;
  }

  public void unsetContractAddress() {
    this.contractAddress = null;
  }

  /** Returns true if field contractAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetContractAddress() {
    return this.contractAddress != null;
  }

  public void setContractAddressIsSet(boolean value) {
    if (!value) {
      this.contractAddress = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.ClassObject getObject() {
    return this.object;
  }

  public SmartContractBinary setObject(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.ClassObject object) {
    this.object = object;
    return this;
  }

  public void unsetObject() {
    this.object = null;
  }

  /** Returns true if field object is set (has been assigned a value) and false otherwise */
  public boolean isSetObject() {
    return this.object != null;
  }

  public void setObjectIsSet(boolean value) {
    if (!value) {
      this.object = null;
    }
  }

  public boolean isStateCanModify() {
    return this.stateCanModify;
  }

  public SmartContractBinary setStateCanModify(boolean stateCanModify) {
    this.stateCanModify = stateCanModify;
    setStateCanModifyIsSet(true);
    return this;
  }

  public void unsetStateCanModify() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATECANMODIFY_ISSET_ID);
  }

  /** Returns true if field stateCanModify is set (has been assigned a value) and false otherwise */
  public boolean isSetStateCanModify() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATECANMODIFY_ISSET_ID);
  }

  public void setStateCanModifyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATECANMODIFY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CONTRACT_ADDRESS:
      if (value == null) {
        unsetContractAddress();
      } else {
        if (value instanceof byte[]) {
          setContractAddress((byte[])value);
        } else {
          setContractAddress((java.nio.ByteBuffer)value);
        }
      }
      break;

    case OBJECT:
      if (value == null) {
        unsetObject();
      } else {
        setObject((com.credits.general.thrift.generated.ClassObject)value);
      }
      break;

    case STATE_CAN_MODIFY:
      if (value == null) {
        unsetStateCanModify();
      } else {
        setStateCanModify((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CONTRACT_ADDRESS:
      return getContractAddress();

    case OBJECT:
      return getObject();

    case STATE_CAN_MODIFY:
      return isStateCanModify();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CONTRACT_ADDRESS:
      return isSetContractAddress();
    case OBJECT:
      return isSetObject();
    case STATE_CAN_MODIFY:
      return isSetStateCanModify();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SmartContractBinary)
      return this.equals((SmartContractBinary)that);
    return false;
  }

  public boolean equals(SmartContractBinary that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_contractAddress = true && this.isSetContractAddress();
    boolean that_present_contractAddress = true && that.isSetContractAddress();
    if (this_present_contractAddress || that_present_contractAddress) {
      if (!(this_present_contractAddress && that_present_contractAddress))
        return false;
      if (!this.contractAddress.equals(that.contractAddress))
        return false;
    }

    boolean this_present_object = true && this.isSetObject();
    boolean that_present_object = true && that.isSetObject();
    if (this_present_object || that_present_object) {
      if (!(this_present_object && that_present_object))
        return false;
      if (!this.object.equals(that.object))
        return false;
    }

    boolean this_present_stateCanModify = true;
    boolean that_present_stateCanModify = true;
    if (this_present_stateCanModify || that_present_stateCanModify) {
      if (!(this_present_stateCanModify && that_present_stateCanModify))
        return false;
      if (this.stateCanModify != that.stateCanModify)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetContractAddress()) ? 131071 : 524287);
    if (isSetContractAddress())
      hashCode = hashCode * 8191 + contractAddress.hashCode();

    hashCode = hashCode * 8191 + ((isSetObject()) ? 131071 : 524287);
    if (isSetObject())
      hashCode = hashCode * 8191 + object.hashCode();

    hashCode = hashCode * 8191 + ((stateCanModify) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SmartContractBinary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetContractAddress()).compareTo(other.isSetContractAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContractAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contractAddress, other.contractAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetObject()).compareTo(other.isSetObject());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObject()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.object, other.object);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStateCanModify()).compareTo(other.isSetStateCanModify());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateCanModify()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stateCanModify, other.stateCanModify);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartContractBinary(");
    boolean first = true;

    sb.append("contractAddress:");
    if (this.contractAddress == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.contractAddress, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("object:");
    if (this.object == null) {
      sb.append("null");
    } else {
      sb.append(this.object);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stateCanModify:");
    sb.append(this.stateCanModify);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (object != null) {
      object.validate();
    }
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

  private static class SmartContractBinaryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractBinaryStandardScheme getScheme() {
      return new SmartContractBinaryStandardScheme();
    }
  }

  private static class SmartContractBinaryStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartContractBinary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartContractBinary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CONTRACT_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contractAddress = iprot.readBinary();
              struct.setContractAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.object = new com.credits.general.thrift.generated.ClassObject();
              struct.object.read(iprot);
              struct.setObjectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATE_CAN_MODIFY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.stateCanModify = iprot.readBool();
              struct.setStateCanModifyIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartContractBinary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.contractAddress != null) {
        oprot.writeFieldBegin(CONTRACT_ADDRESS_FIELD_DESC);
        oprot.writeBinary(struct.contractAddress);
        oprot.writeFieldEnd();
      }
      if (struct.object != null) {
        oprot.writeFieldBegin(OBJECT_FIELD_DESC);
        struct.object.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATE_CAN_MODIFY_FIELD_DESC);
      oprot.writeBool(struct.stateCanModify);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SmartContractBinaryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractBinaryTupleScheme getScheme() {
      return new SmartContractBinaryTupleScheme();
    }
  }

  private static class SmartContractBinaryTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartContractBinary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartContractBinary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContractAddress()) {
        optionals.set(0);
      }
      if (struct.isSetObject()) {
        optionals.set(1);
      }
      if (struct.isSetStateCanModify()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetContractAddress()) {
        oprot.writeBinary(struct.contractAddress);
      }
      if (struct.isSetObject()) {
        struct.object.write(oprot);
      }
      if (struct.isSetStateCanModify()) {
        oprot.writeBool(struct.stateCanModify);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartContractBinary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.contractAddress = iprot.readBinary();
        struct.setContractAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.object = new com.credits.general.thrift.generated.ClassObject();
        struct.object.read(iprot);
        struct.setObjectIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stateCanModify = iprot.readBool();
        struct.setStateCanModifyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

