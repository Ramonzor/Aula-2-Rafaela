import java.util.Scanner;
import java.io.*;

class SalarioMinimoAtual {

  public static void main(String[] args) {

     double salarioMinimo, salarioAtual, equivalencia;
     
		Scanner ler = new 
    Scanner(System.in);
    
		System.out.println("Insira o valor do salario minimo atualmente:");

		salarioMinimo = ler.nextDouble();
		
		System.out.println("Insira o valor do seu salario atualmente:");

		salarioAtual = ler.nextDouble();
		
		equivalencia =  salarioAtual / salarioMinimo;
        
		System.out.print("Seu salário vale o equivalente a:" + equivalencia);

}
}