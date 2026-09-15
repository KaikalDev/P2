import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class PxHb44qWm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P1 = sc.nextInt();
        int V1 = sc.nextInt();
        int P2 = sc.nextInt();
        int V2 = sc.nextInt();
        int tempo = sc.nextInt();

        int DF1 = P1 + (V1 * tempo);
        int DF2 = P2 + (V2 * tempo);

        System.out.println(Math.abs(DF1 - DF2));
    }
}
