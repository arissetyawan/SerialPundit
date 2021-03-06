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

package test21;

import com.embeddedunveiled.serial.ISerialComUSBHotPlugListener;
import com.embeddedunveiled.serial.SerialComManager;
import com.embeddedunveiled.serial.usb.SerialComUSB;

// event 2 indicates port removal, 1 indicates additional of port
class USBHotPlugEventHandler implements ISerialComUSBHotPlugListener {

	@Override
	public void onUSBHotPlugEvent(int event, int vid, int pid, String serial) {
		System.out.println("event " + event + " vid:" + vid + " pid:" + pid + " serial:" + serial);
	}
}

public class Test21 {
	public static void main(String[] args) {
		try {
			int handle = 0;
			SerialComManager scm = new SerialComManager();
			USBHotPlugEventHandler eventhandler = new USBHotPlugEventHandler();

			System.out.println("registering");

			// ALL
			handle = scm.registerUSBHotPlugEventListener(eventhandler, SerialComUSB.DEV_ANY, SerialComUSB.DEV_ANY, null);

			// FT232
			//			handle = scm.registerUSBHotPlugEventListener(eventhandler, 0x0403, 0x6001, "A7036479");

			// CP2102
			//			handle = scm.registerUSBHotPlugEventListener(eventhandler, 0x10C4, 0xEA60, "0001");

			// MCP2200
			handle = scm.registerUSBHotPlugEventListener(eventhandler, 0x04d8, 0x00df, "0000980371");

			System.out.println("sleeping");
			Thread.sleep(50444400);
			System.out.println("unregsitering");
			scm.unregisterUSBHotPlugEventListener(handle);

			System.out.println("unregistered");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
