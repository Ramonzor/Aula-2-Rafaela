import java.util.*;

public class ValoresDobro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for(int i=1; i <= 5; i++) {

            System.out.println("Insira os 5 valores:");
            double valor = ler.nextDouble();
        
            System.out.println("Valor:" + valor*2);
        }
    }
}