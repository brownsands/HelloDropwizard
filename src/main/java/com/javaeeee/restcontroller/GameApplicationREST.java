package com.javaeeee.restcontroller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataParam;

import com.javaeeee.bean.Game;
import com.javaeeee.dao.PlayerDaoOperation;
import com.javaeeee.service.GameOperation;
import com.javaeeee.service.PlayerOperation;
import com.javaeeee.views.GameView;
import com.javaeeee.views.PlayerView;

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
	public GameView startgame(@QueryParam("start-time")String s , @QueryParam("End-Time")String e)
	{
		g=go.startgame(s,e);
		return new GameView(g);
	}
	
//	@PUT
//	@Path("/guess-avg")
//	@Produces(MediaType.APPLICATION_JSON)
//	public PlayerView addPlayer(@QueryParam("name")String name , @QueryParam("Guess")int n )
//	{	
//		//PlayerDaoOperation p = new PlayerDaoOperation();
//		 String ans = po.addPlayer(name, n,g);
//		 return new PlayerView(new Player(name,n));
//	}
	
	@GET
	@Path("/winner")
	@Produces(MediaType.APPLICATION_JSON)
	public GameView CalculateResult()
	{
		String win= go.CalculateResult(g);
		return new GameView(g);
	}
	
	@GET
	@Path("/check")
	@Produces(MediaType.TEXT_HTML)
	public PlayerView hello()
	{	
//		String html = "<!DOCTYPE html>\r\n"
//				+ "<html>\r\n"
//				+ "  <body>\r\n"
//				+ "    <form\r\n"
//				+ "      action=\"/twoByThree/game/check1\"\r\n"
//				+ "      method=\"POST\"\r\n"
//				+ "      enctype=\"multipart/form-data\">\r\n"
//				+ "	  <label for=\"name\">ENTER NAME<label> <br>\r\n"
//				+ "      <input type=\"text\" name=\"name\" /><br><br>\r\n"
//				+ "	  <label for=\"guess\">ENTER GUESS<label> <br>\r\n"
//				+ "      <input type=\"text\" name=\"guess\" /><br><br>\r\n"
//				+ "      <input type=\"submit\" value=\"Submit\" />\r\n"
//				+ "    </form>\r\n"
//				+ "  </body>\r\n"
//				+ "</html>";
//		return html;
		PlayerView pv = new PlayerView();
		return pv;
	}
	
	
    @POST
	@Path("/check1")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.TEXT_HTML)
	public String hello1( @FormDataParam("name")String  Name ,  @FormDataParam("guess")int  n   )
	{	
    	PlayerDaoOperation p = new PlayerDaoOperation();
		 String ans = po.addPlayer(Name, n, g);
		String html1="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h1>THANK YOU</h1>\r\n"
				+ "<p>For Playing my game</p>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		return html1;
	}
	
	
}
