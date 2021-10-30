package com.company;

public class BankAccount {
    private String accountNum;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount () {
        this("543", 2.50, "name", "address", "phone");
        System.out.println("Empty Constructor");
        System.out.println(this.name);
    }

    public BankAccount (String accountNum, double balance, String name, String email, String phone) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    public void deposit(double deposit) {
        this.balance += deposit;
    }
    public void withdrawal(double withdrawal) {
        if (this.balance - withdrawal < 0) {
            System.out.println("Balance too small");
        } else {
            this.balance -= withdrawal;
            System.out.println("Balance equals "  + balance);
        }
    }
    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
