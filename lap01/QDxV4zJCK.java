import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QDxV4zJCK {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int entrada1 = sc.nextInt();
        int entrada2 = sc.nextInt();
        int entrada3 = sc.nextInt();

        int cont = 0;
        if (entrada1 == entrada2) {
            cont++;
        }
        if (entrada1 == entrada3) {
            cont++;
        }
        if (cont > 0) {
            cont++;
        } else if (entrada2 == entrada3) {
            cont += 2;
        }

        System.out.println(cont);
    }
}

