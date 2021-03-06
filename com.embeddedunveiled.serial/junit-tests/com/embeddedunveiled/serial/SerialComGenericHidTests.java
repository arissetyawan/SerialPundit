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

package com.embeddedunveiled.serial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SerialComGenericHidTests {

	static SerialComManager scm;
	static SerialComHID sch;
	static String HIDDEVPATH;
	static Long handle;

	@BeforeClass
	public static void preparePorts() throws Exception {
		scm = new SerialComManager();
		int osType = scm.getOSType();
		if(osType == SerialComManager.OS_LINUX) { 
			HIDDEVPATH = "/dev/hidraw0";
		}else if(osType == SerialComManager.OS_WINDOWS) {
			HIDDEVPATH = "/dev/hidraw0";
		}else if(osType == SerialComManager.OS_MAC_OS_X) {
			HIDDEVPATH = "/dev/hidraw0";
		}else if(osType == SerialComManager.OS_SOLARIS) {
			HIDDEVPATH = "/dev/hidraw0";
		}else{

		}
		sch = scm.getSerialComHIDInstance(SerialComHID.HID_GENERIC, null, null);
		handle = sch.openHidDevice(HIDDEVPATH);
	}

	@AfterClass
	public static void closePorts() throws Exception {
		sch.closeHidDevice(handle);
	}

	@Test(timeout=100)
	public void testListHIDdevicesWithInfo() throws Exception {
		SerialComHIDdevice[] devices = sch.listHIDdevicesWithInfo();
		assertTrue(devices != null);
		assertTrue(devices.length > 0);
	}

	@Test(timeout=100)
	public void testFormatReportToHex() throws Exception {
		assertEquals("68 65 6C 6C 6F", sch.formatReportToHex("hello".getBytes()));
	}

	@Test(timeout=100)
	public void testWriteOutputReport() throws Exception {
		byte[] report = { };
		assertEquals(16, sch.writeOutputReport(handle, (byte)0x00, report));
	}

	@Test(timeout=100)
	public void testReadInputReport() throws Exception {
		byte[] reportBuffer = new byte[17];
		assertEquals(17, sch.readInputReport(handle, reportBuffer, reportBuffer.length));
	}

	@Test(timeout=100)
	public void testReadInputReportWithTimeout() throws Exception {
		byte[] reportBuffer = new byte[17];
		assertEquals(17, sch.readInputReportWithTimeout(handle, reportBuffer, reportBuffer.length, 150));
	}

	@Test(timeout=100)
	public void testSendFeatureReport() throws Exception {
		byte[] report = { };
		assertEquals(16, sch.sendFeatureReport(handle, (byte)0x00, report));
	}

	@Test(timeout=100)
	public void testGetFeatureReport() throws Exception {
		byte[] reportBuffer = new byte[17];
		assertEquals(17, sch.readInputReport(handle, reportBuffer, reportBuffer.length));
	}

	@Test(timeout=100)
	public void testGetManufacturerString() throws Exception {
		assertEquals("68 65 6C 6C 6F", sch.getManufacturerString(handle));
	}

	@Test(timeout=100)
	public void testGetProductString() throws Exception {
		assertEquals("68 65 6C 6C 6F", sch.getProductString(handle));
	}

	@Test(timeout=100)
	public void testGetSerialNumberString() throws Exception {
		assertEquals("68 65 6C 6C 6F", sch.getSerialNumberString(handle));
	}

	@Test(timeout=100)
	public void testGetIndexedString() throws Exception {
		assertEquals("68 65 6C 6C 6F", sch.getIndexedString(handle, 2));
	}
}
