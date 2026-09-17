import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NkQqH1INU {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        if (palavra.length() >= 5) {
            System.out.println("PALAVRA GRANDE!");   
        } else {
            System.out.println("palavrinha");   
        }
    }
}

