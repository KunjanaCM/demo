import java.util.Scanner;

public class WordCount {

    private static Scanner in;

	public static void main(String[] args) {

        String sentence, trimmed;
        String[] words;
        int len;

        in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        sentence = in.nextLine();

        //remove the extra space between words
        trimmed = sentence.trim();

        //check if the entered string is null / empty
        if (trimmed.isEmpty()) {
            //if null print zero
            System.out.println(0);
        } else {

            //let's count the number of words by spliting it
            words = trimmed.split("\\s+");

            //find the length of the words
            len = words.length;

            System.out.println("Number of words: " +len);
        }

    }

}