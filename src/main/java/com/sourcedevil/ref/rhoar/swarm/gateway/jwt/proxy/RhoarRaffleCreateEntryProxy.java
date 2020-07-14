package com.sourcedevil.ref.rhoar.swarm.gateway.jwt.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface RhoarRaffleCreateEntryProxy {

	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	// TODO actualizar este path con el correcot y el media type
	public String createRaffleEntry();


	
}
