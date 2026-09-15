import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class Q9RSE5qiG {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");

        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = Integer.parseInt(nums[i]);
            if (n % 2 == 0) {
                cont += n;
            }
        }

        System.out.println(cont);   
    }
}

