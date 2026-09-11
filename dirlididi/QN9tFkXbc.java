import java.util.Scanner;
import java.util.Locale;

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

