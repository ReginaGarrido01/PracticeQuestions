import java.util.Scanner;

public class Question11 {
    //Objective: Write an algorithm to test if one number is divisible by another, displaying an error if attempting to divide by zero.
    //Input: Two numbers entered by the user.
    //Output: The result of division if valid, or an error message if dividing by zero.
    //Example: If the user inputs 10 and 0, the output should be "Error: Division by zero is not allowed."

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Enter number 1");
        double num1 = input.nextDouble();
        System.out.println("Enter number 2");
        double num2 = input.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Perform the division and display the result
            double result = num1 / num2;
            System.out.println("The result of the division is: " + result);
        }

        input.close();

    }

    
}
