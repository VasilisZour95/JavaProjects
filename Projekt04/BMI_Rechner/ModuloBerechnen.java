package Projekt04.BMI_Rechner;
import java.util.Scanner;


public class ModuloBerechnen {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Geben eine Zahl ein: ");
        int zahl1 = input.nextInt();

        int nummer = Kontrolle(zahl1);

        System.out.println("Geben eine Zahl ein: ");
        int zahl2 = input.nextInt();

        int nummer2 = Kontrolle(zahl2);

        double division = (double)nummer / (double)nummer2;
        double modulo = (double)nummer % (double)nummer2;

        System.out.println("Division: "+division);
        System.out.println("Modulo: "+modulo);
        

    }

    public static int Kontrolle(int zahl){
        Scanner input1 = new Scanner(System.in);

        while (zahl == 0){
            System.out.println("Sie haben Null eingegeben, Sie müssen nicht Null eingeben");
            System.out.println("Geben Sie noch mal den Zahl ein: ");
            zahl = input1.nextInt();
        }

        return zahl;
    }
    
}
