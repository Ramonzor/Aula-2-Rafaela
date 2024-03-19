import java.util.Scanner;

import java.io.*;

class RegraDeTres {

  public static void main(String[] args) {

     double Numero1, Numero2, Numero3, Regrade3;   

		Scanner ler = new

    Scanner(System.in);

        System.out.println("Insira os valores:");

        Numero1 = ler.nextDouble();

        Numero2 = ler.nextDouble();

        Numero3 = ler.nextDouble();

        Regrade3 = (Numero2 * Numero3) / Numero1;

        System.out.println("Sua incógnita da regra de 3 é:" + Regrade3);
 }
}