import java.util.Scanner;
public class Question14 {


//Objective: Write an algorithm to solve a quadratic equation in the form ax2+bx+c=0ax^2 + bx + c = 0ax2+bx+c=0.
//Input: Coefficients aaa, bbb, and ccc entered by the user.
//Output: The roots of the quadratic equation, or a message if no real roots exist.
//Example: For x2−3x+2=0x^2 - 3x + 2 = 0x2−3x+2=0, the output should be x=1x = 1x=1 and x=2x = 2x=2.


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("coefficient a");
    double a = input.nextDouble();
    System.out.println("Enter coefficient b");
    double b = input.nextDouble();
    System.out.println("coefficeint c");
    double c = input.nextDouble(); 

    double discriminant = Math.pow(b,2) - 4 * a * c;
    if (discriminant >= 0){
        double x1 = (-b + Math.sqrt(discriminant)) / (2 *a );
        double x2 = (-b + Math.sqrt(discriminant)) / (2 *a );
        System.out.println("x1 = " + x1 + ", x2 = " + x2); 

    } else {
        System.out.print("The equation has no real solutions");
    }
    input.close();

    

}
    
}
