package model;

import exception.InsuficientFundsException;
import exception.InvalidAccountException;

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

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsuficientFundsException {
        if(balance < amount)
            throw new InsuficientFundsException("fail during withdraw");

        balance -= amount;
    }

    public void transfer(double amount, Account destinationAccount)
            throws InvalidAccountException, InsuficientFundsException { // aremessa...(delegar)

        if(destinationAccount == null)
            throw new InvalidAccountException("fail during transfer"); // aremesse (cria)

        if(balance < amount)
            throw new InsuficientFundsException("fail during transfer");

        this.balance -= amount;
        destinationAccount.balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
