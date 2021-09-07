package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingChar {

    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your phrase: ");
        String phrase = input.nextLine();
        /*
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
         */

        char[] charArray = phrase.toLowerCase().toCharArray();

        input.close();

        for (char i: charArray){
            if(Character.isLetter(i)){
                if(!count.containsKey(i)){
                    count.put(i,1);
                } else{
                    count.put(i,count.get(i)+1);
                }
            }
        }

        for (Map.Entry<Character, Integer> item : count.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());

        }


    }

}
