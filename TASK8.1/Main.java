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
                    String s1 = stringList.get(i).toLowerCase();
                    String s2 = stringList.get(j).toLowerCase();
                    
                    for (int k = 0; k < s1.length(); k++) {
                        if (k < s2.length()) {
                            char c1 = s1.charAt(k);
                            char c2 = s2.charAt(k);
                    
                            if (c1 < c2) 
                                break;
                            else if (c1 > c2) {
                                String tempStr = stringList.get(i);
                                stringList.set(i, stringList.get(j));                                           
                                stringList.set(j, tempStr);
                                break;
                            }
                        }
                        else {
                            String tempStr = stringList.get(i);
                            stringList.set(i, stringList.get(j));                                           
                            stringList.set(j, tempStr);
                            break;
                        }
                    }
                }
            }
		
            stringList.forEach((i) -> {				
                System.out.println(i);
      });  
    }
}