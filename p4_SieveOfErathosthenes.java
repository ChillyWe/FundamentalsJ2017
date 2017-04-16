import java.util.Scanner;

/**
 * Created by Chilly on 16.04.2017 г..
 */
public class p4_SieveOfErathosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        erathosthenes(n);
    }
    static int erathosthenes (int n) {
        boolean [] arrayB = new boolean[n + 1];
    //    arrayB[0] = arrayB[1] = false;
        for (int i = 2; i <= n; i++) {
            arrayB[i] = true;
        }
        for (int p = 2; p <= n; p++) {
            if (arrayB[p] == true) {
                System.out.print(p + " ");
                for (int i = 0; i <= n; i++) {
                    if (i * p <= n && i * p >= 0) {
                        arrayB[i * p] = false;
                    }
                }
            }
        }
        return 0;
    }
}