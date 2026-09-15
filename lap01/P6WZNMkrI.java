import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class P6WZNMkrI {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int valorInicial = sc.nextInt();
        int valorTotal = sc.nextInt();
        int parcelas = sc.nextInt();

        int parcela = (valorTotal - valorInicial) / parcelas;

        if (parcela >= 1000) {
            System.out.println("ALTO (" + parcela + ")");
        } else {
            System.out.println("BAIXO (" + parcela + ")");
        }
    }
}

