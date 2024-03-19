import java.util.Scanner;

import java.io.*;

class Fracao {

    public static void main(String[] args) {
         double Denominador1, Numerador1, Denominador2, Numerador2, SomaDenominador, SomaNumerador ;

         Scanner ler = new

         Scanner(System.in);

         System.out.println("Insira os denominadores e númerados da primeira e segunda fração, respectivamente:");
         Denominador1 = ler.nextDouble();
         Numerador1 = ler.nextDouble();
         Denominador2 = ler.nextDouble();
         Numerador2 = ler.nextDouble();

         SomaDenominador =  Denominador1 + Denominador2;
         SomaNumerador =  Numerador1 + Numerador2;

         System.out.println("A soma de sua fração é igual á:" + SomaDenominador + "/" + SomaNumerador);
    }
}