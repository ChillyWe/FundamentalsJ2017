import java.util.Scanner;

/**
 * Created by Chilly on 07.04.2017 г..
 */
public class p5_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");
        String [] array1 = scanner.nextLine().split(" ");
        int l = array.length;
        int l1 = array1.length;
        int length = 0;
        if (l > l1) {
            length = l1;
        } else {
            length = l;
        }
        boolean equals = false;
        boolean ar = false;
        boolean ar1 = false;

       String s = "";
       for (String n:array)
           s += n;
       char [] charArray = s.toCharArray();
       String s1 = "";
       for (String n:array1)
           s1 += n;
       char [] charArray1 = s1.toCharArray();

        for (int i = 0; i < length - 1; i++) {
            if (array[i].equals(array1[i])) {
                equals = true;
            } else if (charArray[i] < charArray1[i]) {
                ar = true;
                break;
            } else if (charArray[i] > charArray1[i]) {
                ar1 = true;
                break;
            }
        }
        if (equals == true) {
            if (l < l1) {
                for (char ch : charArray) {
                    System.out.print(ch);
                }
                System.out.println();
                for (char ch : charArray1) {
                    System.out.print(ch);
                }
            } else {
                for (char ch:charArray1) {
                    System.out.print(ch);
                }
                System.out.println();
                for (char ch:charArray) {
                    System.out.print(ch);
                }
            }
        } else if (ar == true) {
            for (char ch:charArray) {
                System.out.print(ch);
            }
            System.out.println();
            for (char ch:charArray1) {
                System.out.print(ch);
            }
        } else if (ar1 == true) {
            for (char ch:charArray1) {
                System.out.print(ch);
            }
            System.out.println();
            for (char ch:charArray) {
                System.out.print(ch);
            }
        }
    }
}