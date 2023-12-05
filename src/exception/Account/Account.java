package exception.Account;

public class Account {
    // Atributos
    private static int numberCounter = 0;
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    // Construtor
    public Account(String holder, double balance, double withdrawLimit) {
        numberCounter++;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
        this.number = numberCounter;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    
    // Demais Métodos
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.getBalance()) {
            throw new RuntimeException("Amount bigger than the account balance.");
        } else if (amount > withdrawLimit) {
            throw new RuntimeException("Amount bigger than the account withdraw limit.");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
                + withdrawLimit + "]";
    }

    
}