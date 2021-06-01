package com.javaeeee.restcontroller;

import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.javaeeee.bean.Game;
import com.javaeeee.service.GameOperation;
import com.javaeeee.service.PlayerOperation;

@Path("/game")
public  class GameApplicationREST 
{
	GameOperation go = new GameOperation();
	PlayerOperation po = new PlayerOperation();
	
	Game g=null;
	@POST
	@Path("/newgame")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public String startgame(@QueryParam("start-time")String s , @QueryParam("End-Time")String e)
	{
		g=go.startgame(s,e);
		return "Game Started Successfully";
	}
	
	@PUT
	@Path("/guess-avg")
	@Produces(MediaType.APPLICATION_JSON)
	public String addPlayer(@QueryParam("name")String name , @QueryParam("Guess")int n )
	{	
		return po.addPlayer(name, n, g);
	}
	
	@GET
	@Path("/winner")
	@Produces(MediaType.APPLICATION_JSON)
	public String CalculateResult()
	{
		return go.CalculateResult(g);
		
	}
	
	@GET
	@Path("/check")
	@Produces(MediaType.APPLICATION_JSON)
	public String hello()
	{
		return "HelloWorld";
		
	}
	
	
}
