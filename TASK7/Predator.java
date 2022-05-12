package animal;

public class Predator extends Animal implements Wild {

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
        System.out.println(getName() + " eats meat and " + bite() + ". He says " + animalSound());
    }
    
    @Override
    public String bite() {
        return "bites animals";
    }

    @Override
    public String animalSound() {
        return ("rrrrrr"); 
    }
}
