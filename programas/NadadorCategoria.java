import java.util.Scanner;

public class NadadorCategoria {
    public static void main(String [] args) {
        double idade;

        Scanner ler =  new Scanner(System.in);

        System.out.println("Qual a idade do nadador?");
        idade = ler.nextDouble();

        if (idade <= 7) 
        {
        System.out.println("A categoria é Infantil");
        }

            else if (idade >= 8 & idade <= 10) 
            {
            System.out.println("A categoria é Juvenil");
            }

                else if (idade >= 11 & idade <= 15) 
                {
                System.out.println("A categoria é Adolescente");
                }

                    else if (idade >= 16 & idade <= 30) 
                    {
                    System.out.println("A categoria é Adulto");
                    }

                        else if (idade > 30) 
                        {
                        System.out.println(" A categoria é Sênior");
                        }

    }
}