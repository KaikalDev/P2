import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NGi8iXnAO {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int tam = sc.nextInt();
        sc.nextLine();
        int[] soma = new int[tam];
        
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < tam; i++) {
                int num = sc.nextInt();
                soma[i] += num;
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.println(soma[i]);
        }
    }
}

