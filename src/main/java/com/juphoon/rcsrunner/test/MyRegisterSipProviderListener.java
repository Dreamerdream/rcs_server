package com.juphoon.rcsrunner.test;

import com.juphoon.rcsrunner.server.RcsServer;
import org.zoolu.sip.header.*;
import org.zoolu.sip.provider.SipProviderListener;

import java.util.Vector;

/**
 * Created by hgh on 2017/11/30.
 */
public class MyRegisterSipProviderListener implements SipProviderListener {


    private RcsServer rcsServer;

    public MyRegisterSipProviderListener(RcsServer rcsServer) {
        this.rcsServer = rcsServer;
    }
    public MyRegisterSipProviderListener() {

    }
    @Override
    public void onReceivedMessage(org.zoolu.sip.provider.SipProvider sip_provider, org.zoolu.sip.message.Message message) {
        System.out.println("注册进来啦----------");
        org.zoolu.sip.message.Message respone = null;
        //  ExpiresHeader expiresHeader = message.getExpiresHeader();
        //  int deltaSeconds = expiresHeader.getDeltaSeconds();
        ContactHeader contactHeader = message.getContactHeader();
        int expires = contactHeader.getExpires();
        //    TransportConnId transportConnId = message.getTransportConnId();
        org.zoolu.sip.transaction.TransactionServer t = new org.zoolu.sip.transaction.TransactionServer(sip_provider, message, null);
        Vector contacts = message.getContacts().getHeaders();
        ContactHeader ch_0 = new ContactHeader((Header) contacts.elementAt(0));
        Vector resp_contacts = new Vector();
        for (int i = 0; i < contacts.size(); i++) {
            ContactHeader ch_i = new ContactHeader((Header) contacts.elementAt(i));
            org.zoolu.sip.address.NameAddress name_address = ch_i.getNameAddress();
            String contact = name_address.getAddress().toString();
            int exp_secs_i = 3600;
            if (ch_i.hasExpires()) {
                exp_secs_i = ch_i.getExpires();
            }
            ch_i.setExpires(exp_secs_i);
            resp_contacts.addElement(ch_i);
        }

        if (expires != 0) {
            //注册
            AuthorizationHeader authorizationHeader = message.getAuthorizationHeader();
            ToHeader toHeader = message.getToHeader();
            //       ContentTypeHeader contentTypeHeader = message.getContentTypeHeader();
            //       NameAddress nameAddress = new NameAddress(message.getRequestLine().getAddress());
            if (authorizationHeader != null) {
                //返回200
              //  respone = MessageFactory.createResponse(message, 200, null, null);
                //  if (resp_contacts.size() > 0) respone.setContacts(new MultipleHeader(resp_contacts));
                respone = updateRegistration(message);
            } else {
                //返回401
                respone = org.zoolu.sip.message.MessageFactory.createResponse(message, 401, org.zoolu.sip.message.SipResponses.reasonOf(401), toHeader.getTag(), null, null, null);
            }
        } else {
            //注销
            respone = org.zoolu.sip.message.MessageFactory.createResponse(message, 200, null, null);
            //还要带数据给USA
        }
        t.respondWith(respone);
        rcsServer.sendMessage("hahahahahaha");
        //  respone.setTransportConnId(transportConnId);
        System.out.println(respone.toString());
        // sip_provider.sendMessage(respone);

    }


    protected org.zoolu.sip.message.Message updateRegistration(org.zoolu.sip.message.Message msg) {
        ToHeader th = msg.getToHeader();
        if (th == null) {
            int result = 400;
            return org.zoolu.sip.message.MessageFactory.createResponse(msg, result, null, null);
        }
        org.zoolu.sip.address.SipURL dest_uri = th.getNameAddress().getAddress();
        String user = dest_uri.getUserName() + "@" + dest_uri.getHost();

        int exp_secs = 3600;
        // set the expire value
        ExpiresHeader eh = msg.getExpiresHeader();
        if (eh != null) {
            exp_secs = eh.getDeltaSeconds();
        }
        // limit the expire value
        if (exp_secs < 0) exp_secs = 0;
        else if (exp_secs > 3600) exp_secs = 3600;




        org.zoolu.sip.address.SipURL to_url = msg.getToHeader().getNameAddress().getAddress();


//        if (!msg.hasContactHeader()) {
//            int result = 200;
//            Message resp = MessageFactory.createResponse(msg, result, null, null);
//            Vector v = new Vector();
//            for (Enumeration e = location_service.getUserContactURLs(user); e.hasMoreElements(); ) {
//                String contact = (String) e.nextElement();
//                int expires = (int) (location_service.getUserContactExpirationDate(user, contact).getTime() - System.currentTimeMillis()) / 1000;
//                if (expires > 0) {  // not expired
//                    ContactHeader ch = new ContactHeader(location_service.getUserContactNameAddress(user, contact));
//                    ch.setExpires(expires);
//                    v.addElement(ch);
//                }
//            }
//            if (v.size() > 0) resp.setContacts(new MultipleHeader(v));
//            return resp;
//        }
        Vector contacts = msg.getContacts().getHeaders();
        int result = 200;
        org.zoolu.sip.message.Message resp = org.zoolu.sip.message.MessageFactory.createResponse(msg, result, null, null);

//        ContactHeader ch_0 = new ContactHeader((Header) contacts.elementAt(0));
//        if (ch_0.isStar()) {
//            Vector resp_contacts = new Vector();
//            for (Enumeration e = location_service.getUserContactURLs(user); e.hasMoreElements(); ) {
//                String contact = (String) (e.nextElement());
//                if (!location_service.isUserContactStatic(user, contact)) {
//                    NameAddress name_address = location_service.getUserContactNameAddress(user, contact);
//                    // update db
//                    location_service.removeUserContact(user, contact);
//                    printLog("contact removed: " + contact, Log.LEVEL_LOW);
//                    if (exp_secs > 0) {
//                        Date exp_date = new Date(System.currentTimeMillis() + ((long) exp_secs) * 1000);
//                        location_service.addUserContact(user, name_address, exp_date);
//                        //DateFormat df=new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss 'GMT'",Locale.ITALIAN);
//                        //printLog("contact added: "+url+"; expire: "+df.format(location_service.getUserContactExpire(user,url)),Log.LEVEL_LOW);
//                        printLog("contact added: " + contact + "; expire: " + DateFormat.formatEEEddMMM(location_service.getUserContactExpirationDate(user, contact)), Log.LEVEL_LOW);
//                    }
//                    ContactHeader ch_i = new ContactHeader(name_address.getAddress());
//                    ch_i.setExpires(exp_secs);
//                    resp_contacts.addElement(ch_i);
//                }
//            }
//            if (resp_contacts.size() > 0) resp.setContacts(new MultipleHeader(resp_contacts));
//        } else {
            Vector resp_contacts = new Vector();
            for (int i = 0; i < contacts.size(); i++) {
                ContactHeader ch_i = new ContactHeader((Header) contacts.elementAt(i));
                org.zoolu.sip.address.NameAddress name_address = ch_i.getNameAddress();
                String contact = name_address.getAddress().toString();
                int exp_secs_i = exp_secs;
                if (ch_i.hasExpires()) {
                    exp_secs_i = ch_i.getExpires();
                }
                // limit the expire value
                if (exp_secs_i < 0) exp_secs_i = 0;
                else if (exp_secs_i > 3600) exp_secs_i = 3600;

                // update db
//                location_service.removeUserContact(user, contact);
//                if (exp_secs_i > 0) {
//                    Date exp_date = new Date(System.currentTimeMillis() + ((long) exp_secs) * 1000);
//                    location_service.addUserContact(user, name_address, exp_date);
//                    printLog("registration of user " + user + " updated", Log.LEVEL_HIGH);
//                }
                ch_i.setExpires(exp_secs_i);
                resp_contacts.addElement(ch_i);
            }
            if (resp_contacts.size() > 0) resp.setContacts(new MultipleHeader(resp_contacts));
      //  }

     //   location_service.sync();
        return resp;
    }
}
