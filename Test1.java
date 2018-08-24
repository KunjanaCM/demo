import java.util.Scanner;

public class Test1 {

        private static Scanner scanner;

		public static void main(String[] args) {
            int number = 0;
            scanner = new Scanner(System.in);
            System.out.print("Please type a number OR type -1 to exit:  ");
            number = scanner.nextInt();
            while(number!=-1){
                if(number>=0 && number<=999999999){
                    if(number==0){
                        System.out.print("NUMBER AFTER CONVERSION:");
                    } else {
                        System.out.print("NUMBER AFTER CONVERSION:\t");
                        numberToWord(((number / 1000000) % 10), " HUNDRED");
                        numberToWord((number % 10000000), " ");
                    }

                }
                System.out.print("\nPlease type a number OR type -1 to exit:  ");
                number = scanner.nextInt();
            }
        }

        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
            if (num > 19) {
                System.out.print(tens[num / 100] + " " + ones[num % 100]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(val);
            }
        }
    }