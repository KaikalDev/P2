import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class SlfR6pBmC {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equals("wally")) {
                break;
            }

            String[] nomes = entrada.split(" ");
            String possivel_nome = "?";
            for (String nome : nomes) {
                if (nome.length() == 5) {
                    possivel_nome = nome;
                }
            }

            System.out.println(possivel_nome);
        }
    }
}

