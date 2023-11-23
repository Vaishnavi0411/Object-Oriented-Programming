package com.niit.banking;
public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.setAccountHolderName("sam");
        account.setAccountStatus("Active");
        account.setAccountNumber(63726773);
        account.setAvailableBalance(5000);
        account.setCreditAmount(3000);
        account.setDebitAmount(1000);
        account.setTotalBalance(6000);
        account.setOpeningDate("26-09-2012");
        account.setModeOfOperation("Self Operated");
        account.setIntMobBanking(true);
        account.setInterestRate(4);
        account.displayDetails();
        System.out.println("----------------");
        account.creditAmount();
        System.out.println("----------------");
        account.debitAmount();
        System.out.println("----------------");
        account.retrieveBalance();
    }
}
