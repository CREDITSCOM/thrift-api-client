/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-17")
public class SyncStateResult implements org.apache.thrift.TBase<SyncStateResult, SyncStateResult._Fields>, java.io.Serializable, Cloneable, Comparable<SyncStateResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SyncStateResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CURR_ROUND_FIELD_DESC = new org.apache.thrift.protocol.TField("currRound", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_BLOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("lastBlock", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SyncStateResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SyncStateResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public long currRound; // required
  public long lastBlock; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    CURR_ROUND((short)2, "currRound"),
    LAST_BLOCK((short)3, "lastBlock");

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
        case 1: // STATUS
          return STATUS;
        case 2: // CURR_ROUND
          return CURR_ROUND;
        case 3: // LAST_BLOCK
          return LAST_BLOCK;
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
  private static final int __CURRROUND_ISSET_ID = 0;
  private static final int __LASTBLOCK_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.CURR_ROUND, new org.apache.thrift.meta_data.FieldMetaData("currRound", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_BLOCK, new org.apache.thrift.meta_data.FieldMetaData("lastBlock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SyncStateResult.class, metaDataMap);
  }

  public SyncStateResult() {
  }

  public SyncStateResult(
    com.credits.general.thrift.generated.APIResponse status,
    long currRound,
    long lastBlock)
  {
    this();
    this.status = status;
    this.currRound = currRound;
    setCurrRoundIsSet(true);
    this.lastBlock = lastBlock;
    setLastBlockIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SyncStateResult(SyncStateResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    this.currRound = other.currRound;
    this.lastBlock = other.lastBlock;
  }

  public SyncStateResult deepCopy() {
    return new SyncStateResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    setCurrRoundIsSet(false);
    this.currRound = 0;
    setLastBlockIsSet(false);
    this.lastBlock = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public SyncStateResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public long getCurrRound() {
    return this.currRound;
  }

  public SyncStateResult setCurrRound(long currRound) {
    this.currRound = currRound;
    setCurrRoundIsSet(true);
    return this;
  }

  public void unsetCurrRound() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CURRROUND_ISSET_ID);
  }

  /** Returns true if field currRound is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrRound() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CURRROUND_ISSET_ID);
  }

  public void setCurrRoundIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CURRROUND_ISSET_ID, value);
  }

  public long getLastBlock() {
    return this.lastBlock;
  }

  public SyncStateResult setLastBlock(long lastBlock) {
    this.lastBlock = lastBlock;
    setLastBlockIsSet(true);
    return this;
  }

  public void unsetLastBlock() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTBLOCK_ISSET_ID);
  }

  /** Returns true if field lastBlock is set (has been assigned a value) and false otherwise */
  public boolean isSetLastBlock() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTBLOCK_ISSET_ID);
  }

  public void setLastBlockIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTBLOCK_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.credits.general.thrift.generated.APIResponse)value);
      }
      break;

    case CURR_ROUND:
      if (value == null) {
        unsetCurrRound();
      } else {
        setCurrRound((java.lang.Long)value);
      }
      break;

    case LAST_BLOCK:
      if (value == null) {
        unsetLastBlock();
      } else {
        setLastBlock((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case CURR_ROUND:
      return getCurrRound();

    case LAST_BLOCK:
      return getLastBlock();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case CURR_ROUND:
      return isSetCurrRound();
    case LAST_BLOCK:
      return isSetLastBlock();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SyncStateResult)
      return this.equals((SyncStateResult)that);
    return false;
  }

  public boolean equals(SyncStateResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_currRound = true;
    boolean that_present_currRound = true;
    if (this_present_currRound || that_present_currRound) {
      if (!(this_present_currRound && that_present_currRound))
        return false;
      if (this.currRound != that.currRound)
        return false;
    }

    boolean this_present_lastBlock = true;
    boolean that_present_lastBlock = true;
    if (this_present_lastBlock || that_present_lastBlock) {
      if (!(this_present_lastBlock && that_present_lastBlock))
        return false;
      if (this.lastBlock != that.lastBlock)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(currRound);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastBlock);

    return hashCode;
  }

  @Override
  public int compareTo(SyncStateResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrRound()).compareTo(other.isSetCurrRound());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrRound()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currRound, other.currRound);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastBlock()).compareTo(other.isSetLastBlock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastBlock()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastBlock, other.lastBlock);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SyncStateResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("currRound:");
    sb.append(this.currRound);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastBlock:");
    sb.append(this.lastBlock);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
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

  private static class SyncStateResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SyncStateResultStandardScheme getScheme() {
      return new SyncStateResultStandardScheme();
    }
  }

  private static class SyncStateResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<SyncStateResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SyncStateResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.credits.general.thrift.generated.APIResponse();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CURR_ROUND
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.currRound = iprot.readI64();
              struct.setCurrRoundIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_BLOCK
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastBlock = iprot.readI64();
              struct.setLastBlockIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SyncStateResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CURR_ROUND_FIELD_DESC);
      oprot.writeI64(struct.currRound);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_BLOCK_FIELD_DESC);
      oprot.writeI64(struct.lastBlock);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SyncStateResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SyncStateResultTupleScheme getScheme() {
      return new SyncStateResultTupleScheme();
    }
  }

  private static class SyncStateResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<SyncStateResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SyncStateResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetCurrRound()) {
        optionals.set(1);
      }
      if (struct.isSetLastBlock()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetCurrRound()) {
        oprot.writeI64(struct.currRound);
      }
      if (struct.isSetLastBlock()) {
        oprot.writeI64(struct.lastBlock);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SyncStateResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.currRound = iprot.readI64();
        struct.setCurrRoundIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastBlock = iprot.readI64();
        struct.setLastBlockIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

