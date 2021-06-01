package com.javaeeee.service;

import java.time.LocalTime;

import com.javaeeee.bean.Game;
import com.javaeeee.bean.Player;

public class PlayerOperation implements PlayerInterface
{

    @Override
    public String addPlayer(String name, int guess , Game game) {
        
    	 LocalTime time=LocalTime.now();
         int v=time.compareTo(game.getEnd());

         if(v>0)
         {
             GameOperation go=new GameOperation();
             if(game.getA().size()!=0)
             go.CalculateResult(game);
             return "Winner of Game is:" + game.getWinner();
         }
         
    	Player p = new Player(name,guess);
        game.getA().add(p);
        return "Thanks for Playing.";
    }
}
