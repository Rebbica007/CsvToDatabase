package edu.fgcu.dataengineering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// just to check if these are found

public class BookStoreDB {

  static final String dbUrl = "jdbc:C:\\Users\\Owner\\Desktop\\CsvToDatabase\\src\\Data\\H2";


  static Connection conn = null;

  public static void connectDB() {
    try {

      conn = DriverManager.getConnection("jdbc:H2:C:\\Users\\Owner\\Desktop\\CsvToDatabase\\src\\Data\\H2");
      System.out.println("Connection to H2: Success.");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (conn != null) {
          conn.close();
        }
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}



