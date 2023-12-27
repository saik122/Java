package Jdbc;

import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) {
            String driver="com.mysql.jdbc.Driver";
            String url="jdbc:mysql://localhost:3306/studentdb";
            String username="root";
            String password="Saibro@0099";
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into student values('kumar','7863214','kadapa')");
                stmt.executeUpdate("insert into student values('jhon','988863214','hyderbad')");
                con.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }


