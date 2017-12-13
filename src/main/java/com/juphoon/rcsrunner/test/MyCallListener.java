package com.juphoon.rcsrunner.test;

import java.util.Vector;

/**
 * Created by hgh on 2017/11/9.
 */
public class MyCallListener implements org.zoolu.sip.call.CallListener {
    @Override
    public void onCallInvite(org.zoolu.sip.call.Call call, org.zoolu.sip.address.NameAddress callee, org.zoolu.sip.address.NameAddress caller, String sdp, org.zoolu.sip.message.Message invite) {

    }

    @Override
    public void onCallModify(org.zoolu.sip.call.Call call, String sdp, org.zoolu.sip.message.Message invite) {

    }

    @Override
    public void onCallProgress(org.zoolu.sip.call.Call call, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallRinging(org.zoolu.sip.call.Call call, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallAccepted(org.zoolu.sip.call.Call call, String sdp, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallRefused(org.zoolu.sip.call.Call call, String reason, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallRedirected(org.zoolu.sip.call.Call call, String reason, Vector contact_list, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallConfirmed(org.zoolu.sip.call.Call call, String sdp, org.zoolu.sip.message.Message ack) {

    }

    @Override
    public void onCallTimeout(org.zoolu.sip.call.Call call) {

    }

    @Override
    public void onCallReInviteAccepted(org.zoolu.sip.call.Call call, String sdp, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallReInviteRefused(org.zoolu.sip.call.Call call, String reason, org.zoolu.sip.message.Message resp) {

    }

    @Override
    public void onCallReInviteTimeout(org.zoolu.sip.call.Call call) {

    }

    @Override
    public void onCallCancel(org.zoolu.sip.call.Call call, org.zoolu.sip.message.Message cancel) {

    }

    @Override
    public void onCallBye(org.zoolu.sip.call.Call call, org.zoolu.sip.message.Message bye) {

    }

    @Override
    public void onCallClosed(org.zoolu.sip.call.Call call, org.zoolu.sip.message.Message resp) {

    }
}
