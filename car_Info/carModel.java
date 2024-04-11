package car_Info;

public class carModel extends car {
    private String security;
    private String popularity;

    public void atribute(String security, String popularity){
        this.security = security;
        this.popularity = popularity;
    }

    public void technicalSheet(){
        System.out.println("O nível de segurança do carrro é: " + security);
        System.out.println("O nível de popularidade do carrro é: " + popularity);

    }
}
