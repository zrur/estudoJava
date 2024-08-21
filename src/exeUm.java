
import java.util.Locale;

public class exeUm {
    public static void main(String[] args){

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';
        //char so pode ser declarado com '' nao com ""

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234767;

        System.out.println("Products:");
        System.out.print("Computer,which price is $ ");
        System.out.printf("%.2f",price1);

        System.out.print("\nOffice desk, which price is $ ");
        System.out.printf("%.2f",price2);

        System.out.print(" \nRecord: ");
        System.out.print( age + " years old, code " + code + " and gender: " + gender );
        System.out.print("\nMeasue with eight decimal places: ");
        System.out.print(measure);
        System.out.print("\n Rouded (three decimal places): ");
        System.out.printf("%.3f",measure);

        Locale.setDefault(Locale.US);
        System.out.println("\nUS decimal point");
        System.out.printf("%.3f",measure);


    }
}




