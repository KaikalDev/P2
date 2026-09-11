import java.util.Scanner;

public class Q4wuqKxnM {
    public static boolean is_vogal(char l) {
        if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String vogais = "";

        for (int i = 0; i < 5; i++) {
            String palavra = sc.nextLine();
            char ultimo = palavra.charAt(palavra.length() - 1);
            if (is_vogal(ultimo)) {
                vogais = vogais + ultimo; 
            }
        }
        System.out.println(vogais);
    }
}

