package com.javaeeee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.javaeeee.bean.Game;
import com.javaeeee.bean.Player;
import com.javaeeee.constants.SQLQueriesConstants;
import com.javaeeee.utils.DButils;

public class GameDaoOperation implements GameDaoInterface {

	@Override
	public String CalculateResult(Game g) {
		// TODO Auto-generated method stub
		
		Connection connection = DButils.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(SQLQueriesConstants.VIEW_PLAYERS);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player p =new Player(resultSet.getString(1) ,resultSet.getInt(2) );
				g.getA().add(p);
			}
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
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
