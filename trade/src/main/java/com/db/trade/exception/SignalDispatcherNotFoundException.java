package com.db.trade.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class SignalDispatcherNotFoundException extends RuntimeException {
	
	public SignalDispatcherNotFoundException(String message) {
		super(message);
	}
	
}
