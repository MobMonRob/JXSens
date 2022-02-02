/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class XsGloveData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsGloveData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsGloveData obj) {
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
        minimalJNI.delete_XsGloveData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public XsGloveData() {
    this(minimalJNI.new_XsGloveData__SWIG_0(), true);
  }

  public XsGloveData(int frameNumber, int validSampleFlags, XsFingerData fingerData) {
    this(minimalJNI.new_XsGloveData__SWIG_1(frameNumber, validSampleFlags, XsFingerData.getCPtr(fingerData), fingerData), true);
  }

  public XsGloveData(XsGloveData other) {
    this(minimalJNI.new_XsGloveData__SWIG_2(XsGloveData.getCPtr(other), other), true);
  }

  public long frameNumber() {
    return minimalJNI.XsGloveData_frameNumber(swigCPtr, this);
  }

  public int validSampleFlags() {
    return minimalJNI.XsGloveData_validSampleFlags(swigCPtr, this);
  }

  public static int fingerSegmentCount() {
    return minimalJNI.XsGloveData_fingerSegmentCount();
  }

  public XsFingerData fingerData(int i) {
    return new XsFingerData(minimalJNI.XsGloveData_fingerData(swigCPtr, this, i), false);
  }

  public boolean opEquals(XsGloveData other) {
    return minimalJNI.XsGloveData_opEquals(swigCPtr, this, XsGloveData.getCPtr(other), other);
  }

  public boolean opUnequals(XsGloveData other) {
    return minimalJNI.XsGloveData_opUnequals(swigCPtr, this, XsGloveData.getCPtr(other), other);
  }

  public XsGloveData opSet(XsGloveData other) {
    return new XsGloveData(minimalJNI.XsGloveData_opSet(swigCPtr, this, XsGloveData.getCPtr(other), other), false);
  }

  public void swap(XsGloveData other) {
    minimalJNI.XsGloveData_swap(swigCPtr, this, XsGloveData.getCPtr(other), other);
  }

}
