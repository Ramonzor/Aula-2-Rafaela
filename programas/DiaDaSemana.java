import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        double dia;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o número correspondente ao dia da semana:");

        dia = ler.nextDouble();

        if (dia == 1) {

            System.out.println("O dia é segunda-feira");
        }

            else if (dia == 2) {

            System.out.println("O dia é terça-feira");
            }

                else if (dia == 3) {

                System.out.println("O dia é quarta-feira");
                }

                    else if (dia == 4) {

                    System.out.println("O dia é quinta-feira");
                    }

                        else if (dia == 5) {

                        System.out.println("O dia é sexta-feira");
                        }

                            else if (dia == 6) {

                            System.out.println("O dia é sábado");
                            }

                                else if (dia == 7) {

                                System.out.println("O dia é domingo");
                                }

                                else

                                System.out.println("Dia inválido! A semana só tem 7 dias");
                            }
}