/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-12-10")
public class Pool implements org.apache.thrift.TBase<Pool, Pool._Fields>, java.io.Serializable, Cloneable, Comparable<Pool> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pool");

  private static final org.apache.thrift.protocol.TField HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("hash", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PREV_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("prevHash", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField TRANSACTIONS_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("transactionsCount", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField POOL_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("poolNumber", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField WRITER_FIELD_DESC = new org.apache.thrift.protocol.TField("writer", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField TOTAL_FEE_FIELD_DESC = new org.apache.thrift.protocol.TField("totalFee", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PoolStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PoolTupleSchemeFactory();

  public java.nio.ByteBuffer hash; // required
  public java.nio.ByteBuffer prevHash; // required
  public long time; // required
  public int transactionsCount; // required
  public long poolNumber; // required
  public java.nio.ByteBuffer writer; // required
  public Amount totalFee; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HASH((short)1, "hash"),
    PREV_HASH((short)2, "prevHash"),
    TIME((short)3, "time"),
    TRANSACTIONS_COUNT((short)4, "transactionsCount"),
    POOL_NUMBER((short)5, "poolNumber"),
    WRITER((short)6, "writer"),
    TOTAL_FEE((short)7, "totalFee");

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
        case 1: // HASH
          return HASH;
        case 2: // PREV_HASH
          return PREV_HASH;
        case 3: // TIME
          return TIME;
        case 4: // TRANSACTIONS_COUNT
          return TRANSACTIONS_COUNT;
        case 5: // POOL_NUMBER
          return POOL_NUMBER;
        case 6: // WRITER
          return WRITER;
        case 7: // TOTAL_FEE
          return TOTAL_FEE;
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
  private static final int __TRANSACTIONSCOUNT_ISSET_ID = 1;
  private static final int __POOLNUMBER_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HASH, new org.apache.thrift.meta_data.FieldMetaData("hash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "PoolHash")));
    tmpMap.put(_Fields.PREV_HASH, new org.apache.thrift.meta_data.FieldMetaData("prevHash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "PoolHash")));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Time")));
    tmpMap.put(_Fields.TRANSACTIONS_COUNT, new org.apache.thrift.meta_data.FieldMetaData("transactionsCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POOL_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("poolNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "PoolNumber")));
    tmpMap.put(_Fields.WRITER, new org.apache.thrift.meta_data.FieldMetaData("writer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Address")));
    tmpMap.put(_Fields.TOTAL_FEE, new org.apache.thrift.meta_data.FieldMetaData("totalFee", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Amount.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pool.class, metaDataMap);
  }

  public Pool() {
  }

  public Pool(
    java.nio.ByteBuffer hash,
    java.nio.ByteBuffer prevHash,
    long time,
    int transactionsCount,
    long poolNumber,
    java.nio.ByteBuffer writer,
    Amount totalFee)
  {
    this();
    this.hash = org.apache.thrift.TBaseHelper.copyBinary(hash);
    this.prevHash = org.apache.thrift.TBaseHelper.copyBinary(prevHash);
    this.time = time;
    setTimeIsSet(true);
    this.transactionsCount = transactionsCount;
    setTransactionsCountIsSet(true);
    this.poolNumber = poolNumber;
    setPoolNumberIsSet(true);
    this.writer = org.apache.thrift.TBaseHelper.copyBinary(writer);
    this.totalFee = totalFee;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pool(Pool other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHash()) {
      this.hash = org.apache.thrift.TBaseHelper.copyBinary(other.hash);
    }
    if (other.isSetPrevHash()) {
      this.prevHash = org.apache.thrift.TBaseHelper.copyBinary(other.prevHash);
    }
    this.time = other.time;
    this.transactionsCount = other.transactionsCount;
    this.poolNumber = other.poolNumber;
    if (other.isSetWriter()) {
      this.writer = org.apache.thrift.TBaseHelper.copyBinary(other.writer);
    }
    if (other.isSetTotalFee()) {
      this.totalFee = new Amount(other.totalFee);
    }
  }

  public Pool deepCopy() {
    return new Pool(this);
  }

  @Override
  public void clear() {
    this.hash = null;
    this.prevHash = null;
    setTimeIsSet(false);
    this.time = 0;
    setTransactionsCountIsSet(false);
    this.transactionsCount = 0;
    setPoolNumberIsSet(false);
    this.poolNumber = 0;
    this.writer = null;
    this.totalFee = null;
  }

  public byte[] getHash() {
    setHash(org.apache.thrift.TBaseHelper.rightSize(hash));
    return hash == null ? null : hash.array();
  }

  public java.nio.ByteBuffer bufferForHash() {
    return org.apache.thrift.TBaseHelper.copyBinary(hash);
  }

  public Pool setHash(byte[] hash) {
    this.hash = hash == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(hash.clone());
    return this;
  }

  public Pool setHash(java.nio.ByteBuffer hash) {
    this.hash = org.apache.thrift.TBaseHelper.copyBinary(hash);
    return this;
  }

  public void unsetHash() {
    this.hash = null;
  }

  /** Returns true if field hash is set (has been assigned a value) and false otherwise */
  public boolean isSetHash() {
    return this.hash != null;
  }

  public void setHashIsSet(boolean value) {
    if (!value) {
      this.hash = null;
    }
  }

  public byte[] getPrevHash() {
    setPrevHash(org.apache.thrift.TBaseHelper.rightSize(prevHash));
    return prevHash == null ? null : prevHash.array();
  }

  public java.nio.ByteBuffer bufferForPrevHash() {
    return org.apache.thrift.TBaseHelper.copyBinary(prevHash);
  }

  public Pool setPrevHash(byte[] prevHash) {
    this.prevHash = prevHash == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(prevHash.clone());
    return this;
  }

  public Pool setPrevHash(java.nio.ByteBuffer prevHash) {
    this.prevHash = org.apache.thrift.TBaseHelper.copyBinary(prevHash);
    return this;
  }

  public void unsetPrevHash() {
    this.prevHash = null;
  }

  /** Returns true if field prevHash is set (has been assigned a value) and false otherwise */
  public boolean isSetPrevHash() {
    return this.prevHash != null;
  }

  public void setPrevHashIsSet(boolean value) {
    if (!value) {
      this.prevHash = null;
    }
  }

  public long getTime() {
    return this.time;
  }

  public Pool setTime(long time) {
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

  public int getTransactionsCount() {
    return this.transactionsCount;
  }

  public Pool setTransactionsCount(int transactionsCount) {
    this.transactionsCount = transactionsCount;
    setTransactionsCountIsSet(true);
    return this;
  }

  public void unsetTransactionsCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRANSACTIONSCOUNT_ISSET_ID);
  }

  /** Returns true if field transactionsCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactionsCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRANSACTIONSCOUNT_ISSET_ID);
  }

  public void setTransactionsCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRANSACTIONSCOUNT_ISSET_ID, value);
  }

  public long getPoolNumber() {
    return this.poolNumber;
  }

  public Pool setPoolNumber(long poolNumber) {
    this.poolNumber = poolNumber;
    setPoolNumberIsSet(true);
    return this;
  }

  public void unsetPoolNumber() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POOLNUMBER_ISSET_ID);
  }

  /** Returns true if field poolNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolNumber() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POOLNUMBER_ISSET_ID);
  }

  public void setPoolNumberIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POOLNUMBER_ISSET_ID, value);
  }

  public byte[] getWriter() {
    setWriter(org.apache.thrift.TBaseHelper.rightSize(writer));
    return writer == null ? null : writer.array();
  }

  public java.nio.ByteBuffer bufferForWriter() {
    return org.apache.thrift.TBaseHelper.copyBinary(writer);
  }

  public Pool setWriter(byte[] writer) {
    this.writer = writer == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(writer.clone());
    return this;
  }

  public Pool setWriter(java.nio.ByteBuffer writer) {
    this.writer = org.apache.thrift.TBaseHelper.copyBinary(writer);
    return this;
  }

  public void unsetWriter() {
    this.writer = null;
  }

  /** Returns true if field writer is set (has been assigned a value) and false otherwise */
  public boolean isSetWriter() {
    return this.writer != null;
  }

  public void setWriterIsSet(boolean value) {
    if (!value) {
      this.writer = null;
    }
  }

  public Amount getTotalFee() {
    return this.totalFee;
  }

  public Pool setTotalFee(Amount totalFee) {
    this.totalFee = totalFee;
    return this;
  }

  public void unsetTotalFee() {
    this.totalFee = null;
  }

  /** Returns true if field totalFee is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalFee() {
    return this.totalFee != null;
  }

  public void setTotalFeeIsSet(boolean value) {
    if (!value) {
      this.totalFee = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case HASH:
      if (value == null) {
        unsetHash();
      } else {
        if (value instanceof byte[]) {
          setHash((byte[])value);
        } else {
          setHash((java.nio.ByteBuffer)value);
        }
      }
      break;

    case PREV_HASH:
      if (value == null) {
        unsetPrevHash();
      } else {
        if (value instanceof byte[]) {
          setPrevHash((byte[])value);
        } else {
          setPrevHash((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((java.lang.Long)value);
      }
      break;

    case TRANSACTIONS_COUNT:
      if (value == null) {
        unsetTransactionsCount();
      } else {
        setTransactionsCount((java.lang.Integer)value);
      }
      break;

    case POOL_NUMBER:
      if (value == null) {
        unsetPoolNumber();
      } else {
        setPoolNumber((java.lang.Long)value);
      }
      break;

    case WRITER:
      if (value == null) {
        unsetWriter();
      } else {
        if (value instanceof byte[]) {
          setWriter((byte[])value);
        } else {
          setWriter((java.nio.ByteBuffer)value);
        }
      }
      break;

    case TOTAL_FEE:
      if (value == null) {
        unsetTotalFee();
      } else {
        setTotalFee((Amount)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HASH:
      return getHash();

    case PREV_HASH:
      return getPrevHash();

    case TIME:
      return getTime();

    case TRANSACTIONS_COUNT:
      return getTransactionsCount();

    case POOL_NUMBER:
      return getPoolNumber();

    case WRITER:
      return getWriter();

    case TOTAL_FEE:
      return getTotalFee();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HASH:
      return isSetHash();
    case PREV_HASH:
      return isSetPrevHash();
    case TIME:
      return isSetTime();
    case TRANSACTIONS_COUNT:
      return isSetTransactionsCount();
    case POOL_NUMBER:
      return isSetPoolNumber();
    case WRITER:
      return isSetWriter();
    case TOTAL_FEE:
      return isSetTotalFee();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Pool)
      return this.equals((Pool)that);
    return false;
  }

  public boolean equals(Pool that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hash = true && this.isSetHash();
    boolean that_present_hash = true && that.isSetHash();
    if (this_present_hash || that_present_hash) {
      if (!(this_present_hash && that_present_hash))
        return false;
      if (!this.hash.equals(that.hash))
        return false;
    }

    boolean this_present_prevHash = true && this.isSetPrevHash();
    boolean that_present_prevHash = true && that.isSetPrevHash();
    if (this_present_prevHash || that_present_prevHash) {
      if (!(this_present_prevHash && that_present_prevHash))
        return false;
      if (!this.prevHash.equals(that.prevHash))
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

    boolean this_present_transactionsCount = true;
    boolean that_present_transactionsCount = true;
    if (this_present_transactionsCount || that_present_transactionsCount) {
      if (!(this_present_transactionsCount && that_present_transactionsCount))
        return false;
      if (this.transactionsCount != that.transactionsCount)
        return false;
    }

    boolean this_present_poolNumber = true;
    boolean that_present_poolNumber = true;
    if (this_present_poolNumber || that_present_poolNumber) {
      if (!(this_present_poolNumber && that_present_poolNumber))
        return false;
      if (this.poolNumber != that.poolNumber)
        return false;
    }

    boolean this_present_writer = true && this.isSetWriter();
    boolean that_present_writer = true && that.isSetWriter();
    if (this_present_writer || that_present_writer) {
      if (!(this_present_writer && that_present_writer))
        return false;
      if (!this.writer.equals(that.writer))
        return false;
    }

    boolean this_present_totalFee = true && this.isSetTotalFee();
    boolean that_present_totalFee = true && that.isSetTotalFee();
    if (this_present_totalFee || that_present_totalFee) {
      if (!(this_present_totalFee && that_present_totalFee))
        return false;
      if (!this.totalFee.equals(that.totalFee))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetHash()) ? 131071 : 524287);
    if (isSetHash())
      hashCode = hashCode * 8191 + hash.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrevHash()) ? 131071 : 524287);
    if (isSetPrevHash())
      hashCode = hashCode * 8191 + prevHash.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(time);

    hashCode = hashCode * 8191 + transactionsCount;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(poolNumber);

    hashCode = hashCode * 8191 + ((isSetWriter()) ? 131071 : 524287);
    if (isSetWriter())
      hashCode = hashCode * 8191 + writer.hashCode();

    hashCode = hashCode * 8191 + ((isSetTotalFee()) ? 131071 : 524287);
    if (isSetTotalFee())
      hashCode = hashCode * 8191 + totalFee.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Pool other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHash()).compareTo(other.isSetHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hash, other.hash);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrevHash()).compareTo(other.isSetPrevHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrevHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.prevHash, other.prevHash);
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
    lastComparison = java.lang.Boolean.valueOf(isSetTransactionsCount()).compareTo(other.isSetTransactionsCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactionsCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactionsCount, other.transactionsCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPoolNumber()).compareTo(other.isSetPoolNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolNumber, other.poolNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetWriter()).compareTo(other.isSetWriter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writer, other.writer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotalFee()).compareTo(other.isSetTotalFee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalFee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalFee, other.totalFee);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Pool(");
    boolean first = true;

    sb.append("hash:");
    if (this.hash == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.hash, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("prevHash:");
    if (this.prevHash == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.prevHash, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("time:");
    sb.append(this.time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactionsCount:");
    sb.append(this.transactionsCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("poolNumber:");
    sb.append(this.poolNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("writer:");
    if (this.writer == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.writer, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalFee:");
    if (this.totalFee == null) {
      sb.append("null");
    } else {
      sb.append(this.totalFee);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (totalFee != null) {
      totalFee.validate();
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

  private static class PoolStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PoolStandardScheme getScheme() {
      return new PoolStandardScheme();
    }
  }

  private static class PoolStandardScheme extends org.apache.thrift.scheme.StandardScheme<Pool> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hash = iprot.readBinary();
              struct.setHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PREV_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.prevHash = iprot.readBinary();
              struct.setPrevHashIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.time = iprot.readI64();
              struct.setTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRANSACTIONS_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.transactionsCount = iprot.readI32();
              struct.setTransactionsCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // POOL_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.poolNumber = iprot.readI64();
              struct.setPoolNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WRITER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.writer = iprot.readBinary();
              struct.setWriterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TOTAL_FEE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.totalFee = new Amount();
              struct.totalFee.read(iprot);
              struct.setTotalFeeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pool struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hash != null) {
        oprot.writeFieldBegin(HASH_FIELD_DESC);
        oprot.writeBinary(struct.hash);
        oprot.writeFieldEnd();
      }
      if (struct.prevHash != null) {
        oprot.writeFieldBegin(PREV_HASH_FIELD_DESC);
        oprot.writeBinary(struct.prevHash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI64(struct.time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TRANSACTIONS_COUNT_FIELD_DESC);
      oprot.writeI32(struct.transactionsCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POOL_NUMBER_FIELD_DESC);
      oprot.writeI64(struct.poolNumber);
      oprot.writeFieldEnd();
      if (struct.writer != null) {
        oprot.writeFieldBegin(WRITER_FIELD_DESC);
        oprot.writeBinary(struct.writer);
        oprot.writeFieldEnd();
      }
      if (struct.totalFee != null) {
        oprot.writeFieldBegin(TOTAL_FEE_FIELD_DESC);
        struct.totalFee.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PoolTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PoolTupleScheme getScheme() {
      return new PoolTupleScheme();
    }
  }

  private static class PoolTupleScheme extends org.apache.thrift.scheme.TupleScheme<Pool> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHash()) {
        optionals.set(0);
      }
      if (struct.isSetPrevHash()) {
        optionals.set(1);
      }
      if (struct.isSetTime()) {
        optionals.set(2);
      }
      if (struct.isSetTransactionsCount()) {
        optionals.set(3);
      }
      if (struct.isSetPoolNumber()) {
        optionals.set(4);
      }
      if (struct.isSetWriter()) {
        optionals.set(5);
      }
      if (struct.isSetTotalFee()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetHash()) {
        oprot.writeBinary(struct.hash);
      }
      if (struct.isSetPrevHash()) {
        oprot.writeBinary(struct.prevHash);
      }
      if (struct.isSetTime()) {
        oprot.writeI64(struct.time);
      }
      if (struct.isSetTransactionsCount()) {
        oprot.writeI32(struct.transactionsCount);
      }
      if (struct.isSetPoolNumber()) {
        oprot.writeI64(struct.poolNumber);
      }
      if (struct.isSetWriter()) {
        oprot.writeBinary(struct.writer);
      }
      if (struct.isSetTotalFee()) {
        struct.totalFee.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pool struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.hash = iprot.readBinary();
        struct.setHashIsSet(true);
      }
      if (incoming.get(1)) {
        struct.prevHash = iprot.readBinary();
        struct.setPrevHashIsSet(true);
      }
      if (incoming.get(2)) {
        struct.time = iprot.readI64();
        struct.setTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.transactionsCount = iprot.readI32();
        struct.setTransactionsCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.poolNumber = iprot.readI64();
        struct.setPoolNumberIsSet(true);
      }
      if (incoming.get(5)) {
        struct.writer = iprot.readBinary();
        struct.setWriterIsSet(true);
      }
      if (incoming.get(6)) {
        struct.totalFee = new Amount();
        struct.totalFee.read(iprot);
        struct.setTotalFeeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

