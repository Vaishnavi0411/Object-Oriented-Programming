import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder's name:");
        savingsAccount.accountHolderName = sc.nextLine();
        System.out.println("Enter the Account number:");
        savingsAccount.accountNumber = sc.nextLong();
        System.out.println("Enter the account balance:");
        savingsAccount.accountBalance = sc.nextFloat();
        System.out.println("Enter the account status:");
        savingsAccount.accountStatus = sc.next();
        System.out.println("Enter the amount to deposit:");
        savingsAccount.depositeAmount = sc.nextFloat();
        System.out.println("Enter the amount to withdraw:");
        savingsAccount.withdrawAmount = sc.nextFloat();

        savingsAccount.displayAccountInfo();
        savingsAccount.withdraw();
        savingsAccount.deposit();
        savingsAccount.checkBalance();
    }
}