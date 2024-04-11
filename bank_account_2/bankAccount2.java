package bank_account_2;

public class bankAccount2 {
    private double deposit;
    private double withdraw;
    protected double balance;

    public void balanceAmount(double balance) { this.balance = balance; }

    public void withdraw(double value){
        if (value < balance){
            balance -= value;
            System.out.println("Valor sacado: " + value + " Agora seu saldo é de: " + balance);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void deposit(double value){
        balance += value;
        System.out.println("valor depositado: " + value + " Agora seu saldo é de: " + balance);
    }

    public void balnceView(){
        System.out.println("Seu saldo atual é de: " + balance);
    }
}
