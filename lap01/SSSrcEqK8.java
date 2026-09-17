import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class SSSrcEqK8 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        for (int i = 0; i < 2; i++) {
            soma += sc.nextFloat();
        }
        
        double media = sc.nextFloat();
        if (soma / 2 >= media) {
            System.out.println("pass: True!");   
        } else {
            System.out.println("pass: False!");
        }
    }
}

