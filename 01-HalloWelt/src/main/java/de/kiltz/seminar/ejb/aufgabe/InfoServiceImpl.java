package de.kiltz.seminar.ejb.aufgabe;

import javax.ejb.Stateless;
import java.time.LocalDateTime;

@Stateless(name="InfoService")
public class InfoServiceImpl implements InfoService {
    @Override
    public LocalDateTime getUhrzeit() {
        return LocalDateTime.now();
    }

    @Override
    public long getFreierSpeicher() {
        return Runtime.getRuntime().freeMemory();
    }

    @Override
    public String getBenutzerName() {
        return System.getProperty("user.name");
    }

    @Override
    public ServerInfo getServerInfo() {
        return new ServerInfo();
    }
}
