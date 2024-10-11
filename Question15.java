import java.util.Scanner;

public class Question15 {

//Objective: Write an algorithm to implement the FizzBuzz game for numbers from 1 to 100 using IF statements.
//Input: Numbers from 1 to 100.
//Output: For multiples of 3, print "Fizz"; for multiples of 5, print "Buzz"; for multiples of both, print "FizzBuzz".
//Example: For 15, the output should be "FizzBuzz".

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("enter");
    int number = input.nextInt();

    if (((number % 3) == 0) && ((number % 5) == 0)){
        System.out.println("FizzBuzz");
    } else if ((number % 3) == 0){
        System.out.println("Fizz");
    } else if ((number % 5) == 0){
        System.out.println("Buzz");
    }
    input.close();

}

    
}
