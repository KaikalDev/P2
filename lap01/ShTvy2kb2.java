import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class ShTvy2kb2 {
    public static String gera_dados(String[] entrada) {
        int soma = 0;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;

        for (String num : entrada) {
            int n = Integer.parseInt(num);
            if (n < menor) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }
            soma += n;
        }
        return soma + " " + menor + " " + maior;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String[] entrada = sc.nextLine().split(" ");
            System.out.println(gera_dados(entrada));
        }
    }
}

