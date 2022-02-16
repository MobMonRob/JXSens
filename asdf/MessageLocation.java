/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class MessageLocation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MessageLocation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MessageLocation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        minimalJNI.delete_MessageLocation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_startPos(int value) {
    minimalJNI.MessageLocation_m_startPos_set(swigCPtr, this, value);
  }

  public int getM_startPos() {
    return minimalJNI.MessageLocation_m_startPos_get(swigCPtr, this);
  }

  public void setM_size(int value) {
    minimalJNI.MessageLocation_m_size_set(swigCPtr, this, value);
  }

  public int getM_size() {
    return minimalJNI.MessageLocation_m_size_get(swigCPtr, this);
  }

  public void setM_incompletePos(int value) {
    minimalJNI.MessageLocation_m_incompletePos_set(swigCPtr, this, value);
  }

  public int getM_incompletePos() {
    return minimalJNI.MessageLocation_m_incompletePos_get(swigCPtr, this);
  }

  public void setM_incompleteSize(int value) {
    minimalJNI.MessageLocation_m_incompleteSize_set(swigCPtr, this, value);
  }

  public int getM_incompleteSize() {
    return minimalJNI.MessageLocation_m_incompleteSize_get(swigCPtr, this);
  }

  public MessageLocation(int start, int size, int incompletePos, int incompleteSize) {
    this(minimalJNI.new_MessageLocation__SWIG_0(start, size, incompletePos, incompleteSize), true);
  }

  public MessageLocation(int start, int size, int incompletePos) {
    this(minimalJNI.new_MessageLocation__SWIG_1(start, size, incompletePos), true);
  }

  public MessageLocation(int start, int size) {
    this(minimalJNI.new_MessageLocation__SWIG_2(start, size), true);
  }

  public MessageLocation(int start) {
    this(minimalJNI.new_MessageLocation__SWIG_3(start), true);
  }

  public MessageLocation() {
    this(minimalJNI.new_MessageLocation__SWIG_4(), true);
  }

  public boolean isValid() {
    return minimalJNI.MessageLocation_isValid(swigCPtr, this);
  }

}