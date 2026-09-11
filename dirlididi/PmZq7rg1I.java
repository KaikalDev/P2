import java.util.Scanner;

public class PmZq7rg1I {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (true) {
            int chute = sc.nextInt();
            if (num == chute) {
                System.out.println("ACERTOU");
                break;
            } else if (chute > num) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
        }
    }
}

