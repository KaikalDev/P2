import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class PqhZ0T1dI {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int lisc = sc.nextInt();
        int cart = sc.nextInt();
        float bafometro = sc.nextFloat();

        if (lisc >= 30 || cart >= 30 || bafometro > 0.05f) {
            System.out.println("True");   
        } else {
            System.out.println("False");   
        }
    }
}

