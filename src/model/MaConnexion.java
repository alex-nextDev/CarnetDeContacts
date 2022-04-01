package model;


import java.io.*;

import java.sql.*;
import java.util.*;


public class MaConnexion
{
	private static String url = "jdbc:mysql://localhost:8889/BdContact?useSSL=true&serverTimezone=UTC";
	private static String login = "root";
	private static String password = "";
	
	private static Connection connexion = null;
	
	
	public MaConnexion()
	{
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connexion = DriverManager.getConnection(url, login, password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public static Connection getConnection()
	{
		if(connexion == null)
		{
			new MaConnexion();
		}
		return connexion;
	}
	
	
	
	public static void stop()
	{
		if(connexion != null)
		{
			try
			{
				connexion.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}		
		}	
	}
}
