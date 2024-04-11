package bank_account;

public class bankAccount {
    private int accountNumber;
    private double balance;
    public String owner;

    public int getAccountNumber(){ return accountNumber; }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
