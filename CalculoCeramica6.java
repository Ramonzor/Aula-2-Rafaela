import java.util.Scanner;

import java.io.*;

class CalculoCeramica6 {

  public static void main(String[] args) {

     double Comprimento, Largura, Area, Total;   

		Scanner ler = new

    Scanner(System.in);

    System.out.println("Insira o comprimento e largura da cerâmica, respectivamente:");
    Comprimento = ler.nextDouble();
    Largura = ler.nextDouble();

    Area = (Comprimento * Largura * 0.1) + Comprimento * Largura;

    Total = Area;
    System.out.println("Seu acabamento medirá:" + Total);
    
}
}