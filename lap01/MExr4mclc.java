import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class MExr4mclc {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        char letra = sc.nextLine().charAt(0);
        String palavra = sc.nextLine();
        int index = -1; 
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == letra) {
                index = i;
            }
        }
        System.out.println(index);
    }
}

