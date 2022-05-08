package animal;

public class Main {

    public static void main(String[] args) {

        Predator predator = new Predator("Vasyl");
        predator.printInfo();
        Crocodile crocodile = new Crocodile("Barsic", "meat", "Aligator");
        crocodile.printInfo();
        crocodile.sleep();
        CrocodileAdult crocodileAdult = new CrocodileAdult("Tuzik", "rabbits", "Blunt-nosed crocodile");
        crocodileAdult.printInfo();
        CrocodileChild crocodileChild = new CrocodileChild("Masia", "foxes", "Filippine's crocodile");
        crocodileChild.printInfo();
    }
}
