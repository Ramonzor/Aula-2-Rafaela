import java.util.*;

public class TemperaturasJaneiroBH {
    public static void main(String[] args) {

        Scanner ler = new Scanner (System.in);

        double somatemperatura = 0;    
        for (int i=0;i <= 9; i++) {

            System.out.println("Digite a temperatura:");
            double temperatura = ler.nextDouble();

            somatemperatura += temperatura;
        }

        double mediatemperatura = somatemperatura / 10;

        System.out.println("A média é:" + mediatemperatura);
    }
}