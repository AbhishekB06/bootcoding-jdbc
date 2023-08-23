package com.bootcoding.jdbc;

import com.bootcoding.jdbc.method.JdbcUsingMethods;

import java.util.List;

public class CustomerApp {
    public static void main(String[] args) {
        JdbcUsingMethods readCustomer = new JdbcUsingMethods();
        readCustomer.getAllCustomers();
        readCustomer.getTotalCustomerCount();
        readCustomer.customerCountFromCity("Nagpur");
        readCustomer.customersFromSpecificCity("Nagpur");
        readCustomer.customersBySalesman(20);
        readCustomer.customersById(25);
    }
}
