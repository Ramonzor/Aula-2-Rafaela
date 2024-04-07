import java.util.Scanner; import java.io.*;

class SalarioAReceber { public static void main(String[] args) { 
    
    double salario,total,total2;

    Scanner ler = new Scanner(System.in);

	System.out.println("Digite seu salário base:");

	salario = ler.nextDouble();

    total = salario*0.1;

    total2 = (salario-total) + 50;

    System.out.print("Seu salario a receber será:" + total2); 

}
}