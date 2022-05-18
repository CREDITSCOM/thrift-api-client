/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-09-19")
public class ExtraFee implements org.apache.thrift.TBase<ExtraFee, ExtraFee._Fields>, java.io.Serializable, Cloneable, Comparable<ExtraFee> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExtraFee");

  private static final org.apache.thrift.protocol.TField SUM_FIELD_DESC = new org.apache.thrift.protocol.TField("sum", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField COMMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("comment", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TRANSACTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionId", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExtraFeeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExtraFeeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount sum; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String comment; // required
  public @org.apache.thrift.annotation.Nullable TransactionId transactionId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUM((short)1, "sum"),
    COMMENT((short)2, "comment"),
    TRANSACTION_ID((short)3, "transactionId");

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
        case 1: // SUM
          return SUM;
        case 2: // COMMENT
          return COMMENT;
        case 3: // TRANSACTION_ID
          return TRANSACTION_ID;
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
    tmpMap.put(_Fields.SUM, new org.apache.thrift.meta_data.FieldMetaData("sum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.credits.general.thrift.generated.Amount.class)));
    tmpMap.put(_Fields.COMMENT, new org.apache.thrift.meta_data.FieldMetaData("comment", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRANSACTION_ID, new org.apache.thrift.meta_data.FieldMetaData("transactionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TransactionId.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExtraFee.class, metaDataMap);
  }

  public ExtraFee() {
  }

  public ExtraFee(
    com.credits.general.thrift.generated.Amount sum,
    java.lang.String comment,
    TransactionId transactionId)
  {
    this();
    this.sum = sum;
    this.comment = comment;
    this.transactionId = transactionId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExtraFee(ExtraFee other) {
    if (other.isSetSum()) {
      this.sum = new com.credits.general.thrift.generated.Amount(other.sum);
    }
    if (other.isSetComment()) {
      this.comment = other.comment;
    }
    if (other.isSetTransactionId()) {
      this.transactionId = new TransactionId(other.transactionId);
    }
  }

  public ExtraFee deepCopy() {
    return new ExtraFee(this);
  }

  @Override
  public void clear() {
    this.sum = null;
    this.comment = null;
    this.transactionId = null;
  }

  @org.apache.thrift.annotation.Nullable
  public com.credits.general.thrift.generated.Amount getSum() {
    return this.sum;
  }

  public ExtraFee setSum(@org.apache.thrift.annotation.Nullable com.credits.general.thrift.generated.Amount sum) {
    this.sum = sum;
    return this;
  }

  public void unsetSum() {
    this.sum = null;
  }

  /** Returns true if field sum is set (has been assigned a value) and false otherwise */
  public boolean isSetSum() {
    return this.sum != null;
  }

  public void setSumIsSet(boolean value) {
    if (!value) {
      this.sum = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getComment() {
    return this.comment;
  }

  public ExtraFee setComment(@org.apache.thrift.annotation.Nullable java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  public void unsetComment() {
    this.comment = null;
  }

  /** Returns true if field comment is set (has been assigned a value) and false otherwise */
  public boolean isSetComment() {
    return this.comment != null;
  }

  public void setCommentIsSet(boolean value) {
    if (!value) {
      this.comment = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public TransactionId getTransactionId() {
    return this.transactionId;
  }

  public ExtraFee setTransactionId(@org.apache.thrift.annotation.Nullable TransactionId transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  public void unsetTransactionId() {
    this.transactionId = null;
  }

  /** Returns true if field transactionId is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionId() {
    return this.transactionId != null;
  }

  public void setTransactionIdIsSet(boolean value) {
    if (!value) {
      this.transactionId = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SUM:
      if (value == null) {
        unsetSum();
      } else {
        setSum((com.credits.general.thrift.generated.Amount)value);
      }
      break;

    case COMMENT:
      if (value == null) {
        unsetComment();
      } else {
        setComment((java.lang.String)value);
      }
      break;

    case TRANSACTION_ID:
      if (value == null) {
        unsetTransactionId();
      } else {
        setTransactionId((TransactionId)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUM:
      return getSum();

    case COMMENT:
      return getComment();

    case TRANSACTION_ID:
      return getTransactionId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUM:
      return isSetSum();
    case COMMENT:
      return isSetComment();
    case TRANSACTION_ID:
      return isSetTransactionId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ExtraFee)
      return this.equals((ExtraFee)that);
    return false;
  }

  public boolean equals(ExtraFee that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sum = true && this.isSetSum();
    boolean that_present_sum = true && that.isSetSum();
    if (this_present_sum || that_present_sum) {
      if (!(this_present_sum && that_present_sum))
        return false;
      if (!this.sum.equals(that.sum))
        return false;
    }

    boolean this_present_comment = true && this.isSetComment();
    boolean that_present_comment = true && that.isSetComment();
    if (this_present_comment || that_present_comment) {
      if (!(this_present_comment && that_present_comment))
        return false;
      if (!this.comment.equals(that.comment))
        return false;
    }

    boolean this_present_transactionId = true && this.isSetTransactionId();
    boolean that_present_transactionId = true && that.isSetTransactionId();
    if (this_present_transactionId || that_present_transactionId) {
      if (!(this_present_transactionId && that_present_transactionId))
        return false;
      if (!this.transactionId.equals(that.transactionId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSum()) ? 131071 : 524287);
    if (isSetSum())
      hashCode = hashCode * 8191 + sum.hashCode();

    hashCode = hashCode * 8191 + ((isSetComment()) ? 131071 : 524287);
    if (isSetComment())
      hashCode = hashCode * 8191 + comment.hashCode();

    hashCode = hashCode * 8191 + ((isSetTransactionId()) ? 131071 : 524287);
    if (isSetTransactionId())
      hashCode = hashCode * 8191 + transactionId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExtraFee other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSum()).compareTo(other.isSetSum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sum, other.sum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetComment()).compareTo(other.isSetComment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comment, other.comment);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTransactionId()).compareTo(other.isSetTransactionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionId, other.transactionId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtraFee(");
    boolean first = true;

    sb.append("sum:");
    if (this.sum == null) {
      sb.append("null");
    } else {
      sb.append(this.sum);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("comment:");
    if (this.comment == null) {
      sb.append("null");
    } else {
      sb.append(this.comment);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactionId:");
    if (this.transactionId == null) {
      sb.append("null");
    } else {
      sb.append(this.transactionId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sum != null) {
      sum.validate();
    }
    if (transactionId != null) {
      transactionId.validate();
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

  private static class ExtraFeeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExtraFeeStandardScheme getScheme() {
      return new ExtraFeeStandardScheme();
    }
  }

  private static class ExtraFeeStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExtraFee> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExtraFee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sum = new com.credits.general.thrift.generated.Amount();
              struct.sum.read(iprot);
              struct.setSumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comment = iprot.readString();
              struct.setCommentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TRANSACTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.transactionId = new TransactionId();
              struct.transactionId.read(iprot);
              struct.setTransactionIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExtraFee struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sum != null) {
        oprot.writeFieldBegin(SUM_FIELD_DESC);
        struct.sum.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.comment != null) {
        oprot.writeFieldBegin(COMMENT_FIELD_DESC);
        oprot.writeString(struct.comment);
        oprot.writeFieldEnd();
      }
      if (struct.transactionId != null) {
        oprot.writeFieldBegin(TRANSACTION_ID_FIELD_DESC);
        struct.transactionId.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExtraFeeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExtraFeeTupleScheme getScheme() {
      return new ExtraFeeTupleScheme();
    }
  }

  private static class ExtraFeeTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExtraFee> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExtraFee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSum()) {
        optionals.set(0);
      }
      if (struct.isSetComment()) {
        optionals.set(1);
      }
      if (struct.isSetTransactionId()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSum()) {
        struct.sum.write(oprot);
      }
      if (struct.isSetComment()) {
        oprot.writeString(struct.comment);
      }
      if (struct.isSetTransactionId()) {
        struct.transactionId.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExtraFee struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.sum = new com.credits.general.thrift.generated.Amount();
        struct.sum.read(iprot);
        struct.setSumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.comment = iprot.readString();
        struct.setCommentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.transactionId = new TransactionId();
        struct.transactionId.read(iprot);
        struct.setTransactionIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

