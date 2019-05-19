/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-05-19")
public class SetterMethodResult implements org.apache.thrift.TBase<SetterMethodResult, SetterMethodResult._Fields>, java.io.Serializable, Cloneable, Comparable<SetterMethodResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SetterMethodResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INVOKED_CONTRACT_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("invokedContractState", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RET_VAL_FIELD_DESC = new org.apache.thrift.protocol.TField("ret_val", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField EXECUTION_COST_FIELD_DESC = new org.apache.thrift.protocol.TField("executionCost", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SetterMethodResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SetterMethodResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer invokedContractState; // required
  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant ret_val; // required
  public long executionCost; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    INVOKED_CONTRACT_STATE((short)2, "invokedContractState"),
    RET_VAL((short)3, "ret_val"),
    EXECUTION_COST((short)4, "executionCost");

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
        case 2: // INVOKED_CONTRACT_STATE
          return INVOKED_CONTRACT_STATE;
        case 3: // RET_VAL
          return RET_VAL;
        case 4: // EXECUTION_COST
          return EXECUTION_COST;
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
  private static final int __EXECUTIONCOST_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.INVOKED_CONTRACT_STATE, new org.apache.thrift.meta_data.FieldMetaData("invokedContractState", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.RET_VAL, new org.apache.thrift.meta_data.FieldMetaData("ret_val", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class)));
    tmpMap.put(_Fields.EXECUTION_COST, new org.apache.thrift.meta_data.FieldMetaData("executionCost", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SetterMethodResult.class, metaDataMap);
  }

  public SetterMethodResult() {
  }

  public SetterMethodResult(
    com.credits.general.thrift.generated.APIResponse status,
    java.nio.ByteBuffer invokedContractState,
    com.credits.general.thrift.generated.Variant ret_val,
    long executionCost)
  {
    this();
    this.status = status;
    this.invokedContractState = org.apache.thrift.TBaseHelper.copyBinary(invokedContractState);
    this.ret_val = ret_val;
    this.executionCost = executionCost;
    setExecutionCostIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetterMethodResult(SetterMethodResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    if (other.isSetInvokedContractState()) {
      this.invokedContractState = org.apache.thrift.TBaseHelper.copyBinary(other.invokedContractState);
    }
    if (other.isSetRet_val()) {
      this.ret_val = new com.credits.general.thrift.generated.Variant(other.ret_val);
    }
    this.executionCost = other.executionCost;
  }

  public SetterMethodResult deepCopy() {
    return new SetterMethodResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.invokedContractState = null;
    this.ret_val = null;
    setExecutionCostIsSet(false);
    this.executionCost = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public SetterMethodResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
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

  public byte[] getInvokedContractState() {
    setInvokedContractState(org.apache.thrift.TBaseHelper.rightSize(invokedContractState));
    return invokedContractState == null ? null : invokedContractState.array();
  }

  public java.nio.ByteBuffer bufferForInvokedContractState() {
    return org.apache.thrift.TBaseHelper.copyBinary(invokedContractState);
  }

  public SetterMethodResult setInvokedContractState(byte[] invokedContractState) {
    this.invokedContractState = invokedContractState == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(invokedContractState.clone());
    return this;
  }

  public SetterMethodResult setInvokedContractState(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer invokedContractState) {
    this.invokedContractState = org.apache.thrift.TBaseHelper.copyBinary(invokedContractState);
    return this;
  }

  public void unsetInvokedContractState() {
    this.invokedContractState = null;
  }

  /** Returns true if field invokedContractState is set (has been assigned a value) and false otherwise */
  public boolean isSetInvokedContractState() {
    return this.invokedContractState != null;
  }

  public void setInvokedContractStateIsSet(boolean value) {
    if (!value) {
      this.invokedContractState = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Variant getRet_val() {
    return this.ret_val;
  }

  public SetterMethodResult setRet_val(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant ret_val) {
    this.ret_val = ret_val;
    return this;
  }

  public void unsetRet_val() {
    this.ret_val = null;
  }

  /** Returns true if field ret_val is set (has been assigned a value) and false otherwise */
  public boolean isSetRet_val() {
    return this.ret_val != null;
  }

  public void setRet_valIsSet(boolean value) {
    if (!value) {
      this.ret_val = null;
    }
  }

  public long getExecutionCost() {
    return this.executionCost;
  }

  public SetterMethodResult setExecutionCost(long executionCost) {
    this.executionCost = executionCost;
    setExecutionCostIsSet(true);
    return this;
  }

  public void unsetExecutionCost() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXECUTIONCOST_ISSET_ID);
  }

  /** Returns true if field executionCost is set (has been assigned a value) and false otherwise */
  public boolean isSetExecutionCost() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXECUTIONCOST_ISSET_ID);
  }

  public void setExecutionCostIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXECUTIONCOST_ISSET_ID, value);
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

    case INVOKED_CONTRACT_STATE:
      if (value == null) {
        unsetInvokedContractState();
      } else {
        if (value instanceof byte[]) {
          setInvokedContractState((byte[])value);
        } else {
          setInvokedContractState((java.nio.ByteBuffer)value);
        }
      }
      break;

    case RET_VAL:
      if (value == null) {
        unsetRet_val();
      } else {
        setRet_val((com.credits.general.thrift.generated.Variant)value);
      }
      break;

    case EXECUTION_COST:
      if (value == null) {
        unsetExecutionCost();
      } else {
        setExecutionCost((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case INVOKED_CONTRACT_STATE:
      return getInvokedContractState();

    case RET_VAL:
      return getRet_val();

    case EXECUTION_COST:
      return getExecutionCost();

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
    case INVOKED_CONTRACT_STATE:
      return isSetInvokedContractState();
    case RET_VAL:
      return isSetRet_val();
    case EXECUTION_COST:
      return isSetExecutionCost();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SetterMethodResult)
      return this.equals((SetterMethodResult)that);
    return false;
  }

  public boolean equals(SetterMethodResult that) {
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

    boolean this_present_invokedContractState = true && this.isSetInvokedContractState();
    boolean that_present_invokedContractState = true && that.isSetInvokedContractState();
    if (this_present_invokedContractState || that_present_invokedContractState) {
      if (!(this_present_invokedContractState && that_present_invokedContractState))
        return false;
      if (!this.invokedContractState.equals(that.invokedContractState))
        return false;
    }

    boolean this_present_ret_val = true && this.isSetRet_val();
    boolean that_present_ret_val = true && that.isSetRet_val();
    if (this_present_ret_val || that_present_ret_val) {
      if (!(this_present_ret_val && that_present_ret_val))
        return false;
      if (!this.ret_val.equals(that.ret_val))
        return false;
    }

    boolean this_present_executionCost = true;
    boolean that_present_executionCost = true;
    if (this_present_executionCost || that_present_executionCost) {
      if (!(this_present_executionCost && that_present_executionCost))
        return false;
      if (this.executionCost != that.executionCost)
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

    hashCode = hashCode * 8191 + ((isSetInvokedContractState()) ? 131071 : 524287);
    if (isSetInvokedContractState())
      hashCode = hashCode * 8191 + invokedContractState.hashCode();

    hashCode = hashCode * 8191 + ((isSetRet_val()) ? 131071 : 524287);
    if (isSetRet_val())
      hashCode = hashCode * 8191 + ret_val.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(executionCost);

    return hashCode;
  }

  @Override
  public int compareTo(SetterMethodResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetInvokedContractState()).compareTo(other.isSetInvokedContractState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvokedContractState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invokedContractState, other.invokedContractState);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRet_val()).compareTo(other.isSetRet_val());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRet_val()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ret_val, other.ret_val);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExecutionCost()).compareTo(other.isSetExecutionCost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecutionCost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executionCost, other.executionCost);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SetterMethodResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invokedContractState:");
    if (this.invokedContractState == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.invokedContractState, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ret_val:");
    if (this.ret_val == null) {
      sb.append("null");
    } else {
      sb.append(this.ret_val);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executionCost:");
    sb.append(this.executionCost);
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

  private static class SetterMethodResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetterMethodResultStandardScheme getScheme() {
      return new SetterMethodResultStandardScheme();
    }
  }

  private static class SetterMethodResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<SetterMethodResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SetterMethodResult struct) throws org.apache.thrift.TException {
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
          case 2: // INVOKED_CONTRACT_STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.invokedContractState = iprot.readBinary();
              struct.setInvokedContractStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RET_VAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ret_val = new com.credits.general.thrift.generated.Variant();
              struct.ret_val.read(iprot);
              struct.setRet_valIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXECUTION_COST
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.executionCost = iprot.readI64();
              struct.setExecutionCostIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SetterMethodResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.invokedContractState != null) {
        oprot.writeFieldBegin(INVOKED_CONTRACT_STATE_FIELD_DESC);
        oprot.writeBinary(struct.invokedContractState);
        oprot.writeFieldEnd();
      }
      if (struct.ret_val != null) {
        oprot.writeFieldBegin(RET_VAL_FIELD_DESC);
        struct.ret_val.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXECUTION_COST_FIELD_DESC);
      oprot.writeI64(struct.executionCost);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetterMethodResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SetterMethodResultTupleScheme getScheme() {
      return new SetterMethodResultTupleScheme();
    }
  }

  private static class SetterMethodResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<SetterMethodResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SetterMethodResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetInvokedContractState()) {
        optionals.set(1);
      }
      if (struct.isSetRet_val()) {
        optionals.set(2);
      }
      if (struct.isSetExecutionCost()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetInvokedContractState()) {
        oprot.writeBinary(struct.invokedContractState);
      }
      if (struct.isSetRet_val()) {
        struct.ret_val.write(oprot);
      }
      if (struct.isSetExecutionCost()) {
        oprot.writeI64(struct.executionCost);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SetterMethodResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.invokedContractState = iprot.readBinary();
        struct.setInvokedContractStateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ret_val = new com.credits.general.thrift.generated.Variant();
        struct.ret_val.read(iprot);
        struct.setRet_valIsSet(true);
      }
      if (incoming.get(3)) {
        struct.executionCost = iprot.readI64();
        struct.setExecutionCostIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
