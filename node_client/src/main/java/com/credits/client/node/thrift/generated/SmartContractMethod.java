/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-31")
public class SmartContractMethod implements org.apache.thrift.TBase<SmartContractMethod, SmartContractMethod._Fields>, java.io.Serializable, Cloneable, Comparable<SmartContractMethod> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartContractMethod");

  private static final org.apache.thrift.protocol.TField RETURN_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("returnType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ARGUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("arguments", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SmartContractMethodStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SmartContractMethodTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String returnType; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<SmartContractMethodArgument> arguments; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RETURN_TYPE((short)1, "returnType"),
    NAME((short)2, "name"),
    ARGUMENTS((short)3, "arguments");

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
        case 1: // RETURN_TYPE
          return RETURN_TYPE;
        case 2: // NAME
          return NAME;
        case 3: // ARGUMENTS
          return ARGUMENTS;
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
    tmpMap.put(_Fields.RETURN_TYPE, new org.apache.thrift.meta_data.FieldMetaData("returnType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARGUMENTS, new org.apache.thrift.meta_data.FieldMetaData("arguments", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SmartContractMethodArgument.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartContractMethod.class, metaDataMap);
  }

  public SmartContractMethod() {
  }

  public SmartContractMethod(
    java.lang.String returnType,
    java.lang.String name,
    java.util.List<SmartContractMethodArgument> arguments)
  {
    this();
    this.returnType = returnType;
    this.name = name;
    this.arguments = arguments;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SmartContractMethod(SmartContractMethod other) {
    if (other.isSetReturnType()) {
      this.returnType = other.returnType;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetArguments()) {
      java.util.List<SmartContractMethodArgument> __this__arguments = new java.util.ArrayList<SmartContractMethodArgument>(other.arguments.size());
      for (SmartContractMethodArgument other_element : other.arguments) {
        __this__arguments.add(new SmartContractMethodArgument(other_element));
      }
      this.arguments = __this__arguments;
    }
  }

  public SmartContractMethod deepCopy() {
    return new SmartContractMethod(this);
  }

  @Override
  public void clear() {
    this.returnType = null;
    this.name = null;
    this.arguments = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getReturnType() {
    return this.returnType;
  }

  public SmartContractMethod setReturnType(@org.apache.thrift.annotation.Nullable java.lang.String returnType) {
    this.returnType = returnType;
    return this;
  }

  public void unsetReturnType() {
    this.returnType = null;
  }

  /** Returns true if field returnType is set (has been assigned a value) and false otherwise */
  public boolean isSetReturnType() {
    return this.returnType != null;
  }

  public void setReturnTypeIsSet(boolean value) {
    if (!value) {
      this.returnType = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public SmartContractMethod setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getArgumentsSize() {
    return (this.arguments == null) ? 0 : this.arguments.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SmartContractMethodArgument> getArgumentsIterator() {
    return (this.arguments == null) ? null : this.arguments.iterator();
  }

  public void addToArguments(SmartContractMethodArgument elem) {
    if (this.arguments == null) {
      this.arguments = new java.util.ArrayList<SmartContractMethodArgument>();
    }
    this.arguments.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SmartContractMethodArgument> getArguments() {
    return this.arguments;
  }

  public SmartContractMethod setArguments(@org.apache.thrift.annotation.Nullable java.util.List<SmartContractMethodArgument> arguments) {
    this.arguments = arguments;
    return this;
  }

  public void unsetArguments() {
    this.arguments = null;
  }

  /** Returns true if field arguments is set (has been assigned a value) and false otherwise */
  public boolean isSetArguments() {
    return this.arguments != null;
  }

  public void setArgumentsIsSet(boolean value) {
    if (!value) {
      this.arguments = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case RETURN_TYPE:
      if (value == null) {
        unsetReturnType();
      } else {
        setReturnType((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ARGUMENTS:
      if (value == null) {
        unsetArguments();
      } else {
        setArguments((java.util.List<SmartContractMethodArgument>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case RETURN_TYPE:
      return getReturnType();

    case NAME:
      return getName();

    case ARGUMENTS:
      return getArguments();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case RETURN_TYPE:
      return isSetReturnType();
    case NAME:
      return isSetName();
    case ARGUMENTS:
      return isSetArguments();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SmartContractMethod)
      return this.equals((SmartContractMethod)that);
    return false;
  }

  public boolean equals(SmartContractMethod that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_returnType = true && this.isSetReturnType();
    boolean that_present_returnType = true && that.isSetReturnType();
    if (this_present_returnType || that_present_returnType) {
      if (!(this_present_returnType && that_present_returnType))
        return false;
      if (!this.returnType.equals(that.returnType))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_arguments = true && this.isSetArguments();
    boolean that_present_arguments = true && that.isSetArguments();
    if (this_present_arguments || that_present_arguments) {
      if (!(this_present_arguments && that_present_arguments))
        return false;
      if (!this.arguments.equals(that.arguments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetReturnType()) ? 131071 : 524287);
    if (isSetReturnType())
      hashCode = hashCode * 8191 + returnType.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetArguments()) ? 131071 : 524287);
    if (isSetArguments())
      hashCode = hashCode * 8191 + arguments.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SmartContractMethod other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetReturnType()).compareTo(other.isSetReturnType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReturnType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.returnType, other.returnType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetArguments()).compareTo(other.isSetArguments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArguments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arguments, other.arguments);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SmartContractMethod(");
    boolean first = true;

    sb.append("returnType:");
    if (this.returnType == null) {
      sb.append("null");
    } else {
      sb.append(this.returnType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("arguments:");
    if (this.arguments == null) {
      sb.append("null");
    } else {
      sb.append(this.arguments);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SmartContractMethodStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractMethodStandardScheme getScheme() {
      return new SmartContractMethodStandardScheme();
    }
  }

  private static class SmartContractMethodStandardScheme extends org.apache.thrift.scheme.StandardScheme<SmartContractMethod> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SmartContractMethod struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RETURN_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.returnType = iprot.readString();
              struct.setReturnTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARGUMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list132 = iprot.readListBegin();
                struct.arguments = new java.util.ArrayList<SmartContractMethodArgument>(_list132.size);
                @org.apache.thrift.annotation.Nullable SmartContractMethodArgument _elem133;
                for (int _i134 = 0; _i134 < _list132.size; ++_i134)
                {
                  _elem133 = new SmartContractMethodArgument();
                  _elem133.read(iprot);
                  struct.arguments.add(_elem133);
                }
                iprot.readListEnd();
              }
              struct.setArgumentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SmartContractMethod struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.returnType != null) {
        oprot.writeFieldBegin(RETURN_TYPE_FIELD_DESC);
        oprot.writeString(struct.returnType);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.arguments != null) {
        oprot.writeFieldBegin(ARGUMENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.arguments.size()));
          for (SmartContractMethodArgument _iter135 : struct.arguments)
          {
            _iter135.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SmartContractMethodTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SmartContractMethodTupleScheme getScheme() {
      return new SmartContractMethodTupleScheme();
    }
  }

  private static class SmartContractMethodTupleScheme extends org.apache.thrift.scheme.TupleScheme<SmartContractMethod> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SmartContractMethod struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetReturnType()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetArguments()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetReturnType()) {
        oprot.writeString(struct.returnType);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetArguments()) {
        {
          oprot.writeI32(struct.arguments.size());
          for (SmartContractMethodArgument _iter136 : struct.arguments)
          {
            _iter136.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SmartContractMethod struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.returnType = iprot.readString();
        struct.setReturnTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list137 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.arguments = new java.util.ArrayList<SmartContractMethodArgument>(_list137.size);
          @org.apache.thrift.annotation.Nullable SmartContractMethodArgument _elem138;
          for (int _i139 = 0; _i139 < _list137.size; ++_i139)
          {
            _elem138 = new SmartContractMethodArgument();
            _elem138.read(iprot);
            struct.arguments.add(_elem138);
          }
        }
        struct.setArgumentsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

