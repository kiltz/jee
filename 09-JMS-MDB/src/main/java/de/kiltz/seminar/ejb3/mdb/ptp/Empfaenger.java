package de.kiltz.seminar.ejb3.mdb.ptp;

import de.kiltz.seminar.ejb3.mdb.Tools;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class Empfaenger {
    private static final String DEFAULT_CONNECTION_FACTORY = "jms/RemoteConnectionFactory";
    private static final String DEFAULT_DESTINATION = "java:jboss/exported/jms/queue/test";

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Context  ctx = Tools.getInitialContext();
		ConnectionFactory factory = (ConnectionFactory) 
			ctx.lookup(DEFAULT_CONNECTION_FACTORY);
		Connection con = factory.createConnection("benutzer", "benutzer-123");
		Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
		con.start();
		
		Destination postfach = (Destination)ctx.lookup(DEFAULT_DESTINATION);
		// Mit MessageSelector
		// erwartet beim Sender msg.setStringProperty("Typ", "Meine");
//		MessageConsumer empf = session.createConsumer(postfach, "Typ='Meine'");
		// Ohne MessageSelector
		MessageConsumer empf = session.createConsumer(postfach);
		TextMessage msg = (TextMessage)empf.receive();
		System.out.println(msg.getText());
		System.out.println("Ende!");
		con.close();
	}

}
