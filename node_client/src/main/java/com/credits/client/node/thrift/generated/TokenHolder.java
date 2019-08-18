/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-08-18")
public class TokenHolder implements org.apache.thrift.TBase<TokenHolder, TokenHolder._Fields>, java.io.Serializable, Cloneable, Comparable<TokenHolder> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TokenHolder");

  private static final org.apache.thrift.protocol.TField HOLDER_FIELD_DESC = new org.apache.thrift.protocol.TField("holder", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BALANCE_FIELD_DESC = new org.apache.thrift.protocol.TField("balance", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TRANSFERS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("transfersCount", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TokenHolderStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TokenHolderTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer holder; // required
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer token; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String balance; // required
  public int transfersCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOLDER((short)1, "holder"),
    TOKEN((short)2, "token"),
    BALANCE((short)3, "balance"),
    TRANSFERS_COUNT((short)4, "transfersCount");

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
        case 1: // HOLDER
          return HOLDER;
        case 2: // TOKEN
          return TOKEN;
        case 3: // BALANCE
          return BALANCE;
        case 4: // TRANSFERS_COUNT
          return TRANSFERS_COUNT;
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
  private static final int __TRANSFERSCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOLDER, new org.apache.thrift.meta_data.FieldMetaData("holder", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.BALANCE, new org.apache.thrift.meta_data.FieldMetaData("balance", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TokenAmount")));
    tmpMap.put(_Fields.TRANSFERS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("transfersCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TokenHolder.class, metaDataMap);
  }

  public TokenHolder() {
  }

  public TokenHolder(
    java.nio.ByteBuffer holder,
    java.nio.ByteBuffer token,
    java.lang.String balance,
    int transfersCount)
  {
    this();
    this.holder = org.apache.thrift.TBaseHelper.copyBinary(holder);
    this.token = org.apache.thrift.TBaseHelper.copyBinary(token);
    this.balance = balance;
    this.transfersCount = transfersCount;
    setTransfersCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenHolder(TokenHolder other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHolder()) {
      this.holder = org.apache.thrift.TBaseHelper.copyBinary(other.holder);
    }
    if (other.isSetToken()) {
      this.token = org.apache.thrift.TBaseHelper.copyBinary(other.token);
    }
    if (other.isSetBalance()) {
      this.balance = other.balance;
    }
    this.transfersCount = other.transfersCount;
  }

  public TokenHolder deepCopy() {
    return new TokenHolder(this);
  }

  @Override
  public void clear() {
    this.holder = null;
    this.token = null;
    this.balance = null;
    setTransfersCountIsSet(false);
    this.transfersCount = 0;
  }

  public byte[] getHolder() {
    setHolder(org.apache.thrift.TBaseHelper.rightSize(holder));
    return holder == null ? null : holder.array();
  }

  public java.nio.ByteBuffer bufferForHolder() {
    return org.apache.thrift.TBaseHelper.copyBinary(holder);
  }

  public TokenHolder setHolder(byte[] holder) {
    this.holder = holder == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(holder.clone());
    return this;
  }

  public TokenHolder setHolder(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer holder) {
    this.holder = org.apache.thrift.TBaseHelper.copyBinary(holder);
    return this;
  }

  public void unsetHolder() {
    this.holder = null;
  }

  /** Returns true if field holder is set (has been assigned a value) and false otherwise */
  public boolean isSetHolder() {
    return this.holder != null;
  }

  public void setHolderIsSet(boolean value) {
    if (!value) {
      this.holder = null;
    }
  }

  public byte[] getToken() {
    setToken(org.apache.thrift.TBaseHelper.rightSize(token));
    return token == null ? null : token.array();
  }

  public java.nio.ByteBuffer bufferForToken() {
    return org.apache.thrift.TBaseHelper.copyBinary(token);
  }

  public TokenHolder setToken(byte[] token) {
    this.token = token == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(token.clone());
    return this;
  }

  public TokenHolder setToken(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer token) {
    this.token = org.apache.thrift.TBaseHelper.copyBinary(token);
    return this;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBalance() {
    return this.balance;
  }

  public TokenHolder setBalance(@org.apache.thrift.annotation.Nullable java.lang.String balance) {
    this.balance = balance;
    return this;
  }

  public void unsetBalance() {
    this.balance = null;
  }

  /** Returns true if field balance is set (has been assigned a value) and false otherwise */
  public boolean isSetBalance() {
    return this.balance != null;
  }

  public void setBalanceIsSet(boolean value) {
    if (!value) {
      this.balance = null;
    }
  }

  public int getTransfersCount() {
    return this.transfersCount;
  }

  public TokenHolder setTransfersCount(int transfersCount) {
    this.transfersCount = transfersCount;
    setTransfersCountIsSet(true);
    return this;
  }

  public void unsetTransfersCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSFERSCOUNT_ISSET_ID);
  }

  /** Returns true if field transfersCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTransfersCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSFERSCOUNT_ISSET_ID);
  }

  public void setTransfersCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSFERSCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case HOLDER:
      if (value == null) {
        unsetHolder();
      } else {
        if (value instanceof byte[]) {
          setHolder((byte[])value);
        } else {
          setHolder((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        if (value instanceof byte[]) {
          setToken((byte[])value);
        } else {
          setToken((java.nio.ByteBuffer)value);
        }
      }
      break;

    case BALANCE:
      if (value == null) {
        unsetBalance();
      } else {
        setBalance((java.lang.String)value);
      }
      break;

    case TRANSFERS_COUNT:
      if (value == null) {
        unsetTransfersCount();
      } else {
        setTransfersCount((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HOLDER:
      return getHolder();

    case TOKEN:
      return getToken();

    case BALANCE:
      return getBalance();

    case TRANSFERS_COUNT:
      return getTransfersCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HOLDER:
      return isSetHolder();
    case TOKEN:
      return isSetToken();
    case BALANCE:
      return isSetBalance();
    case TRANSFERS_COUNT:
      return isSetTransfersCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TokenHolder)
      return this.equals((TokenHolder)that);
    return false;
  }

  public boolean equals(TokenHolder that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_holder = true && this.isSetHolder();
    boolean that_present_holder = true && that.isSetHolder();
    if (this_present_holder || that_present_holder) {
      if (!(this_present_holder && that_present_holder))
        return false;
      if (!this.holder.equals(that.holder))
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_balance = true && this.isSetBalance();
    boolean that_present_balance = true && that.isSetBalance();
    if (this_present_balance || that_present_balance) {
      if (!(this_present_balance && that_present_balance))
        return false;
      if (!this.balance.equals(that.balance))
        return false;
    }

    boolean this_present_transfersCount = true;
    boolean that_present_transfersCount = true;
    if (this_present_transfersCount || that_present_transfersCount) {
      if (!(this_present_transfersCount && that_present_transfersCount))
        return false;
      if (this.transfersCount != that.transfersCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHolder()) ? 131071 : 524287);
    if (isSetHolder())
      hashCode = hashCode * 8191 + holder.hashCode();

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    hashCode = hashCode * 8191 + ((isSetBalance()) ? 131071 : 524287);
    if (isSetBalance())
      hashCode = hashCode * 8191 + balance.hashCode();

    hashCode = hashCode * 8191 + transfersCount;

    return hashCode;
  }

  @Override
  public int compareTo(TokenHolder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHolder()).compareTo(other.isSetHolder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHolder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.holder, other.holder);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBalance()).compareTo(other.isSetBalance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBalance()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.balance, other.balance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransfersCount()).compareTo(other.isSetTransfersCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransfersCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transfersCount, other.transfersCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenHolder(");
    boolean first = true;

    sb.append("holder:");
    if (this.holder == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.holder, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.token, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("balance:");
    if (this.balance == null) {
      sb.append("null");
    } else {
      sb.append(this.balance);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transfersCount:");
    sb.append(this.transfersCount);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TokenHolderStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenHolderStandardScheme getScheme() {
      return new TokenHolderStandardScheme();
    }
  }

  private static class TokenHolderStandardScheme extends org.apache.thrift.scheme.StandardScheme<TokenHolder> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TokenHolder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOLDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.holder = iprot.readBinary();
              struct.setHolderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readBinary();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BALANCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.balance = iprot.readString();
              struct.setBalanceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRANSFERS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.transfersCount = iprot.readI32();
              struct.setTransfersCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TokenHolder struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.holder != null) {
        oprot.writeFieldBegin(HOLDER_FIELD_DESC);
        oprot.writeBinary(struct.holder);
        oprot.writeFieldEnd();
      }
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeBinary(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.balance != null) {
        oprot.writeFieldBegin(BALANCE_FIELD_DESC);
        oprot.writeString(struct.balance);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TRANSFERS_COUNT_FIELD_DESC);
      oprot.writeI32(struct.transfersCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TokenHolderTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenHolderTupleScheme getScheme() {
      return new TokenHolderTupleScheme();
    }
  }

  private static class TokenHolderTupleScheme extends org.apache.thrift.scheme.TupleScheme<TokenHolder> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TokenHolder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHolder()) {
        optionals.set(0);
      }
      if (struct.isSetToken()) {
        optionals.set(1);
      }
      if (struct.isSetBalance()) {
        optionals.set(2);
      }
      if (struct.isSetTransfersCount()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetHolder()) {
        oprot.writeBinary(struct.holder);
      }
      if (struct.isSetToken()) {
        oprot.writeBinary(struct.token);
      }
      if (struct.isSetBalance()) {
        oprot.writeString(struct.balance);
      }
      if (struct.isSetTransfersCount()) {
        oprot.writeI32(struct.transfersCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TokenHolder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.holder = iprot.readBinary();
        struct.setHolderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.token = iprot.readBinary();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.balance = iprot.readString();
        struct.setBalanceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.transfersCount = iprot.readI32();
        struct.setTransfersCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

