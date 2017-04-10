import java.util.Scanner;

/**
 * Created by Chilly on 09.04.2017 г..
 */
public class p10_PairsByDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int differenceBy = Integer.parseInt(scanner.nextLine());
        int length = array.length;

        int [] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            int currentNumber = intArray[i];
            for (int j = i; j < length; j++) {
                if (Math.abs(currentNumber - intArray[j]) == differenceBy) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}