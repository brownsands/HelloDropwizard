package com.javaeeee.views;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.javaeeee.bean.Player;
import io.dropwizard.views.View;

//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PlayerView extends View {
	
	private final Player player;
    public PlayerView() {
    	super("player.ftl");
    	this.player=null;
    }
    
    public Player getPlayer()
    {
    	return player;
    }
    
    
}
