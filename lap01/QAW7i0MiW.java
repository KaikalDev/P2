import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QAW7i0MiW {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int init = Integer.parseInt(entrada[0]);
        int pulo =  Integer.parseInt(entrada[1]);
        int n = Integer.parseInt(entrada[2]);
        for (int i = 0; i < n; i++) {
            System.out.print(init + pulo * i + " ");
        }
        System.out.println();   
    }
}

