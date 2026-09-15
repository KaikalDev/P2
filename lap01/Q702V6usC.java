import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Q702V6usC {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String senha = "";
        for (int i = 0; i < 4; i++) {
            String frase = sc.nextLine();
            senha += frase.charAt(i);
        }
        System.out.println(senha);
    }
}

