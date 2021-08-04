package com.rms.exception;

import org.apache.log4j.Logger;

public class InvalidSwitchException extends Exception{

	static Logger logger = Logger.getLogger(InvalidSwitchException.class);
	public InvalidSwitchException(String msg) {
		super(msg);
		logger.warn("Exception-Invalid Switch Case Operation..");
	}
}
