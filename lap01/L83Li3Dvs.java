import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Kaique - 20260011498
 */
public class L83Li3Dvs {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        System.out.println(list[index]);
    }
}

