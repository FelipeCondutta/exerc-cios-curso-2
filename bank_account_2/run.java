package bank_account_2;

public class run {
    public static void main(String[] args) {
        mainAccount Felipe = new mainAccount();
        Felipe.balanceAmount(15000);
        Felipe.chargeMonthlyFee(1000);
        Felipe.deposit(2500.75);
        Felipe.withdraw(2000.50);

    }
}
