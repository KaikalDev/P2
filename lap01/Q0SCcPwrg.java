import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Q0SCcPwrg {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String palavra = sc.nextLine();
            if (palavra.charAt(0) == 'a') {
                System.out.println("s");
            } else {
                System.out.println("n");
            }
        }
    }
}

