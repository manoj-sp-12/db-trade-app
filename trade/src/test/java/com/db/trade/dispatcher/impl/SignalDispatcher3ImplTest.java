package com.db.trade.dispatcher.impl;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.db.trade.extern.Algo;


@ExtendWith(MockitoExtension.class)
class SignalDispatcher3ImplTest {

	@Mock
	Algo algo;

	@InjectMocks
	SignalDispatcher3Impl signalDispatcher3Impl;

	@Test
	void testMethodInvokation() {
		
		signalDispatcher3Impl.execute();
		
		verify(algo).setAlgoParam(1, 90);
		verify(algo).setAlgoParam(2, 15);
		algo.performCalc();
		verify(algo).submitToMarket();

	}

}
