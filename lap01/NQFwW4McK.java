import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NQFwW4McK {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] list = new int[5];

        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int valor = sc.nextInt();
        list[index] = valor;

        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);
        }
    }
}

