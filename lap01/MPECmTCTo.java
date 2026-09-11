import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class MPECmTCTo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int cont = 0;
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            if (num % 2 == 0) {
                cont += num;
            }
        } 
        System.out.println(cont);
    }
}

