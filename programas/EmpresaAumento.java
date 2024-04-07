import java.util.Scanner;

public class EmpresaAumento {
    public static void main(String[] args) {
        double salario, aumento;

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual seu salário:");
        
        salario = ler.nextDouble();

        if (salario < 1000) {

            aumento = salario * 0.3 + salario;
            System.out.println("Seu novo salário será:" + aumento + "reais");
        }
            else

            System.out.println("Você não terá direito a aumento");
}
}