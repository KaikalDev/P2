import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class QIXAfeChM {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] meses = sc.nextLine().split(" ");
        String[] valores = sc.nextLine().split(" ");

        Map<String, Integer> calendario = new HashMap<String, Integer>();
        for (int i = 0; i < meses.length; i++) {
            calendario.put(meses[i], Integer.parseInt(valores[i]));    
        }
        String mes = sc.nextLine();
        System.out.println(calendario.get(mes));   
    }
}

