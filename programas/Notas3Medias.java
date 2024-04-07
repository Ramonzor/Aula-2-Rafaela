import java.util.Scanner;

public class Notas3Medias {
    public static void main(String[] args) {
        double n1,n2,n3,media;

        Scanner ler = new
        Scanner(System.in);

        System.out.println("Digite suas 3 notas:");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 0 & media < 3) {

            System.out.println("Reprovado");
        }
        else if (media >= 3 & media <7 ) {

            System.out.println("Exame");
        }

            else

            System.out.println(" Aprovado");
    }
}