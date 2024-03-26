import java.util.Scanner;

public class LojinhaDoSenhorAboo {
    public static void main(String[] args) {

        double Produto, Venda, Lucro, Lucro2, Lucro3, Lucro4;
        Scanner ler = new Scanner(System.in);

                                            System.out.println("Lojinha do Sr. Aboo");

    System.out.println("Qual o valor de compra do produto?");
    Produto = ler.nextDouble();

    if (Produto<10) {

    Lucro = Produto*0.7;
    System.out.println("Você deverá vender esse produto por no mínimo:" + (Lucro+Produto) + "Reais");
    }
        else if (Produto >= 10 & Produto < 30) {

            Lucro2 = Produto*0.5;
        System.out.println("Você deverá vender esse produto por no mínimo:" + (Lucro2+Produto) + "Reais");
        }
            else if (Produto >= 30 & Produto <50) {

                Lucro3 = Produto*0.4;
            System.out.println("Você deverá vender esse produto por no mínimo:" + (Lucro3+Produto) + "Reais");
            }
                else if (Produto>= 50) {

                    Lucro4 = Produto*0.3;
                System.out.println("Você deverá vender esse produto por no mínimo:" + (Lucro4+Produto) + "Reais");
                }
}
}
