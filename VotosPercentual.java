import java.util.Scanner;

public class VotosPercentual {
    
    public static void main(String[] args) {
    double Branco,BrancoTotal, Nulo, NuloTotal, Válido, VálidoTotal, TotalVotos;

    Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de votos nulos, brancos e válidos, respectivamente:");

        Branco = ler.nextDouble();
        Nulo = ler.nextDouble();
        Válido = ler.nextDouble();

        TotalVotos = Branco + Nulo + Válido;

        BrancoTotal = Branco/TotalVotos;

        System.out.printf("O total de seus votos brancos é: %.0f %% \n" ,  BrancoTotal*100);

        NuloTotal = Nulo/TotalVotos;

        System.out.printf("O total de seus votos nulos é: %.0f %% \n" ,  NuloTotal*100);

        VálidoTotal = Válido/TotalVotos;

        System.out.printf("O total de seus votos válidos é: %.0f %% \n" ,  VálidoTotal*100);
}
}