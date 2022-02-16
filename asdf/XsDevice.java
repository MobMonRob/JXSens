/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package asdf;

public class XsDevice extends CallbackManagerXda {
  private transient long swigCPtr;

  protected XsDevice(long cPtr, boolean cMemoryOwn) {
    super(minimalJNI.XsDevice_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XsDevice obj) {
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
        minimalJNI.delete_XsDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void addRef() {
    minimalJNI.XsDevice_addRef(swigCPtr, this);
  }

  public void removeRef() {
    minimalJNI.XsDevice_removeRef(swigCPtr, this);
  }

  public SWIGTYPE_p_XsSize refCounter() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsDevice_refCounter(swigCPtr, this), true);
  }

  public XsDevice master() {
    long cPtr = minimalJNI.XsDevice_master(swigCPtr, this);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice findDevice(XsDeviceIdClass deviceid) {
    long cPtr = minimalJNI.XsDevice_findDevice(swigCPtr, this, XsDeviceIdClass.getCPtr(deviceid), deviceid);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice findDeviceConst(XsDeviceIdClass deviceid) {
    long cPtr = minimalJNI.XsDevice_findDeviceConst(swigCPtr, this, XsDeviceIdClass.getCPtr(deviceid), deviceid);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice subDevice(int subDeviceId) {
    long cPtr = minimalJNI.XsDevice_subDevice(swigCPtr, this, subDeviceId);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public int subDeviceCount() {
    return minimalJNI.XsDevice_subDeviceCount(swigCPtr, this);
  }

  public int busId() {
    return minimalJNI.XsDevice_busId(swigCPtr, this);
  }

  public XsDeviceIdClass deviceId() {
    return new XsDeviceIdClass(minimalJNI.XsDevice_deviceId(swigCPtr, this), false);
  }

  public SWIGTYPE_p_XsVersion firmwareVersion() {
    return new SWIGTYPE_p_XsVersion(minimalJNI.XsDevice_firmwareVersion(swigCPtr, this), true);
  }

  public boolean isMasterDevice() {
    return minimalJNI.XsDevice_isMasterDevice(swigCPtr, this);
  }

  public boolean isContainerDevice() {
    return minimalJNI.XsDevice_isContainerDevice(swigCPtr, this);
  }

  public boolean isInitialized() {
    return minimalJNI.XsDevice_isInitialized(swigCPtr, this);
  }

  public boolean isStandaloneDevice() {
    return minimalJNI.XsDevice_isStandaloneDevice(swigCPtr, this);
  }

  public XsDevice deviceAtBusIdConst(int busid) {
    long cPtr = minimalJNI.XsDevice_deviceAtBusIdConst(swigCPtr, this, busid);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsDevice deviceAtBusId(int busid) {
    long cPtr = minimalJNI.XsDevice_deviceAtBusId(swigCPtr, this, busid);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public Communicator communicator() {
    long cPtr = minimalJNI.XsDevice_communicator(swigCPtr, this);
    return (cPtr == 0) ? null : new Communicator(cPtr, false);
  }

  public DataLogger logFileInterface(SWIGTYPE_p_std__unique_ptrT_xsens__Lock_t myLock) {
    long cPtr = minimalJNI.XsDevice_logFileInterface(swigCPtr, this, SWIGTYPE_p_std__unique_ptrT_xsens__Lock_t.getCPtr(myLock));
    return (cPtr == 0) ? null : new DataLogger(cPtr, false);
  }

  public XsResultValue updatePortInfo(XsPortInfoClass newInfo) {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_updatePortInfo(swigCPtr, this, XsPortInfoClass.getCPtr(newInfo), newInfo));
  }

  public void setGotoConfigOnClose(boolean gotoConfigOnClose) {
    minimalJNI.XsDevice_setGotoConfigOnClose(swigCPtr, this, gotoConfigOnClose);
  }

  public XsResultValue createLogFile(XsStringClass filename) {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_createLogFile(swigCPtr, this, XsStringClass.getCPtr(filename), filename));
  }

  public boolean closeLogFile() {
    return minimalJNI.XsDevice_closeLogFile(swigCPtr, this);
  }

  public boolean isMeasuring() {
    return minimalJNI.XsDevice_isMeasuring(swigCPtr, this);
  }

  public boolean isRecording() {
    return minimalJNI.XsDevice_isRecording(swigCPtr, this);
  }

  public boolean isReadingFromFile() {
    return minimalJNI.XsDevice_isReadingFromFile(swigCPtr, this);
  }

  public void checkDataCache() {
    minimalJNI.XsDevice_checkDataCache(swigCPtr, this);
  }

  public void restartFilter() {
    minimalJNI.XsDevice_restartFilter(swigCPtr, this);
  }

  public XsResultValue lastResult() {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_lastResult(swigCPtr, this));
  }

  public XsStringClass lastResultText() {
    return new XsStringClass(minimalJNI.XsDevice_lastResultText(swigCPtr, this), true);
  }

  public int recordingQueueLength() {
    return minimalJNI.XsDevice_recordingQueueLength(swigCPtr, this);
  }

  public int cacheSize() {
    return minimalJNI.XsDevice_cacheSize(swigCPtr, this);
  }

  public XsDeviceState deviceState() {
    return XsDeviceState.swigToEnum(minimalJNI.XsDevice_deviceState(swigCPtr, this));
  }

  public static boolean supportsSyncSettings(XsDeviceIdClass deviceId) {
    return minimalJNI.XsDevice_supportsSyncSettings(XsDeviceIdClass.getCPtr(deviceId), deviceId);
  }

  public static boolean isCompatibleSyncSetting(XsDeviceIdClass deviceId, SWIGTYPE_p_XsSyncSetting setting1, SWIGTYPE_p_XsSyncSetting setting2) {
    return minimalJNI.XsDevice_isCompatibleSyncSetting(XsDeviceIdClass.getCPtr(deviceId), deviceId, SWIGTYPE_p_XsSyncSetting.getCPtr(setting1), SWIGTYPE_p_XsSyncSetting.getCPtr(setting2));
  }

  public static long syncSettingsTimeResolutionInMicroSeconds(XsDeviceIdClass deviceId) {
    return minimalJNI.XsDevice_syncSettingsTimeResolutionInMicroSeconds(XsDeviceIdClass.getCPtr(deviceId), deviceId);
  }

  public boolean opLessThen(XsDevice dev) {
    return minimalJNI.XsDevice_opLessThen__SWIG_0(swigCPtr, this, XsDevice.getCPtr(dev), dev);
  }

  public boolean opEquals(XsDevice dev) {
    return minimalJNI.XsDevice_opEquals__SWIG_0(swigCPtr, this, XsDevice.getCPtr(dev), dev);
  }

  public boolean opLessThen(XsDeviceIdClass devId) {
    return minimalJNI.XsDevice_opLessThen__SWIG_1(swigCPtr, this, XsDeviceIdClass.getCPtr(devId), devId);
  }

  public boolean opEquals(XsDeviceIdClass devId) {
    return minimalJNI.XsDevice_opEquals__SWIG_1(swigCPtr, this, XsDeviceIdClass.getCPtr(devId), devId);
  }

  public XsDeviceConfiguration deviceConfiguration() {
    return new XsDeviceConfiguration(minimalJNI.XsDevice_deviceConfiguration(swigCPtr, this), true);
  }

  public XsDeviceConfiguration deviceConfigurationRef() {
    return new XsDeviceConfiguration(minimalJNI.XsDevice_deviceConfigurationRef(swigCPtr, this), false);
  }

  public XsDeviceConfiguration deviceConfigurationConst() {
    return new XsDeviceConfiguration(minimalJNI.XsDevice_deviceConfigurationConst(swigCPtr, this), false);
  }

  public boolean initialize() {
    return minimalJNI.XsDevice_initialize(swigCPtr, this);
  }

  public boolean initializeSoftwareCalibration() {
    return minimalJNI.XsDevice_initializeSoftwareCalibration(swigCPtr, this);
  }

  public void deinitializeSoftwareCalibration() {
    minimalJNI.XsDevice_deinitializeSoftwareCalibration(swigCPtr, this);
  }

  public int batteryLevel() {
    return minimalJNI.XsDevice_batteryLevel(swigCPtr, this);
  }

  public int updateRateForDataIdentifier(SWIGTYPE_p_XsDataIdentifier dataType) {
    return minimalJNI.XsDevice_updateRateForDataIdentifier(swigCPtr, this, SWIGTYPE_p_XsDataIdentifier.getCPtr(dataType));
  }

  public int updateRateForProcessedDataIdentifier(SWIGTYPE_p_XsDataIdentifier dataType) {
    return minimalJNI.XsDevice_updateRateForProcessedDataIdentifier(swigCPtr, this, SWIGTYPE_p_XsDataIdentifier.getCPtr(dataType));
  }

  public SWIGTYPE_p_std__vectorT_int_t supportedUpdateRates(SWIGTYPE_p_XsDataIdentifier dataType) {
    return new SWIGTYPE_p_std__vectorT_int_t(minimalJNI.XsDevice_supportedUpdateRates__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsDataIdentifier.getCPtr(dataType)), true);
  }

  public SWIGTYPE_p_std__vectorT_int_t supportedUpdateRates() {
    return new SWIGTYPE_p_std__vectorT_int_t(minimalJNI.XsDevice_supportedUpdateRates__SWIG_1(swigCPtr, this), true);
  }

  public int maximumUpdateRate() {
    return minimalJNI.XsDevice_maximumUpdateRate(swigCPtr, this);
  }

  public boolean hasDataEnabled(SWIGTYPE_p_XsDataIdentifier dataType) {
    return minimalJNI.XsDevice_hasDataEnabled(swigCPtr, this, SWIGTYPE_p_XsDataIdentifier.getCPtr(dataType));
  }

  public boolean hasProcessedDataEnabled(SWIGTYPE_p_XsDataIdentifier dataType) {
    return minimalJNI.XsDevice_hasProcessedDataEnabled(swigCPtr, this, SWIGTYPE_p_XsDataIdentifier.getCPtr(dataType));
  }

  public XsStringClass productCode() {
    return new XsStringClass(minimalJNI.XsDevice_productCode(swigCPtr, this), true);
  }

  public XsStringClass shortProductCode() {
    return new XsStringClass(minimalJNI.XsDevice_shortProductCode(swigCPtr, this), true);
  }

  public XsStringClass portName() {
    return new XsStringClass(minimalJNI.XsDevice_portName(swigCPtr, this), true);
  }

  public XsPortInfoClass portInfo() {
    return new XsPortInfoClass(minimalJNI.XsDevice_portInfo(swigCPtr, this), true);
  }

  public XsBaudRate baudRate() {
    return XsBaudRate.swigToEnum(minimalJNI.XsDevice_baudRate(swigCPtr, this));
  }

  public XsBaudRate serialBaudRate() {
    return XsBaudRate.swigToEnum(minimalJNI.XsDevice_serialBaudRate(swigCPtr, this));
  }

  public SWIGTYPE_p_XsVersion hardwareVersion() {
    return new SWIGTYPE_p_XsVersion(minimalJNI.XsDevice_hardwareVersion(swigCPtr, this), true);
  }

  public boolean startRecording() {
    return minimalJNI.XsDevice_startRecording(swigCPtr, this);
  }

  public boolean triggerStartRecording() {
    return minimalJNI.XsDevice_triggerStartRecording(swigCPtr, this);
  }

  public boolean stopRecording() {
    return minimalJNI.XsDevice_stopRecording(swigCPtr, this);
  }

  public long getStartRecordingPacketId() {
    return minimalJNI.XsDevice_getStartRecordingPacketId(swigCPtr, this);
  }

  public long getStopRecordingPacketId() {
    return minimalJNI.XsDevice_getStopRecordingPacketId(swigCPtr, this);
  }

  public void setOptions(XsOption enable, XsOption disable) {
    minimalJNI.XsDevice_setOptions(swigCPtr, this, enable.swigValue(), disable.swigValue());
  }

  public boolean areOptionsEnabled(XsOption options) {
    return minimalJNI.XsDevice_areOptionsEnabled(swigCPtr, this, options.swigValue());
  }

  public XsOption getOptions() {
    return XsOption.swigToEnum(minimalJNI.XsDevice_getOptions(swigCPtr, this));
  }

  public boolean sendCustomMessage(XsMessageClass messageSend, boolean waitForResult, XsMessageClass messageReceive, int timeout) {
    return minimalJNI.XsDevice_sendCustomMessage__SWIG_0(swigCPtr, this, XsMessageClass.getCPtr(messageSend), messageSend, waitForResult, XsMessageClass.getCPtr(messageReceive), messageReceive, timeout);
  }

  public boolean sendCustomMessage(XsMessageClass messageSend, boolean waitForResult, XsMessageClass messageReceive) {
    return minimalJNI.XsDevice_sendCustomMessage__SWIG_1(swigCPtr, this, XsMessageClass.getCPtr(messageSend), messageSend, waitForResult, XsMessageClass.getCPtr(messageReceive), messageReceive);
  }

  public boolean sendRawMessage(XsMessageClass message) {
    return minimalJNI.XsDevice_sendRawMessage(swigCPtr, this, XsMessageClass.getCPtr(message), message);
  }

  public boolean sendCustomMessage(XsMessageClass messageSend, boolean waitForResult, SWIGTYPE_p_XsXbusMessageId messageId, XsMessageClass messageReceive, int timeout) {
    return minimalJNI.XsDevice_sendCustomMessage__SWIG_2(swigCPtr, this, XsMessageClass.getCPtr(messageSend), messageSend, waitForResult, SWIGTYPE_p_XsXbusMessageId.getCPtr(messageId), XsMessageClass.getCPtr(messageReceive), messageReceive, timeout);
  }

  public boolean sendCustomMessage(XsMessageClass messageSend, boolean waitForResult, SWIGTYPE_p_XsXbusMessageId messageId, XsMessageClass messageReceive) {
    return minimalJNI.XsDevice_sendCustomMessage__SWIG_3(swigCPtr, this, XsMessageClass.getCPtr(messageSend), messageSend, waitForResult, SWIGTYPE_p_XsXbusMessageId.getCPtr(messageId), XsMessageClass.getCPtr(messageReceive), messageReceive);
  }

  public boolean waitForCustomMessage(SWIGTYPE_p_XsXbusMessageId messageId, XsMessageClass messageReceive, int timeout) {
    return minimalJNI.XsDevice_waitForCustomMessage__SWIG_0(swigCPtr, this, SWIGTYPE_p_XsXbusMessageId.getCPtr(messageId), XsMessageClass.getCPtr(messageReceive), messageReceive, timeout);
  }

  public boolean waitForCustomMessage(SWIGTYPE_p_XsXbusMessageId messageId, XsMessageClass messageReceive) {
    return minimalJNI.XsDevice_waitForCustomMessage__SWIG_1(swigCPtr, this, SWIGTYPE_p_XsXbusMessageId.getCPtr(messageId), XsMessageClass.getCPtr(messageReceive), messageReceive);
  }

  public boolean waitForCustomMessage(SWIGTYPE_p_std__shared_ptrT_ReplyObject_t reply, XsMessageClass messageReceive, int timeout) {
    return minimalJNI.XsDevice_waitForCustomMessage__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_ReplyObject_t.getCPtr(reply), XsMessageClass.getCPtr(messageReceive), messageReceive, timeout);
  }

  public SWIGTYPE_p_std__shared_ptrT_ReplyObject_t addReplyObject(SWIGTYPE_p_XsXbusMessageId messageId, short data) {
    return new SWIGTYPE_p_std__shared_ptrT_ReplyObject_t(minimalJNI.XsDevice_addReplyObject(swigCPtr, this, SWIGTYPE_p_XsXbusMessageId.getCPtr(messageId), data), true);
  }

  public void handleMessage(XsMessageClass msg) {
    minimalJNI.XsDevice_handleMessage(swigCPtr, this, XsMessageClass.getCPtr(msg), msg);
  }

  public void handleDataPacket(XsDataPacketClass packet) {
    minimalJNI.XsDevice_handleDataPacket(swigCPtr, this, XsDataPacketClass.getCPtr(packet), packet);
  }

  public void handleNonDataMessage(XsMessageClass msg) {
    minimalJNI.XsDevice_handleNonDataMessage(swigCPtr, this, XsMessageClass.getCPtr(msg), msg);
  }

  public void handleErrorMessage(XsMessageClass msg) {
    minimalJNI.XsDevice_handleErrorMessage(swigCPtr, this, XsMessageClass.getCPtr(msg), msg);
  }

  public void handleWarningMessage(XsMessageClass msg) {
    minimalJNI.XsDevice_handleWarningMessage(swigCPtr, this, XsMessageClass.getCPtr(msg), msg);
  }

  public void handleWakeupMessage(XsMessageClass msg) {
    minimalJNI.XsDevice_handleWakeupMessage(swigCPtr, this, XsMessageClass.getCPtr(msg), msg);
  }

  public boolean setSerialBaudRate(XsBaudRate baudrate) {
    return minimalJNI.XsDevice_setSerialBaudRate(swigCPtr, this, baudrate.swigValue());
  }

  public SWIGTYPE_p_XsIntArray portConfiguration() {
    return new SWIGTYPE_p_XsIntArray(minimalJNI.XsDevice_portConfiguration(swigCPtr, this), true);
  }

  public boolean setPortConfiguration(SWIGTYPE_p_XsIntArray config) {
    return minimalJNI.XsDevice_setPortConfiguration(swigCPtr, this, SWIGTYPE_p_XsIntArray.getCPtr(config));
  }

  public boolean isMotionTracker() {
    return minimalJNI.XsDevice_isMotionTracker(swigCPtr, this);
  }

  public XsOperationalMode operationalMode() {
    return XsOperationalMode.swigToEnum(minimalJNI.XsDevice_operationalMode(swigCPtr, this));
  }

  public boolean setOperationalMode(XsOperationalMode mode) {
    return minimalJNI.XsDevice_setOperationalMode(swigCPtr, this, mode.swigValue());
  }

  public int updateRate() {
    return minimalJNI.XsDevice_updateRate(swigCPtr, this);
  }

  public boolean setUpdateRate(int rate) {
    return minimalJNI.XsDevice_setUpdateRate(swigCPtr, this, rate);
  }

  public XsDeviceOptionFlag deviceOptionFlags() {
    return XsDeviceOptionFlag.swigToEnum(minimalJNI.XsDevice_deviceOptionFlags(swigCPtr, this));
  }

  public boolean setDeviceOptionFlags(XsDeviceOptionFlag setFlags, XsDeviceOptionFlag clearFlags) {
    return minimalJNI.XsDevice_setDeviceOptionFlags(swigCPtr, this, setFlags.swigValue(), clearFlags.swigValue());
  }

  public SWIGTYPE_p_XsOutputConfigurationArray outputConfiguration() {
    return new SWIGTYPE_p_XsOutputConfigurationArray(minimalJNI.XsDevice_outputConfiguration(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsOutputConfigurationArray processedOutputConfiguration() {
    return new SWIGTYPE_p_XsOutputConfigurationArray(minimalJNI.XsDevice_processedOutputConfiguration(swigCPtr, this), true);
  }

  public boolean setOutputConfiguration(SWIGTYPE_p_XsOutputConfigurationArray config) {
    return minimalJNI.XsDevice_setOutputConfiguration(swigCPtr, this, SWIGTYPE_p_XsOutputConfigurationArray.getCPtr(config));
  }

  public boolean isInStringOutputMode() {
    return minimalJNI.XsDevice_isInStringOutputMode(swigCPtr, this);
  }

  public SWIGTYPE_p_XsCanOutputConfigurationArray canOutputConfiguration() {
    return new SWIGTYPE_p_XsCanOutputConfigurationArray(minimalJNI.XsDevice_canOutputConfiguration(swigCPtr, this), true);
  }

  public boolean setCanOutputConfiguration(SWIGTYPE_p_XsCanOutputConfigurationArray config) {
    return minimalJNI.XsDevice_setCanOutputConfiguration(swigCPtr, this, SWIGTYPE_p_XsCanOutputConfigurationArray.getCPtr(config));
  }

  public long canConfiguration() {
    return minimalJNI.XsDevice_canConfiguration(swigCPtr, this);
  }

  public boolean setCanConfiguration(long config) {
    return minimalJNI.XsDevice_setCanConfiguration(swigCPtr, this, config);
  }

  public boolean usesLegacyDeviceMode() {
    return minimalJNI.XsDevice_usesLegacyDeviceMode(swigCPtr, this);
  }

  public int stringOutputType() {
    return minimalJNI.XsDevice_stringOutputType(swigCPtr, this);
  }

  public int stringSamplePeriod() {
    return minimalJNI.XsDevice_stringSamplePeriod(swigCPtr, this);
  }

  public int stringSkipFactor() {
    return minimalJNI.XsDevice_stringSkipFactor(swigCPtr, this);
  }

  public boolean setStringOutputMode(int type, int period, int skipFactor) {
    return minimalJNI.XsDevice_setStringOutputMode(swigCPtr, this, type, period, skipFactor);
  }

  public SWIGTYPE_p_XsStringOutputTypeArray supportedStringOutputTypes() {
    return new SWIGTYPE_p_XsStringOutputTypeArray(minimalJNI.XsDevice_supportedStringOutputTypes(swigCPtr, this), true);
  }

  public int dataLength() {
    return minimalJNI.XsDevice_dataLength(swigCPtr, this);
  }

  public SWIGTYPE_p_XsSyncSettingArray syncSettings() {
    return new SWIGTYPE_p_XsSyncSettingArray(minimalJNI.XsDevice_syncSettings(swigCPtr, this), true);
  }

  public boolean setSyncSettings(SWIGTYPE_p_XsSyncSettingArray settingList) {
    return minimalJNI.XsDevice_setSyncSettings(swigCPtr, this, SWIGTYPE_p_XsSyncSettingArray.getCPtr(settingList));
  }

  public boolean isSyncMaster() {
    return minimalJNI.XsDevice_isSyncMaster(swigCPtr, this);
  }

  public boolean isSyncSlave() {
    return minimalJNI.XsDevice_isSyncSlave(swigCPtr, this);
  }

  public SWIGTYPE_p_XsSyncSettingArray supportedSyncSettings() {
    return new SWIGTYPE_p_XsSyncSettingArray(minimalJNI.XsDevice_supportedSyncSettings__SWIG_0(swigCPtr, this), true);
  }

  public static SWIGTYPE_p_XsSyncSettingArray supportedSyncSettings(XsDeviceIdClass deviceId) {
    return new SWIGTYPE_p_XsSyncSettingArray(minimalJNI.XsDevice_supportedSyncSettings__SWIG_1(XsDeviceIdClass.getCPtr(deviceId), deviceId), true);
  }

  public boolean gotoMeasurement() {
    return minimalJNI.XsDevice_gotoMeasurement(swigCPtr, this);
  }

  public boolean gotoConfig() {
    return minimalJNI.XsDevice_gotoConfig(swigCPtr, this);
  }

  public boolean restoreFactoryDefaults() {
    return minimalJNI.XsDevice_restoreFactoryDefaults(swigCPtr, this);
  }

  public boolean reset() {
    return minimalJNI.XsDevice_reset__SWIG_0(swigCPtr, this);
  }

  public boolean reset(boolean skipDeviceIdCheck) {
    return minimalJNI.XsDevice_reset__SWIG_1(swigCPtr, this, skipDeviceIdCheck);
  }

  public boolean reopenPort(boolean gotoConfig, boolean skipDeviceIdCheck) {
    return minimalJNI.XsDevice_reopenPort__SWIG_0(swigCPtr, this, gotoConfig, skipDeviceIdCheck);
  }

  public boolean reopenPort(boolean gotoConfig) {
    return minimalJNI.XsDevice_reopenPort__SWIG_1(swigCPtr, this, gotoConfig);
  }

  public void writeDeviceSettingsToFile() {
    minimalJNI.XsDevice_writeDeviceSettingsToFile(swigCPtr, this);
  }

  public void flushInputBuffers() {
    minimalJNI.XsDevice_flushInputBuffers(swigCPtr, this);
  }

  public XsSyncRole syncRole() {
    return XsSyncRole.swigToEnum(minimalJNI.XsDevice_syncRole(swigCPtr, this));
  }

  public boolean loadLogFile() {
    return minimalJNI.XsDevice_loadLogFile(swigCPtr, this);
  }

  public boolean abortLoadLogFile() {
    return minimalJNI.XsDevice_abortLoadLogFile(swigCPtr, this);
  }

  public XsStringClass logFileName() {
    return new XsStringClass(minimalJNI.XsDevice_logFileName(swigCPtr, this), true);
  }

  public boolean resetOrientation(XsResetMethod resetmethod) {
    return minimalJNI.XsDevice_resetOrientation(swigCPtr, this, resetmethod.swigValue());
  }

  public boolean resetLogFileReadPosition() {
    return minimalJNI.XsDevice_resetLogFileReadPosition(swigCPtr, this);
  }

  public long logFileSize() {
    return minimalJNI.XsDevice_logFileSize(swigCPtr, this);
  }

  public long logFileReadPosition() {
    return minimalJNI.XsDevice_logFileReadPosition(swigCPtr, this);
  }

  public boolean updateCachedDeviceInformation() {
    return minimalJNI.XsDevice_updateCachedDeviceInformation(swigCPtr, this);
  }

  public boolean enableProtocol(XsProtocolType protocol) {
    return minimalJNI.XsDevice_enableProtocol(swigCPtr, this, protocol.swigValue());
  }

  public boolean disableProtocol(XsProtocolType protocol) {
    return minimalJNI.XsDevice_disableProtocol(swigCPtr, this, protocol.swigValue());
  }

  public boolean isProtocolEnabled(XsProtocolType protocol) {
    return minimalJNI.XsDevice_isProtocolEnabled(swigCPtr, this, protocol.swigValue());
  }

  public long deviceBufferSize() {
    return minimalJNI.XsDevice_deviceBufferSize(swigCPtr, this);
  }

  public boolean setDeviceBufferSize(long frames) {
    return minimalJNI.XsDevice_setDeviceBufferSize(swigCPtr, this, frames);
  }

  public XsConnectivityState connectivityState() {
    return XsConnectivityState.swigToEnum(minimalJNI.XsDevice_connectivityState(swigCPtr, this));
  }

  public void waitForAllDevicesInitialized() {
    minimalJNI.XsDevice_waitForAllDevicesInitialized(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_XsDevice_p_t children() {
    return new SWIGTYPE_p_std__vectorT_XsDevice_p_t(minimalJNI.XsDevice_children(swigCPtr, this), true);
  }

  public int childCount() {
    return minimalJNI.XsDevice_childCount(swigCPtr, this);
  }

  public boolean enableRadio(int channel) {
    return minimalJNI.XsDevice_enableRadio(swigCPtr, this, channel);
  }

  public boolean disableRadio() {
    return minimalJNI.XsDevice_disableRadio(swigCPtr, this);
  }

  public int radioChannel() {
    return minimalJNI.XsDevice_radioChannel(swigCPtr, this);
  }

  public boolean isRadioEnabled() {
    return minimalJNI.XsDevice_isRadioEnabled(swigCPtr, this);
  }

  public boolean makeOperational() {
    return minimalJNI.XsDevice_makeOperational(swigCPtr, this);
  }

  public boolean isOperational() {
    return minimalJNI.XsDevice_isOperational(swigCPtr, this);
  }

  public boolean isInSyncStationMode() {
    return minimalJNI.XsDevice_isInSyncStationMode(swigCPtr, this);
  }

  public boolean setSyncStationMode(boolean enabled) {
    return minimalJNI.XsDevice_setSyncStationMode(swigCPtr, this, enabled);
  }

  public boolean stealthMode() {
    return minimalJNI.XsDevice_stealthMode(swigCPtr, this);
  }

  public boolean setStealthMode(boolean enabled) {
    return minimalJNI.XsDevice_setStealthMode(swigCPtr, this, enabled);
  }

  public void discardRetransmissions(long firstNewPacketId) {
    minimalJNI.XsDevice_discardRetransmissions(swigCPtr, this, firstNewPacketId);
  }

  public void handleMasterIndication(XsMessageClass message) {
    minimalJNI.XsDevice_handleMasterIndication(swigCPtr, this, XsMessageClass.getCPtr(message), message);
  }

  public boolean abortFlushing() {
    return minimalJNI.XsDevice_abortFlushing(swigCPtr, this);
  }

  public boolean setDeviceAccepted(XsDeviceIdClass deviceId) {
    return minimalJNI.XsDevice_setDeviceAccepted(swigCPtr, this, XsDeviceIdClass.getCPtr(deviceId), deviceId);
  }

  public boolean setDeviceRejected(XsDeviceIdClass deviceId) {
    return minimalJNI.XsDevice_setDeviceRejected(swigCPtr, this, XsDeviceIdClass.getCPtr(deviceId), deviceId);
  }

  public boolean setAccessControlMode(XsAccessControlMode mode, SWIGTYPE_p_XsDeviceIdArray initialList) {
    return minimalJNI.XsDevice_setAccessControlMode(swigCPtr, this, mode.swigValue(), SWIGTYPE_p_XsDeviceIdArray.getCPtr(initialList));
  }

  public XsAccessControlMode accessControlMode() {
    return XsAccessControlMode.swigToEnum(minimalJNI.XsDevice_accessControlMode(swigCPtr, this));
  }

  public SWIGTYPE_p_XsDeviceIdArray currentAccessControlList() {
    return new SWIGTYPE_p_XsDeviceIdArray(minimalJNI.XsDevice_currentAccessControlList(swigCPtr, this), true);
  }

  public XsResultValue setDeviceParameter(XsDeviceParameter parameter) {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_setDeviceParameter(swigCPtr, this, XsDeviceParameter.getCPtr(parameter), parameter));
  }

  public XsResultValue deviceParameter(XsDeviceParameter parameter) {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_deviceParameter(swigCPtr, this, XsDeviceParameter.getCPtr(parameter), parameter));
  }

  public XsGnssPlatform gnssPlatform() {
    return XsGnssPlatform.swigToEnum(minimalJNI.XsDevice_gnssPlatform(swigCPtr, this));
  }

  public boolean setGnssPlatform(XsGnssPlatform gnssPlatform) {
    return minimalJNI.XsDevice_setGnssPlatform(swigCPtr, this, gnssPlatform.swigValue());
  }

  public boolean acceptConnection() {
    return minimalJNI.XsDevice_acceptConnection(swigCPtr, this);
  }

  public boolean rejectConnection() {
    return minimalJNI.XsDevice_rejectConnection(swigCPtr, this);
  }

  public int wirelessPriority() {
    return minimalJNI.XsDevice_wirelessPriority(swigCPtr, this);
  }

  public boolean setWirelessPriority(int priority) {
    return minimalJNI.XsDevice_setWirelessPriority(swigCPtr, this, priority);
  }

  public XsRejectReason rejectReason() {
    return XsRejectReason.swigToEnum(minimalJNI.XsDevice_rejectReason(swigCPtr, this));
  }

  public boolean requestBatteryLevel() {
    return minimalJNI.XsDevice_requestBatteryLevel(swigCPtr, this);
  }

  public XsTimeStampClass batteryLevelTime() {
    return new XsTimeStampClass(minimalJNI.XsDevice_batteryLevelTime(swigCPtr, this), true);
  }

  public boolean setTransportMode(boolean transportModeEnabled) {
    return minimalJNI.XsDevice_setTransportMode(swigCPtr, this, transportModeEnabled);
  }

  public boolean transportMode() {
    return minimalJNI.XsDevice_transportMode(swigCPtr, this);
  }

  public short lastKnownRssi() {
    return minimalJNI.XsDevice_lastKnownRssi(swigCPtr, this);
  }

  public void setPacketErrorRate(int per) {
    minimalJNI.XsDevice_setPacketErrorRate(swigCPtr, this, per);
  }

  public int packetErrorRate() {
    return minimalJNI.XsDevice_packetErrorRate(swigCPtr, this);
  }

  public boolean isBlueToothEnabled() {
    return minimalJNI.XsDevice_isBlueToothEnabled(swigCPtr, this);
  }

  public boolean setBlueToothEnabled(boolean enabled) {
    return minimalJNI.XsDevice_setBlueToothEnabled(swigCPtr, this, enabled);
  }

  public boolean isBusPowerEnabled() {
    return minimalJNI.XsDevice_isBusPowerEnabled(swigCPtr, this);
  }

  public boolean setBusPowerEnabled(boolean enabled) {
    return minimalJNI.XsDevice_setBusPowerEnabled(swigCPtr, this, enabled);
  }

  public boolean powerDown() {
    return minimalJNI.XsDevice_powerDown(swigCPtr, this);
  }

  public XsErrorMode errorMode() {
    return XsErrorMode.swigToEnum(minimalJNI.XsDevice_errorMode(swigCPtr, this));
  }

  public boolean setErrorMode(XsErrorMode errormode) {
    return minimalJNI.XsDevice_setErrorMode(swigCPtr, this, errormode.swigValue());
  }

  public boolean setHeadingOffset(double offset) {
    return minimalJNI.XsDevice_setHeadingOffset(swigCPtr, this, offset);
  }

  public double headingOffset() {
    return minimalJNI.XsDevice_headingOffset(swigCPtr, this);
  }

  public boolean setLocationId(int id) {
    return minimalJNI.XsDevice_setLocationId(swigCPtr, this, id);
  }

  public int locationId() {
    return minimalJNI.XsDevice_locationId(swigCPtr, this);
  }

  public XsDevice getDeviceFromLocationId(int locId) {
    long cPtr = minimalJNI.XsDevice_getDeviceFromLocationId(swigCPtr, this, locId);
    return (cPtr == 0) ? null : new XsDevice(cPtr, false);
  }

  public XsMatrixClass objectAlignment() {
    return new XsMatrixClass(minimalJNI.XsDevice_objectAlignment(swigCPtr, this), true);
  }

  public boolean setObjectAlignment(XsMatrixClass matrix) {
    return minimalJNI.XsDevice_setObjectAlignment(swigCPtr, this, XsMatrixClass.getCPtr(matrix), matrix);
  }

  public double gravityMagnitude() {
    return minimalJNI.XsDevice_gravityMagnitude(swigCPtr, this);
  }

  public boolean setGravityMagnitude(double mag) {
    return minimalJNI.XsDevice_setGravityMagnitude(swigCPtr, this, mag);
  }

  public XsVectorClass initialPositionLLA() {
    return new XsVectorClass(minimalJNI.XsDevice_initialPositionLLA(swigCPtr, this), true);
  }

  public boolean setInitialPositionLLA(XsVectorClass lla) {
    return minimalJNI.XsDevice_setInitialPositionLLA(swigCPtr, this, XsVectorClass.getCPtr(lla), lla);
  }

  public SWIGTYPE_p_XsTimeInfo utcTime() {
    return new SWIGTYPE_p_XsTimeInfo(minimalJNI.XsDevice_utcTime(swigCPtr, this), true);
  }

  public boolean setUtcTime(SWIGTYPE_p_XsTimeInfo time) {
    return minimalJNI.XsDevice_setUtcTime(swigCPtr, this, SWIGTYPE_p_XsTimeInfo.getCPtr(time));
  }

  public boolean reinitialize() {
    return minimalJNI.XsDevice_reinitialize(swigCPtr, this);
  }

  public XsFilterProfile xdaFilterProfile() {
    return new XsFilterProfile(minimalJNI.XsDevice_xdaFilterProfile(swigCPtr, this), true);
  }

  public boolean setXdaFilterProfile(int profileType) {
    return minimalJNI.XsDevice_setXdaFilterProfile__SWIG_0(swigCPtr, this, profileType);
  }

  public boolean setXdaFilterProfile(XsStringClass profileType) {
    return minimalJNI.XsDevice_setXdaFilterProfile__SWIG_1(swigCPtr, this, XsStringClass.getCPtr(profileType), profileType);
  }

  public XsFilterProfile onboardFilterProfile() {
    return new XsFilterProfile(minimalJNI.XsDevice_onboardFilterProfile(swigCPtr, this), true);
  }

  public boolean setOnboardFilterProfile(int profileType) {
    return minimalJNI.XsDevice_setOnboardFilterProfile__SWIG_0(swigCPtr, this, profileType);
  }

  public boolean setOnboardFilterProfile(XsStringClass profileType) {
    return minimalJNI.XsDevice_setOnboardFilterProfile__SWIG_1(swigCPtr, this, XsStringClass.getCPtr(profileType), profileType);
  }

  public boolean replaceFilterProfile(XsFilterProfile profileCurrent, XsFilterProfile profileNew) {
    return minimalJNI.XsDevice_replaceFilterProfile(swigCPtr, this, XsFilterProfile.getCPtr(profileCurrent), profileCurrent, XsFilterProfile.getCPtr(profileNew), profileNew);
  }

  public SWIGTYPE_p_XsFilterProfileArray availableOnboardFilterProfiles() {
    return new SWIGTYPE_p_XsFilterProfileArray(minimalJNI.XsDevice_availableOnboardFilterProfiles(swigCPtr, this), true);
  }

  public SWIGTYPE_p_XsFilterProfileArray availableXdaFilterProfiles() {
    return new SWIGTYPE_p_XsFilterProfileArray(minimalJNI.XsDevice_availableXdaFilterProfiles(swigCPtr, this), true);
  }

  public double accelerometerRange() {
    return minimalJNI.XsDevice_accelerometerRange(swigCPtr, this);
  }

  public double gyroscopeRange() {
    return minimalJNI.XsDevice_gyroscopeRange(swigCPtr, this);
  }

  public boolean setNoRotation(int duration) {
    return minimalJNI.XsDevice_setNoRotation(swigCPtr, this, duration);
  }

  public boolean startRepresentativeMotion() {
    return minimalJNI.XsDevice_startRepresentativeMotion(swigCPtr, this);
  }

  public boolean representativeMotionState() {
    return minimalJNI.XsDevice_representativeMotionState(swigCPtr, this);
  }

  public XsIccRepMotionResult stopRepresentativeMotion() {
    return new XsIccRepMotionResult(minimalJNI.XsDevice_stopRepresentativeMotion(swigCPtr, this), true);
  }

  public boolean storeIccResults() {
    return minimalJNI.XsDevice_storeIccResults(swigCPtr, this);
  }

  public int rs485TransmissionDelay() {
    return minimalJNI.XsDevice_rs485TransmissionDelay(swigCPtr, this);
  }

  public boolean setRs485TransmissionDelay(int delay) {
    return minimalJNI.XsDevice_setRs485TransmissionDelay(swigCPtr, this, delay);
  }

  public XsSelfTestResult runSelfTest() {
    return new XsSelfTestResult(minimalJNI.XsDevice_runSelfTest(swigCPtr, this), true);
  }

  public boolean requestData() {
    return minimalJNI.XsDevice_requestData(swigCPtr, this);
  }

  public boolean storeFilterState() {
    return minimalJNI.XsDevice_storeFilterState(swigCPtr, this);
  }

  public XsDataPacketClass getDataPacketByIndex(SWIGTYPE_p_XsSize index) {
    return new XsDataPacketClass(minimalJNI.XsDevice_getDataPacketByIndex(swigCPtr, this, SWIGTYPE_p_XsSize.getCPtr(index)), true);
  }

  public SWIGTYPE_p_XsSize getDataPacketCount() {
    return new SWIGTYPE_p_XsSize(minimalJNI.XsDevice_getDataPacketCount(swigCPtr, this), true);
  }

  public XsDataPacketClass lastAvailableLiveData() {
    return new XsDataPacketClass(minimalJNI.XsDevice_lastAvailableLiveData(swigCPtr, this), true);
  }

  public XsDataPacketClass takeFirstDataPacketInQueue() {
    return new XsDataPacketClass(minimalJNI.XsDevice_takeFirstDataPacketInQueue(swigCPtr, this), true);
  }

  public boolean isInitialBiasUpdateEnabled() {
    return minimalJNI.XsDevice_isInitialBiasUpdateEnabled(swigCPtr, this);
  }

  public boolean setInitialBiasUpdateEnabled(boolean enable) {
    return minimalJNI.XsDevice_setInitialBiasUpdateEnabled(swigCPtr, this, enable);
  }

  public boolean isFixedGravityEnabled() {
    return minimalJNI.XsDevice_isFixedGravityEnabled(swigCPtr, this);
  }

  public boolean setFixedGravityEnabled(boolean enable) {
    return minimalJNI.XsDevice_setFixedGravityEnabled(swigCPtr, this, enable);
  }

  public XsResultValue createConfigFile(XsStringClass filename) {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_createConfigFile(swigCPtr, this, XsStringClass.getCPtr(filename), filename));
  }

  public XsResultValue applyConfigFile(XsStringClass filename) {
    return XsResultValue.swigToEnum(minimalJNI.XsDevice_applyConfigFile(swigCPtr, this, XsStringClass.getCPtr(filename), filename));
  }

  public boolean setAlignmentRotationMatrix(XsAlignmentFrame frame, XsMatrixClass matrix) {
    return minimalJNI.XsDevice_setAlignmentRotationMatrix(swigCPtr, this, frame.swigValue(), XsMatrixClass.getCPtr(matrix), matrix);
  }

  public XsMatrixClass alignmentRotationMatrix(XsAlignmentFrame frame) {
    return new XsMatrixClass(minimalJNI.XsDevice_alignmentRotationMatrix(swigCPtr, this, frame.swigValue()), true);
  }

  public boolean setAlignmentRotationQuaternion(XsAlignmentFrame frame, XsQuaternionClass quat) {
    return minimalJNI.XsDevice_setAlignmentRotationQuaternion(swigCPtr, this, frame.swigValue(), XsQuaternionClass.getCPtr(quat), quat);
  }

  public XsQuaternionClass alignmentRotationQuaternion(XsAlignmentFrame frame) {
    return new XsQuaternionClass(minimalJNI.XsDevice_alignmentRotationQuaternion(swigCPtr, this, frame.swigValue()), true);
  }

  public SWIGTYPE_p_xsens__GuardedMutex mutex() {
    long cPtr = minimalJNI.XsDevice_mutex(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_xsens__GuardedMutex(cPtr, false);
  }

  public boolean deviceIsDocked(XsDevice dev) {
    return minimalJNI.XsDevice_deviceIsDocked(swigCPtr, this, XsDevice.getCPtr(dev), dev);
  }

  public boolean isLoadLogFileInProgress() {
    return minimalJNI.XsDevice_isLoadLogFileInProgress(swigCPtr, this);
  }

  public void waitForLoadLogFileDone() {
    minimalJNI.XsDevice_waitForLoadLogFileDone(swigCPtr, this);
  }

  public boolean messageLooksSane(XsMessageClass msg) {
    return minimalJNI.XsDevice_messageLooksSane(swigCPtr, this, XsMessageClass.getCPtr(msg), msg);
  }

  public void prepareForTermination() {
    minimalJNI.XsDevice_prepareForTermination(swigCPtr, this);
  }

  public boolean setGnssLeverArm(XsVectorClass arm) {
    return minimalJNI.XsDevice_setGnssLeverArm(swigCPtr, this, XsVectorClass.getCPtr(arm), arm);
  }

  public XsVectorClass gnssLeverArm() {
    return new XsVectorClass(minimalJNI.XsDevice_gnssLeverArm(swigCPtr, this), true);
  }

  public boolean requestUtcTime() {
    return minimalJNI.XsDevice_requestUtcTime(swigCPtr, this);
  }

  public void handleUnavailableData(long frameNumber) {
    minimalJNI.XsDevice_handleUnavailableData(swigCPtr, this, frameNumber);
  }

  public boolean writeEmtsPage(SWIGTYPE_p_unsigned_char data, int pageNr, int bankNr) {
    return minimalJNI.XsDevice_writeEmtsPage(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), pageNr, bankNr);
  }

  public void setSkipEmtsReadOnInit(boolean skip) {
    minimalJNI.XsDevice_setSkipEmtsReadOnInit(swigCPtr, this, skip);
  }

  public boolean readEmtsAndDeviceConfiguration() {
    return minimalJNI.XsDevice_readEmtsAndDeviceConfiguration(swigCPtr, this);
  }

  public long supportedStatusFlags() {
    return minimalJNI.XsDevice_supportedStatusFlags(swigCPtr, this);
  }

  public SWIGTYPE_p_XsByteArray readMetaDataFromLogFile() {
    return new SWIGTYPE_p_XsByteArray(minimalJNI.XsDevice_readMetaDataFromLogFile(swigCPtr, this), true);
  }

  public void onMessageSent(XsMessageClass message) {
    minimalJNI.XsDevice_onMessageSent(swigCPtr, this, XsMessageClass.getCPtr(message), message);
  }

  public void onMessageReceived(XsMessageClass message) {
    minimalJNI.XsDevice_onMessageReceived(swigCPtr, this, XsMessageClass.getCPtr(message), message);
  }

  public void onMessageDetected2(XsProtocolType type, SWIGTYPE_p_XsByteArray rawMessage) {
    minimalJNI.XsDevice_onMessageDetected2(swigCPtr, this, type.swigValue(), SWIGTYPE_p_XsByteArray.getCPtr(rawMessage));
  }

  public void onSessionRestarted() {
    minimalJNI.XsDevice_onSessionRestarted(swigCPtr, this);
  }

  public void onConnectionLost() {
    minimalJNI.XsDevice_onConnectionLost(swigCPtr, this);
  }

  public void onEofReached() {
    minimalJNI.XsDevice_onEofReached(swigCPtr, this);
  }

  public void onWirelessConnectionLost() {
    minimalJNI.XsDevice_onWirelessConnectionLost(swigCPtr, this);
  }

  public long deviceRecordingBufferItemCount(SWIGTYPE_p_long_long lastCompletePacketId) {
    return minimalJNI.XsDevice_deviceRecordingBufferItemCount(swigCPtr, this, SWIGTYPE_p_long_long.getCPtr(lastCompletePacketId));
  }

}
