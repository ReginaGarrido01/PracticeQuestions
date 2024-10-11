import java.util.Scanner;

public class Question16 {

//Objective: Implement the FizzBuzz game for numbers 1 to 100 using SWITCH statements.
//Input: Numbers from 1 to 100.
//Output: For multiples of 3, print "Fizz"; for multiples of 5, print "Buzz"; for multiples of both, print "FizzBuzz".
//Example: For 30, the output should be "FizzBuzz".

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("enter");
    int number = input.nextInt();

    int caseIdentifier = 0;
    if (number % 3 == 0) {
        caseIdentifier += 3;
    }
    if (number % 5 == 0) {
        caseIdentifier += 5;
    }

    switch (caseIdentifier) {
        case 8:  
            System.out.println("FizzBuzz");
            break;
        case 3:
            System.out.println("Fizz");
            break;
        case 5:
            System.out.println("Buzz");
            break;
        default:
            System.out.println("Not multiple of 5, 3 or both"); 
    }


    input.close();
    

}

    
}
