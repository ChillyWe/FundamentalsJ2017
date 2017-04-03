import java.util.Scanner;

/**
 * Created by Chilly on 02.04.2017 г..
 */
public class p2_RotateAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nArray [] = scanner.nextLine().split(" ");
        int k = Integer.parseInt(scanner.nextLine());
        int length = nArray.length;

        int [] intArray = new int [length];
        for(int i = 0;i < length; i++)  {
            intArray[i]=Integer.parseInt(nArray[i]);
        }
        int [] sumArray = new int [length];
        for (int i = 0; i < k; i++) {
            int [] reversedArray = rotate(intArray, length);
            intArray = reversedArray;
            for (int j = 0; j < length; j++) {
                sumArray[j] = sumArray[j] += reversedArray[j];
            }
        }
        for (int sums : sumArray) {
            System.out.print(sums + " ");
        }
        System.out.println();
    }
    static int[] rotate(int[] intArray, int length) {
        int[] arrayToReturn = new int[intArray.length];
        arrayToReturn[0] = arrayToReturn[0] += intArray[length - 1];
        for (int j = 1; j < (length); j++) {
            arrayToReturn[j] = intArray[j -1];
        }
        return arrayToReturn;
    }
}