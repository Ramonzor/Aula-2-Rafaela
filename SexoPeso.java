import java.util.*;

public class SexoPeso {
    public static void main(String [] args) {
        Scanner ler = new Scanner(System.in);
        double quantidade;
            for (int i =1;i <=10; i++) {

                System.out.println("Insira seu sexo (1 para homens, 2 para mulheres:)");
                double sexo = ler.nextInt();

                System.out.println("Digite o peso:");
                double peso = ler.nextDouble();

                if (sexo>2) {
                    System.out.println("Número inválido sexo tem que estar entre 1 e 2");
                }
            
                if (sexo== 1 && peso>=60 && peso <=80) {
                    
                    System.out.println("Quantidade de homens entre 60 e 80kg:" + quantidade);
                }
                
            }
            
    }

