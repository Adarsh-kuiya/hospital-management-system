/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class ConnectionProvider {
    public static Connection getcon(){
  try {
  Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement","root","1234");
  return con;
  }
  catch(Exception e){
  JOptionPane.showConfirmDialog(null, e.toString());
  return null;
     }
   }
}