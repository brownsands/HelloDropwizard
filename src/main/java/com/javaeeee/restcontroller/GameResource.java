package com.javaeeee.restcontroller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.javaeeee.bean.Player;
import com.javaeeee.views.GameView;
import com.javaeeee.views.PlayerView;

@Path("/game")
@Produces(MediaType.APPLICATION_JSON)
public class GameResource {
	
	
	  @GET
	    
	    public GameView getwinner( ) {
	    	return null;
	    }
}
