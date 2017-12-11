import java.util.Scanner;
/**
 * Natasya Virgichalia
 * Date: 12/03/2017
 * Assignment 13.20
 */
public class solveQuadraticEq {
     public static void main(String[]args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a, b, and c for the quadratic equation");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double discrNum = (b*b)-4*a*c;
        if(discrNum>0) {
            double firstRoot = ((-b)+Math.sqrt(discrNum)) / (2*a);
            double secondRoot = ((-b)-Math.sqrt(discrNum)) / (2*a);
            System.out.println("The roots are " + firstRoot + " and " + secondRoot);
        }
        else if(discrNum==0) {
            double onlyRoot = ((-b)+Math.sqrt(discrNum)) / (2*a);
            System.out.println("Thee root is " + onlyRoot);
        }
        else {
            Complex firstRoot = new Complex((-b)/(2*a), Math.sqrt(2*a));
            Complex secondRoot = new Complex((-b)/(2*a), -Math.sqrt(2*a));
            System.out.println("The roots are " + firstRoot + " and " + secondRoot);
        }
    }
}
