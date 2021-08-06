package homework2;
import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert value of array size and target value");
        String[] arrayParameters = scanner.nextLine().split(" ");
        int arraySize = Integer.parseInt(arrayParameters[0]);
        int targetValue = Integer.parseInt(arrayParameters[1]);
        int[] array = makeArray(arraySize);
        System.out.println(Arrays.toString(array));
        pairs(array, targetValue);
        scanner.close();
    }

        public static int[] makeArray ( int arraySize){
            int[] array = new int[arraySize];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 7 + 1);
            }
            return array;
        }

        public static void pairs(int[] array, int targetValue){
        int pairs = 0;
            for (int i = 0; i < array.length ; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if ((array[i] - array[j] == targetValue) || (array[j] - array[i] == targetValue)){
                        pairs++;
                        System.out.printf("%2d - %2d = %2d %n", array[i], array[j], targetValue);
                    }
                }
            }
            System.out.println("The number of pairs is " + pairs);
        }
}
