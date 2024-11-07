package ExerciciosUm;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         double codigoPecaUm, codigoPecaDois;
         int numeroPecasUm, numeroPecasDois;
         double precoPecaUm, precoPecaDois;

        System.out.println("Bem-vindo ao calculo de peças a pagar");

        System.out.println("Digite o codigo da primeira peça:");
        sc.nextDouble();

        System.out.println("Digite o numero de peças:");
        numeroPecasUm = sc.nextInt();

        System.out.println("Digite o preço da peça:");
        precoPecaUm = sc.nextDouble();

        System.out.println("Digite o codigo da segunda peça:");
        sc.nextDouble();

        System.out.println("Digite o numero de peças:");
        numeroPecasDois = sc.nextInt();

        System.out.println("Digite o preço da peça: ");
        precoPecaDois = sc.nextDouble();

         double valor = numeroPecasUm * precoPecaUm + numeroPecasDois * precoPecaDois;

        System.out.println("O Valor Total a ser pago é "+ valor);

    }
}
