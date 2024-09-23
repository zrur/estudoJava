import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String x;
        // x= sc.next();

        //int x;
        //x = sc.nextInt();
        //ver a configuração

        //double x;
        //x = sc.nextDouble();
        //char x;
        //x = sc.next().charAt(0);
        String x;
        int y;
        double z;

        x = sc.nextLine();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        ///oq digitou caiu na variavel x e dps apareceu na tela

        //System.out.println("Você digitou: " + x);


        sc.close();
    }
}
