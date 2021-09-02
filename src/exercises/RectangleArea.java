package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the rectangles length: ");
        double length = input.nextDouble();

        System.out.println("What is the rectangle's width: ");
        double width = input.nextDouble();

        double area = length*width;

        System.out.println("The area is "+ area);
    }
}
