import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NJqdW36ci {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String tipo = sc.nextLine();
        if (tipo.equals("moto")) {
            System.out.println(5);
        } else if (tipo.equals("carro")) {
            System.out.println(10);   
        } else {
            System.out.println(30);   
        }
    }
}

