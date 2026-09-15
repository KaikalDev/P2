import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Rg70ol9A8 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        if (frase.length() >= 2 &&
                Character.isDigit(frase.charAt(0)) &&
                Character.isDigit(frase.charAt(1))
        ) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

