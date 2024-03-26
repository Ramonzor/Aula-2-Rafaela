import java.util.*;

class NumeroDivisãoRegras {
    
    public static void main(String[] args) {
        double numero1, numero2, resultado;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite os dois números que quer dividir:");

        numero1 = ler.nextDouble();
        numero2 = ler.nextDouble();

        resultado = numero1 / numero2;

        if (resultado == 0 || numero2 == 0) {

            System.out.println("Impossível dividir");
        }
        else
        
        System.out.println("Resultado:" + resultado);
    }
    }