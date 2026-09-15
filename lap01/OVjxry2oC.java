import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class OVjxry2oC {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String q1 = sc.nextLine();
        String nome = "pessoa";
        if (q1.equals("s")) {
            nome = sc.nextLine();
        }

        String q2 = sc.nextLine();
        String presente = "presente";
        if (q2.equals("s")) {
            presente = sc.nextLine();
        }

        System.out.println("Oi " + nome + ", espero que goste de receber " + presente + "!");
        System.out.println("E Boas Festas!");
    }
}

