import java.util.Scanner;

import java.io.*;

class DownloadTempo {
    
 public static void main(String[] args) {

        double Mb, Mbps, Total;
        
        Scanner ler = new

        Scanner(System.in);

        System.out.println("Insira o tamanho do arquivo e a velocidade do link, respectivamente:");
        Mb = ler.nextDouble();
        Mbps =  ler.nextDouble();

        Total = Mb / Mbps / 60;
        System.out.println("Seu arquivo irá necessitar de:" + Total + "Minutos");
    }
}
