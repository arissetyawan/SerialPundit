/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge */

#ifndef _Included_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
#define _Included_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    initNativeLib
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_initNativeLib
  (JNIEnv *, jobject);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    listHIDdevicesWithInfo
 * Signature: ()[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_listHIDdevicesWithInfo
  (JNIEnv *, jobject);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    openHidDevice
 * Signature: (Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_openHidDevice
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    closeHidDevice
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_closeHidDevice
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    getReportDescriptorSize
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_getReportDescriptorSize
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    writeOutputReport
 * Signature: (JB[B)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_writeOutputReport
  (JNIEnv *, jobject, jlong, jbyte, jbyteArray);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    readInputReport
 * Signature: (J[BI)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_readInputReport
  (JNIEnv *, jobject, jlong, jbyteArray, jint);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    readInputReportWithTimeout
 * Signature: (J[BII)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_readInputReportWithTimeout
  (JNIEnv *, jobject, jlong, jbyteArray, jint, jint);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    sendFeatureReport
 * Signature: (JB[B)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_sendFeatureReport
  (JNIEnv *, jobject, jlong, jbyte, jbyteArray);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    getFeatureReport
 * Signature: (J[B)I
 */
JNIEXPORT jint JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_getFeatureReport
  (JNIEnv *, jobject, jlong, jbyteArray);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    getManufacturerString
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_getManufacturerString
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    getProductString
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_getProductString
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    getSerialNumberString
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_getSerialNumberString
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    getIndexedString
 * Signature: (JI)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_getIndexedString
  (JNIEnv *, jobject, jlong, jint);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    listUSBHIDdevicesWithInfo
 * Signature: (I)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_listUSBHIDdevicesWithInfo
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge
 * Method:    openHidDeviceByUSBAttributes
 * Signature: (IILjava/lang/String;III)J
 */
JNIEXPORT jlong JNICALL Java_com_embeddedunveiled_serial_internal_SerialComHIDJNIBridge_openHidDeviceByUSBAttributes
  (JNIEnv *, jobject, jint, jint, jstring, jint, jint, jint);

#ifdef __cplusplus
}
#endif
#endif