import java.util.Scanner;

public class OccurancesOfLettersInWords
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		String sentence;
		System.out.println("Enter a sentence:");
		sentence = myScanner.nextLine();
   		String[] sentceComp = sentence.split(" ");
   		System.out.println(sentceComp.length);
   		for (int i = 0; i < sentceComp.length; i++)
   		{
   			System.out.println("The word \"" + sentceComp[i] + "\" in the input sentence has " + sentceComp[i].length() + " chars");
       
   		}
	}
}
