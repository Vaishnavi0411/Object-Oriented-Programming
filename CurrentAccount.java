package com.niit.bankaccount;
public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, float balance, String status, float depositeAmount, float withdrawAmount) {
        super(accNo, name, balance, status, depositeAmount, withdrawAmount);
    }

    public void withDraw() {
        if (super.getWithdrawAmount() <= 0 || super.getBalance() <= 5000) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            super.setBalance(super.getBalance() - super.getWithdrawAmount());
            System.out.println("Updated balance after withdrawal : " + super.getBalance());
        }
    }
}
