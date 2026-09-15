import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class SyzD4CAQC {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] palavras1 = sc.nextLine().split(" ");
        String[] palavras2 = sc.nextLine().split(" ");

        for (int i = 0; i < palavras1.length; i++) {
            System.out.println(palavras1[i] + " " + palavras2[i]);
        }
    }
}

