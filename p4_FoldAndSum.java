import java.util.Scanner;

/**
 * Created by Chilly on 03.04.2017 г..
 */
public class p4_FoldAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        int length = array.length;

        int [] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        int k = length / 4;
        int [] sumArray = new int[length/ 2];

        for (int i = 0; i < length / 2; i++) {
            sumArray [i] = intArray [(length / 2 - k)];
            k--;
        }

        k = length / 4;
        int [] fold = new int[length / 2];
        int [] fold1 = rotateArray(intArray, (length / 2) - k);
        int [] fold2 = new int[length / 2 - k];
        for (int i = 0; i < k; i++) {
            fold2[i] = intArray [length / 2 + k + i];
        }
        fold2 = rotateArray(fold2, length / 2 - k);
        for (int i = 0; i < k; i++) {
            fold[i] = fold1[i];
            fold[i + k] = fold2[i];
        }
        for (int i = 0; i < length / 2; i++) {
            sumArray[i] = sumArray[i] + fold[i];
        }
        for (int sums : sumArray) {
            System.out.print(sums + " ");
        }
        System.out.println();
    }
    static int [] rotateArray(int [] arrayForRotate, int length) {
        int[] rotated = new int[length];
        for (int index = 0; index < length; index++) {
            rotated[length - index - 1] = arrayForRotate[index];
        }
        return rotated;
    }
}