package de.kiltz.seminar.ejb.aufgabe;

import java.text.DateFormat;
import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless(name = "InfoService")
@Remote(InfoService.class)
public class InfoServiceImpl implements InfoService {

	private final static DateFormat DF = DateFormat.getTimeInstance();

	@Override
	public String getUhrzeit() {

		return DF.format(new Date());
	}

	@Override
	public long getFreierSpeicher() {

		return Runtime.getRuntime().freeMemory();
	}

	@Override
	public String getUserName() {

		return System.getProperty("user.name");
	}

}
