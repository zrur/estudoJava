package ExerciciosUm;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A,B,C,D;

        System.out.println("Digite os valores correspondentes:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = (A*B - C*D);

        System.out.println("A Diferença entre os produtos é "+ diferenca);


        sc.close();
    }
}
