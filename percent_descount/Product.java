package percent_descount;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(){}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discountAmount = (percent / 100) * price;
            price -= discountAmount;
        } else {
            System.out.println("Invalid discount.");
        }
    }
}
