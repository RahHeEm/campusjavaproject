package db;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

import java.sql.Connection;
public class Connections {
   
    public static Connection con;
          
    public static void ConnectDB(){
        String url = "jdbc:mysql://localhost/campus";
        String user = "root";
        String pass = "";
       
    try{
            con = DriverManager.getConnection(url, user, pass);
           // JOptionPane.showMessageDialog(null, "Connection Establised..");
           System.out.println("Connection Establised..");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
}

