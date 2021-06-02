package com.javaeeee.constants;

public class SQLQueriesConstants 
{
	public static final String ADD_PLAYER="insert into player(name,guess) values (? ,?)";
	public static final String VIEW_PLAYERS="select name , guess from player";
}
