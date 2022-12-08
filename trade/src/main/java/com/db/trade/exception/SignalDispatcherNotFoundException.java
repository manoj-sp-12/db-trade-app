package com.db.trade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception class for the new trading application in the case of unknown or signal not found 
 *
 * @author Manoj
 */

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class SignalDispatcherNotFoundException extends RuntimeException {
	
	/**
	 * Constructor
	 * @param message
	 */
	public SignalDispatcherNotFoundException(String message) {
		super(message);
	}
	
}
