package com.company.bank;

public interface Transactions {
    void deposit (Account account, double amount);
    void withdraw (Account account, double amount);
    double getBalance (Account account);
    void interests (Account account);
    void transfer (Account accountFrom, Account accountTo, double amount);

}
