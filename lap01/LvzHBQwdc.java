import java.util.Scanner;
import java.util.Map;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class LvzHBQwdc {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Map<Character, Integer> vogais = Map.of(
                'I', 1,
                'O', 2,
                'U', 3,
                'E', 4,
                'A', 5);
        String palavra = sc.nextLine();
        char xplot = 'I';
        for (char l : palavra.toCharArray()) {
            if (vogais.containsKey(l) && vogais.get(l) > vogais.get(xplot)) {
                xplot = l;
            }        
        }
        System.out.println(xplot);
    }
}

