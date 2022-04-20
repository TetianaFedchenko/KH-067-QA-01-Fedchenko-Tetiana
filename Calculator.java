package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
  
    double a=0, b=0;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a");
    try {
        a = in.nextDouble();
    } catch(InputMismatchException exception) {
        System.out.println("Invalid number");
        return;
    }
    
    System.out.println("Enter operation");
    String operation = in.next();
    
    System.out.println("Enter b");
    try {
        b = in.nextDouble();
    } catch(InputMismatchException exception) {
        System.out.println("Invalid number");
        return;
    }
    
    double result = 0;

    if ("+".equals(operation)){   
    	result = a + b;
    } else if ("-".equals(operation)) {
        result = a - b;
    } else if ("*".equals(operation)) {
        result = a * b;
    } else if ("/".equals(operation)) {
        result = a / b;
    } else if ("%".equals(operation)) {
        result = a % b;
    } else {
        System.out.println("Operation is not supported");
        return;
    }
    
    System.out.println(a + operation + b + "=" + result);
    
    }
}
