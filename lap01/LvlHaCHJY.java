import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class LvlHaCHJY {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        char letra = sc.nextLine().charAt(0);
        String palavra = sc.nextLine();
        int cont = 0; 
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}

