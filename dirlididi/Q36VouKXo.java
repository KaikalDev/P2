import java.util.Scanner;

public class Q36VouKXo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int altura_ideal = sc.nextInt();
        int altura_atual = sc.nextInt();
        int dif = Math.abs(altura_atual - altura_ideal);
        while (true) {
            altura_atual = sc.nextInt();
            int dif_atual = Math.abs(altura_atual - altura_ideal);
            if (altura_atual == altura_ideal) {
                System.out.println("OK");
                break;
            }
            
            if (dif_atual >= dif) {
                System.out.println("PERIGO");
            } else {
                System.out.println("ADEQUADO"); 
            }
            dif = dif_atual;
        }
    }
}

