/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class ConnectionProvider {
     ResultSet rs = null;
    PreparedStatement pst = null;
    
    
     static Connection conn = null;
     
    public static Connection getCon(){
    
    try{
    
    Class.forName("com.mysql.jdbc.Driver");
     conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/java_bms_database","root","");
     Statement st = conn.createStatement();
    return conn;
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, e);
            return null;
    }
    
    
    }
    
    
}
