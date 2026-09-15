import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class LGRuJsN1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        if (p1.length() > p2.length()) {
            System.out.println(p2);
            System.out.println(p1);
        } else if (p2.length() > p1.length()) {
            System.out.println(p1);
            System.out.println(p2);
        } else {
            System.out.println(p1);
            System.out.println(p1);
        }
    }
}
