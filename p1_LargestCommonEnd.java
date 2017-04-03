import java.util.Scanner;

/**
 * Created by Chilly on 01.04.2017 г..
 */
public class p1_LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String array [] = scanner.nextLine().split(" ");
        String array1 [] = scanner.nextLine().split(" ");
        int lengthMin = Math.min(array.length, array1.length);
        int lengthMax = Math.max(array.length, array1.length);
        int abs = lengthMax - lengthMin;
        int countL = 0;
        for (int left = 0; left < lengthMin; left++) {
            if (array[left].equals(array1[left])) {
                countL++;
            }
        }
        int countR = 0;
        String arrayReversed [] = new String[lengthMin];
        String array1Reversed [] = new String[lengthMin];
        int k = 0;
        for (int i = lengthMin - 1; i >= 0; i--) {
            if (array.length > array1.length) {
                arrayReversed[k] = array[i + abs];
                array1Reversed[k] = array1[i];
            } else {
                arrayReversed[k] = array[i];
                array1Reversed[k] = array1[i + abs];
            }
            k++;
        }
        for (int right = 0; right < lengthMin; right++) {
                if (arrayReversed[right].equals(array1Reversed[right])) {
                    countR++;
                }
        }
        int count = countL;
        if (countL < countR) {
            count = countR;
        }
        System.out.printf("%d", count);
    }
}