import java.util.Random;

//Objective: Write an algorithm that randomly selects and displays two numbers between 0 and 10.
//Input: None (random generation).
//Output: Two randomly generated numbers between 0 and 10.
//Example: Output could be 2 and 7.


public class Question17 {
    public static void main(String[] args) {

        Random rand = new Random();
        int random1 = rand.nextInt(0,10);
        int random2 = rand.nextInt(0,10);
        System.out.println("Random num 1: " + random1 + " Random num 2: " +random2);

    }


}


    

