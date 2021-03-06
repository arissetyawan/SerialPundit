/*
 * This file is part of SerialPundit project and software.
 * 
 * Copyright (C) 2014-2016, Rishi Gupta. All rights reserved.
 *
 * The SerialPundit software is DUAL licensed. It is made available under the terms of the GNU Affero 
 * General Public License (AGPL) v3.0 for non-commercial use and under the terms of a commercial 
 * license for commercial use of this software. 
 * 
 * The SerialPundit software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.embeddedunveiled.serial.usb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.embeddedunveiled.serial.hid.SerialComHID;
import com.embeddedunveiled.serial.hid.SerialComHIDdevice;
import com.embeddedunveiled.serial.SerialComManager;
import com.embeddedunveiled.serial.usb.SerialComUSB;
import com.embeddedunveiled.serial.usb.SerialComUSBHID;

public class SerialComUSBHidTests {

	static SerialComManager scm;
	static SerialComUSBHID scuh;
	static String HIDDEVPATH;
	static long handle;

	@BeforeClass
	public static void preparePorts() throws Exception {
		scm = new SerialComManager();
		scuh = (SerialComUSBHID) scm.getSerialComHIDInstance(SerialComHID.HID_USB, null, null);
		handle = scuh.openHidDeviceByUSBAttributes(SerialComUSB.V_MCHIP, SerialComUSB.DEV_ANY, null,
				-1, -1, -1);
	}

	@AfterClass
	public static void closePorts() throws Exception {
		scuh.closeHidDevice(handle);
	}

	@Test(timeout=100)
	public void testListUSBHIDdevicesWithInfo() throws Exception {
		SerialComHIDdevice[] devices = scuh.listUSBHIDdevicesWithInfo(SerialComUSB.V_ALL);
		assertTrue(devices != null);
		assertTrue(devices.length > 0);
	}

	@Test(timeout=100)
	public void testFormatReportToHex() throws Exception {
		assertEquals("68 65 6C 6C 6F", scuh.formatReportToHex("hello".getBytes()));
	}

	@Test(timeout=100)
	public void testWriteOutputReport() throws Exception {
		byte[] report = { };
		assertEquals(16, scuh.writeOutputReport(handle, (byte)0x00, report));
	}

	@Test(timeout=100)
	public void testReadInputReport() throws Exception {
		byte[] reportBuffer = new byte[17];
		assertEquals(17, scuh.readInputReport(handle, reportBuffer, reportBuffer.length));
	}

	@Test(timeout=100)
	public void testReadInputReportWithTimeout() throws Exception {
		byte[] reportBuffer = new byte[17];
		assertEquals(17, scuh.readInputReportWithTimeout(handle, reportBuffer, reportBuffer.length, 150));
	}

	@Test(timeout=100)
	public void testSendFeatureReport() throws Exception {
		byte[] report = { };
		assertEquals(16, scuh.sendFeatureReport(handle, (byte)0x00, report));
	}

	@Test(timeout=100)
	public void testGetFeatureReport() throws Exception {
		byte[] reportBuffer = new byte[17];
		assertEquals(17, scuh.readInputReport(handle, reportBuffer, reportBuffer.length));
	}

	@Test(timeout=100)
	public void testGetManufacturerString() throws Exception {
		assertEquals("68 65 6C 6C 6F", scuh.getManufacturerString(handle));
	}

	@Test(timeout=100)
	public void testGetProductString() throws Exception {
		assertEquals("68 65 6C 6C 6F", scuh.getProductString(handle));
	}

	@Test(timeout=100)
	public void testGetSerialNumberString() throws Exception {
		assertEquals("68 65 6C 6C 6F", scuh.getSerialNumberString(handle));
	}

	@Test(timeout=100)
	public void testGetIndexedString() throws Exception {
		assertEquals("68 65 6C 6C 6F", scuh.getIndexedString(handle, 2));
	}
}
