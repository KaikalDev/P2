import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Tv6m8WMfw {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num3 && num2 > num3) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

