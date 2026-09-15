import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NjAy49WbI {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        char l = palavra.charAt(palavra.length() - 1);
        if (l == 'S' || l == 's') {
            System.out.println("TALVEZ PLURAL");
        } else {
            System.out.println("TALVEZ SINGULAR");
        }
    }
}

