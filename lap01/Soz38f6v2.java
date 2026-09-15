import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Soz38f6v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P1 = sc.nextLine();
        String P2 = sc.nextLine();

        if (P1.charAt(0) == P2.charAt(0) && P1.charAt(P1.length() - 1) == P2.charAt(P2.length() - 1)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
