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
 * are invoked in the SignalDispatcher1Imp2
 *
 * @author Manoj
 */
@ExtendWith(MockitoExtension.class)
class SignalDispatcher2ImplTest {

	@Mock
	Algo algo;

	@InjectMocks
	SignalDispatcher2Impl signalDispatcher2Impl;

	/**
	 * 
	 * method to test if all the required methods for signalDispatcher2 is invoked
	 */
	@Test
	void testSignalDispatcher() {

		signalDispatcher2Impl.execute();

		verify(algo).reverse();
		verify(algo).setAlgoParam(1, 80);
		verify(algo).submitToMarket();

	}

}
