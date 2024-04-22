package primeNumbers;

public class primeGenerate extends prime_numbers {
    public int gerarProximoPrimo(int lastKnown) {
        int nextNumber = lastKnown + 1;
        while (!verify(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }
}