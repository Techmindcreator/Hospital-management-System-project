/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;
import java.sql.*;

/**
 *
 * @author Arun
 */
public class DBconnection {
   static final String DB_URL= "jdbc:mysql://localhost/Hsmdb";
   static final String USER = "Arun";
   static final String PASS= "Arun@123";
   public static Connection connectDB() {
      Connection conn = null;
      
      try{
       // Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
      }catch (SQLException ex) {
         System.out.println("There were errors while connecting to db.");
         return null;
        }
    }

    static Connection getconn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

