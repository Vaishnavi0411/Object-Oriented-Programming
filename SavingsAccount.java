public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    float accountBalance;
    String accountStatus;
    float depositeAmount;
    float withdrawAmount;


    void withdraw() {
        if (withdrawAmount <= 0 || withdrawAmount > accountBalance) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            accountBalance = accountBalance - withdrawAmount;
            System.out.println("Withdrawn account: " +withdrawAmount);
        }
    }

    void checkBalance()
    {
        System.out.println("Account Balance: " +accountBalance);
    }

    void deposit() {
        if (depositeAmount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            accountBalance = accountBalance + depositeAmount;
            System.out.println("Deposited account: "+ depositeAmount);
        }
    }

    void displayAccountInfo() {
            System.out.println("Account Holder's Name : " + accountHolderName);
            System.out.println("Account Number :\t" + accountNumber);
            System.out.println("Account Status :\t" + accountStatus);
    }
}

