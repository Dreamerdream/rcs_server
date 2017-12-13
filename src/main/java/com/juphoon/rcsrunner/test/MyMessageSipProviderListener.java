package com.juphoon.rcsrunner.test;

/**
 * Created by hgh on 2017/11/30.
 */
public class MyMessageSipProviderListener implements org.zoolu.sip.provider.SipProviderListener {
    @Override
    public void onReceivedMessage(org.zoolu.sip.provider.SipProvider sip_provider, org.zoolu.sip.message.Message message) {
        System.out.println("消息进来啦----------");

        String body = message.getBody();
        System.out.println("body---------" + body);
        org.zoolu.sip.header.ToHeader toHeader = message.getToHeader();
        org.zoolu.sip.address.SipURL toAddress = toHeader.getNameAddress().getAddress();
        System.out.println("toAddress-------" + toAddress);
        org.zoolu.sip.header.FromHeader fromHeader = message.getFromHeader();
        org.zoolu.sip.address.SipURL fromAddress = fromHeader.getNameAddress().getAddress();
        System.out.println("fromAddress-------" + fromAddress);
        org.zoolu.sip.header.ContentTypeHeader contentTypeHeader = message.getContentTypeHeader();
        org.zoolu.sip.header.ViaHeader viaHeader = message.getViaHeader();
        org.zoolu.sip.transaction.TransactionServer transactionServer = new org.zoolu.sip.transaction.TransactionServer(sip_provider,message,null);
        //SipProvider sip_provider, String method, NameAddress to, NameAddress from, String body
        org.zoolu.sip.message.Message request = org.zoolu.sip.message.MessageFactory.createRequest(sip_provider, org.zoolu.sip.message.SipMethods.MESSAGE, toHeader.getNameAddress(), fromHeader.getNameAddress(), body);
        //   MessageFactory.createResponse(message,202, SipResponses.reasonOf(202),null);
      //  transactionServer.respondWith(request);
        sip_provider.sendMessage(request);
        org.zoolu.sip.message.Message response = org.zoolu.sip.message.MessageFactory.createResponse(message, 202, org.zoolu.sip.message.SipResponses.reasonOf(202), null);
        transactionServer.respondWith(response);
    }
}
