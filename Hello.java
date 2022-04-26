package hello;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        String name;
  	String address;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("What is your name?");
    name = in.nextLine();
    
    System.out.println("Where are you live, " + name + "?");
    address = in.nextLine();
    
    System.out.println("I live in " + address);
    }
}
