package de.kiltz.seminar.ejb3.mdb.ptp;

import de.kiltz.seminar.ejb3.mdb.Tools;

import javax.jms.*;
import javax.naming.Context;
import java.util.Date;

public class Sender {

    private static final String DEFAULT_CONNECTION_FACTORY = "jms/RemoteConnectionFactory";
    private static final String DEFAULT_DESTINATION = "jms/queue/test";


    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("1");
        Context ctx = Tools.getInitialContext();
        ConnectionFactory factory = (ConnectionFactory)
                ctx.lookup(DEFAULT_CONNECTION_FACTORY);

        Connection con = factory.createConnection("benutzer", "benutzer-123");
        Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
        con.start();

        TextMessage msg = session.createTextMessage();
        msg.setStringProperty("Typ", "Bean");
        msg.setText("Die Nachricht! von " + new Date());

        Destination ziel = (Destination) ctx.lookup(DEFAULT_DESTINATION);
        MessageProducer sender = session.createProducer(ziel);

        sender.send(msg);
        System.out.println("gesendet..");
        con.close();
    }

}
