package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        CreateList();
        CreateMap();
        CreateQueue();
        CreateHashSet();
    }
    
    public static void CreateList() {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Lion");
        animals.add("Crocodile");
        animals.add("Tiger");
        animals.add("Wolf");
        animals.add("Deer");
        animals.add("Elephant");

        System.out.printf("ArrayList has %d elements \n", animals.size());
        for(String wild : animals){
            System.out.println(wild);
        }

        if(animals.contains("Wolf")){
            System.out.println("ArrayList contains Wolf");
        }

	System.out.println(animals.isEmpty());

	System.out.println(animals.get(1));
        animals.set(2, "Monkey");

        animals.remove("Deer");

        animals.remove(0);

        for(Object wild : animals) {

            System.out.println(wild);
        }
        
	animals.clear();
        
        System.out.println();
    }
    
    public static void CreateMap() {
        Map<Integer, String> animals = new HashMap<Integer, String>();

        animals.put(1, "Lion");
        animals.put(2, "Crocodile");
        animals.put(3, "Tiger");
        animals.put(4, "Wolf");
        animals.put(5, "Deer");
        animals.put(6, "Elephant");

        System.out.printf("Map has %d elements \n", animals.size());
        for(String wild : animals.values()) {
            System.out.println(wild);
        }

        if(animals.containsValue("Wolf"));{

            System.out.println("Map contains Wolf");
        }
        System.out.println(animals.isEmpty());

        String first = animals.get(1);
        System.out.println(first);

        Set<Integer> keys = animals.keySet();

        Collection<String> values = animals.values();

        animals.replace(2, "Monkey");

        animals.remove(5);
        
        for(Map.Entry<Integer, String> item : animals.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        animals.clear();
        
        System.out.println();
    }
    
    public static void CreateQueue() {
        Queue<String> animals = new ArrayDeque<String>();

        animals.add("Lion");
        animals.add("Crocodile");
        animals.add("Tiger");
        animals.add("Wolf");
        animals.add("Deer");
        animals.add("Elephant");

        String sFirst = animals.poll();
        System.out.println(sFirst);

        System.out.printf("Queue size: %d \n", animals.size());

        sFirst = animals.peek();
        System.out.println(sFirst);
        
        sFirst = animals.remove();
        System.out.println(sFirst);
        
        if (animals.offer("Lion")) {
            System.out.println("Lion is added");
        }

        System.out.println(sFirst);
        
        animals.clear();
        
        System.out.println();
    }
    
    public static void CreateHashSet() {
        HashSet<String> animals = new HashSet<String>();

        animals.add("Lion");
        animals.add("Crocodile");
        animals.add("Tiger");
        animals.add("Wolf");
        animals.add("Deer");
        animals.add("Elephant");

        boolean isAdded = animals.add("Wolf");
        System.out.println(isAdded);

        System.out.printf("Set contains %d elements \n", animals.size());

        for(String animal : animals){
            System.out.println(animal);
        }

        if(animals.contains("Wolf")){
            System.out.println("Set contains Wolf");
        }

        System.out.println(animals.isEmpty());

        boolean b = animals.add("Monkey");
        if (b) {
            System.out.println ("Monkey is added");
        }
        
        for (String s : animals) {
            System.out.println (s + ",");
        }
        
        animals.remove("Deer");
        
        animals.remove(0);

        animals.clear();
    }
}
