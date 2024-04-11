package car_Info;

public class run {
    public static void main(String[] args) {
        carModel fusion = new carModel();
        fusion.modelDefine("Ford Fusion - sedan");
        fusion.priceDefine(50000, 40000, 30000);
        fusion.atribute("Seguro.", "Pouco procurado.");
        fusion.showInfo();
        fusion.technicalSheet();
    }
}
