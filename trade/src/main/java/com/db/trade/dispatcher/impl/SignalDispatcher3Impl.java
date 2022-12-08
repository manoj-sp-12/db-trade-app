package com.db.trade.dispatcher.impl;

import com.db.trade.dispatcher.SignalDispatcher;
import com.db.trade.extern.Algo;

/**
 * This class specifies the code to execute when signal 3 is encountered
 *
 * @author Manoj
 */
public class SignalDispatcher3Impl implements SignalDispatcher {

	private Algo algo;

	/**
	 * code to execute for signal 3
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		algo.setAlgoParam(1, 90);
		algo.setAlgoParam(2, 15);
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
