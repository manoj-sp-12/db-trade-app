package com.db.trade.dispatcher.impl;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.db.trade.extern.Algo;

/**
 * Test class to test if all the required methods with the expected parameters
 * are invoked in the SignalDispatcher1Imp1
 *
 * @author Manoj
 */
@ExtendWith(MockitoExtension.class)
class SignalDispatcher1ImplTest {

	@Mock
	Algo algo;

	@InjectMocks
	SignalDispatcher1Impl signalDispatcher1Impl;

	/**
	 * method to test if all the required methods for signalDispatcher1 is invoked
	 */
	@Test
	void testSignalDispatcher() {

		signalDispatcher1Impl.execute();

		verify(algo).setUp();
		verify(algo).setAlgoParam(1, 60);
		verify(algo).performCalc();
		verify(algo).submitToMarket();

	}

}
