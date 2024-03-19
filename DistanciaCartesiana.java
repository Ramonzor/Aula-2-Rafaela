import java.util.Scanner;

import java.io.*;

class DistanciaCartesiana {

   public static void main(String[] args) {

     double Pontox1, Pontoy1, Pontox2, Pontoy2, DistanciaP1P2, XmenosX, YmenosY;
    
     Scanner ler = new

     Scanner(System.in);

     System.out.println("Insira os valores dos pontos x1,y1 e x2,y2");
     Pontox1 = ler.nextDouble();
     Pontoy1 = ler.nextDouble();
     Pontox2 = ler.nextDouble();
     Pontoy2 = ler.nextDouble();

     DistanciaP1P2 = Math.sqrt(Math.pow((Pontox1 - Pontox2), 2) + Math.pow((Pontoy1 - Pontoy2), 2));
     System.out.println("Sua distância entre os pontos é:" + DistanciaP1P2);
 }
}