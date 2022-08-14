package tr.com.obss.JIP;
import java.applet.*;


import java.io.IOException;
import java.sql.SQLException;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class App {

    public static void main( String[] args ) throws SQLException {
        //com.mysql.jdbc.Driver
        //org.postgresql.Driver
        try{
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres","postgres","Bk454454.");
            System.out.println(con.isValid(1)); //to check if the connection is valid or not. con.isValid() returns a boolean.
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from users.users;"); //obtaining all of the user records
                while (rs.next()) {
                    System.out.print("\nThe id:" + rs.getInt(1) + ",");
                    System.out.print("The name:" + rs.getString(2) + ",");
                    System.out.print("The password:" + rs.getString(3) + ",");
                    System.out.print("The age:" + rs.getInt(4) + "");

                }

                stmt.executeUpdate("UPDATE users.users SET age = 33 WHERE name = 'Ali';"); //updating the age of the record having the name 'Ali':



                //stmt.executeUpdate("INSERT INTO users.users VALUES (3,'Hasan','443',45);");
                stmt.executeUpdate("DELETE FROM users.users WHERE id=3"); //Deleting the user record with id equal to 3.

                ResultSet rs3 = stmt.executeQuery("select * from users.users;"); //obtaining all the user records again.
                while (rs3.next()) {
                    System.out.print("\nThe id:" + rs3.getInt(1) + ",");
                    System.out.print("The name:" + rs3.getString(2) + ",");
                    System.out.print("The password:" + rs3.getString(3) + ",");
                    System.out.print("The age:" + rs3.getInt(4) + ",");
                }

            con.close();
        } catch (org.postgresql.util.PSQLException ex){ //handling psql exception
            ex.printStackTrace();
        } catch(SQLException e){//handling sql exception
           e.printStackTrace();
           throw new SQLException();
        } catch (ClassNotFoundException e) {//handling class not found exception
            throw new RuntimeException(e);
        }
    }
}





