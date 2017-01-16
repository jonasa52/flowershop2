package newpackage;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DBConnector
{
  private Connection connection = null;
    
 private static final String IP = "localhost";
 private static final String port = "3306";
 private static final String database = "henningsbolmster";
 private static final String username = "root";
 private static final String password = "lodsvej52";
 
 
 


public DBConnector() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://" + IP + ":" + port + "/" + database;
        this.connection = (Connection) DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection()
    {
        return this.connection;
    }





}
