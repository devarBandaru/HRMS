package com.spthhrms.util;
 
import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnection {
 
    public static Connection createConnection()
    {
    	Connection con = null;
	       try
    {
    	
    	 Class.forName("oracle.jdbc.driver.OracleDriver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HRMS", "HRMS");
        //System.out.println("Post establishing a DB connection - "+con);
    }
    catch (Exception e)
    {
     System.out.println("An error occurred. Maybe user/password is invalid");
         System.out.println(e);
    }
	return con;
    }
}