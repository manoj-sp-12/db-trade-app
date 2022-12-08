package com.db.trade.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.db.trade.exception.SignalDispatcherNotFoundException;
/**
 * Test class for the new trade app service
 *
 * @author Manoj
 */

class TradeAppServiceTest {

	/**
	 * Method to test valid signals
	 */
	@Test
	void handleSignaltest_validSignals() {
		
		TradeAppService tradeAppService = new TradeAppService();
		Assertions.assertDoesNotThrow(() -> tradeAppService.handleSignal(1));
		Assertions.assertDoesNotThrow(() -> tradeAppService.handleSignal(2));
		Assertions.assertDoesNotThrow(() -> tradeAppService.handleSignal(3));
		
	}

	/**
	 * Method to test invalid signals
	 */
	@Test
	void handleSignaltest_invalidSignals() {
		
		TradeAppService tradeAppService = new TradeAppService();
		Assertions.assertThrows(SignalDispatcherNotFoundException.class, () -> tradeAppService.handleSignal(0));
		Assertions.assertThrows(SignalDispatcherNotFoundException.class, () -> tradeAppService.handleSignal(4));
		Assertions.assertThrows(SignalDispatcherNotFoundException.class, () -> tradeAppService.handleSignal(100));
		Assertions.assertThrows(SignalDispatcherNotFoundException.class, () -> tradeAppService.handleSignal(4000));
		
	}

}
