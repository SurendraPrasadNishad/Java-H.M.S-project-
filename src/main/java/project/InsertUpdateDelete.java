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
//for runnung query 
public class InsertUpdateDelete {
    public static void setData(String Query,String msg)
    {  //making connection and statement null
        Connection con = null;
        Statement  st= null;
        
        try
        { //making connection with database with the help of connection provider class
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //obtain query executed here
            st.executeUpdate(Query);
            
            //for showing messages receive from msg
            if(!msg.equals(""))
            {
            JOptionPane.showMessageDialog(null, msg);
            }
       
        
        }
        catch(Exception e)
        {//when error show messge
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
             try
             {//close connection and statement after execution of query
            con.close();
            st.close();
             }
            catch(Exception e)
             {
             }
        
        }
    }
    
}
