import java.util.Scanner;

public class PesoIdealHomemMulher {
    public static void main(String[] args) {

        double sexo,altura,pesoideal1, pesoideal2;

        Scanner ler = new

        Scanner(System.in);

        System.out.println("Digite seu sexo( 1 para homens, e 2 para mulheres) e altura(em metros)");
        
        sexo = ler.nextInt();
        altura = ler.nextDouble();

        if ( sexo == 1) 
        {
            pesoideal1 = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é:" + pesoideal1);
    }

        else if (sexo == 2)
        {
            pesoideal2 = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é:" + pesoideal2);
    }
    
        else
        System.out.println("Sexo inválido! Por favor, informe 1 para homem ou 2 para mulher.");

    }
}