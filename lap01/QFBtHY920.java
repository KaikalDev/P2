import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QFBtHY920 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int tam = sc.nextInt();
        int[] list = new int[tam];

        for (int i = 0; i < tam; i++) {
            int n = sc.nextInt();
            list[i] = n;
        }

        int index = sc.nextInt();
        System.out.println(list[index]);
    }
}

