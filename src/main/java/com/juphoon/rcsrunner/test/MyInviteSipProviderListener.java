package com.juphoon.rcsrunner.test;

/**
 * Created by hgh on 2017/11/9.
 */
public class MyInviteSipProviderListener implements org.zoolu.sip.provider.SipProviderListener {




    @Override
    public void onReceivedMessage(org.zoolu.sip.provider.SipProvider sip_provider, org.zoolu.sip.message.Message message) {
        System.out.println("打电话进来啦----------");

    }
}

