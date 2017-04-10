import java.util.Scanner;

/**
 * Created by Chilly on 09.04.2017 г..
 */
public class p9_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char [] alphabet = {'a' , 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String input = scanner.nextLine();
        char [] charArray = input.toCharArray();
       for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j <= 25; j++) {
                if (charArray[i] == alphabet [j]) {
                    System.out.printf("%c -> %d%n", charArray[i], j);
                    break;
                }
            }
        }
    }
}