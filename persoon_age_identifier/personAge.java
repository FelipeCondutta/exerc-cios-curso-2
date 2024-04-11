package persoon_age_identifier;

public class personAge {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void verify() {
        if (age > 18){
            System.out.println("João possui " + age + " anos portanto é maior de idade");
        }
        else {
            System.out.println("João possui " + age + " anos portanto é menor de idade");
        }
    }
}
