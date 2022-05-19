package list;

import java.util.ArrayList;
import java.util.List;

public class Main { 
  public static void main(String[] args) { 
    List<String> animals = new ArrayList<>();
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
    
            for (int i = 0; i < stringList.size() - 1; i++) {
                for (int j = i + 1; j < stringList.size(); j++) {
                    char c1 = stringList.get(i).toLowerCase().charAt(0);
                    char c2 = stringList.get(j).toLowerCase().charAt(0);
                    if (c1 > c2) {
                        String tempStr = stringList.get(i);
                        stringList.set(i, stringList.get(j));                                           
                        stringList.set(j, tempStr);
                    }
                }
            }
		
            stringList.forEach((i) -> {				
                System.out.println(i);
      });  
    }
}