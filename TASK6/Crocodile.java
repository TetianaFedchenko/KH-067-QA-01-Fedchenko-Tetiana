package animal;

public class Crocodile extends Predator {

    private String kind;
    
    public Crocodile(String name, String food) {
        super(name, food);
    }
    
    public Crocodile(String name, String food, String kind) {
        super(name, food);
        this.kind = kind;
    }
 
    public String getKind() {
        return kind;
    }

    @Override
    public void printInfo() {
        System.out.println(getKind() + " " + getName() + " eats meat");
    }
}