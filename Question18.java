import java.util.Random;

public class Question18 {

    //Objective: Write an algorithm to randomly generate and display two numbers between 1 and 10.
    //Input: None (random generation).
    //Output: Two randomly generated numbers between 1 and 10.
    //Example: Output could be 3 and 8.

    public static void main(String[] args) {

        Random rand = new Random();
        int random1 = rand.nextInt(1,11);
        int random2 = rand.nextInt(1,11);
        System.out.println("Random num 1: " + random1 + " Random num 2: " +random2);

    }
    
}
