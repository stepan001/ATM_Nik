package com.company;

import com.company.bank.Bank;
import com.company.bank.Customer;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

//      add [0] branch
        bank.addBranch();

        System.out.println("create customer Ivan Ivanov");
        bank.getBranch(0).addCustomer("Ivan", "Ivanov", "Ivanovich", "0000 000001");
        Customer customer1 = bank.getBranch(0).getCustomer(0);

        customer1.addAccount(50000);
        System.out.println("add account with " + bank.getBalance(customer1.getAccount(0)) + " on balance");

        System.out.println("withdraw 1000");
        bank.withdraw(customer1.getAccount(0), 1000);
        System.out.println("so balance is " + bank.getBalance(customer1.getAccount(0)));

        System.out.println("deposit 2000");
        bank.deposit(customer1.getAccount(0), 2000);
        System.out.println("so balance is " + bank.getBalance(customer1.getAccount(0)));

        System.out.println("pay interests for account of customer1");
        bank.interests(customer1.getAccount(0));
        System.out.println("so balance is " + bank.getBalance(customer1.getAccount(0)));


//      add another [1] branch
        bank.addBranch();
        System.out.println("create another customer Ivan Sidorov");
        bank.getBranch(1).addCustomer("Ivan", "Sidorov", "Ivanovich", "0000 000002");
        Customer customer2 = bank.getBranch(1).getCustomer(0);

        customer2.addAccount(5000000);
        System.out.println("add account with " + customer2.getAccount(0).getBalance() + " on balance");

        customer2.addAccount(5000);
        System.out.println("add account with " + customer2.getAccount(1).getBalance() + " on balance");

        System.out.println("pay interests for account [0] of customer2");
        bank.interests(customer2.getAccount(0));
        System.out.println("so balance is " + bank.getBalance(customer2.getAccount(0)));

        System.out.println("transfer 1000 from account[0] to account[1] of customer2");
        bank.transfer(customer2.getAccount(0), customer2.getAccount(1), 1000);
        System.out.println("balance on account[0] " + bank.getBalance(customer2.getAccount(0)) +
                ", balance on account[1] " + bank.getBalance(customer2.getAccount(1)));

        System.out.println("transfer 2000 from customer1, account[0] (branch[0]) to customer2, account[0] (branch[1])");
        bank.transfer(customer1.getAccount(0), customer2.getAccount(0), 2000);
        System.out.println("customers 1 balance on account[0] " + bank.getBalance(customer1.getAccount(0)) +
                ", customers 2 balance on account[0] " + bank.getBalance(customer2.getAccount(0)));

    }
}
