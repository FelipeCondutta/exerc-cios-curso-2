package primeNumbers;

public class run {
    public static void main(String[] args) {
        primeChecker verificador = new primeChecker();
        verificador.verifyOut(17);

        primeGenerate gerador = new primeGenerate();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        prime_numbers numerosPrimos = new prime_numbers();
        numerosPrimos.primeList(30);
    }
}
