package bank_account;

public class run {
    public static void main(String[] args) {
        bankAccount conta = new bankAccount();

        conta.setAccountNumber(123);
        conta.setBalance(1000);
        conta.owner = "João";

        System.out.println("Número da Conta: " + conta.getAccountNumber());
        System.out.println("Saldo: " + conta.getBalance());
        System.out.println("Titular: " + conta.owner);

        conta.setBalance(1500);
        System.out.println("Novo Saldo: " + conta.getBalance());
    }
}
