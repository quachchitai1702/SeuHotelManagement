/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;


/**
 *
 * @author ASUS
 */
//class để kết nối vào database
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider {
   public static Connection getCon()
   {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           //thay đổi mật khẩu theo mật khẩu đặt trong mysql còn lại giữ nguyên
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","quachchitai@2004");
           return con;
       }
       
       catch (Exception e) {           
           return null;
       }
 
   }
}
