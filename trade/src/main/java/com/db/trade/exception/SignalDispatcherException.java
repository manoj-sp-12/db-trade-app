package com.db.trade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * General exception class for the new trading application
 *
 * @author Manoj
 */

@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
public class SignalDispatcherException extends RuntimeException {
	
	/**
	 * Constructor with parameters
	 * @param message
	 * @param e
	 */
	public SignalDispatcherException(String message, Throwable e) {
		super(message, e);
	}

}
