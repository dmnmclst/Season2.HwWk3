package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return this.amount;
    }

    public void deposit(double sum){
        this.amount = sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (getAmount()<sum){
            throw new LimitException("Остаток на вашем счете "+ getAmount(), getAmount());
        }
        deposit(getAmount()-sum);
    }
}

