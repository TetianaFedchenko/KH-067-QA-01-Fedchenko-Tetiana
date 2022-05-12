package animal;

interface Wild {
    
    String size = "medium";
    public default String getSize(){
        return size;   
    }

    public abstract String animalSound();
}
