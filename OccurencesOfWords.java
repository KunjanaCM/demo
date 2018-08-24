import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class OccurencesOfWords {
    
	private static Scanner scanner;
	
	public static void main(String[] args) {
        
		String inputString1;
        scanner = new Scanner(System.in);
        int count;
        System.out.println("Enter a paragraph: ");
        inputString1 = scanner.nextLine();        

        String[] wordsArray = inputString1.split(" ");
        System.out.println( wordsArray.length);
       
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word : wordsArray)
        {
                if (map.containsKey(word))
                {
                	count = map.get(word);
                	map.put(word, count + 1);
                } 
                else 
                {
                	map.put(word, 1);
                }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " is repeated : " + entry.getValue() + " times");
        }
        System.out.println(" ");
   		for (int i = 0; i < wordsArray.length; i++)
   		{
   			System.out.println("The word \"" + wordsArray[i] + "\" in the input sentence has " + wordsArray[i].length() + " chars");
       
   		}
    }
}