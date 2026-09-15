import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NDUgYIb8i {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println((i + 1) + ": " + palavra.charAt(i));
        }
    }
}

