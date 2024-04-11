package percent_descount;

public class run {
    public static void main(String[] args) {
        Product garrafa = new Product("Coke", 10);
        garrafa.applyDiscount(20);
        System.out.println("O valor do produto é " + garrafa.getPrice());
    }
}
