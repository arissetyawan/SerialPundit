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
 
import com.embeddedunveiled.serial.SerialComManager;

public class FindPorts {
	public static void main(String[] args) {
	 	try {
			System.out.println("Executing FindPorts application 2");
			SerialComManager scm = new SerialComManager(System.getProperty("user.home"), "lib2");
			String[] ports = scm.listAvailableComPorts();
			for(String port: ports){
				System.out.println(port);
			}
			// give time so that another instance of SCM gets created via another shell script and these
			// 2 apps exist together in system.
			Thread.sleep(1000);
			System.out.println("Exit 2");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
