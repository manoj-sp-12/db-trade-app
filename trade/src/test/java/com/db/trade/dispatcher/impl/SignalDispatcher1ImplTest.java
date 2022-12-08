package com.db.trade.dispatcher.impl;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.db.trade.extern.Algo;

@ExtendWith(MockitoExtension.class)
class SignalDispatcher1ImplTest {

	@Mock
	Algo algo;

	@InjectMocks
	SignalDispatcher1Impl signalDispatcher1Impl;

	@Test
	void testMethodInvokation() {
		
		signalDispatcher1Impl.execute();
		
		verify(algo).setUp();
		verify(algo).setAlgoParam(1, 60);
		verify(algo).performCalc();
		verify(algo).submitToMarket();

	}

}
