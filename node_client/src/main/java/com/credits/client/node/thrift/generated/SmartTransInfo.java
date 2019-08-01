/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-07-31")
public class SmartTransInfo extends org.apache.thrift.TUnion<SmartTransInfo, SmartTransInfo._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SmartTransInfo");
  private static final org.apache.thrift.protocol.TField V_TOKEN_DEPLOY_FIELD_DESC = new org.apache.thrift.protocol.TField("v_tokenDeploy", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField V_TOKEN_TRANSFER_FIELD_DESC = new org.apache.thrift.protocol.TField("v_tokenTransfer", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField V_SMART_DEPLOY_FIELD_DESC = new org.apache.thrift.protocol.TField("v_smartDeploy", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField V_SMART_EXECUTION_FIELD_DESC = new org.apache.thrift.protocol.TField("v_smartExecution", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField V_SMART_STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("v_smartState", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    V_TOKEN_DEPLOY((short)1, "v_tokenDeploy"),
    V_TOKEN_TRANSFER((short)2, "v_tokenTransfer"),
    V_SMART_DEPLOY((short)3, "v_smartDeploy"),
    V_SMART_EXECUTION((short)4, "v_smartExecution"),
    V_SMART_STATE((short)5, "v_smartState");

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
        case 1: // V_TOKEN_DEPLOY
          return V_TOKEN_DEPLOY;
        case 2: // V_TOKEN_TRANSFER
          return V_TOKEN_TRANSFER;
        case 3: // V_SMART_DEPLOY
          return V_SMART_DEPLOY;
        case 4: // V_SMART_EXECUTION
          return V_SMART_EXECUTION;
        case 5: // V_SMART_STATE
          return V_SMART_STATE;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.V_TOKEN_DEPLOY, new org.apache.thrift.meta_data.FieldMetaData("v_tokenDeploy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TokenDeployTransInfo.class)));
    tmpMap.put(_Fields.V_TOKEN_TRANSFER, new org.apache.thrift.meta_data.FieldMetaData("v_tokenTransfer", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TokenTransferTransInfo.class)));
    tmpMap.put(_Fields.V_SMART_DEPLOY, new org.apache.thrift.meta_data.FieldMetaData("v_smartDeploy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SmartDeployTransInfo.class)));
    tmpMap.put(_Fields.V_SMART_EXECUTION, new org.apache.thrift.meta_data.FieldMetaData("v_smartExecution", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SmartExecutionTransInfo.class)));
    tmpMap.put(_Fields.V_SMART_STATE, new org.apache.thrift.meta_data.FieldMetaData("v_smartState", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SmartStateTransInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SmartTransInfo.class, metaDataMap);
  }

  public SmartTransInfo() {
    super();
  }

  public SmartTransInfo(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public SmartTransInfo(SmartTransInfo other) {
    super(other);
  }
  public SmartTransInfo deepCopy() {
    return new SmartTransInfo(this);
  }

  public static SmartTransInfo v_tokenDeploy(TokenDeployTransInfo value) {
    SmartTransInfo x = new SmartTransInfo();
    x.setV_tokenDeploy(value);
    return x;
  }

  public static SmartTransInfo v_tokenTransfer(TokenTransferTransInfo value) {
    SmartTransInfo x = new SmartTransInfo();
    x.setV_tokenTransfer(value);
    return x;
  }

  public static SmartTransInfo v_smartDeploy(SmartDeployTransInfo value) {
    SmartTransInfo x = new SmartTransInfo();
    x.setV_smartDeploy(value);
    return x;
  }

  public static SmartTransInfo v_smartExecution(SmartExecutionTransInfo value) {
    SmartTransInfo x = new SmartTransInfo();
    x.setV_smartExecution(value);
    return x;
  }

  public static SmartTransInfo v_smartState(SmartStateTransInfo value) {
    SmartTransInfo x = new SmartTransInfo();
    x.setV_smartState(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case V_TOKEN_DEPLOY:
        if (value instanceof TokenDeployTransInfo) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TokenDeployTransInfo for field 'v_tokenDeploy', but got " + value.getClass().getSimpleName());
      case V_TOKEN_TRANSFER:
        if (value instanceof TokenTransferTransInfo) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type TokenTransferTransInfo for field 'v_tokenTransfer', but got " + value.getClass().getSimpleName());
      case V_SMART_DEPLOY:
        if (value instanceof SmartDeployTransInfo) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SmartDeployTransInfo for field 'v_smartDeploy', but got " + value.getClass().getSimpleName());
      case V_SMART_EXECUTION:
        if (value instanceof SmartExecutionTransInfo) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SmartExecutionTransInfo for field 'v_smartExecution', but got " + value.getClass().getSimpleName());
      case V_SMART_STATE:
        if (value instanceof SmartStateTransInfo) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SmartStateTransInfo for field 'v_smartState', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case V_TOKEN_DEPLOY:
          if (field.type == V_TOKEN_DEPLOY_FIELD_DESC.type) {
            TokenDeployTransInfo v_tokenDeploy;
            v_tokenDeploy = new TokenDeployTransInfo();
            v_tokenDeploy.read(iprot);
            return v_tokenDeploy;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_TOKEN_TRANSFER:
          if (field.type == V_TOKEN_TRANSFER_FIELD_DESC.type) {
            TokenTransferTransInfo v_tokenTransfer;
            v_tokenTransfer = new TokenTransferTransInfo();
            v_tokenTransfer.read(iprot);
            return v_tokenTransfer;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_SMART_DEPLOY:
          if (field.type == V_SMART_DEPLOY_FIELD_DESC.type) {
            SmartDeployTransInfo v_smartDeploy;
            v_smartDeploy = new SmartDeployTransInfo();
            v_smartDeploy.read(iprot);
            return v_smartDeploy;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_SMART_EXECUTION:
          if (field.type == V_SMART_EXECUTION_FIELD_DESC.type) {
            SmartExecutionTransInfo v_smartExecution;
            v_smartExecution = new SmartExecutionTransInfo();
            v_smartExecution.read(iprot);
            return v_smartExecution;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case V_SMART_STATE:
          if (field.type == V_SMART_STATE_FIELD_DESC.type) {
            SmartStateTransInfo v_smartState;
            v_smartState = new SmartStateTransInfo();
            v_smartState.read(iprot);
            return v_smartState;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case V_TOKEN_DEPLOY:
        TokenDeployTransInfo v_tokenDeploy = (TokenDeployTransInfo)value_;
        v_tokenDeploy.write(oprot);
        return;
      case V_TOKEN_TRANSFER:
        TokenTransferTransInfo v_tokenTransfer = (TokenTransferTransInfo)value_;
        v_tokenTransfer.write(oprot);
        return;
      case V_SMART_DEPLOY:
        SmartDeployTransInfo v_smartDeploy = (SmartDeployTransInfo)value_;
        v_smartDeploy.write(oprot);
        return;
      case V_SMART_EXECUTION:
        SmartExecutionTransInfo v_smartExecution = (SmartExecutionTransInfo)value_;
        v_smartExecution.write(oprot);
        return;
      case V_SMART_STATE:
        SmartStateTransInfo v_smartState = (SmartStateTransInfo)value_;
        v_smartState.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case V_TOKEN_DEPLOY:
          TokenDeployTransInfo v_tokenDeploy;
          v_tokenDeploy = new TokenDeployTransInfo();
          v_tokenDeploy.read(iprot);
          return v_tokenDeploy;
        case V_TOKEN_TRANSFER:
          TokenTransferTransInfo v_tokenTransfer;
          v_tokenTransfer = new TokenTransferTransInfo();
          v_tokenTransfer.read(iprot);
          return v_tokenTransfer;
        case V_SMART_DEPLOY:
          SmartDeployTransInfo v_smartDeploy;
          v_smartDeploy = new SmartDeployTransInfo();
          v_smartDeploy.read(iprot);
          return v_smartDeploy;
        case V_SMART_EXECUTION:
          SmartExecutionTransInfo v_smartExecution;
          v_smartExecution = new SmartExecutionTransInfo();
          v_smartExecution.read(iprot);
          return v_smartExecution;
        case V_SMART_STATE:
          SmartStateTransInfo v_smartState;
          v_smartState = new SmartStateTransInfo();
          v_smartState.read(iprot);
          return v_smartState;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case V_TOKEN_DEPLOY:
        TokenDeployTransInfo v_tokenDeploy = (TokenDeployTransInfo)value_;
        v_tokenDeploy.write(oprot);
        return;
      case V_TOKEN_TRANSFER:
        TokenTransferTransInfo v_tokenTransfer = (TokenTransferTransInfo)value_;
        v_tokenTransfer.write(oprot);
        return;
      case V_SMART_DEPLOY:
        SmartDeployTransInfo v_smartDeploy = (SmartDeployTransInfo)value_;
        v_smartDeploy.write(oprot);
        return;
      case V_SMART_EXECUTION:
        SmartExecutionTransInfo v_smartExecution = (SmartExecutionTransInfo)value_;
        v_smartExecution.write(oprot);
        return;
      case V_SMART_STATE:
        SmartStateTransInfo v_smartState = (SmartStateTransInfo)value_;
        v_smartState.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case V_TOKEN_DEPLOY:
        return V_TOKEN_DEPLOY_FIELD_DESC;
      case V_TOKEN_TRANSFER:
        return V_TOKEN_TRANSFER_FIELD_DESC;
      case V_SMART_DEPLOY:
        return V_SMART_DEPLOY_FIELD_DESC;
      case V_SMART_EXECUTION:
        return V_SMART_EXECUTION_FIELD_DESC;
      case V_SMART_STATE:
        return V_SMART_STATE_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public TokenDeployTransInfo getV_tokenDeploy() {
    if (getSetField() == _Fields.V_TOKEN_DEPLOY) {
      return (TokenDeployTransInfo)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'v_tokenDeploy' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_tokenDeploy(TokenDeployTransInfo value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_TOKEN_DEPLOY;
    value_ = value;
  }

  public TokenTransferTransInfo getV_tokenTransfer() {
    if (getSetField() == _Fields.V_TOKEN_TRANSFER) {
      return (TokenTransferTransInfo)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'v_tokenTransfer' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_tokenTransfer(TokenTransferTransInfo value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_TOKEN_TRANSFER;
    value_ = value;
  }

  public SmartDeployTransInfo getV_smartDeploy() {
    if (getSetField() == _Fields.V_SMART_DEPLOY) {
      return (SmartDeployTransInfo)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'v_smartDeploy' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_smartDeploy(SmartDeployTransInfo value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_SMART_DEPLOY;
    value_ = value;
  }

  public SmartExecutionTransInfo getV_smartExecution() {
    if (getSetField() == _Fields.V_SMART_EXECUTION) {
      return (SmartExecutionTransInfo)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'v_smartExecution' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_smartExecution(SmartExecutionTransInfo value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_SMART_EXECUTION;
    value_ = value;
  }

  public SmartStateTransInfo getV_smartState() {
    if (getSetField() == _Fields.V_SMART_STATE) {
      return (SmartStateTransInfo)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'v_smartState' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setV_smartState(SmartStateTransInfo value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.V_SMART_STATE;
    value_ = value;
  }

  public boolean isSetV_tokenDeploy() {
    return setField_ == _Fields.V_TOKEN_DEPLOY;
  }


  public boolean isSetV_tokenTransfer() {
    return setField_ == _Fields.V_TOKEN_TRANSFER;
  }


  public boolean isSetV_smartDeploy() {
    return setField_ == _Fields.V_SMART_DEPLOY;
  }


  public boolean isSetV_smartExecution() {
    return setField_ == _Fields.V_SMART_EXECUTION;
  }


  public boolean isSetV_smartState() {
    return setField_ == _Fields.V_SMART_STATE;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof SmartTransInfo) {
      return equals((SmartTransInfo)other);
    } else {
      return false;
    }
  }

  public boolean equals(SmartTransInfo other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(SmartTransInfo other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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


}
