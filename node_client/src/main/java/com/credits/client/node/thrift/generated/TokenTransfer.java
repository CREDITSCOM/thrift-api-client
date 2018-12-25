/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-12-24")
public class TokenTransfer implements org.apache.thrift.TBase<TokenTransfer, TokenTransfer._Fields>, java.io.Serializable, Cloneable, Comparable<TokenTransfer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TokenTransfer");

  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("receiver", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField INITIATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("initiator", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("transaction", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I64, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TokenTransferStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TokenTransferTupleSchemeFactory();

  public java.nio.ByteBuffer token; // required
  public java.lang.String code; // required
  public java.nio.ByteBuffer sender; // required
  public java.nio.ByteBuffer receiver; // required
  public java.lang.String amount; // required
  public java.nio.ByteBuffer initiator; // required
  public TransactionId transaction; // required
  public long time; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN((short)1, "token"),
    CODE((short)2, "code"),
    SENDER((short)3, "sender"),
    RECEIVER((short)4, "receiver"),
    AMOUNT((short)5, "amount"),
    INITIATOR((short)6, "initiator"),
    TRANSACTION((short)7, "transaction"),
    TIME((short)8, "time");

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
        case 1: // TOKEN
          return TOKEN;
        case 2: // CODE
          return CODE;
        case 3: // SENDER
          return SENDER;
        case 4: // RECEIVER
          return RECEIVER;
        case 5: // AMOUNT
          return AMOUNT;
        case 6: // INITIATOR
          return INITIATOR;
        case 7: // TRANSACTION
          return TRANSACTION;
        case 8: // TIME
          return TIME;
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

  // isset id assignments
  private static final int __TIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TokenCode")));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.RECEIVER, new org.apache.thrift.meta_data.FieldMetaData("receiver", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TokenAmount")));
    tmpMap.put(_Fields.INITIATOR, new org.apache.thrift.meta_data.FieldMetaData("initiator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("transaction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Time")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TokenTransfer.class, metaDataMap);
  }

  public TokenTransfer() {
  }

  public TokenTransfer(
    java.nio.ByteBuffer token,
    java.lang.String code,
    java.nio.ByteBuffer sender,
    java.nio.ByteBuffer receiver,
    java.lang.String amount,
    java.nio.ByteBuffer initiator,
    TransactionId transaction,
    long time)
  {
    this();
    this.token = org.apache.thrift.TBaseHelper.copyBinary(token);
    this.code = code;
    this.sender = org.apache.thrift.TBaseHelper.copyBinary(sender);
    this.receiver = org.apache.thrift.TBaseHelper.copyBinary(receiver);
    this.amount = amount;
    this.initiator = org.apache.thrift.TBaseHelper.copyBinary(initiator);
    this.transaction = transaction;
    this.time = time;
    setTimeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenTransfer(TokenTransfer other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetToken()) {
      this.token = org.apache.thrift.TBaseHelper.copyBinary(other.token);
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
    if (other.isSetSender()) {
      this.sender = org.apache.thrift.TBaseHelper.copyBinary(other.sender);
    }
    if (other.isSetReceiver()) {
      this.receiver = org.apache.thrift.TBaseHelper.copyBinary(other.receiver);
    }
    if (other.isSetAmount()) {
      this.amount = other.amount;
    }
    if (other.isSetInitiator()) {
      this.initiator = org.apache.thrift.TBaseHelper.copyBinary(other.initiator);
    }
    if (other.isSetTransaction()) {
      this.transaction = new TransactionId(other.transaction);
    }
    this.time = other.time;
  }

  public TokenTransfer deepCopy() {
    return new TokenTransfer(this);
  }

  @Override
  public void clear() {
    this.token = null;
    this.code = null;
    this.sender = null;
    this.receiver = null;
    this.amount = null;
    this.initiator = null;
    this.transaction = null;
    setTimeIsSet(false);
    this.time = 0;
  }

  public byte[] getToken() {
    setToken(org.apache.thrift.TBaseHelper.rightSize(token));
    return token == null ? null : token.array();
  }

  public java.nio.ByteBuffer bufferForToken() {
    return org.apache.thrift.TBaseHelper.copyBinary(token);
  }

  public TokenTransfer setToken(byte[] token) {
    this.token = token == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(token.clone());
    return this;
  }

  public TokenTransfer setToken(java.nio.ByteBuffer token) {
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

  public java.lang.String getCode() {
    return this.code;
  }

  public TokenTransfer setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public byte[] getSender() {
    setSender(org.apache.thrift.TBaseHelper.rightSize(sender));
    return sender == null ? null : sender.array();
  }

  public java.nio.ByteBuffer bufferForSender() {
    return org.apache.thrift.TBaseHelper.copyBinary(sender);
  }

  public TokenTransfer setSender(byte[] sender) {
    this.sender = sender == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(sender.clone());
    return this;
  }

  public TokenTransfer setSender(java.nio.ByteBuffer sender) {
    this.sender = org.apache.thrift.TBaseHelper.copyBinary(sender);
    return this;
  }

  public void unsetSender() {
    this.sender = null;
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return this.sender != null;
  }

  public void setSenderIsSet(boolean value) {
    if (!value) {
      this.sender = null;
    }
  }

  public byte[] getReceiver() {
    setReceiver(org.apache.thrift.TBaseHelper.rightSize(receiver));
    return receiver == null ? null : receiver.array();
  }

  public java.nio.ByteBuffer bufferForReceiver() {
    return org.apache.thrift.TBaseHelper.copyBinary(receiver);
  }

  public TokenTransfer setReceiver(byte[] receiver) {
    this.receiver = receiver == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(receiver.clone());
    return this;
  }

  public TokenTransfer setReceiver(java.nio.ByteBuffer receiver) {
    this.receiver = org.apache.thrift.TBaseHelper.copyBinary(receiver);
    return this;
  }

  public void unsetReceiver() {
    this.receiver = null;
  }

  /** Returns true if field receiver is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiver() {
    return this.receiver != null;
  }

  public void setReceiverIsSet(boolean value) {
    if (!value) {
      this.receiver = null;
    }
  }

  public java.lang.String getAmount() {
    return this.amount;
  }

  public TokenTransfer setAmount(java.lang.String amount) {
    this.amount = amount;
    return this;
  }

  public void unsetAmount() {
    this.amount = null;
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return this.amount != null;
  }

  public void setAmountIsSet(boolean value) {
    if (!value) {
      this.amount = null;
    }
  }

  public byte[] getInitiator() {
    setInitiator(org.apache.thrift.TBaseHelper.rightSize(initiator));
    return initiator == null ? null : initiator.array();
  }

  public java.nio.ByteBuffer bufferForInitiator() {
    return org.apache.thrift.TBaseHelper.copyBinary(initiator);
  }

  public TokenTransfer setInitiator(byte[] initiator) {
    this.initiator = initiator == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(initiator.clone());
    return this;
  }

  public TokenTransfer setInitiator(java.nio.ByteBuffer initiator) {
    this.initiator = org.apache.thrift.TBaseHelper.copyBinary(initiator);
    return this;
  }

  public void unsetInitiator() {
    this.initiator = null;
  }

  /** Returns true if field initiator is set (has been assigned a value) and false otherwise */
  public boolean isSetInitiator() {
    return this.initiator != null;
  }

  public void setInitiatorIsSet(boolean value) {
    if (!value) {
      this.initiator = null;
    }
  }

  public TransactionId getTransaction() {
    return this.transaction;
  }

  public TokenTransfer setTransaction(TransactionId transaction) {
    this.transaction = transaction;
    return this;
  }

  public void unsetTransaction() {
    this.transaction = null;
  }

  /** Returns true if field transaction is set (has been assigned a value) and false otherwise */
  public boolean isSetTransaction() {
    return this.transaction != null;
  }

  public void setTransactionIsSet(boolean value) {
    if (!value) {
      this.transaction = null;
    }
  }

  public long getTime() {
    return this.time;
  }

  public TokenTransfer setTime(long time) {
    this.time = time;
    setTimeIsSet(true);
    return this;
  }

  public void unsetTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field time is set (has been assigned a value) and false otherwise */
  public boolean isSetTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void setTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
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

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((java.lang.String)value);
      }
      break;

    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        if (value instanceof byte[]) {
          setSender((byte[])value);
        } else {
          setSender((java.nio.ByteBuffer)value);
        }
      }
      break;

    case RECEIVER:
      if (value == null) {
        unsetReceiver();
      } else {
        if (value instanceof byte[]) {
          setReceiver((byte[])value);
        } else {
          setReceiver((java.nio.ByteBuffer)value);
        }
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((java.lang.String)value);
      }
      break;

    case INITIATOR:
      if (value == null) {
        unsetInitiator();
      } else {
        if (value instanceof byte[]) {
          setInitiator((byte[])value);
        } else {
          setInitiator((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TRANSACTION:
      if (value == null) {
        unsetTransaction();
      } else {
        setTransaction((TransactionId)value);
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN:
      return getToken();

    case CODE:
      return getCode();

    case SENDER:
      return getSender();

    case RECEIVER:
      return getReceiver();

    case AMOUNT:
      return getAmount();

    case INITIATOR:
      return getInitiator();

    case TRANSACTION:
      return getTransaction();

    case TIME:
      return getTime();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOKEN:
      return isSetToken();
    case CODE:
      return isSetCode();
    case SENDER:
      return isSetSender();
    case RECEIVER:
      return isSetReceiver();
    case AMOUNT:
      return isSetAmount();
    case INITIATOR:
      return isSetInitiator();
    case TRANSACTION:
      return isSetTransaction();
    case TIME:
      return isSetTime();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TokenTransfer)
      return this.equals((TokenTransfer)that);
    return false;
  }

  public boolean equals(TokenTransfer that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    boolean this_present_sender = true && this.isSetSender();
    boolean that_present_sender = true && that.isSetSender();
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (!this.sender.equals(that.sender))
        return false;
    }

    boolean this_present_receiver = true && this.isSetReceiver();
    boolean that_present_receiver = true && that.isSetReceiver();
    if (this_present_receiver || that_present_receiver) {
      if (!(this_present_receiver && that_present_receiver))
        return false;
      if (!this.receiver.equals(that.receiver))
        return false;
    }

    boolean this_present_amount = true && this.isSetAmount();
    boolean that_present_amount = true && that.isSetAmount();
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (!this.amount.equals(that.amount))
        return false;
    }

    boolean this_present_initiator = true && this.isSetInitiator();
    boolean that_present_initiator = true && that.isSetInitiator();
    if (this_present_initiator || that_present_initiator) {
      if (!(this_present_initiator && that_present_initiator))
        return false;
      if (!this.initiator.equals(that.initiator))
        return false;
    }

    boolean this_present_transaction = true && this.isSetTransaction();
    boolean that_present_transaction = true && that.isSetTransaction();
    if (this_present_transaction || that_present_transaction) {
      if (!(this_present_transaction && that_present_transaction))
        return false;
      if (!this.transaction.equals(that.transaction))
        return false;
    }

    boolean this_present_time = true;
    boolean that_present_time = true;
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (this.time != that.time)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
    if (isSetCode())
      hashCode = hashCode * 8191 + code.hashCode();

    hashCode = hashCode * 8191 + ((isSetSender()) ? 131071 : 524287);
    if (isSetSender())
      hashCode = hashCode * 8191 + sender.hashCode();

    hashCode = hashCode * 8191 + ((isSetReceiver()) ? 131071 : 524287);
    if (isSetReceiver())
      hashCode = hashCode * 8191 + receiver.hashCode();

    hashCode = hashCode * 8191 + ((isSetAmount()) ? 131071 : 524287);
    if (isSetAmount())
      hashCode = hashCode * 8191 + amount.hashCode();

    hashCode = hashCode * 8191 + ((isSetInitiator()) ? 131071 : 524287);
    if (isSetInitiator())
      hashCode = hashCode * 8191 + initiator.hashCode();

    hashCode = hashCode * 8191 + ((isSetTransaction()) ? 131071 : 524287);
    if (isSetTransaction())
      hashCode = hashCode * 8191 + transaction.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(time);

    return hashCode;
  }

  @Override
  public int compareTo(TokenTransfer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSender()).compareTo(other.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, other.sender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReceiver()).compareTo(other.isSetReceiver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiver, other.receiver);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInitiator()).compareTo(other.isSetInitiator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInitiator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.initiator, other.initiator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransaction()).compareTo(other.isSetTransaction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransaction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transaction, other.transaction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenTransfer(");
    boolean first = true;

    sb.append("token:");
    if (this.token == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.token, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender:");
    if (this.sender == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.sender, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiver:");
    if (this.receiver == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.receiver, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    if (this.amount == null) {
      sb.append("null");
    } else {
      sb.append(this.amount);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("initiator:");
    if (this.initiator == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.initiator, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transaction:");
    if (this.transaction == null) {
      sb.append("null");
    } else {
      sb.append(this.transaction);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time:");
    sb.append(this.time);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (transaction != null) {
      transaction.validate();
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

  private static class TokenTransferStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenTransferStandardScheme getScheme() {
      return new TokenTransferStandardScheme();
    }
  }

  private static class TokenTransferStandardScheme extends org.apache.thrift.scheme.StandardScheme<TokenTransfer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TokenTransfer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readBinary();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sender = iprot.readBinary();
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RECEIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.receiver = iprot.readBinary();
              struct.setReceiverIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.amount = iprot.readString();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // INITIATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.initiator = iprot.readBinary();
              struct.setInitiatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TRANSACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transaction = new TransactionId();
              struct.transaction.read(iprot);
              struct.setTransactionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time = iprot.readI64();
              struct.setTimeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TokenTransfer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.token != null) {
        oprot.writeFieldBegin(TOKEN_FIELD_DESC);
        oprot.writeBinary(struct.token);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      if (struct.sender != null) {
        oprot.writeFieldBegin(SENDER_FIELD_DESC);
        oprot.writeBinary(struct.sender);
        oprot.writeFieldEnd();
      }
      if (struct.receiver != null) {
        oprot.writeFieldBegin(RECEIVER_FIELD_DESC);
        oprot.writeBinary(struct.receiver);
        oprot.writeFieldEnd();
      }
      if (struct.amount != null) {
        oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
        oprot.writeString(struct.amount);
        oprot.writeFieldEnd();
      }
      if (struct.initiator != null) {
        oprot.writeFieldBegin(INITIATOR_FIELD_DESC);
        oprot.writeBinary(struct.initiator);
        oprot.writeFieldEnd();
      }
      if (struct.transaction != null) {
        oprot.writeFieldBegin(TRANSACTION_FIELD_DESC);
        struct.transaction.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI64(struct.time);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TokenTransferTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenTransferTupleScheme getScheme() {
      return new TokenTransferTupleScheme();
    }
  }

  private static class TokenTransferTupleScheme extends org.apache.thrift.scheme.TupleScheme<TokenTransfer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TokenTransfer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetToken()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      if (struct.isSetSender()) {
        optionals.set(2);
      }
      if (struct.isSetReceiver()) {
        optionals.set(3);
      }
      if (struct.isSetAmount()) {
        optionals.set(4);
      }
      if (struct.isSetInitiator()) {
        optionals.set(5);
      }
      if (struct.isSetTransaction()) {
        optionals.set(6);
      }
      if (struct.isSetTime()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetToken()) {
        oprot.writeBinary(struct.token);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
      if (struct.isSetSender()) {
        oprot.writeBinary(struct.sender);
      }
      if (struct.isSetReceiver()) {
        oprot.writeBinary(struct.receiver);
      }
      if (struct.isSetAmount()) {
        oprot.writeString(struct.amount);
      }
      if (struct.isSetInitiator()) {
        oprot.writeBinary(struct.initiator);
      }
      if (struct.isSetTransaction()) {
        struct.transaction.write(oprot);
      }
      if (struct.isSetTime()) {
        oprot.writeI64(struct.time);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TokenTransfer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.token = iprot.readBinary();
        struct.setTokenIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sender = iprot.readBinary();
        struct.setSenderIsSet(true);
      }
      if (incoming.get(3)) {
        struct.receiver = iprot.readBinary();
        struct.setReceiverIsSet(true);
      }
      if (incoming.get(4)) {
        struct.amount = iprot.readString();
        struct.setAmountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.initiator = iprot.readBinary();
        struct.setInitiatorIsSet(true);
      }
      if (incoming.get(6)) {
        struct.transaction = new TransactionId();
        struct.transaction.read(iprot);
        struct.setTransactionIsSet(true);
      }
      if (incoming.get(7)) {
        struct.time = iprot.readI64();
        struct.setTimeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

