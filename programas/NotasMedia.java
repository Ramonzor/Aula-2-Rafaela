import java.util.*;

public class NotasMedia {

    public static void main(String[] args){
        double nota1,nota2, media;

        Scanner ler = new

        Scanner(System.in);

        System.out.println("Digite suas duas notas");

        nota1 = ler.nextDouble();
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7)
        {
            System.out.println("Aprovado");
        }

            else if (media <= 7)
            {
            
            System.out.println("Reprovado");
            }
        }
    }