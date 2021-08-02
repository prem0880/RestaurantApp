package com.rms.exception;

import org.apache.log4j.Logger;

public class EmptyListException extends Exception {
	static Logger logger = Logger.getLogger(EmptyListException.class);

	public EmptyListException(String msg) {
		super(msg);
		logger.info("Inside Custom Exception of DISPLAY!!!");
	}

}
