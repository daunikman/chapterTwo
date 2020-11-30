import java.util.Scanner;

public class AccountTest{

    public static void main(String... args){
        Account dipoAccount = new Account("Dipo", 1_000_000);
        Account nonsoAccount = new Account();
        Account dotunAccount = new Account("Dotun", 75);
        int balance = dotunAccount.getAccountBalance();


        System.out.printf("Dotun's old balance is: %d%n", balance);

        balance = dipoAccount.getAccountBalance();


        System.out.printf("Dipo's old balance is: %d%n", balance);
        
        Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the new balance: ");
//        int newBalance = scanner.nextInt();

//        dotunAccount.setAccountBalance(newBalance);


        dotunAccount.setAccountBalance(scanner.nextInt());

        balance = dotunAccount.getAccountBalance();
    
        System.out.printf("Dotun's current balance is: %d%n", balance);
        balance = dipoAccount.getAccountBalance();
        System.out.printf("Dipo's current balance is: %d%n", balance);


 String accountName = dipoAccount.getAccountName();
        System.out.printf("Dipo's current account name is: %s%n", accountName);


        accountName = dotunAccount.getAccountName();
        System.out.printf("Dotun's current account name is: %s%n", accountName);
        
        




    }







}
