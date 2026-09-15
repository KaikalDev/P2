import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NgD54cA0e {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int qtd = sc.nextInt();
        sc.nextLine();
        String print = "";
        for (int i = 0; i < qtd; i++) {
            String num = sc.nextLine();
            print += i + " " + num + "\n";
        }
        System.out.println(print);
    }
}

