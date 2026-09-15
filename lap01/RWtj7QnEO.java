import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class RWtj7QnEO {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            String palavra = sc.nextLine();
            char l = palavra.charAt(0);
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                cont++;
            }
        }

        System.out.println(cont);
    }
}

