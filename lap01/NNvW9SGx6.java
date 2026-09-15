import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NNvW9SGx6 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] list = new int[3];

        for (int i = 0; i < 3; i++) {
            list[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int soma = sc.nextInt();
        list[index] += soma;

        for (int i = 0; i < 3; i++) {
            System.out.println(list[i]);
        } 
    }
}

