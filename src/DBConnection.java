
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harry
 */
public class DBConnection {
    
    static String mysqlurl = "jdbc:mysql://localhost:3306/librarydb";
    static String mysqluser = "root";
    static String mysqlpass = "Blinkohermes8";
    
    public static Connection connectDb(){
        
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection(mysqlurl, mysqluser, mysqlpass);
        
        return connect;
    }
    catch(HeadlessException | ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
    return null;
    }  
    
}
