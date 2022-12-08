package com.db.trade.dispatcher.impl;

import com.db.trade.dispatcher.SignalDispatcher;
import com.db.trade.extern.Algo;

public class SignalDispatcher1Impl implements SignalDispatcher {
  private Algo algo;

  @Override
  public void execute() {
    // TODO Auto-generated method stub
    algo.setUp();
    algo.setAlgoParam(1, 60);
    algo.performCalc();
    algo.submitToMarket();
  }

@Override
public void setAlgo(Algo algo) {
	// TODO Auto-generated method stub
	this.algo = algo;
}

}
