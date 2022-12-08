package com.db.trade.dispatcher.impl;

import com.db.trade.dispatcher.SignalDispatcher;
import com.db.trade.extern.Algo;

public class SignalDispatcher2Impl implements SignalDispatcher {
  private Algo algo;

  @Override
  public void execute() {
    // TODO Auto-generated method stub
    algo.reverse();
    algo.setAlgoParam(1,80);
    algo.submitToMarket();
  }

  @Override
  public void setAlgo(Algo algo) {
  	// TODO Auto-generated method stub
  	this.algo = algo;
  }
}
