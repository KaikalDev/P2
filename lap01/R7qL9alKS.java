import java.util.Scanner;
import java.util.Locale;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class R7qL9alKS {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        if (!op.equals("+") &&
            !op.equals("-") &&
            !op.equals("*") &&
            !op.equals("/")) {
            System.out.println("ENTRADA INVALIDA");
            return; 
        }
        
        sc.useLocale(Locale.US);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        switch (op) {
            case "+":
                System.out.println("RESULTADO: " + (num1 + num2));
                break;
            case "-":
                System.out.println("RESULTADO: " + (num1 - num2));
                break;
            case "/":
                if (num2 == 0.0) {
                    System.out.println("ERRO");
                    break;
                }
                System.out.println("RESULTADO: " + (num1 / num2));
                break;
            case "*":
                System.out.println("RESULTADO: " + (num1 * num2));
                break;
        }
    }
}

