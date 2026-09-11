import java.util.Scanner;
import java.util.ArrayList;

public class PzzmAS81Y {
    public static boolean is_ingrata(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            char l = palavra.charAt(i);
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        ArrayList<String> ingratas = new ArrayList<>();

        while (true) {
            if (ingratas.size() == 3) {
                break;
            }

            String palavra_nova = sc.nextLine();
            if (is_ingrata(palavra_nova)) {
                ingratas.add(palavra_nova);
            }
        }
        
        for (String ingrata : ingratas) {
            System.out.println(ingrata);
        }        
    }
}




