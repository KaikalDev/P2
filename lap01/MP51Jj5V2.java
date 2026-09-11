import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class MP51Jj5V2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        String[] entrada = sc.nextLine().split(" ");
        for (String num : entrada) {
            int n = Integer.parseInt(num);
            if (n > maior1) {
                maior2 = maior1;
                maior1 = n;
            } else if (n > maior2) {
                maior2 = n;
            }
        }

        System.out.println(maior1 + maior2);
    }
}

