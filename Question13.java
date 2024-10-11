import java.util.Scanner;

public class Question13 {

    //Objective: Write an algorithm to implement a basic calculator using SWITCH statements for operation selection.
    //Input: Two numbers and an operation (+, -, *, /) entered by the user.
    //Output: The result of the selected operation.
    //Example: If the user inputs 5, 3, and "-", the output should be 2
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Enter number 1");
        double num1 = input.nextDouble();
        System.out.println("Enter number 2");
        double num2 = input.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        String operator = input.next(); 

        switch(operator){
            case "+":
                double addition = num1 + num2;
                System.out.println("Result: " + addition);
                break;
            case "-":
                double subtraction = num1 - num2;
                System.out.println("Result: " + subtraction);
                break;
            case "*":
                double multiplication = num1 * num2;
                System.out.println("Result: " + multiplication);
                break;
            case "/":
                double division = num1 / num2;
                System.out.println("Result: " + division);
                break;
            default: 
                System.out.println("Please input valid operator");
             
        }
    }
}
