package com.group11.whatapos.model;

import java.sql.*;

//import javax.swing.JOptionPane;

/*
CSCE 315
9-25-2019 Original
2/7/2020 Update for AWS
 */
public class database {
  protected String database_username;
  protected String database_password;
  protected String database_url;
  private Connection conn = null;

  public database(){
      database_username = dbConfig.user;
      database_password = dbConfig.pswd;
      database_url = dbConfig.url;
      createConnection();

  }

  private void createConnection(){
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

  public void closeConnection(){
      try {
          conn.close();
          System.out.println("Connection Closed.");
      } catch(Exception e) {
          System.out.println("Connection NOT Closed.");
      }
  }

  public Connection returnConnection(){
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
