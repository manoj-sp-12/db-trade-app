package com.db.trade.dispatcher;

import com.db.trade.extern.Algo;
/**
 * SignalDispatecher Interface 
 *
 * @author Manoj
 */
public interface SignalDispatcher {
	
	/**
	 * code to execute for signal
	 */
	public void execute();

	/**
	 * set Algo object to signal dispatcher object
	 * @param algo
	 */
	public void setAlgo(Algo algo);

}
