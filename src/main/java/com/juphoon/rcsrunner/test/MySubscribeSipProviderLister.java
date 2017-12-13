package com.juphoon.rcsrunner.test;

/**
 * Created by hgh on 2017/11/30.
 */
public class MySubscribeSipProviderLister implements org.zoolu.sip.provider.SipProviderListener {
    @Override
    public void onReceivedMessage(org.zoolu.sip.provider.SipProvider sip_provider, org.zoolu.sip.message.Message message) {
        //System.out.println("订阅进来啦----------");
        org.zoolu.sip.message.Message respone = null;
        org.zoolu.sip.header.ContactHeader contactHeader = message.getContactHeader();
        org.zoolu.sip.header.ToHeader toHeader = message.getToHeader();
        //返回200
        respone = org.zoolu.sip.message.MessageFactory.createResponse(message,200,null,null);


        return;
   //     System.out.println(respone.toString());

//        TransactionServer t = new TransactionServer(sip_provider, message, null);
//        t.respondWith(respone);
    }
}
