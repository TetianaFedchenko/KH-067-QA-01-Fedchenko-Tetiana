package animal;

public class CrocodileAdult extends Crocodile {
    
    public CrocodileAdult(String name, String food, String kind) {
        super(name, food, kind);
    }

    @Override
    public void printInfo() {
        System.out.println(getKind() + " " + getName() + " is adult and eats " + getFood() + ". " + bite());
    }

    @Override
    public String bite() {
        return "The Crocodile can bite.";
    }
}
