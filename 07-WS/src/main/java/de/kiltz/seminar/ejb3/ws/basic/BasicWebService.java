package de.kiltz.seminar.ejb3.ws.basic;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface BasicWebService {


	 String ping(@WebParam(name = "txt") String txt);


}
