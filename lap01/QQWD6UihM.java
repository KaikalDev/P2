import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class QQWD6UihM {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] nums1 = sc.nextLine().split(" ");
        String[] nums2 = sc.nextLine().split(" ");

        for (int i = 0; i < nums1.length; i++) {
            int n1 = Integer.parseInt(nums1[i]);
            int n2 = Integer.parseInt(nums2[i]);

            System.out.println(n1 - n2);
        }
    }
}

