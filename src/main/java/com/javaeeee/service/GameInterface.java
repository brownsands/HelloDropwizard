package com.javaeeee.service;

import com.javaeeee.bean.Game;

import com.javaeeee.bean.Player;

import java.util.ArrayList;

public interface GameInterface
{
	public Game startgame(String s,String e);
    public String CalculateResult(Game g);
}
