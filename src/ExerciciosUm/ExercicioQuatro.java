package ExerciciosUm;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        int numero;
        double horasTrabalhadas,valorHora;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao calculo de salario liquido!");
        System.out.println("Digite o numero do funcionario:");
        numero = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor que recebe por hora:");
        valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("O teu Salário é "+ salario);

        sc.close();


    }
}
