package model;

public class Account {

    public static double operationTax = 5.0;

    private int id;
    private String holder;
    private double balance;

    public Account() {
    }

    public Account(int id, String holder, double balance) {
        this.id = id;
        this.holder = holder;
        this.balance = balance;
    }

    public int getId() {
        return id;
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
        double amountToDeposit = amount - operationTax;
        balance += amountToDeposit;
    }

    public void withdraw(double amount) {
        double amountToWithdraw = amount + operationTax;

        if(amountToWithdraw > balance) {
            return;
        }

        balance -= amountToWithdraw;
    }

    @Override
    public String toString() {
        return """
        Account{
            id=$id,
            holder='$holder',
            balance=$balance
        }""";
    }
}
