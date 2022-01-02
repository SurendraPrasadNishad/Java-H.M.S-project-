/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import project.ConnectionProvider;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class SelectForLogin {
    //for taking multiple value we use Resultset
    public static ResultSet getData(String query)
    {
      Connection con = null;
      Statement st = null;
      ResultSet rs= null;
      try
      {
          //making connection with database with help of ConectionProvider in project folfer so we need to import it
          con = ConnectionProvider.getCon();
          //creating statement
          st  = con.createStatement();
          //what ever query we get from login page that is execute here result is store in rs 
          rs =st.executeQuery(query);
          //now return query result to login page
          return rs;
      }
      catch(Exception e)
      {//when error show message what is wrong then
          JOptionPane.showMessageDialog(null, e);
          //pass null to login page 
          return null;
      }
    
    
    }
}
