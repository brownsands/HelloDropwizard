package com.javaeeee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.javaeeee.bean.Game;
import com.javaeeee.constants.SQLQueriesConstants;
import com.javaeeee.utils.DButils;

public class PlayerDaoOperation implements PlayerDaoInterface
{

	public void addPlayer(String name , int guess) {
		// TODO Auto-generated method stub
	Connection connection = DButils.getConnection();
	PreparedStatement preparedStatement;
	try {
		preparedStatement = connection.prepareStatement(SQLQueriesConstants.ADD_PLAYER);
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, guess);
		System.out.println(guess);
		preparedStatement.executeUpdate();
		
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}


}
