package com.javaeeee.service;

import com.javaeeee.bean.Game;

import com.javaeeee.bean.Player;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GameOperation implements GameInterface
{

   
	
    @Override
    public String CalculateResult(Game g) {

        int s=0,cnt=0;
       
        for(Player p: g.getA())
            s+=p.getGuess();

        cnt=g.getA().size();

        s=s/cnt;

        s=(2*s)/3;

        int mn=10000000;
        for(Player p: g.getA())
        {
            if(Math.abs(p.getGuess()-s)<mn)
            {  
            	mn=Math.abs(p.getGuess()-s);
                g.setWinner(p.getName());
            }
        }
        
        return g.getWinner();
    }

	@Override
	public Game startgame(String s, String e) {
		 
         LocalTime s1 = LocalTime.parse(s);
         LocalTime e1 = LocalTime.parse(e);
         Game g = new Game(s1, e1);
         return g;
		    
	}
}
