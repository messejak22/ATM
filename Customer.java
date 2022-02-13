public class Customer {


    private int AccountNumber;
    private int pin;
    private int balance;
    public Customer(int AccountNumber, int pin, int balance) {
        this.AccountNumber = AccountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }
    public int getAccountNumber() {
        return AccountNumber;
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

        






}