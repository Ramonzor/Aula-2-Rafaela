import java.util.*;

public class NumerosImpares {
    public static void main(String [] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número limite para seus impares:");
        int impar = ler.nextInt();

        for (int i = 1; i <= impar;i++) {

            if (i %2 != 0)
            System.out.println(i);
        }
    }
}