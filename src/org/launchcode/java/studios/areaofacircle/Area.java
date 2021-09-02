package org.launchcode.java.studios.areaofacircle;

import java.lang.Math.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");


        if(!input.hasNextFloat()) {
            System.out.println("Incorrect input");
            System.exit(0);
        }

        Double rad = input.nextDouble();

        if (rad<0){
            System.out.println("Incorrect input: negative number");

            while(rad<0){
                System.out.println("Enter a radius: ");
                rad = input.nextDouble();
            }
        }

        Double area = Circle.getArea(rad);

        System.out.println("The area is "+ area);
    }
}
