import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NIGzVIuci {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;
        int qtd = 0;
        int cima = 0;
        int baixo = 0;
        
        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equals("-")) {
                break;
            }
            
            int nota = Integer.parseInt(entrada.split(" ")[1]);
            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
            if (nota >= 700) {
                cima++;
            } else {
                baixo++;
            }
            soma += nota;
            qtd++;
        }

        int media = soma / qtd;

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + cima);
        System.out.println("abaixo: " + baixo);
    }
}

