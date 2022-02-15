public class Customer {


    private int accountNum;
    private int pin;
    private int balance;
    public Customer(int accountNum, int pin, int balance) {
        this.accountNum = accountNum;
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }
    public int getAccountNum() {
        return accountNum;
    }

    public void withdraw(int withdraw) {
        balance -= withdraw;
    }

    public void deposit(int deposit) {
        balance += deposit;
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {

        return accountNum +  " " + " " + pin + " " +balance;

    }
        






}