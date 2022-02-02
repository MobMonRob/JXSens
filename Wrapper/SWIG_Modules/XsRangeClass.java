/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class XsRangeClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsRangeClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsRangeClass obj) {
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
        minimalJNI.delete_XsRangeClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsRangeClass(int f, int l) {
    this(minimalJNI.new_XsRangeClass__SWIG_0(f, l), true);
  }

  public XsRangeClass(int f) {
    this(minimalJNI.new_XsRangeClass__SWIG_1(f), true);
  }

  public XsRangeClass() {
    this(minimalJNI.new_XsRangeClass__SWIG_2(), true);
  }

  public XsRangeClass(XsRangeClass other) {
    this(minimalJNI.new_XsRangeClass__SWIG_3(XsRangeClass.getCPtr(other), other), true);
  }

  public XsRangeClass opSet(XsRangeClass other) {
    return new XsRangeClass(minimalJNI.XsRangeClass_opSet(swigCPtr, this, XsRangeClass.getCPtr(other), other), false);
  }

  public int count() {
    return minimalJNI.XsRangeClass_count(swigCPtr, this);
  }

  public int interval() {
    return minimalJNI.XsRangeClass_interval(swigCPtr, this);
  }

  public boolean contains(int i) {
    return minimalJNI.XsRangeClass_contains(swigCPtr, this, i);
  }

  public void setRange(int f, int l) {
    minimalJNI.XsRangeClass_setRange(swigCPtr, this, f, l);
  }

  public boolean empty() {
    return minimalJNI.XsRangeClass_empty(swigCPtr, this);
  }

  public int first() {
    return minimalJNI.XsRangeClass_first(swigCPtr, this);
  }

  public int last() {
    return minimalJNI.XsRangeClass_last(swigCPtr, this);
  }

  public boolean opEquals(XsRangeClass other) {
    return minimalJNI.XsRangeClass_opEquals(swigCPtr, this, XsRangeClass.getCPtr(other), other);
  }

  public boolean opLessThen(XsRangeClass other) {
    return minimalJNI.XsRangeClass_opLessThen(swigCPtr, this, XsRangeClass.getCPtr(other), other);
  }

}
