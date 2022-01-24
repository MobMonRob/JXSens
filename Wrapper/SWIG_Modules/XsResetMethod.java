/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class XsResetMethod {
  public final static XsResetMethod XRM_StoreAlignmentMatrix = new XsResetMethod("XRM_StoreAlignmentMatrix", minimalJNI.XRM_StoreAlignmentMatrix_get());
  public final static XsResetMethod XRM_Heading = new XsResetMethod("XRM_Heading", minimalJNI.XRM_Heading_get());
  public final static XsResetMethod XRM_Object = new XsResetMethod("XRM_Object", minimalJNI.XRM_Object_get());
  public final static XsResetMethod XRM_Inclination = new XsResetMethod("XRM_Inclination", minimalJNI.XRM_Inclination_get());
  public final static XsResetMethod XRM_Alignment = new XsResetMethod("XRM_Alignment", minimalJNI.XRM_Alignment_get());
  public final static XsResetMethod XRM_Global = new XsResetMethod("XRM_Global", minimalJNI.XRM_Global_get());
  public final static XsResetMethod XRM_DefaultHeading = new XsResetMethod("XRM_DefaultHeading", minimalJNI.XRM_DefaultHeading_get());
  public final static XsResetMethod XRM_DefaultInclination = new XsResetMethod("XRM_DefaultInclination", minimalJNI.XRM_DefaultInclination_get());
  public final static XsResetMethod XRM_DefaultAlignment = new XsResetMethod("XRM_DefaultAlignment", minimalJNI.XRM_DefaultAlignment_get());
  public final static XsResetMethod XRM_None = new XsResetMethod("XRM_None");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static XsResetMethod swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + XsResetMethod.class + " with value " + swigValue);
  }

  private XsResetMethod(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private XsResetMethod(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private XsResetMethod(String swigName, XsResetMethod swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static XsResetMethod[] swigValues = { XRM_StoreAlignmentMatrix, XRM_Heading, XRM_Object, XRM_Inclination, XRM_Alignment, XRM_Global, XRM_DefaultHeading, XRM_DefaultInclination, XRM_DefaultAlignment, XRM_None };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

