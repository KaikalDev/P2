import java.util.Scanner;

public class Q795uH0vQ {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int cont = 0;
        int soma = 0;

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equals("fim")) {
                break;
            }
            int nota = Integer.parseInt(entrada.split(" ")[1]);
            soma += nota;
            cont++;
        }
        System.out.println(cont);
        System.out.println(soma / cont);
    }
}

