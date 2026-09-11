import java.util.Scanner;

public class MRcS7IuiO {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int maior = num;
	int menor = num;

	for (int i = 0; i < 4; i++) {
	    num = sc.nextInt();
	    if (num < menor) {
		menor = num;
	    }
	    if (num > maior) {
		maior = num;
	    }
	}

	System.out.println(maior - menor);
    }
}

