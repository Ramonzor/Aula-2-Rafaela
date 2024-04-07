import java.util.Scanner;

public class PesoIMC {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual seu peso e altura, respectivamente:");

        peso = ler.nextDouble();
        altura = ler.nextDouble();
        
        imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            
            System.out.println("Abaixo do peso");
        }

            else if (imc >= 20 & imc < 24) {

                System.out.println("Peso Normal");
            }

                else if (imc >= 25 & imc < 29) {

                    System.out.println(" Sobre Peso");
                }

                    else if (imc >= 30 & imc <39) {

                    System.out.println("Obeso");
                    }

                        else if (imc >= 40) {

                        System.out.println("Obeso Mórbido");
                        }
    
                    }
                }