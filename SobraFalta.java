import java.util.Scanner;
import java.io.*;

class SobraFalta {
  public static void main(String[] args) {
     double salario, boleto1, boleto2, boleto3,boleto4, total, total2;    
		Scanner ler = new 
    Scanner(System.in);
    
    	System.out.println("Digite o valor do seu salário:");
    	salario = ler.nextDouble();

		System.out.println("Digite o 1º boleto:");
		boleto1 = ler.nextDouble();

		System.out.println("Digite o 2º boleto:");
		boleto2 = ler.nextDouble();

		System.out.println("Digite o 3º boleto:");
		boleto3 = ler.nextDouble();
    
		System.out.println("Digite o 4º boleto:");
		boleto4 = ler.nextDouble();
    
		total = boleto1+boleto2+boleto3+boleto4;
		System.out.print("O Total de Suas Contas são: " + total);

        total2 = salario-total;
        System.out.print("O valor que irá restar/faltar será:" + total2);
  }
}