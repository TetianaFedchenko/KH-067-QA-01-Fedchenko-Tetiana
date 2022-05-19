package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main { 
  public static void main(String[] args) { 
    List<String> animals = new ArrayList<String>();
    animals.add("Crocodile");
    animals.add("Wolf");
    animals.add("deer");
    animals.add("Fox");
    animals.add("Rabbite");
    animals.add("lion");
    animals.add("Tiger");
    animals.add("Bear");
    animals.add("elephant");
    animals.add("Monkey");   

	sortList(animals);
	
  }

	public static void sortList(List<String> stringList) {
    
		Collections.sort (stringList, String.CASE_INSENSITIVE_ORDER);
		
		for (String i : stringList) {		
				
			System.out.println(i);
		}
  
    }
}