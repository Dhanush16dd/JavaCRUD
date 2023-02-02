/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class JavaProject {

    Connection con;
    public static void main(String[] args) {
       JavaProject jp = new JavaProject();
       jp.createConnection();
    }
    public void createConnection(){
       
        
           
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            System.out.println("javaproject.JavaProject.createConnection()");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while(rs.next()){
                String name = rs.getString("name");
                int age = rs.getInt(2);
                System.out.println(name + " " + age);
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(JavaProject.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
  
}
