import java.util.Scanner;

public class MPECmTCTo {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int cont = 0;
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            if (num % 2 == 0) {
                cont += num;
            }
        } 
        System.out.println(cont);
    }
}

