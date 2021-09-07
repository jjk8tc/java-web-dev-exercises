package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListPractice {

    public static int sumEven(ArrayList<Integer> practiceInts){
        int total = 0;
        for(int i : practiceInts){
            if(i%2==0){
                total=total+i;
            }
        }
        return total;
    }

    public static void printFive(ArrayList<String> words){
        Scanner input = new Scanner(System.in);

        System.out.println("What word length to print?: ");
        double length = input.nextDouble();
        for (String word : words){
            if (word.length()==length){
                System.out.println(word);
            }
        }
    }

    public static void main(String [] args){
        /*
        ArrayList<Integer> practiceInts = new ArrayList<>();
        practiceInts.add(1);
        practiceInts.add(2);
        practiceInts.add(3);
        practiceInts.add(4);
        practiceInts.add(5);
        practiceInts.add(6);
        practiceInts.add(7);
        practiceInts.add(8);
        practiceInts.add(9);
        practiceInts.add(10);

        int totalEvens = sumEven(practiceInts);
        System.out.println(totalEvens);
        */

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("stupid");
        words.add("what");
        words.add("Uncle");
        words.add("two");
        words.add("Josh");

        String stringPractice = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArray = stringPractice.split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));

        //printFive(words);
        printFive(strList);

    }
}
