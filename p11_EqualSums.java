import java.util.Scanner;

/**
 * Created by Chilly on 09.04.2017 г..
 */
public class p11_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        int length = array.length;

        int [] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        for(int i = 0; i < length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for(int j = 0; j < i; j++) {
                leftSum += intArray[j];
            }
            for(int j = i + 1; j < length; j++) {
                rightSum += intArray[j];
            }
            if(leftSum == rightSum) {
                System.out.print(i);
                return;
            }
        }
        System.out.print("no");
    }
}