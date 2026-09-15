import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NEvQySfxo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] key = new int[4];

        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            key[i] = n;
        }
        sc.nextLine();
        String senha = "";
        for (int i = 0; i < 4; i++) {
            String mask = sc.nextLine();
            char l = mask.charAt(key[i]);
            senha += l;
        }

        System.out.println(senha);
    }
}

