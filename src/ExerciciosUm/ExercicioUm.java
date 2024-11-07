package ExerciciosUm;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma;
        int y ;
        int x ;

        System.out.println("Digite os números correspondentes");
        x = sc.nextInt();
        y = sc.nextInt();

        soma = x + y;

        System.out.println("A soma dos números é: ");
        System.out.println(soma);
    }
}
