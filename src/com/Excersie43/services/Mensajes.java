package com.Excersie43.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Mensajes") //http://localhost:8080/excersie43/rest/Mensajes
public class Mensajes {
	
	//funci�n que retorna un mensaje con el m�todo GET
	@GET
	public String sayHello() {
		
		return "Hello World";
	}

}
