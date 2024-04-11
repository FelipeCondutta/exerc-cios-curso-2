package car_Info;

public class car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void modelDefine(String model){
        this.model = model;
    }

    public void priceDefine(double priceYear1, double priceYear2, double priceYear3){
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public void showInfo(){
        System.out.println("Modelo do carro: " + model);
        System.out.println("Preço do primeiro ano: " + priceYear1);
        System.out.println("Preço no segundo ano: " + priceYear2);
        System.out.println("Preço no terceiro ano: " + priceYear3);
        System.out.println("Menor preço: " + lowestPriceCalculator());
        System.out.println("Maior preço: " + biggestPriceCalculator());
    }

    private double lowestPriceCalculator(){
        double lowestPrice = priceYear1;

        if(priceYear2 < lowestPrice){
          lowestPrice = priceYear2;
        }

        if (priceYear3 < lowestPrice){
            lowestPrice = priceYear3;
        }

        return lowestPrice;
    }

    private double biggestPriceCalculator(){
        double biggestPrice = priceYear1;

        if(priceYear2 > biggestPrice){
            biggestPrice = priceYear2;
        }

        if (priceYear3 > biggestPrice){
            biggestPrice = priceYear3;
        }

        return biggestPrice;
    }
}
