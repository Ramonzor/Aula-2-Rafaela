import java.util.*;

public class PrefeituraFilhos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    while (true) {
        System.out.println("Informe seu salário e a quantidade total de salários que serão inseridos:");
        double salario = ler.nextDouble();
        double salariostotais = ler.nextDouble();

        if (salario <0) {
    System.out.println("Salário negativo inválido!");
    break;
}
    double totalfilhos = 0;

    for (int i= 1;i <=3; i++) {

    System.out.println("Insira quantos filhos cada pessoa tem");
    
    double nfilhos = ler.nextDouble();

    totalfilhos += nfilhos;
    }

    double mediasalarial = salario/ salariostotais;
    System.out.println("Média salárial:" + mediasalarial);
    double mediafilhos = totalfilhos / 3;
    System.out.println("Média de filhos:" + mediafilhos);
    }
}
}