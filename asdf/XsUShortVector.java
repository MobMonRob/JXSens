/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsUShortVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsUShortVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsUShortVector obj) {
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
        minimalJNI.delete_XsUShortVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsUShortVector() {
    this(minimalJNI.new_XsUShortVector__SWIG_0(), true);
  }

  public XsUShortVector(int v1, int v2, int v3) {
    this(minimalJNI.new_XsUShortVector__SWIG_1(v1, v2, v3), true);
  }

  public XsUShortVector(SWIGTYPE_p_unsigned_short a) {
    this(minimalJNI.new_XsUShortVector__SWIG_2(SWIGTYPE_p_unsigned_short.getCPtr(a)), true);
  }

  public XsUShortVector(XsUShortVector other) {
    this(minimalJNI.new_XsUShortVector__SWIG_3(XsUShortVector.getCPtr(other), other), true);
  }

  public XsUShortVector opSet(XsUShortVector other) {
    return new XsUShortVector(minimalJNI.XsUShortVector_opSet(swigCPtr, this, XsUShortVector.getCPtr(other), other), false);
  }

  public boolean opEquals(XsUShortVector other) {
    return minimalJNI.XsUShortVector_opEquals(swigCPtr, this, XsUShortVector.getCPtr(other), other);
  }

  public SWIGTYPE_p_XsSize size() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsUShortVector_size(swigCPtr, this), true);
  }

  public int at(int index) {
    return minimalJNI.XsUShortVector_at(swigCPtr, this, index);
  }

  public int opSquareBracket(SWIGTYPE_p_XsSize index) {
    return minimalJNI.XsUShortVector_opSquareBracket(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index));
  }

  public SWIGTYPE_p_unsigned_short data() {
    long cPtr = minimalJNI.XsUShortVector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

}