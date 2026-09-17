import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Np8sCM6Cm {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        double valor = sc.nextFloat();
        sc.nextLine();
        String metodo = sc.nextLine();
        if (metodo.equals("debito")) {
            System.out.println(valor + " REAIS NO DEBITO");   
        } else {
            String isDireto = sc.nextLine();

            if (isDireto.equals("n")) {
                System.out.println(valor + " REAIS NO CREDITO (DIRETO)");   
            } else {
                int parcelas = sc.nextInt();
                System.out.printf("%d PARCELAS DE %.1f REAIS %n", parcelas, valor / parcelas);   
            }
        }
    }
}

