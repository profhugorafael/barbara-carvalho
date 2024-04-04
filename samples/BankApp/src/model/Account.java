package model;

public class Account {

    private String holder;
    private double balance;

    public Account() {
    }

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance < amount){
            System.out.println("Not enough balance");
            return;
        }

        balance -= amount;
    }

    public void transfer(double amount, Account destinationAccount) {
        if(destinationAccount == null) {
            System.out.println("destination account should not be null");
            return;
        }

        if(balance < amount) {
            System.out.println("Not enough balance");
            return;
        }

        this.balance -= amount;
        destinationAccount.balance += amount;
    }
}
