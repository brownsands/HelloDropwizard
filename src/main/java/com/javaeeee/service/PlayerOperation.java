package com.javaeeee.service;

import java.time.LocalTime;



import com.javaeeee.bean.Game;
import com.javaeeee.bean.Player;
import com.javaeeee.dao.PlayerDaoOperation;
import com.javaeeee.views.PlayerView;

public class PlayerOperation implements PlayerInterface
{

    @Override
    public String addPlayer(String name, int guess , Game game) {
        
    	 LocalTime time=LocalTime.now();
         int v=time.compareTo(game.getEnd());

         if(v>0)
         {
             GameOperation go=new GameOperation();
            // if(game.getA().size()!=0)
             go.CalculateResult(game);
             return "Winner of Game is:" + game.getWinner();
         }
         
         PlayerDaoOperation p = new PlayerDaoOperation();
        p.addPlayer(name, guess);
         return "Player added succesfully";
    }
}
