import java.util.Scanner;

public class PoFnkEzvk {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        int soma = 0;
        for (String num : entrada) {
            soma += Integer.parseInt(num);
        }
        double media = soma / entrada.length;
        for (String num : entrada) {
            int n = Integer.parseInt(num);
            if (n > media) {
                System.out.print(n + " ");
            }
        }
        System.out.println();   
    }
}

