import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NTuCd8w7s {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        double soma = 0;
        double mult = 1;

        for (int i = 0; i < 3; i++) {
            double num = sc.nextFloat();
            soma += num;
            mult *= num;
        }

        System.out.println("Oi " + nome + "!");
        System.out.printf("%.1f%n", soma);      
        System.out.printf("%.1f%n", mult);      
    }
}

