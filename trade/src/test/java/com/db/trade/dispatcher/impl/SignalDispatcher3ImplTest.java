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
 * are invoked in the SignalDispatcher1Imp3
 *
 * @author Manoj
 */

@ExtendWith(MockitoExtension.class)
class SignalDispatcher3ImplTest {

	@Mock
	Algo algo;

	@InjectMocks
	SignalDispatcher3Impl signalDispatcher3Impl;

	/**
	 * method to test if all the required methods for signalDispatcher3 is invoked
	 * 
	 */
	@Test
	void testSignalDispatcher() {
		
		signalDispatcher3Impl.execute();
		
		verify(algo).setAlgoParam(1, 90);
		verify(algo).setAlgoParam(2, 15);
		algo.performCalc();
		verify(algo).submitToMarket();

	}

}
