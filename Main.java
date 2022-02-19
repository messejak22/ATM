import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
    
    private static CustomerDatabase cd1;
    private static int listSize;
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        cd1 = new CustomerDatabase();
        cd1.addCustomer();
        listSize = cd1.getList().size();
        int checkAccountNum;
        int k = 0;
        boolean flag = false;
        int keep;
        while (true) {
            System.out.println("Enter Account number: ");
            checkAccountNum = scan.nextInt();
            for (int i = 0; i < cd1.getList().size(); i++) {
                if (checkAccountNum == cd1.getList().get(k).getAccountNum()) {
                    System.out.println("Correct");
                    flag = true;
                    break;
                } else {
                    k++;
                }
            }
            keep = k;
            k -= k;

            if (flag == false) {
                System.out.println("Try again");
            } else {
                break;
            }
     
        }
        boolean flag2 = false;
        while (true) {
            System.out.println("Enter pin: ");
            int checkPin = scan.nextInt(); 
            if (checkPin == cd1.getList().get(keep).getPin()) { System.out.println("Correct"); flag2 = true; break; } 
            if (flag2 == false) {
                System.out.println("Try again");
            } else {
                break;
            }

        }

        while(true) {
            System.out.println(cd1.getList().get(keep).getBalance());
            System.out.println("Enter (1) Withdraw (2) Deposit (3) Check Balance (4) Exit");
            int choice1 = scan.nextInt();
            if (choice1 == 1) {
                //Withdraw 
                System.out.println("Enter withdraw amount: ");
                int withdrawChoice = scan.nextInt();
                cd1.getList().get(keep).withdraw(withdrawChoice);
                System.out.println("New balance: " + cd1.getList().get(keep).getBalance());
                rewrite();
                System.out.println("Enter (1) to exit (2) to return to home: ");
                int returnChoice = scan.nextInt(); 
                if (returnChoice == 1) {
                    break;
                }

            } else if (choice1 == 2) {

                //Deposit 
                System.out.println("Enter deposit amount: ");
                int depositAmount = scan.nextInt();
                cd1.getList().get(keep).deposit(depositAmount);
                System.out.println("New balance " + cd1.getList().get(keep).getBalance());
                rewrite();
                System.out.println("Enter (1) to exit (2) to return to home: ");
                int returnChoice = scan.nextInt(); 
                if (returnChoice == 1) {
                    break;
                }

            } else if (choice1 == 3) {
                //Check balance
                System.out.println("Balance: " + cd1.getList().get(keep).getBalance());
                System.out.println("Enter (1) Return Home (2) Exit: ");
                int choice2 = scan.nextInt();
                if (choice2 == 2) {
                    break;
                }
            } else {
                //Exit
                break;
            }
    
            
        }
 
        
    }

    public static void rewrite() {

        try {

            FileWriter f = new FileWriter("C:\\Users\\jakec\\Desktop\\ATM\\ATM-\\Text.in.txt");
            for (int i = 0; i < listSize; i++) {
                f.write(cd1.getList().get(i).getAccountNum() + " " + cd1.getList().get(i).getPin() + " " + cd1.getList().get(i).getBalance() + "\n");
            }
            
            f.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
}
        

    }
}
