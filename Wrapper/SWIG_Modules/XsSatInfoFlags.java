/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class XsSatInfoFlags {
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_Mask = new XsSatInfoFlags("XSIF_SignalQualityIndicator_Mask", minimalJNI.XSIF_SignalQualityIndicator_Mask_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_NoSignal = new XsSatInfoFlags("XSIF_SignalQualityIndicator_NoSignal", minimalJNI.XSIF_SignalQualityIndicator_NoSignal_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_Searching = new XsSatInfoFlags("XSIF_SignalQualityIndicator_Searching", minimalJNI.XSIF_SignalQualityIndicator_Searching_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_Acquired = new XsSatInfoFlags("XSIF_SignalQualityIndicator_Acquired", minimalJNI.XSIF_SignalQualityIndicator_Acquired_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_Unusable = new XsSatInfoFlags("XSIF_SignalQualityIndicator_Unusable", minimalJNI.XSIF_SignalQualityIndicator_Unusable_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_CodeTimeOk = new XsSatInfoFlags("XSIF_SignalQualityIndicator_CodeTimeOk", minimalJNI.XSIF_SignalQualityIndicator_CodeTimeOk_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_CodeCarrierTimeOk1 = new XsSatInfoFlags("XSIF_SignalQualityIndicator_CodeCarrierTimeOk1", minimalJNI.XSIF_SignalQualityIndicator_CodeCarrierTimeOk1_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_CodeCarrierTimeOk2 = new XsSatInfoFlags("XSIF_SignalQualityIndicator_CodeCarrierTimeOk2", minimalJNI.XSIF_SignalQualityIndicator_CodeCarrierTimeOk2_get());
  public final static XsSatInfoFlags XSIF_SignalQualityIndicator_CodeCarrierTimeOk3 = new XsSatInfoFlags("XSIF_SignalQualityIndicator_CodeCarrierTimeOk3", minimalJNI.XSIF_SignalQualityIndicator_CodeCarrierTimeOk3_get());
  public final static XsSatInfoFlags XSIF_UsedForNavigation_Mask = new XsSatInfoFlags("XSIF_UsedForNavigation_Mask", minimalJNI.XSIF_UsedForNavigation_Mask_get());
  public final static XsSatInfoFlags XSIF_UsedForNavigation_Used = new XsSatInfoFlags("XSIF_UsedForNavigation_Used", minimalJNI.XSIF_UsedForNavigation_Used_get());
  public final static XsSatInfoFlags XSIF_HealthFlag_Mask = new XsSatInfoFlags("XSIF_HealthFlag_Mask", minimalJNI.XSIF_HealthFlag_Mask_get());
  public final static XsSatInfoFlags XSIF_HealthFlag_Unknown = new XsSatInfoFlags("XSIF_HealthFlag_Unknown", minimalJNI.XSIF_HealthFlag_Unknown_get());
  public final static XsSatInfoFlags XSIF_HealthFlag_Healthy = new XsSatInfoFlags("XSIF_HealthFlag_Healthy", minimalJNI.XSIF_HealthFlag_Healthy_get());
  public final static XsSatInfoFlags XSIF_HealthFlag_Unhealthy = new XsSatInfoFlags("XSIF_HealthFlag_Unhealthy", minimalJNI.XSIF_HealthFlag_Unhealthy_get());
  public final static XsSatInfoFlags XSIF_Differential_Mask = new XsSatInfoFlags("XSIF_Differential_Mask", minimalJNI.XSIF_Differential_Mask_get());
  public final static XsSatInfoFlags XSIF_Differential_Available = new XsSatInfoFlags("XSIF_Differential_Available", minimalJNI.XSIF_Differential_Available_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static XsSatInfoFlags swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + XsSatInfoFlags.class + " with value " + swigValue);
  }

  private XsSatInfoFlags(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private XsSatInfoFlags(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private XsSatInfoFlags(String swigName, XsSatInfoFlags swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static XsSatInfoFlags[] swigValues = { XSIF_SignalQualityIndicator_Mask, XSIF_SignalQualityIndicator_NoSignal, XSIF_SignalQualityIndicator_Searching, XSIF_SignalQualityIndicator_Acquired, XSIF_SignalQualityIndicator_Unusable, XSIF_SignalQualityIndicator_CodeTimeOk, XSIF_SignalQualityIndicator_CodeCarrierTimeOk1, XSIF_SignalQualityIndicator_CodeCarrierTimeOk2, XSIF_SignalQualityIndicator_CodeCarrierTimeOk3, XSIF_UsedForNavigation_Mask, XSIF_UsedForNavigation_Used, XSIF_HealthFlag_Mask, XSIF_HealthFlag_Unknown, XSIF_HealthFlag_Healthy, XSIF_HealthFlag_Unhealthy, XSIF_Differential_Mask, XSIF_Differential_Available };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

