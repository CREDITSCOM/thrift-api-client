/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.credits.client.node.thrift.generated;


public enum SmartOperationState implements org.apache.thrift.TEnum {
  SOS_Pending(0),
  SOS_Success(1),
  SOS_Failed(2);

  private final int value;

  private SmartOperationState(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SmartOperationState findByValue(int value) { 
    switch (value) {
      case 0:
        return SOS_Pending;
      case 1:
        return SOS_Success;
      case 2:
        return SOS_Failed;
      default:
        return null;
    }
  }
}
