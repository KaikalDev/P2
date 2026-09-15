import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NTrqde6Ma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        if (r >= 128 && g >= 128 && b >= 128) {
            System.out.println("BRANCO");
        } else {
            System.out.println("PRETO");
        }
    }
}
