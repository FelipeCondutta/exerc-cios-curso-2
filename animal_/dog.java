package animal_;

public class dog extends animal {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println(name + ": Au au ");
    }
}
