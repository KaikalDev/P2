import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class O74TDGIEa {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        boolean cres = true;
        boolean decres = true;

        for (int i = 0; i < 3; i++) {
            int prox = sc.nextInt();
            if (num < prox) {
                decres = false;
            } else if (num > prox) {
                cres = false;
            } else {
                decres = false;
                cres = false;
            }
            num = prox;
        }

        if (cres && decres || (!cres && !decres)) {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        } else if (cres) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else {
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        }
    }
}
