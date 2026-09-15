import java.util.Scanner;
import java.util.Locale;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Tyr6BJWj2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double dim = sc.nextFloat();
        int qtdCafe = sc.nextInt();

        double total = dim - qtdCafe * 0.5;
        if (total < 10) {
            System.out.println("SEM COMIDA HOJE!");
        } else {
            System.out.println("PODE COMER!");
        }
    }
}

