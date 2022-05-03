package animal;

public class CrocodileChild extends Crocodile {

    public CrocodileChild(String name, String food, String kind) {
        super(name, food, kind);
    }
    
    @Override
    public void printInfo() {
        System.out.println(getKind() + " " + getName() + " is child and eats " + getFood());
    }
}