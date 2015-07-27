package com.company.bank;

import java.util.ArrayList;

public class Bank implements Transactions {
    private ArrayList<Branch> branches = new ArrayList<>();

    public void addBranch() {
        Branch branch = new Branch();
        branches.add(branch);
    }

    public Branch getBranch(int branchIndex) {
        if (branchIndex >= branches.size()) return null;
        return branches.get(branchIndex);
    }

    private double getPercents(double balance) {
        if (balance >= 5000000) return 0.01;
        if (balance >= 5000) return 0.05;
        return 0;
    }

    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (amount > account.getBalance()) return;
        account.setBalance(account.getBalance() - amount);
    }

    @Override
    public double getBalance(Account account) {
        return account.getBalance();
    }

    @Override
    public void interests(Account account) {
        double amount = account.getBalance() * getPercents(account.getBalance());
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void transfer(Account accountFrom, Account accountTo, double amount) {
        if (amount > accountFrom.getBalance()) return;
        withdraw(accountFrom, amount);
        deposit(accountTo, amount);
    }
}
