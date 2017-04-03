import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Chilly on 01.04.2017 г..
 */
public class p1_NakovBook207 {
    public static void main(String[] args) {
        int numbersX5 [] = new int[20];

        for (int i = 0; i < 20; i++) {
            numbersX5 [i] = i * 5;
            System.out.print(numbersX5[i] + " ");
        }
    }
}