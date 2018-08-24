import java.util.*;

public class NumberToWord {
    private static Scanner s;
	public void numberToword(int n, String ch) {
        String one[] = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven",
        		" Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", 
        		"Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"
        };
        String ten[] = { "", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety"};
        if (n > 19) {
            System.out.print(ten[n / 10] + " " + one[n % 10]);
        } else {
            System.out.print(one[n]);
        }
        if (n > 0) {
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        int n = 0;
        s = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        n = s.nextInt();
        if (n <= 0) {
            System.out.print("Enter numbers greater than 0");
        } else {
            NumberToWord a = new NumberToWord();
           
            a.numberToword((n / 1000000000), " Hundred");
            a.numberToword((n / 10000000) % 100, " Crore");
            a.numberToword(((n / 100000) % 100), " Lakh");
            a.numberToword(((n / 1000) % 100), " Thousand");
            a.numberToword(((n / 100) % 10), " Hundred");
            a.numberToword((n % 100), " ");
        }
    }
}