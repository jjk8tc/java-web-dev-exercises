package exercises;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String [] args) {

        /*
        int[] intArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < intArray.length; i++ ) {
            if(intArray[i]%2!=0) {
                System.out.println(intArray[i]);
            }
        }
        */

        String stringPractice = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = stringPractice.split(" ");
        System.out.println(Arrays.toString(stringArray));

        String[] sentenceArray = stringPractice.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }

}
