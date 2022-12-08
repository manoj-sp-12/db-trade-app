package com.db.trade.extern;

/**
 * This is an upcall from our trading system, and we cannot change it.
 */
public interface SignalHandler {
    void handleSignal(int signal);
}

