import java.util.Scanner;

import java.io.*;

class EquipamentoKWhMensal {

   public static void main(String[] args) {

     double Consumo, PotenciaW, HorasDia, ValorKWh, Gasto, Total;
    
     Scanner ler = new

     Scanner(System.in);

     System.out.println("Insira a potência do equipamento e a quantia de horas que ele fica ligado e o valor do KW/h, respectivamente:");

     PotenciaW = ler.nextDouble();
     HorasDia =  ler.nextDouble();
     ValorKWh = ler.nextDouble();

     Consumo = (PotenciaW * HorasDia) / 1000;
     Gasto = (PotenciaW * HorasDia) / 1000 * ValorKWh;
     Total =  Gasto * 30;

     System.out.println("Você consumirá:" + Consumo + "KWh" + ", e pagará:" + Total + "Por mês.");

 }
}