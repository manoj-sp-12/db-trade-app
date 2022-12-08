package com.db.trade.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.db.trade.dispatcher.SignalDispatcher;
import com.db.trade.dispatcher.impl.SignalDispatcher1Impl;
import com.db.trade.dispatcher.impl.SignalDispatcher2Impl;
import com.db.trade.dispatcher.impl.SignalDispatcher3Impl;
import com.db.trade.exception.SignalDispatcherException;
import com.db.trade.exception.SignalDispatcherNotFoundException;
import com.db.trade.extern.Algo;
import com.db.trade.extern.SignalHandler;

/**
 * New Trading application to handle signals.
 *
 * @author Manoj
 */

@Component
public class TradeAppService implements SignalHandler {

	private static final Logger LOG = LoggerFactory.getLogger(TradeAppService.class);
	private static Map<Integer, SignalDispatcher> signalDispatcherMap = new HashMap<Integer, SignalDispatcher>();

	public TradeAppService() {
		initApplication();
	}

	private void initApplication() {
		signalDispatcherMap.put(1, new SignalDispatcher1Impl());
		signalDispatcherMap.put(2, new SignalDispatcher2Impl());
		signalDispatcherMap.put(3, new SignalDispatcher3Impl());
	}

	public void handleSignal(int signal) {
		Algo algo = new Algo();
		SignalDispatcher dispatcher = signalDispatcherMap.get(signal);

		// Check for unknown signals.
		if (dispatcher == null) {
			LOG.error("Unknown signal {}.", signal);

			// Leave the decision, if that's fatal or not to the calling method.
			throw new SignalDispatcherNotFoundException("Unknown signal.");
		}

		dispatcher.setAlgo(algo);

		try {
			dispatcher.execute();
		} catch (Exception e) {
			LOG.error("Error, when dispatching signal {}.", signal, e);

			// Leave the decision, if that's fatal or not to the calling method.
			throw new SignalDispatcherException("Error, when dispatching signal.", e);
		}

		algo.doAlgo();
	}

}
