package animal;

public class Crocodile extends Predator implements Reptilia {

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
        System.out.println(getKind() + " " + getName() + " eats meat. He is a " + getSize() + " animal");
    }

    @Override
    public void sleep() {
        System.out.println("Crocodile sleeps during 17 hours"); 
    }
}