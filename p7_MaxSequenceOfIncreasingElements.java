import java.util.Scanner;

/**
 * Created by Chilly on 09.04.2017 г..
 */
public class p7_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        int length = array.length;
        int [] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        int start = intArray[0];
        int bestStart = 0;
        int len = 1;
        int bestLen = 1;
        for (int i = 0; i < length - 1; i++) {
            int currentNumber = intArray[i];
            int nextNumber = intArray [i + 1];
            if (currentNumber < nextNumber) {
                len++;
                if (len > bestLen) {
                    bestLen = len;
                    bestStart = start;
                }
            } else {
                start = nextNumber;
                len = 1;
            }
        }
        for (int i = 0; i < bestLen; i++) {
            System.out.print(bestStart + " ");
            bestStart++;
        }
    }
}