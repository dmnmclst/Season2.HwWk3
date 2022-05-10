package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        double d=0;
        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                if (e.getRemainingAmount() > 0) {
                    d = e.getRemainingAmount();
                }
                try {
                    bankAccount.withDraw((int) d);
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                    break;
                }
            }
        }

    }
}
