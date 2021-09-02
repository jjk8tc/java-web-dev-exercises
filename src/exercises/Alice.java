package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = "\nAlice was beginning to get very tired of sitting by her\n" +
                "sister on the bank, and of having nothing to do: once or\n" +
                "twice she had peeped into the book her sister was\n" +
                "reading, but it had no pictures or conversations in it,\n" +
                "'and what is the use of a book,' thought Alice 'without\n" +
                "pictures or conversation?'";
        System.out.println("What term should we search for in the following text: "+text);

        String term = input.nextLine();

        Boolean check = text.toLowerCase().contains(term.toLowerCase());
        Integer index = text.toLowerCase().indexOf(term.toLowerCase());
        Integer termLength = term.length();
        String newText = text.replace(term,"");

        System.out.println("The term: "+term+" is found in the text? "+check +" and it was found at "+index+
                " with a length of "+termLength);

        System.out.println(newText);

    }
}
