import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccurancesOfLettersSentence {

    private static Scanner in;

	public static void main(String[] args) {;
        String str;
        char ch;

        in = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        str = in.nextLine();
        str = str.replaceAll(" ", "");
        System.out.println(str.length());
       
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) 
        {
            ch = str.charAt(i);            
            if (map.containsKey(ch)) 
            {
                int val = map.get(ch);
                map.put(ch, val + 1);
            } 
            else 
            {
            	map.put(ch, 1);
            }
        }
        //loop through the map to print each key and value pair 
        map.entrySet().stream().map((entry) -> 
        {
            System.out.print(entry.getKey() + " occurs ");
            return entry;
        }).forEach((entry) -> {
            System.out.println(entry.getValue() + " time(s)");
        });

    }
}