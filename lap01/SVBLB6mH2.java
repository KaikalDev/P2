import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class SVBLB6mH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String maior = palavra;
        String menor = palavra;
        for (int i = 0; i < 4; i ++ ) {
            palavra = sc.nextLine();
            if (palavra.length() > maior.length()) {
                maior = palavra;
            }

            if (palavra.length() < menor.length()) {
                menor = palavra;
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
