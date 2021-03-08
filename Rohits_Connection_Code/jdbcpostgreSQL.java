import java.sql.*;

public class jdbcpostgreSQL {
  public static void main(String args[]) {
    dbSetup my = new dbSetup();

    // Building the connection
    Connection conn = null;
    try {
      conn = DriverManager.getConnection("jdbc:postgresql://csce-315-db.engr.tamu.edu/db904_group11_project2", my.user,
          my.pswd);
    } 
    catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Opened database successfully");

    try {
      Statement stmt = conn.createStatement();
      String sqlStatement = "SELECT * from item";

      // send statement to DBMS
      ResultSet result = stmt.executeQuery(sqlStatement);

      // OUTPUT
      System.out.println("Query Result");
      while (result.next()) {
        System.out.println(result.getString("itemname") + " - " + result.getString("itemcode"));
      }
    } 
    catch (Exception e) {
      System.out.println("Error accessing Database.");
    }

    // closing the connection
    try {
      conn.close();
      System.out.println("Connection Closed.");
    } 
    catch (Exception e) {
      System.out.println("Connection NOT Closed.");
    } 
  }
}
