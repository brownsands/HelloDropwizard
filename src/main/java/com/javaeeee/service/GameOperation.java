package com.javaeeee.service;

import com.javaeeee.bean.Game;


import com.javaeeee.bean.Player;
import com.javaeeee.dao.GameDaoOperation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class GameOperation implements GameInterface
{

   
	
    @Override
    public String CalculateResult(Game g) {

        GameDaoOperation go1 = new GameDaoOperation();
        return go1.CalculateResult(g);
    }

	@Override
	public Game startgame(String s, String e) {
		 
         LocalTime s1 = LocalTime.parse(s);
         LocalTime e1 = LocalTime.parse(e);
         Game g = new Game(s1, e1);
         return g;
		    
	}
}
