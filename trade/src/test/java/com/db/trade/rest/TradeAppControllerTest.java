package com.db.trade.rest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.db.trade.extern.SignalHandler;
import com.db.trade.service.TradeAppService;


@ExtendWith(MockitoExtension.class)
class TradeAppControllerTest {


	@InjectMocks
	TradeAppController tradeAppController;
	
    @Mock
    SignalHandler signalHandler;
    
    @Mock
    TradeAppService tradeAppService;

    @Test
	void test() throws Exception {
		
    	ResponseEntity<String> responseEntity = tradeAppController.handleSignal(1);
    	assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    	
	}

}
