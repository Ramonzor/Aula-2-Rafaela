import java.util.Scanner;

public class IdadeClasseEleitoral {
    public static void main(String[] args) {
        double idade;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira sua idade:");
        idade = ler.nextDouble();

        if (idade < 16) {

            System.out.println("Não eleitor");
        }

            else if (idade >= 18 & idade <= 65) {

                System.out.println("Eleitor obrigatório");
            }

                else if (idade >= 16 & idade <= 17 || idade > 65) {

                    System.out.println("Eleitor facultativo");
                }
            }
        }