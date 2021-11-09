package rest.basic.test;


import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

/**
 * curl -i http://127.0.0.1:8080/rs/services/Basic/ping -d txt=test
 */
public class Tester {

    final static String UrlBase = "http://127.0.0.1:8080/REST/services/Basic";

    public static void main(String[] args) {
        // erzeuge Client:

        Client c = ClientBuilder.newClient();
        WebTarget wr = c.target(UrlBase);

        System.out.println("Führe Ping aus...");
        wr = wr.queryParam("text", "test");
        String ret = wr.path("/ping").request(MediaType.TEXT_PLAIN)
                .get(String.class);
        System.out.println(String.format("Rückgabe: :\n%s", ret));

    }
}
