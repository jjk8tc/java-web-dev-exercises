package exercises;
import java.util.Scanner;

public class milesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double miles = input.nextDouble();

        System.out.println("How much gas have you consumed: ");
        double gallons = input.nextDouble();

        double mpg = miles/gallons;

        System.out.println("You got " + mpg +" miles per gallon");
    }
}
