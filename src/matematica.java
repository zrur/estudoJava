public class matematica {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A,B,C;

        A = Math.sqrt(x);
        //a variavel A recebe a raiz quadrada de x
        B = Math.pow(x,y);
        //Variavel B recebe o resultado de x elevado a y
        C = Math.abs(x);
        //Variavel C recebe o valor absoluto de x

        System.out.println("Raiz quadrada de " + x + " = " + A);
    }

}
