package com.db.trade.dispatcher.impl;

import com.db.trade.dispatcher.SignalDispatcher;
import com.db.trade.extern.Algo;

/**
 * This class specifies the code to execute when signal 2 is encountered
 *
 * @author Manoj
 */
public class SignalDispatcher2Impl implements SignalDispatcher {
	private Algo algo;

	/**
	 * code to execute for signal 2
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		algo.reverse();
		algo.setAlgoParam(1, 80);
		algo.submitToMarket();
	}

	/**
	 * set Algo object to signal dispatcher object
	 * 
	 * @param algo
	 */
	@Override
	public void setAlgo(Algo algo) {
		// TODO Auto-generated method stub
		this.algo = algo;
	}
}
