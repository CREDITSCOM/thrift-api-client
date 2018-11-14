/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-14")
public class TrxnsCount implements org.apache.thrift.TBase<TrxnsCount, TrxnsCount._Fields>, java.io.Serializable, Cloneable, Comparable<TrxnsCount> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TrxnsCount");

  private static final org.apache.thrift.protocol.TField SEND_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("sendCount", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField RECV_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("recvCount", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TrxnsCountStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TrxnsCountTupleSchemeFactory();

  public long sendCount; // required
  public long recvCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SEND_COUNT((short)1, "sendCount"),
    RECV_COUNT((short)2, "recvCount");

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
        case 1: // SEND_COUNT
          return SEND_COUNT;
        case 2: // RECV_COUNT
          return RECV_COUNT;
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
  private static final int __SENDCOUNT_ISSET_ID = 0;
  private static final int __RECVCOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SEND_COUNT, new org.apache.thrift.meta_data.FieldMetaData("sendCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RECV_COUNT, new org.apache.thrift.meta_data.FieldMetaData("recvCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TrxnsCount.class, metaDataMap);
  }

  public TrxnsCount() {
  }

  public TrxnsCount(
    long sendCount,
    long recvCount)
  {
    this();
    this.sendCount = sendCount;
    setSendCountIsSet(true);
    this.recvCount = recvCount;
    setRecvCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TrxnsCount(TrxnsCount other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sendCount = other.sendCount;
    this.recvCount = other.recvCount;
  }

  public TrxnsCount deepCopy() {
    return new TrxnsCount(this);
  }

  @Override
  public void clear() {
    setSendCountIsSet(false);
    this.sendCount = 0;
    setRecvCountIsSet(false);
    this.recvCount = 0;
  }

  public long getSendCount() {
    return this.sendCount;
  }

  public TrxnsCount setSendCount(long sendCount) {
    this.sendCount = sendCount;
    setSendCountIsSet(true);
    return this;
  }

  public void unsetSendCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SENDCOUNT_ISSET_ID);
  }

  /** Returns true if field sendCount is set (has been assigned a value) and false otherwise */
  public boolean isSetSendCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SENDCOUNT_ISSET_ID);
  }

  public void setSendCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SENDCOUNT_ISSET_ID, value);
  }

  public long getRecvCount() {
    return this.recvCount;
  }

  public TrxnsCount setRecvCount(long recvCount) {
    this.recvCount = recvCount;
    setRecvCountIsSet(true);
    return this;
  }

  public void unsetRecvCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECVCOUNT_ISSET_ID);
  }

  /** Returns true if field recvCount is set (has been assigned a value) and false otherwise */
  public boolean isSetRecvCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECVCOUNT_ISSET_ID);
  }

  public void setRecvCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECVCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SEND_COUNT:
      if (value == null) {
        unsetSendCount();
      } else {
        setSendCount((java.lang.Long)value);
      }
      break;

    case RECV_COUNT:
      if (value == null) {
        unsetRecvCount();
      } else {
        setRecvCount((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SEND_COUNT:
      return getSendCount();

    case RECV_COUNT:
      return getRecvCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SEND_COUNT:
      return isSetSendCount();
    case RECV_COUNT:
      return isSetRecvCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TrxnsCount)
      return this.equals((TrxnsCount)that);
    return false;
  }

  public boolean equals(TrxnsCount that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sendCount = true;
    boolean that_present_sendCount = true;
    if (this_present_sendCount || that_present_sendCount) {
      if (!(this_present_sendCount && that_present_sendCount))
        return false;
      if (this.sendCount != that.sendCount)
        return false;
    }

    boolean this_present_recvCount = true;
    boolean that_present_recvCount = true;
    if (this_present_recvCount || that_present_recvCount) {
      if (!(this_present_recvCount && that_present_recvCount))
        return false;
      if (this.recvCount != that.recvCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sendCount);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(recvCount);

    return hashCode;
  }

  @Override
  public int compareTo(TrxnsCount other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSendCount()).compareTo(other.isSetSendCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSendCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sendCount, other.sendCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecvCount()).compareTo(other.isSetRecvCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecvCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recvCount, other.recvCount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TrxnsCount(");
    boolean first = true;

    sb.append("sendCount:");
    sb.append(this.sendCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("recvCount:");
    sb.append(this.recvCount);
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

  private static class TrxnsCountStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TrxnsCountStandardScheme getScheme() {
      return new TrxnsCountStandardScheme();
    }
  }

  private static class TrxnsCountStandardScheme extends org.apache.thrift.scheme.StandardScheme<TrxnsCount> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TrxnsCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SEND_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sendCount = iprot.readI64();
              struct.setSendCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECV_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.recvCount = iprot.readI64();
              struct.setRecvCountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TrxnsCount struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SEND_COUNT_FIELD_DESC);
      oprot.writeI64(struct.sendCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECV_COUNT_FIELD_DESC);
      oprot.writeI64(struct.recvCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TrxnsCountTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TrxnsCountTupleScheme getScheme() {
      return new TrxnsCountTupleScheme();
    }
  }

  private static class TrxnsCountTupleScheme extends org.apache.thrift.scheme.TupleScheme<TrxnsCount> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TrxnsCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSendCount()) {
        optionals.set(0);
      }
      if (struct.isSetRecvCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSendCount()) {
        oprot.writeI64(struct.sendCount);
      }
      if (struct.isSetRecvCount()) {
        oprot.writeI64(struct.recvCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TrxnsCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.sendCount = iprot.readI64();
        struct.setSendCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.recvCount = iprot.readI64();
        struct.setRecvCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

