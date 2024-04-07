import java.util.Scanner;

public class CondicaoExistenciaTriangulo {
    
    public static void main(String[] args) {
        double l1,l2,l3;

        Scanner ler = new
        Scanner(System.in);
    
        System.out.println("Digite os 3 lados do triângulo para comprovar sua existência:");

        l1 = ler.nextDouble();
        l2 = ler.nextDouble();
        l3 = ler.nextDouble();

        if (l1 < l2+l3 & l2 < l1+l3 & l3 < l1+l2)
        {
        System.out.println("Pode formar um triângulo");
        }
        
        else

        System.out.println("Impossível formar triângulo");
    }
}