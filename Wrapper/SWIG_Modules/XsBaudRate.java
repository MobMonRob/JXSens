/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class XsBaudRate {
  public final static XsBaudRate XBR_Invalid = new XsBaudRate("XBR_Invalid", minimalJNI.XBR_Invalid_get());
  public final static XsBaudRate XBR_4800 = new XsBaudRate("XBR_4800", minimalJNI.XBR_4800_get());
  public final static XsBaudRate XBR_9600 = new XsBaudRate("XBR_9600", minimalJNI.XBR_9600_get());
  public final static XsBaudRate XBR_19k2 = new XsBaudRate("XBR_19k2", minimalJNI.XBR_19k2_get());
  public final static XsBaudRate XBR_38k4 = new XsBaudRate("XBR_38k4", minimalJNI.XBR_38k4_get());
  public final static XsBaudRate XBR_57k6 = new XsBaudRate("XBR_57k6", minimalJNI.XBR_57k6_get());
  public final static XsBaudRate XBR_115k2 = new XsBaudRate("XBR_115k2", minimalJNI.XBR_115k2_get());
  public final static XsBaudRate XBR_230k4 = new XsBaudRate("XBR_230k4", minimalJNI.XBR_230k4_get());
  public final static XsBaudRate XBR_460k8 = new XsBaudRate("XBR_460k8", minimalJNI.XBR_460k8_get());
  public final static XsBaudRate XBR_921k6 = new XsBaudRate("XBR_921k6", minimalJNI.XBR_921k6_get());
  public final static XsBaudRate XBR_2000k = new XsBaudRate("XBR_2000k", minimalJNI.XBR_2000k_get());
  public final static XsBaudRate XBR_3500k = new XsBaudRate("XBR_3500k", minimalJNI.XBR_3500k_get());
  public final static XsBaudRate XBR_4000k = new XsBaudRate("XBR_4000k", minimalJNI.XBR_4000k_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static XsBaudRate swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + XsBaudRate.class + " with value " + swigValue);
  }

  private XsBaudRate(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private XsBaudRate(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private XsBaudRate(String swigName, XsBaudRate swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static XsBaudRate[] swigValues = { XBR_Invalid, XBR_4800, XBR_9600, XBR_19k2, XBR_38k4, XBR_57k6, XBR_115k2, XBR_230k4, XBR_460k8, XBR_921k6, XBR_2000k, XBR_3500k, XBR_4000k };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

