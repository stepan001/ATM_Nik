package com.company.bank;


import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<>();

    public Customer getCustomer (int customerIndex) {
        if (customerIndex >= customers.size()) return null;
        return customers.get(customerIndex);
    }

    public void addCustomer (String fname, String lname, String mname, String passportId) {
        Customer customer = new Customer (fname, lname, mname, passportId);
        customers.add(customer);
    }

}
