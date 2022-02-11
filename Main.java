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

        System.out.println(cd1.getC1().getBalance());
        System.out.println("Enter (1) Withdraw (2) Deposit");
        



        
        
        
    }
}
