package com.rms.exception;

import org.apache.log4j.Logger;

public class DuplicateIDException extends Exception {

	static Logger logger = Logger.getLogger(DuplicateIDException.class);

	public DuplicateIDException(String msg) {
		super(msg);
		logger.info("Inside Custom Exception of Add!!!");

	}

}
