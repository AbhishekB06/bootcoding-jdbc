package com.bootcoding.jdbc.method;

import com.bootcoding.jdbc.utils.DBConnectionUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcUsingMethods {
    public List<Customer> getAllCustomers(){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM bootcoding.customers";
            ResultSet rs = statement.executeQuery(query);

            // Extract
            List<Customer> customers = new ArrayList<>();
            while(rs.next()){
                // Single Row
                int custId = rs.getInt("customer_id");
                int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customer customer = new Customer();
                customer.setCustomerId(custId);
                customer.setSalesmanId(salesManId);
                customer.setName(name);
                customer.setCity(city);
                customer.setEmail(email);


                customers.add(customer);
            }
            return customers;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public int getTotalCustomerCount(){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT count(*) FROM bootcoding.customer";
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()){
                int count = rs.getInt("count" );
                System.out.println(count);
                return count;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    public void customerCountFromCity(String city){
        try{
            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT count(*) from bootcoding.customer where city ='"+city+"'";
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()){
                int count = rs.getInt("count");
                System.out.println("Count of customers from "+city+"="+count);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    // Get all customers
    // Tell me how many customers we have
    // Tell me how many customer belongs to specific city we have
    // SELECT COUNT(*) from customer where city = 'specific';
    // Get all customers who belong to specific CITY
    public List<Customer> customersFromSpecificCity(String cityName){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM bootcoding.customers where city = '"+cityName+"'";
            ResultSet rs = statement.executeQuery(query);

            // Extract
            List<Customer> customers = new ArrayList<>();
            while(rs.next()){
                // Single Row
                int custId = rs.getInt("customer_id");
                int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customer customer = new Customer();
                customer.setCustomerId(custId);
                customer.setSalesmanId(salesManId);
                customer.setName(name);
                customer.setCity(city);
                customer.setEmail(email);


                customers.add(customer);
            }
            return customers;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    // Get all customers which handled by specific salesman
    public List<Customer> customersBySalesman(int idNum){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM bootcoding.customers where salesman_id = '"+idNum+"'";
            ResultSet rs = statement.executeQuery(query);

            // Extract
            List<Customer> customers = new ArrayList<>();
            while(rs.next()){
                // Single Row
                int custId = rs.getInt("customer_id");
                int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customer customer = new Customer();
                customer.setCustomerId(custId);
                customer.setSalesmanId(salesManId);
                customer.setName(name);
                customer.setCity(city);
                customer.setEmail(email);


                customers.add(customer);
            }
            return customers;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    // Get a Customer by customer Id
    public List<Customer> customersById(int cid){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM bootcoding.customers where cust_id = '"+cid+"'";
            ResultSet rs = statement.executeQuery(query);

            // Extract
            List<Customer> customers = new ArrayList<>();
            while(rs.next()){
                // Single Row
                int custId = rs.getInt("customer_id");
                int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                Customer customer = new Customer();
                customer.setCustomerId(custId);
                customer.setSalesmanId(salesManId);
                customer.setName(name);
                customer.setCity(city);
                customer.setEmail(email);


                customers.add(customer);
            }
            return customers;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    // Business Logic + JDBC Code
}
