/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dell
 */
public class tables {
    //by main method we are going to create tables
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st= null;
        
        try
        {//code to create table in database
         //from Connection provider class making connection to databse
            con =ConnectionProvider.getCon();
            st = con.createStatement();
            //creating users table in database
            st.executeUpdate("create table  users (name varchar(200), email varchar(200), password varchar(50),securityQuestion varchar(500),answer varchar(200), address varchar(200), status varchar(20) )");
             //creating room table in database
            st.executeUpdate("create table  room (roomNo varchar(10), roomType varchar(200), bed varchar(200),price int,roomStatus varchar(20) )");
            //creating customer table in database
            st.executeUpdate("create table  customer (id int ,name varchar(200),mobileNumber varchar(10), nationality varchar(200),gender varchar(50),email varchar(200), idProof varchar(200), address varchar(500), checkIn varchar(20),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10) ,numberOfDaysStay int(10), totalAmount varchar(200),checkOut varchar(50) )");
        JOptionPane.showMessageDialog(null,"Table created Successfully!");
        }
        catch(Exception e)
        {//when error show message
            JOptionPane.showMessageDialog(null, e);
        }
        finally// if any error
        {
        try
        {//close all connection and statement
        con.close();
        st.close();
        }
        catch(Exception e)
        {
            
        }
        }
  
    }
    
}
