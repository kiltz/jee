package de.kiltz.seminar.ejb3.ws.komplexer.test;

import de.kiltz.seminar.ejb3.ws.komplexer.Domain;
import de.kiltz.seminar.ejb3.ws.komplexer.DomainObject;
import de.kiltz.seminar.ejb3.ws.komplexer.DomainPort;

public class Tester {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Domain erzeuger = new Domain();
        DomainPort service = erzeuger.getDomainHttpSoapPort();
        DomainObject obj = service.getDomainObject();
        System.out.println(obj.getText());

    }

}
