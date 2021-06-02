package com.javaeeee.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DButils 
{
private static Connection connection = null;
	
	public static Connection getConnection() {
		
        if (connection != null)
            return connection;
        else {
            try {
                
                String driver="com.mysql.cj.jdbc.Driver";
                String url="jdbc:mysql://localhost:3306/dwgettingstarted";
                String user="root";
                String password="root";
                	 		
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }

            return connection;
        }

    }
}
