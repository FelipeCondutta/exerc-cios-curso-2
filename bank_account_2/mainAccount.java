package bank_account_2;

public class mainAccount extends bankAccount2 {
    private double monthlyRate;

    public void chargeMonthlyFee(double value){
        balance -= value;
        System.out.println("Tarifa mensal de: " + value + " cobrada " + "Saldo atual de: " + balance);
    }

}
