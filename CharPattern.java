public class CharPattern
{

 	public static void main(String[] args)
	{
 		char ch = 'A';
		int i, j, k;
		for (i = 1; i <= 4; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(ch);
				ch++;
			}
			for (k = 5; k >= j; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}