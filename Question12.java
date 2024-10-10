import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        System.out.println("Enter number 1:");
        double num1 = input.nextDouble();
        
        System.out.println("Enter number 2:");
        double num2 = input.nextDouble();
        
        System.out.println("Enter operator (+, -, *, /):");
        String operator = input.next();  // Use next() instead of nextLine()
        
        // Perform the operation based on the operator
        if (operator.equals("+")) {
            double addition = num1 + num2;
            System.out.println("Result: " + addition);
        } else if (operator.equals("-")) {
            double subtraction = num1 - num2;
            System.out.println("Result: " + subtraction);
        } else if (operator.equals("*")) {
            double multiplication = num1 * num2;
            System.out.println("Result: " + multiplication);
        } else if (operator.equals("/")) {
            // Check for division by zero
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                double division = num1 / num2;
                System.out.println("Result: " + division);
            }
        } else {
            System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        input.close();
    }
}
