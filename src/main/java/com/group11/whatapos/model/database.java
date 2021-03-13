package com.group11.whatapos.model;

import java.sql.*;

//import javax.swing.JOptionPane;

/*
CSCE 315
9-25-2019 Original
2/7/2020 Update for AWS
 */
public class database {
  protected static String database_username;
  protected static String database_password;
  protected static String database_url;
  private static Connection conn = null;
  private static database instance = new database();
  
  /*
  database() : constructor
  description : creates and configures a database object, which is used to create connections to the AWS database
  
  */
  private database(){
      database_username = dbConfig.user;
      database_password = dbConfig.pswd;
      database_url = dbConfig.url;
  }
  
  public static database getInstance(){
      return instance;
  }

  public static void createConnection(){
      try {
          Class.forName("org.postgresql.Driver");
          conn = DriverManager.getConnection(database_url, database_username, database_password);
      }
      catch (Exception e) {
          e.printStackTrace();
          System.err.println(e.getClass().getName()+": "+e.getMessage());
          System.exit(0);
      }
      System.out.println("Database opened successfully");
  }

  public static void closeConnection(){
      try {
          conn.close();
          System.out.println("Connection Closed.");
      } catch(Exception e) {
          System.out.println("Connection NOT Closed.");
      }
  }

  public static Connection returnConnection(){
      return conn;
  }

  public void printItems() throws SQLException {
      String query = "SELECT *" +
                     "from item";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(query);

      while (rs.next()) {
          String lastName = rs.getString("itemname");
          System.out.println(lastName + "\n");
      }
  }
}
