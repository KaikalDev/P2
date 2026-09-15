import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NM1RJVlHE {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split("\\s+");

        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            long n = Long.parseLong(nums[i]);
            if (n % 2 == 0) {
                cont++;
            }
        }

        System.out.println(cont);   
    }
}

