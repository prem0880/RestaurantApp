package com.rms.exception;

import org.apache.log4j.Logger;

public class InvalidDeletionException extends Exception {

	static Logger logger = Logger.getLogger(InvalidDeletionException.class);

	public InvalidDeletionException(String msg) {
		super(msg);
		logger.info("Inside Custom Exception of DELETION");
	}
}
