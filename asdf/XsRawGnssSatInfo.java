/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsRawGnssSatInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected XsRawGnssSatInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsRawGnssSatInfo obj) {
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
        minimalJNI.delete_XsRawGnssSatInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_itow(long value) {
    minimalJNI.XsRawGnssSatInfo_m_itow_set(swigCPtr, this, value);
  }

  public long getM_itow() {
    return minimalJNI.XsRawGnssSatInfo_m_itow_get(swigCPtr, this);
  }

  public void setM_numSvs(short value) {
    minimalJNI.XsRawGnssSatInfo_m_numSvs_set(swigCPtr, this, value);
  }

  public short getM_numSvs() {
    return minimalJNI.XsRawGnssSatInfo_m_numSvs_get(swigCPtr, this);
  }

  public void setM_res1(short value) {
    minimalJNI.XsRawGnssSatInfo_m_res1_set(swigCPtr, this, value);
  }

  public short getM_res1() {
    return minimalJNI.XsRawGnssSatInfo_m_res1_get(swigCPtr, this);
  }

  public void setM_res2(short value) {
    minimalJNI.XsRawGnssSatInfo_m_res2_set(swigCPtr, this, value);
  }

  public short getM_res2() {
    return minimalJNI.XsRawGnssSatInfo_m_res2_get(swigCPtr, this);
  }

  public void setM_res3(short value) {
    minimalJNI.XsRawGnssSatInfo_m_res3_set(swigCPtr, this, value);
  }

  public short getM_res3() {
    return minimalJNI.XsRawGnssSatInfo_m_res3_get(swigCPtr, this);
  }

  public void setM_satInfos(XsSatInfo value) {
    minimalJNI.XsRawGnssSatInfo_m_satInfos_set(swigCPtr, this, XsSatInfo.getCPtr(value), value);
  }

  public XsSatInfo getM_satInfos() {
    long cPtr = minimalJNI.XsRawGnssSatInfo_m_satInfos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new XsSatInfo(cPtr, false);
  }

  public boolean opEquals(XsRawGnssSatInfo b) {
    return minimalJNI.XsRawGnssSatInfo_opEquals(swigCPtr, this, XsRawGnssSatInfo.getCPtr(b), b);
  }

  public XsRawGnssSatInfo() {
    this(minimalJNI.new_XsRawGnssSatInfo(), true);
  }

}