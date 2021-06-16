package com.javaeeee.restcontroller;

import javax.ws.rs.GET;


import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.javaeeee.bean.Player;
import com.javaeeee.views.PlayerView;

@Path("/player")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResouce {
	
	  //  @GET
	    
//	    public PlayerView getPerson(@QueryParam("name") String name , @QueryParam("name") int guess   ) {
//	    	Player py =new Player(name,guess);
//	        return new PlayerView(py);
//	    }
}
