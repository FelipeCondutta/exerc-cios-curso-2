package animal_;

public class cat extends animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println(name + ": Miau ");
    }
}
