/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class tables {
    public static void main(String[] args)
    {
       Connection con=null;
       Statement st=null;
       try
       {
           con=(Connection) ConnectionProvider.getCon();
           st=con.createStatement();
           //Bảng users
//           st.executeUpdate("create table users("
//                   + "name varchar(200),"
//                   + "email varchar(200),"
//                   + "password varchar(50), "
//                   + "securityQuestion varchar(500),"
//                   + "answer varchar(200),"
//                   + "address varchar(200),"
//                   + "status varchar(200))");
            //Bảng room
            st.executeUpdate("create table room("
                    + "roomNo varchar(10),"
                    + "roomType varchar(200),"
                    + "bed varchar (200),"
                    + "price int,"
                    + "status varchar(200))");
           JOptionPane.showMessageDialog(null,"Table Created Successfully");
                          
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       finally
       {
       try
       {
           con.close();
           st.close();
       }
       catch(Exception e)
       {}
       }
       
    }
}
