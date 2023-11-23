package com.niit.bankaccount;

public abstract class BankAccount {
    private String accNo;
    private String name;
    private float balance;
    private String status;
    private float depositeAmount;
    private float withdrawAmount;

    public BankAccount(String accNo, String name, float balance, String status, float depositeAmount, float withdrawAmount) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.status = status;
        this.depositeAmount = depositeAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getDepositeAmount() {
        return depositeAmount;
    }

    public void setDepositeAmount(float depositeAmount) {
        this.depositeAmount = depositeAmount;
    }

    public float getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(float withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }


    public abstract void withDraw();

    public void checkBalance() {
        System.out.println("Account Balance: " + getBalance());
    }


    public void deposit() {
        if (depositeAmount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            setBalance(getBalance() + getDepositeAmount());
            System.out.println("Updated balance after deposit : " + getBalance());
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accNo='" + accNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", status='" + status + '\'' +
                ", depositeAmount=" + depositeAmount +
                ", withdrawAmount=" + withdrawAmount +
                '}';
    }

}
