package ExerciciosUm;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        double A,B,C;
        double triangulo,circulo,trapezio,quadrado,retangulo;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        A = sc.nextDouble();

        System.out.println("Digite o valor de B:");
        B= sc.nextDouble();

        System.out.println("Digite o valor de C:");
        C = sc.nextDouble();

        circulo = 3.14159 * Math.pow(C,2);
        triangulo = A * C / 2;
        trapezio = (A+B) * C /2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("A área do triangulo é " + triangulo );
        System.out.println( "A área do circulo é " + circulo);
        System.out.println("A área do trapezio é " + trapezio);
        System.out.println("A área do quadrado é " + quadrado);
        System.out.println("A área do retangulo é " + retangulo);
        System.out.println("Obrigado por usar nosso Programa");


        sc.close();




    }
}
