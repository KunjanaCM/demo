import java.util.Scanner;

public class OccurenceOfCharacters {
	private static Scanner scan = null;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str = null;
		System.out.println("Enter String : ");
		str = scan.nextLine();//reads the input
		str = str.replaceAll(" ","");//not consider the space
		int length = str.length();
		System.out.println(length);
		int count[] = new int[255];
	    for (int i = 0; i < length; i++) 
		{
			count[str.charAt(i)]++;
		}
		char ch[] = new char[str.length()];
		for (int i = 0; i < length; i++) 
		{
			int find = 0;
			ch[i] = str.charAt(i);
		    for (int j = 0; j <= i; j++) 
			{
				if (str.charAt(i) == ch[j])
					find++;
			}
 			if (find == 1) 
			{
				System.out.println("Number of Occurrence of " + str.charAt(i) + " letter is:" + count[str.charAt(i)]);
			}
		}
	}
}