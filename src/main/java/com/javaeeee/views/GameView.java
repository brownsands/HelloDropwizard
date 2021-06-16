package com.javaeeee.views;

import com.javaeeee.bean.Game;
import com.javaeeee.bean.Player;

import io.dropwizard.views.View;

public class GameView extends View{
	
	private final Game g;
	  public GameView(Game g) {
	    	super("game.ftl");
	        this.g = g;
	    
	    }

	  public Game getGame() {
	        return g;
	    }
}
