import java.util.Scanner;

public class PzOA6f22a {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int cont = 0;
        while (true) {
            int temp = sc.nextInt();
            if (temp == 0) {
                break;
            } else if (temp < 0) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}

