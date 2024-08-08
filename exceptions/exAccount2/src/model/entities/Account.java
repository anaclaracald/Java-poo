package model.entities;

import model.exceptions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainExceptions {
       validateWithdraw(amount);
        balance -= amount;
    }

    public void validateWithdraw(Double amount) throws DomainExceptions {
        if(amount >= withdrawLimit){
            throw new DomainExceptions("Withdraw error: Withdraw limit must be bigger than amount.");
        } if (amount >= balance){
            throw new DomainExceptions("Withdraw error: The balance must be bigger than amount.");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account {");
        sb.append("number: ").append(number);
        sb.append(", holder: ").append(holder).append('\'');
        sb.append(", balance: ").append(balance);
        sb.append(", withdrawLimit: ").append(withdrawLimit);
        sb.append('}');
        return sb.toString();
    }
}
