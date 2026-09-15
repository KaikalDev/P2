import java.util.Scanner;
import java.util.Locale;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QGl8F3JGy {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float pAlcool = sc.nextFloat();
        float pGasolina = sc.nextFloat();
        int litros = sc.nextInt();

        if (pAlcool * litros >= pGasolina * 0.7 * litros) {
            System.out.printf(Locale.US, "%.1f%n", pGasolina * litros);
        } else {
            System.out.printf(Locale.US, "%.1f%n", pAlcool * litros);
        }
    }
}

