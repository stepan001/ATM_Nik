package com.company.bank;


public class Account {
    private Customer customer;
    private double balance;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
