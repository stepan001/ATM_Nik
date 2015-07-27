package com.company.bank;


import java.util.ArrayList;

public class Customer {
    private String fname;
    private String lname;
    private String mname;
    private String passportId;

    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String fname, String lname, String mname, String passportId) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.passportId = passportId;
    }

    public void addAccount (double balance) {
        Account account = new Account (this, balance);
        accounts.add(account);
    }

    public Account getAccount (int accountIndex) {
        if (accountIndex >= accounts.size()) return null;
        return accounts.get(accountIndex);
    }
}
