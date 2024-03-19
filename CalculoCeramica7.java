import java.util.Scanner;

import java.io.*;

class CalculoCeramica7 {

  public static void main(String[] args) {

     double Valorm2,Comprimento, Largura, Area, Total;   

		  Scanner ler = new

      Scanner(System.in);

      System.out.println("Insira o comprimento, largura da cerâmica e valor do m² da ceramica, respectivamente:");
      Comprimento = ler.nextDouble();
      Largura = ler.nextDouble();
      Valorm2 =  ler.nextDouble();

      Area = (Comprimento * Largura * 0.1) + Comprimento * Largura;

      Total = Area * Valorm2;
      System.out.println("O valor do seu acabamento será:" + Total);
   
  }
}