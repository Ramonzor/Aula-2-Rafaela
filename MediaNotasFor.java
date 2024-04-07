import java.util.Scanner;

public class MediaNotasFor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            while (true) {
                System.out.println("Informe sua matrícula");
                double matricula = ler.nextDouble();

                if (matricula <0) {
            System.out.println("Matrícula negativa inválida!");
            break;
        }

         double somatotal = 0;

        for (int i = 1;i <= 3; i++) {
            

            System.out.println("Informe suas 3 notas, respectivamente:");

            double nota = ler.nextDouble();

            somatotal += nota;
        }

        double media = somatotal / 3;

        if (media >=70) {
            System.out.println("Aprovado!");
        } else if (media >=60) {
            System.out.println("Exame!");
        } else if (media <60) {
            System.out.println("Reprovado!");
        }
    }
}
}