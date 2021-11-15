package de.kiltz.seminar.ejb.aufgabe;

import javax.ejb.Remote;
import java.time.LocalDateTime;

@Remote
public interface InfoService {
    LocalDateTime getUhrzeit();
    long getFreierSpeicher();
    String getBenutzerName();

    ServerInfo getServerInfo();

}
