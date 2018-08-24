import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CompareStrings {
    
	private static Scanner scanner;
	
	public static void main(String[] args) {
        
		String inputString1,inputString2;
        scanner = new Scanner(System.in);
        int count;
       
        System.out.println("Enter a paragraph1: ");
        inputString1 = scanner.nextLine();
        
        System.out.println("Enter a paragraph2: ");
        inputString2 = scanner.nextLine();
        
        String inputString = inputString1+" "+ inputString2;

        String[] wordsArray = inputString.split(" ");
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
   		
    }
}