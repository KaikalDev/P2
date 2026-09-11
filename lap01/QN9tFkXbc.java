import java.util.Scanner;
import java.util.Locale;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QN9tFkXbc {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
    }
}

