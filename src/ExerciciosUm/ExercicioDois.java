package ExerciciosUm;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double π = 3.14159;
        double raio;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();// Lê o valor do raio digitado pelo usuário

        double area = π * Math.pow (raio,2);

        System.out.printf("A área do círculo é: %.4f%n" , area);

        sc.close();
    }
}
