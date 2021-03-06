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

import java.io.IOException;

/** 
 * <p>Limit the scope of exceptions in context of serial port communication only.</p>
 * 
 * @author Rishi Gupta
 */
public final class SerialComException extends IOException {

	private static final long serialVersionUID = -6849706871605796050L;
	private String exceptionMsg;

	/**
	 * <p>Constructs and allocate a new SerialComException object with the specified detail message.</p>
	 * 
	 * @param exceptionMsg message describing reason for exception.
	 */
	public SerialComException(String exceptionMsg) {
		super(exceptionMsg);
		this.exceptionMsg = exceptionMsg;
	}

	/** 
	 * <p>Get the specific type of exception. </p>
	 * 
	 * @return exceptionMsg reason for exception.
	 */
	public String getExceptionMsg() {
		return exceptionMsg;
	}
}
