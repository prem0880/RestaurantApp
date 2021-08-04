package com.rms.exception;

import org.apache.log4j.Logger;

public class InvalidIDException extends Exception {

	static Logger logger = Logger.getLogger(InvalidIDException.class);

	public InvalidIDException(String msg) {
		super(msg);
		logger.info("Inside Invalid Id Exception");
	}

}
