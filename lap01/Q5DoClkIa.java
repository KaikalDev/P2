import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Q5DoClkIa {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] receita = sc.nextLine().split(" ");
        String[] dispesas = sc.nextLine().split(" ");

        int cont_pos = 0;
        int cont_neg = 0;
        for (int i = 0; i < receita.length; i++) {
            int r = Integer.parseInt(receita[i]);
            int d = Integer.parseInt(dispesas[i]);
            int lucro = r - d;

            if (lucro < 0) {
                cont_neg += lucro;
            } else {
                cont_pos += lucro;
            }
        }

        System.out.println(cont_pos);
        System.out.println(cont_neg);
    }
}

