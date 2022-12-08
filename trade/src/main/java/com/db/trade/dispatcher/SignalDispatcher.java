package com.db.trade.dispatcher;

import com.db.trade.extern.Algo;

public interface SignalDispatcher {
	
	public void execute();

	public void setAlgo(Algo algo);

}
