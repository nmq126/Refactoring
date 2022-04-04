package com.demo.Facade;

import com.demo.Entity.Customer;

import java.util.ArrayList;

public class Organization {
    private ArrayList<Customer> customers;
    public void addCustomer(Customer customer){
        if (customers == null){
            customers = new ArrayList<>();
        }
        customers.add(customer);
        System.out.println("Organization có khách mới");

    }
}
