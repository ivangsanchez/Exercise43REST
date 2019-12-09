package com.Excersie43.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Mensajes") //http://localhost:8080/excersie43/rest/Mensajes
public class Mensajes {
	
	//función que retorna un mensaje con el método GET
	@GET
	public String sayHello() {
		
		return "Hello World";
	}

}
