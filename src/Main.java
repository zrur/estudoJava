import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double x = 10.35784;

        System.out.println(x);
        System.out.printf("%.2fn",x);
        System.out.printf("%.4fn",x);

        System.out.println("Resultado");
        //mudar a localização do

        Locale.setDefault(Locale.US);
    }
}
//concatenação
//%f = ponto flutuante
//%d = inteiro
//%s = texto
//n = quebra de linha
