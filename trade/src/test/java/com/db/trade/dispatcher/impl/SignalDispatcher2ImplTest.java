package com.db.trade.dispatcher.impl;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.db.trade.extern.Algo;

@ExtendWith(MockitoExtension.class)
class SignalDispatcher2ImplTest {

	@Mock
	Algo algo;

	@InjectMocks
	SignalDispatcher2Impl signalDispatcher2Impl;

	@Test
	void testMethodInvokation() {
		
		signalDispatcher2Impl.execute();
		
		verify(algo).reverse();
		verify(algo).setAlgoParam(1, 80);
		verify(algo).submitToMarket();

	}

}
