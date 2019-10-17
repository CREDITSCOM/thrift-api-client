/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.executor.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-10-17")
public class GetContractVariablesResult implements org.apache.thrift.TBase<GetContractVariablesResult, GetContractVariablesResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetContractVariablesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetContractVariablesResult");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CONTRACT_VARIABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("contractVariables", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetContractVariablesResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetContractVariablesResultTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,com.credits.general.thrift.generated.Variant> contractVariables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    CONTRACT_VARIABLES((short)2, "contractVariables");

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
        case 2: // CONTRACT_VARIABLES
          return CONTRACT_VARIABLES;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.APIResponse.class)));
    tmpMap.put(_Fields.CONTRACT_VARIABLES, new org.apache.thrift.meta_data.FieldMetaData("contractVariables", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Variant.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetContractVariablesResult.class, metaDataMap);
  }

  public GetContractVariablesResult() {
  }

  public GetContractVariablesResult(
    com.credits.general.thrift.generated.APIResponse status,
    java.util.Map<java.lang.String,com.credits.general.thrift.generated.Variant> contractVariables)
  {
    this();
    this.status = status;
    this.contractVariables = contractVariables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetContractVariablesResult(GetContractVariablesResult other) {
    if (other.isSetStatus()) {
      this.status = new com.credits.general.thrift.generated.APIResponse(other.status);
    }
    if (other.isSetContractVariables()) {
      java.util.Map<java.lang.String,com.credits.general.thrift.generated.Variant> __this__contractVariables = new java.util.HashMap<java.lang.String,com.credits.general.thrift.generated.Variant>(other.contractVariables.size());
      for (java.util.Map.Entry<java.lang.String, com.credits.general.thrift.generated.Variant> other_element : other.contractVariables.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        com.credits.general.thrift.generated.Variant other_element_value = other_element.getValue();

        java.lang.String __this__contractVariables_copy_key = other_element_key;

        com.credits.general.thrift.generated.Variant __this__contractVariables_copy_value = new com.credits.general.thrift.generated.Variant(other_element_value);

        __this__contractVariables.put(__this__contractVariables_copy_key, __this__contractVariables_copy_value);
      }
      this.contractVariables = __this__contractVariables;
    }
  }

  public GetContractVariablesResult deepCopy() {
    return new GetContractVariablesResult(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.contractVariables = null;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.APIResponse getStatus() {
    return this.status;
  }

  public GetContractVariablesResult setStatus(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.APIResponse status) {
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

  public int getContractVariablesSize() {
    return (this.contractVariables == null) ? 0 : this.contractVariables.size();
  }

  public void putToContractVariables(java.lang.String key, com.credits.general.thrift.generated.Variant val) {
    if (this.contractVariables == null) {
      this.contractVariables = new java.util.HashMap<java.lang.String,com.credits.general.thrift.generated.Variant>();
    }
    this.contractVariables.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,com.credits.general.thrift.generated.Variant> getContractVariables() {
    return this.contractVariables;
  }

  public GetContractVariablesResult setContractVariables(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,com.credits.general.thrift.generated.Variant> contractVariables) {
    this.contractVariables = contractVariables;
    return this;
  }

  public void unsetContractVariables() {
    this.contractVariables = null;
  }

  /** Returns true if field contractVariables is set (has been assigned a value) and false otherwise */
  public boolean isSetContractVariables() {
    return this.contractVariables != null;
  }

  public void setContractVariablesIsSet(boolean value) {
    if (!value) {
      this.contractVariables = null;
    }
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

    case CONTRACT_VARIABLES:
      if (value == null) {
        unsetContractVariables();
      } else {
        setContractVariables((java.util.Map<java.lang.String,com.credits.general.thrift.generated.Variant>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case CONTRACT_VARIABLES:
      return getContractVariables();

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
    case CONTRACT_VARIABLES:
      return isSetContractVariables();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetContractVariablesResult)
      return this.equals((GetContractVariablesResult)that);
    return false;
  }

  public boolean equals(GetContractVariablesResult that) {
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

    boolean this_present_contractVariables = true && this.isSetContractVariables();
    boolean that_present_contractVariables = true && that.isSetContractVariables();
    if (this_present_contractVariables || that_present_contractVariables) {
      if (!(this_present_contractVariables && that_present_contractVariables))
        return false;
      if (!this.contractVariables.equals(that.contractVariables))
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

    hashCode = hashCode * 8191 + ((isSetContractVariables()) ? 131071 : 524287);
    if (isSetContractVariables())
      hashCode = hashCode * 8191 + contractVariables.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetContractVariablesResult other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetContractVariables()).compareTo(other.isSetContractVariables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContractVariables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contractVariables, other.contractVariables);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetContractVariablesResult(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contractVariables:");
    if (this.contractVariables == null) {
      sb.append("null");
    } else {
      sb.append(this.contractVariables);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetContractVariablesResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetContractVariablesResultStandardScheme getScheme() {
      return new GetContractVariablesResultStandardScheme();
    }
  }

  private static class GetContractVariablesResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetContractVariablesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetContractVariablesResult struct) throws org.apache.thrift.TException {
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
          case 2: // CONTRACT_VARIABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map42 = iprot.readMapBegin();
                struct.contractVariables = new java.util.HashMap<java.lang.String,com.credits.general.thrift.generated.Variant>(2*_map42.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key43;
                @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant _val44;
                for (int _i45 = 0; _i45 < _map42.size; ++_i45)
                {
                  _key43 = iprot.readString();
                  _val44 = new com.credits.general.thrift.generated.Variant();
                  _val44.read(iprot);
                  struct.contractVariables.put(_key43, _val44);
                }
                iprot.readMapEnd();
              }
              struct.setContractVariablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetContractVariablesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.contractVariables != null) {
        oprot.writeFieldBegin(CONTRACT_VARIABLES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.contractVariables.size()));
          for (java.util.Map.Entry<java.lang.String, com.credits.general.thrift.generated.Variant> _iter46 : struct.contractVariables.entrySet())
          {
            oprot.writeString(_iter46.getKey());
            _iter46.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetContractVariablesResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetContractVariablesResultTupleScheme getScheme() {
      return new GetContractVariablesResultTupleScheme();
    }
  }

  private static class GetContractVariablesResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetContractVariablesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetContractVariablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetContractVariables()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetContractVariables()) {
        {
          oprot.writeI32(struct.contractVariables.size());
          for (java.util.Map.Entry<java.lang.String, com.credits.general.thrift.generated.Variant> _iter47 : struct.contractVariables.entrySet())
          {
            oprot.writeString(_iter47.getKey());
            _iter47.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetContractVariablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.status = new com.credits.general.thrift.generated.APIResponse();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map48 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.contractVariables = new java.util.HashMap<java.lang.String,com.credits.general.thrift.generated.Variant>(2*_map48.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _key49;
          @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Variant _val50;
          for (int _i51 = 0; _i51 < _map48.size; ++_i51)
          {
            _key49 = iprot.readString();
            _val50 = new com.credits.general.thrift.generated.Variant();
            _val50.read(iprot);
            struct.contractVariables.put(_key49, _val50);
          }
        }
        struct.setContractVariablesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

