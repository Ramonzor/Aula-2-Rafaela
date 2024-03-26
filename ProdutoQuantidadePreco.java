import java.util.Scanner;

public class ProdutoQuantidadePreco {
    
    public static void main(String[] args) {
        double Quantidade,Preço, total,t1 ,t2, t3, t4;

        Scanner produto = new Scanner(System.in);

        System.out.println("Informe a quantidade adquirida, e o preço por unidade do produto, por favor:");

        Quantidade = produto.nextDouble();
        Preço = produto.nextDouble();

        total = Quantidade* Preço;

        if (Quantidade <= 5) {

            t1 = (total*0.2)/10;
            
            System.out.println("caso leve 5 produtos ou menos você pagará:" + (total-t1) );
        }
            else if (Quantidade>5 & Quantidade<=10) {

            t2 = (total*0.3)/10;
            System.out.println("caso leve entre 6 e 10 produtos você pagará:" + (total-t2));
        }
                else if (Quantidade>10 & Quantidade<30) {

                t3 = (total*0.5)/10;
                System.out.println("caso leve entre 11 e 29 produtos você pagará:" + (total-t3));
    }
                    else if (Quantidade >= 30) {

                    t4 = (total*0.10)/10;
                    System.out.println("Você terá o desconto a partir de 30 produtos ou mais de:" + (total-t4));
}
    }
}
