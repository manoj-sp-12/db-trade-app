package com.db.trade.dispatcher.impl;

import com.db.trade.dispatcher.SignalDispatcher;
import com.db.trade.extern.Algo;

/**
 * This class specifies the code to execute when signal 1 is encountered
 *
 * @author Manoj
 */
public class SignalDispatcher1Impl implements SignalDispatcher {
	private Algo algo;

	/**
	 * code to execute for signal 1
	 */
	@Override
	public void execute() {
		algo.setUp();
		algo.setAlgoParam(1, 60);
		algo.performCalc();
		algo.submitToMarket();
	}

	/**
	 * set Algo object to signal dispatcher object
	 * 
	 * @param algo
	 */
	@Override
	public void setAlgo(Algo algo) {
		this.algo = algo;
	}

}
