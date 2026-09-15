import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class SgfzajXjU {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();

        if (pass > 10) {
            System.out.println("Passagem cara");
            System.out.println("Valor: " + pass);
        } else if (pass < 10) {
            System.out.println("Passagem barata");
            System.out.println("Valor: " + pass);
        } else {
            System.out.println("Passagem ok");
        }

        System.out.println("Obrigado!");
    }
}

