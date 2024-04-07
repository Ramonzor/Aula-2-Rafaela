import java.util.*;

public class MaiorMenorIgual {
    
    public static void main(String[] args){
        double numero1, numero2;

        Scanner ler = new

        Scanner(System.in);

        System.out.println("Digite o primeiro e segundo número ordenadamente:");

        numero1 = ler.nextDouble();
        numero2 = ler.nextDouble();

        if (numero1>numero2) {
            
            System.out.println("Maior:" + numero1);
            System.out.println("Menor:" + numero2);
        }
            
            else if(numero2>numero1) {
                System.out.println("Maior" + numero2);
                System.out.println("Menor" + numero1);
            }
            else
            System.out.println("Os números são iguais");
        }
    }