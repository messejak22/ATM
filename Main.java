import java.util.*;
public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CustomerDatabase cd1 = new CustomerDatabase();
        System.out.println("Enter Account number: ");
        int checkAccountNum = scan.nextInt();
        while (true) {
            if (checkAccountNum == cd1.getC1().getAccountNumber()) {
                break;

            } else {
                System.out.println("Try again");
            }
        }
        while (true) {
            System.out.println("Enter pin: ");
            int checkPin = scan.nextInt(); 
            if (checkPin == cd1.getC1().getPin()) {
                break;
            } else {
                System.out.println("Try again");
            }
        }

        while(true) {
            System.out.println(cd1.getC1().getBalance());
            System.out.println("Enter (1) Withdraw (2) Deposit (3) Check Balance (4) Exit");
            int choice1 = scan.nextInt();
            if (choice1 == 1) {
                //Withdraw 
                System.out.println("Enter withdraw amount: ");
                int withdrawChoice = scan.nextInt();
                cd1.getC1().withdraw(withdrawChoice);
                System.out.println("New balance: " + cd1.getC1().getBalance());
                /*
                System.out.println("Enter (1) to exit (2) to return to home: ");
                int returnChoice = scan.nextInt(); 
                if (returnChoice == 1) {
                    break;
                }
                */

            } else if (choice1 == 2) {
                //Deposit 
                System.out.println("Enter deposit amount: ");
                int depositAmount = scan.nextInt();
                cd1.getC1().deposit(depositAmount);
                System.out.println("New balance " + cd1.getC1().getBalance());
                /*
                System.out.println("Enter (1) to exit (2) to return to home: ");
                int returnChoice = scan.nextInt(); 
                if (returnChoice == 1) {
                    break;
                }
                */

            } else if (choice1 == 3) {
                //Check balance
                System.out.println("Balance: " + cd1.getC1().getBalance());
                /*
                System.out.println("Enter (1) Return Home (2) Exit: ");
                int choice2 = scan.nextInt();
                if (choice2 == 2) {
                    break;
                }
                */
            } else {
                //Exit
                break;
            }
    
        }
   

        
        
        
    }
}
