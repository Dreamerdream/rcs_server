package com.juphoon.rcsrunner.test;

/**
 * Created by hgh on 2017/11/9.
 */
public class MyTransactionServerListener implements org.zoolu.sip.transaction.TransactionServerListener {
    @Override
    public void onTransRequest(org.zoolu.sip.transaction.TransactionServer ts, org.zoolu.sip.message.Message req) {
        org.zoolu.sip.provider.SipProvider sipProvider = new org.zoolu.sip.provider.SipProvider("");
        

    }
}
