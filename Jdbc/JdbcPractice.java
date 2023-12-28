package Jdbc;

import java.sql.*;

public class JdbcPractice {
    public static void main(String[] args) {
        try{
          // Step1 :register the driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      //  Step2 :get the connection
       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","Saibro@0099");
         // Step3 :create the statement object
       Statement database=con.createStatement();
       //  Step4 :execute the queries
       database.executeUpdate("insert into student2(name,rollNo,branch)values('Abhi','11','Mca')");
            database.executeUpdate("insert into student2(name,rollNo,branch)values('yash','12','Mca')");
            database.executeUpdate("insert into student2(name,rollNo,branch)values('shabeer','13','Mca')");

            //  Step5 :close the connection
            con.close();
    }
        catch(Exception e){
               System.out.println(e);
        }
}}
