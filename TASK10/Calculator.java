package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
  
        System.out.println("This calculator allows you to perform the "
                + "following operations: +, -, *, / and % on two double numbers.\n"
                + "To perform calculations, enter the requested data\n");
        
        double a = setDouble();
        String operation;
        
        while (true) {
            try {
                operation = setSupportedOperation();
                break;
            } 
            catch (UnsupportedOperationException ex) {
                System.out.println("Operation is not supported");
            }
        }
            
        double b = setDouble();
        
        double result = 0;

        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
        }
    
        System.out.println(a + operation + b + "=" + result);
    
    }
    
    public static double setDouble() {
        
        while (true) {
            try {
                System.out.println("Enter a double value");
                Scanner in = new Scanner(System.in);
                double value = in.nextDouble();
                return value;
            } 
            catch (InputMismatchException ex) {
                System.out.println("Invalid number");
            }
        }
    }
    
    public static String setSupportedOperation() {
        
        System.out.println("Enter one of the supported operations: +, -, *, /, %");
        Scanner in = new Scanner(System.in);
        String operation = in.next();
        if ("+".equals(operation) || "-".equals(operation) || "*".equals(operation) ||
            "/".equals(operation) || "%".equals(operation))
                return operation;
        else
            throw new UnsupportedOperationException(); 
    }
}
