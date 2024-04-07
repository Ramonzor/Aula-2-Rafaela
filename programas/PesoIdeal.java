import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o sexo (1 para homem, 2 para mulher): ");
        int sexo = scanner.nextInt();

        System.out.println("Informe a altura em metros: ");
        double altura = scanner.nextDouble();

        double pesoIdeal;

        if (sexo == 1) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 2) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Por favor, informe 1 para homem ou 2 para mulher.");
            return;
        }

        System.out.println("O peso ideal é: " + pesoIdeal);
    }
}