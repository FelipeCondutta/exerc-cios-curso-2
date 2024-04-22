package primeNumbers;

    public class primeChecker extends prime_numbers {
        public void verifyOut(int numero) {
            if (verify(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
    }
