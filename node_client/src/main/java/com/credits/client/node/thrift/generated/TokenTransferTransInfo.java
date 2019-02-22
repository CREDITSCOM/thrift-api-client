/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-02-22")
public class TokenTransferTransInfo implements org.apache.thrift.TBase<TokenTransferTransInfo, TokenTransferTransInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TokenTransferTransInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TokenTransferTransInfo");

  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("receiver", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField STATE_TRANSACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("stateTransaction", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField TRANSFER_SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("transferSuccess", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TokenTransferTransInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TokenTransferTransInfoTupleSchemeFactory();

  public java.lang.String code; // required
  public java.nio.ByteBuffer sender; // required
  public java.nio.ByteBuffer receiver; // required
  public java.lang.String amount; // required
  /**
   * 
   * @see SmartOperationState
   */
  public SmartOperationState state; // required
  public TransactionId stateTransaction; // optional
  public boolean transferSuccess; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODE((short)1, "code"),
    SENDER((short)2, "sender"),
    RECEIVER((short)3, "receiver"),
    AMOUNT((short)4, "amount"),
    /**
     * 
     * @see SmartOperationState
     */
    STATE((short)5, "state"),
    STATE_TRANSACTION((short)6, "stateTransaction"),
    TRANSFER_SUCCESS((short)7, "transferSuccess");

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
        case 1: // CODE
          return CODE;
        case 2: // SENDER
          return SENDER;
        case 3: // RECEIVER
          return RECEIVER;
        case 4: // AMOUNT
          return AMOUNT;
        case 5: // STATE
          return STATE;
        case 6: // STATE_TRANSACTION
          return STATE_TRANSACTION;
        case 7: // TRANSFER_SUCCESS
          return TRANSFER_SUCCESS;
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
  private static final int __TRANSFERSUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.STATE_TRANSACTION,_Fields.TRANSFER_SUCCESS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TokenCode")));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.RECEIVER, new org.apache.thrift.meta_data.FieldMetaData("receiver", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "TokenAmount")));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SmartOperationState.class)));
    tmpMap.put(_Fields.STATE_TRANSACTION, new org.apache.thrift.meta_data.FieldMetaData("stateTransaction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    tmpMap.put(_Fields.TRANSFER_SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("transferSuccess", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TokenTransferTransInfo.class, metaDataMap);
  }

  public TokenTransferTransInfo() {
  }

  public TokenTransferTransInfo(
    java.lang.String code,
    java.nio.ByteBuffer sender,
    java.nio.ByteBuffer receiver,
    java.lang.String amount,
    SmartOperationState state)
  {
    this();
    this.code = code;
    this.sender = org.apache.thrift.TBaseHelper.copyBinary(sender);
    this.receiver = org.apache.thrift.TBaseHelper.copyBinary(receiver);
    this.amount = amount;
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenTransferTransInfo(TokenTransferTransInfo other) {
    __isset_bitfield = other.__isset_bitfield;
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
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetStateTransaction()) {
      this.stateTransaction = new TransactionId(other.stateTransaction);
    }
    this.transferSuccess = other.transferSuccess;
  }

  public TokenTransferTransInfo deepCopy() {
    return new TokenTransferTransInfo(this);
  }

  @Override
  public void clear() {
    this.code = null;
    this.sender = null;
    this.receiver = null;
    this.amount = null;
    this.state = null;
    this.stateTransaction = null;
    setTransferSuccessIsSet(false);
    this.transferSuccess = false;
  }

  public java.lang.String getCode() {
    return this.code;
  }

  public TokenTransferTransInfo setCode(java.lang.String code) {
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

  public TokenTransferTransInfo setSender(byte[] sender) {
    this.sender = sender == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(sender.clone());
    return this;
  }

  public TokenTransferTransInfo setSender(java.nio.ByteBuffer sender) {
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

  public TokenTransferTransInfo setReceiver(byte[] receiver) {
    this.receiver = receiver == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(receiver.clone());
    return this;
  }

  public TokenTransferTransInfo setReceiver(java.nio.ByteBuffer receiver) {
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

  public TokenTransferTransInfo setAmount(java.lang.String amount) {
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

  /**
   * 
   * @see SmartOperationState
   */
  public SmartOperationState getState() {
    return this.state;
  }

  /**
   * 
   * @see SmartOperationState
   */
  public TokenTransferTransInfo setState(SmartOperationState state) {
    this.state = state;
    return this;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public TransactionId getStateTransaction() {
    return this.stateTransaction;
  }

  public TokenTransferTransInfo setStateTransaction(TransactionId stateTransaction) {
    this.stateTransaction = stateTransaction;
    return this;
  }

  public void unsetStateTransaction() {
    this.stateTransaction = null;
  }

  /** Returns true if field stateTransaction is set (has been assigned a value) and false otherwise */
  public boolean isSetStateTransaction() {
    return this.stateTransaction != null;
  }

  public void setStateTransactionIsSet(boolean value) {
    if (!value) {
      this.stateTransaction = null;
    }
  }

  public boolean isTransferSuccess() {
    return this.transferSuccess;
  }

  public TokenTransferTransInfo setTransferSuccess(boolean transferSuccess) {
    this.transferSuccess = transferSuccess;
    setTransferSuccessIsSet(true);
    return this;
  }

  public void unsetTransferSuccess() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSFERSUCCESS_ISSET_ID);
  }

  /** Returns true if field transferSuccess is set (has been assigned a value) and false otherwise */
  public boolean isSetTransferSuccess() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSFERSUCCESS_ISSET_ID);
  }

  public void setTransferSuccessIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSFERSUCCESS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
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

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((SmartOperationState)value);
      }
      break;

    case STATE_TRANSACTION:
      if (value == null) {
        unsetStateTransaction();
      } else {
        setStateTransaction((TransactionId)value);
      }
      break;

    case TRANSFER_SUCCESS:
      if (value == null) {
        unsetTransferSuccess();
      } else {
        setTransferSuccess((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODE:
      return getCode();

    case SENDER:
      return getSender();

    case RECEIVER:
      return getReceiver();

    case AMOUNT:
      return getAmount();

    case STATE:
      return getState();

    case STATE_TRANSACTION:
      return getStateTransaction();

    case TRANSFER_SUCCESS:
      return isTransferSuccess();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODE:
      return isSetCode();
    case SENDER:
      return isSetSender();
    case RECEIVER:
      return isSetReceiver();
    case AMOUNT:
      return isSetAmount();
    case STATE:
      return isSetState();
    case STATE_TRANSACTION:
      return isSetStateTransaction();
    case TRANSFER_SUCCESS:
      return isSetTransferSuccess();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TokenTransferTransInfo)
      return this.equals((TokenTransferTransInfo)that);
    return false;
  }

  public boolean equals(TokenTransferTransInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

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

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_stateTransaction = true && this.isSetStateTransaction();
    boolean that_present_stateTransaction = true && that.isSetStateTransaction();
    if (this_present_stateTransaction || that_present_stateTransaction) {
      if (!(this_present_stateTransaction && that_present_stateTransaction))
        return false;
      if (!this.stateTransaction.equals(that.stateTransaction))
        return false;
    }

    boolean this_present_transferSuccess = true && this.isSetTransferSuccess();
    boolean that_present_transferSuccess = true && that.isSetTransferSuccess();
    if (this_present_transferSuccess || that_present_transferSuccess) {
      if (!(this_present_transferSuccess && that_present_transferSuccess))
        return false;
      if (this.transferSuccess != that.transferSuccess)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

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

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.getValue();

    hashCode = hashCode * 8191 + ((isSetStateTransaction()) ? 131071 : 524287);
    if (isSetStateTransaction())
      hashCode = hashCode * 8191 + stateTransaction.hashCode();

    hashCode = hashCode * 8191 + ((isSetTransferSuccess()) ? 131071 : 524287);
    if (isSetTransferSuccess())
      hashCode = hashCode * 8191 + ((transferSuccess) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TokenTransferTransInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStateTransaction()).compareTo(other.isSetStateTransaction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStateTransaction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stateTransaction, other.stateTransaction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransferSuccess()).compareTo(other.isSetTransferSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransferSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transferSuccess, other.transferSuccess);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenTransferTransInfo(");
    boolean first = true;

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
    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (isSetStateTransaction()) {
      if (!first) sb.append(", ");
      sb.append("stateTransaction:");
      if (this.stateTransaction == null) {
        sb.append("null");
      } else {
        sb.append(this.stateTransaction);
      }
      first = false;
    }
    if (isSetTransferSuccess()) {
      if (!first) sb.append(", ");
      sb.append("transferSuccess:");
      sb.append(this.transferSuccess);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stateTransaction != null) {
      stateTransaction.validate();
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

  private static class TokenTransferTransInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenTransferTransInfoStandardScheme getScheme() {
      return new TokenTransferTransInfoStandardScheme();
    }
  }

  private static class TokenTransferTransInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TokenTransferTransInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TokenTransferTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sender = iprot.readBinary();
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECEIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.receiver = iprot.readBinary();
              struct.setReceiverIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.amount = iprot.readString();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STATE_TRANSACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stateTransaction = new TransactionId();
              struct.stateTransaction.read(iprot);
              struct.setStateTransactionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TRANSFER_SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.transferSuccess = iprot.readBool();
              struct.setTransferSuccessIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TokenTransferTransInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
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
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.stateTransaction != null) {
        if (struct.isSetStateTransaction()) {
          oprot.writeFieldBegin(STATE_TRANSACTION_FIELD_DESC);
          struct.stateTransaction.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTransferSuccess()) {
        oprot.writeFieldBegin(TRANSFER_SUCCESS_FIELD_DESC);
        oprot.writeBool(struct.transferSuccess);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TokenTransferTransInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TokenTransferTransInfoTupleScheme getScheme() {
      return new TokenTransferTransInfoTupleScheme();
    }
  }

  private static class TokenTransferTransInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TokenTransferTransInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TokenTransferTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCode()) {
        optionals.set(0);
      }
      if (struct.isSetSender()) {
        optionals.set(1);
      }
      if (struct.isSetReceiver()) {
        optionals.set(2);
      }
      if (struct.isSetAmount()) {
        optionals.set(3);
      }
      if (struct.isSetState()) {
        optionals.set(4);
      }
      if (struct.isSetStateTransaction()) {
        optionals.set(5);
      }
      if (struct.isSetTransferSuccess()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
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
      if (struct.isSetState()) {
        oprot.writeI32(struct.state.getValue());
      }
      if (struct.isSetStateTransaction()) {
        struct.stateTransaction.write(oprot);
      }
      if (struct.isSetTransferSuccess()) {
        oprot.writeBool(struct.transferSuccess);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TokenTransferTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sender = iprot.readBinary();
        struct.setSenderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.receiver = iprot.readBinary();
        struct.setReceiverIsSet(true);
      }
      if (incoming.get(3)) {
        struct.amount = iprot.readString();
        struct.setAmountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.state = com.credits.client.node.thrift.generated.SmartOperationState.findByValue(iprot.readI32());
        struct.setStateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.stateTransaction = new TransactionId();
        struct.stateTransaction.read(iprot);
        struct.setStateTransactionIsSet(true);
      }
      if (incoming.get(6)) {
        struct.transferSuccess = iprot.readBool();
        struct.setTransferSuccessIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

