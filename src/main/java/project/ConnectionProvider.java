/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class ConnectionProvider {
    public static Connection  getCon()
    {
        try
        {//adding jar files for mysql
        Class.forName("com.mysql.cj.jdbc.Driver");
        //creating a connection to database name=hotel,username=root, password="" if not
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
        return con;
        }
        catch(Exception e)
        {
        return null;
        }
    }
}
