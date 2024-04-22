package primeNumbers;

public class prime_numbers {
    public boolean verify(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void primeList(int upperLimit) {
        System.out.println("Números primos até " + upperLimit + ": ");
        for (int i = 2; i <= upperLimit; i++) {
            if (verify(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
