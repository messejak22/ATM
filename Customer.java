public class Customer {


    private int AccountNumber;
    private int pin;
    private int withdraw;
    private int deposit;
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

    public int getWithdraw() {
        return withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getBalance() {
        return balance;
    }






}