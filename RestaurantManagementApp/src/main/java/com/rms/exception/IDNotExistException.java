package com.rms.exception;

import org.apache.log4j.Logger;

public class IDNotExistException extends Exception {

	static Logger logger = Logger.getLogger(IDNotExistException.class);

	public IDNotExistException(String msg) {
		super(msg);
		logger.info("Inside Custom Exception of UPDATE!!!!");
	}

}
