import java.util.Arrays;

public class ProblemInArray{

    public static void main(String args[]) {
        int[] numbers = { 2, 4, 3, 7, 7, 5, 9 };
        int[] numbers1 ={ 12, 14, 17, 15, 19, 20,-11};
       
        prettyPrint(numbers, 14);
        prettyPrint(numbers1, 26);
    }

    public static void printPairs(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];

                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }

        }
    }
   
    public static void prettyPrint(int[] givenArray, int givenSum){
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
       
        printPairs(givenArray, givenSum);
    }

}