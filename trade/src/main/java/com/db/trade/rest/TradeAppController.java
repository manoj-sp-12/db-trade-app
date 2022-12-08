package com.db.trade.rest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.trade.extern.SignalHandler;
import com.db.trade.service.TradeAppService;

/**
 * Rest Controller - a single http endpoint for receiving and handling the
 * ‘signal’
 *
 * @author Manoj
 */

@RestController
public class TradeAppController {
	
	private SignalHandler signalHandler;
	
	public TradeAppController(TradeAppService tradeAppService) {
		this.signalHandler = tradeAppService;
	}

	@GetMapping(path="/signal/{signalNum}")
	public ResponseEntity<String> handleSignal(@PathVariable int signalNum) {
		signalHandler.handleSignal(signalNum);
		return ResponseEntity.ok("Successfully handled signal : " +signalNum);
	}
}
