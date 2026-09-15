import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class NKRdmLuj2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] list1 = new int[4];
        int[] list2 = new int[4];
    
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            list1[i] = n;
        }
        for (int i = 0; i < 4; i++) {
            int n = sc.nextInt();
            list2[i] = n;
        }
        int index = sc.nextInt();
        System.out.println(list1[index] + list2[index]);
    }
}

