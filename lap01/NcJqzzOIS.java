import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NcJqzzOIS {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        
        if (palavra.length() >= 2) {
            char l1 = palavra.charAt(0);
            char l2 = palavra.charAt(1);

            if (l1 == 'p' && isVogal(l2)) {
                System.out.println("s");
            } else {
                System.out.println("n");
            }
        } else {
            System.out.println("n");
        }
    }

    public static boolean isVogal(char l) {
        return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u';
    }
}

