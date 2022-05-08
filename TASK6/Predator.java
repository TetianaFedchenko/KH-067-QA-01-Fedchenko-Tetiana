package animal;

public class Predator extends Animal {

    private String food;
    
    public Predator(String name) {
        super(name);
    }
    
    public Predator(String name, String food) {
        super(name);
        this.food = food;
    }
    
    public String getFood() {
        return food;
    }

    public void printInfo() {
        System.out.println(getName() + " eats meat and " + bite());
    }
    
    @Override
    public String bite() {
        return "bites animals";
    }
}
