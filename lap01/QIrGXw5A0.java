import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QIrGXw5A0 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        if (palavra.length() >= 1 && Character.isDigit(palavra.charAt(0))) {
            System.out.println("N");
        } else {
            System.out.println("S");
        }
    }
}

