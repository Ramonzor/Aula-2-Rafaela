import java.util.Scanner;

public class NumeroMenu {
    public static void main(String[] args) {
        double n1, n2;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira os dois números:");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();

        switch (opcao) {

            case 1:
            System.out.println("Soma:" + somar(n1, n2));
            break;
        
            case 2:
            System.out.println("subtração:" + subtrair(n1, n2));
            break;

            case 3:
            System.out.println("Multiplicação:" + multiplicar(n1, n2));
            break;

            case 4:
            System.out.println("Divisão:" + dividir(n1, n2));
            break;
            
            case 5:
            System.out.println("Sair");
            break;

            default:
            System.out.println("opção inválida. Escolha novamente.:");
            break;
        }
    }
    
    scanner.close();
}
public static void exibirMenu() {
    System.out.println("Menu:");
    System.out.println("1 - Somar");
    System.out.println("2 - Subtrair");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    System.out.println("5 - Sair");
    System.out.print("Escolha uma opção: ");
}