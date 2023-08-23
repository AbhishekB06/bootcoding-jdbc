package com.bootcoding.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcExample {
    public static void main(String[] args) {
        try{
            //1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");

            //2. Get Database Connection Object
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bootcoding_db","postgres", "852000ab");

            //3. Query Database Using Statement Object
            Statement stmt = conn.createStatement();

            //4. Execute Query and Get ResultSet
            ResultSet rs = stmt.executeQuery("select * from bootcoding.customer");
            //4.1 Extract Result
            while (rs.next()){

                //single row
                int custId = rs.getInt("customer_id");
                //int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesmanId = rs.getInt("salesman_id");

                System.out.println("Id = "+custId);
                System.out.println("Name = "+name);
                System.out.println("City = "+city);
                System.out.println("Email = "+email);
                System.out.println("SalesmanId = "+salesmanId);
            }

            //5. Connection Close
            conn.close();
        }
        catch (Exception exception){
            exception.printStackTrace();

        }
    }
}
