import java.util.Scanner;
import java.io.*;

class SalarioPorcentagem {
  public static void main(String[] args) {
     double salario, boleto1, boleto2, boleto3,boleto4, total,salarioL,total2;    
		Scanner ler = new 
    Scanner(System.in);
    
     System.out.println("Digite o seu salário:");
     salario = ler.nextDouble();

		System.out.println("Digite o 1º boleto:");
		boleto1 = ler.nextDouble();

		System.out.println("Digite o 2º boleto:");
		boleto2 = ler.nextDouble();

		System.out.println("Digite o 3º boleto:");
		boleto3 = ler.nextDouble();
    
		System.out.println("Digite o 4º boleto:");
		boleto4 = ler.nextDouble();

     salarioL  = salario*0.86;
     System.out.print("Seu salário líquido será" + salarioL);

		total = boleto1+boleto2+boleto3+boleto4;
		System.out.print("O Total de suas contas será: " + total);

        total2 = salarioL - total;
        System.out.print("O seu salário restante será:" + total2);
  }
}