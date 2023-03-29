package Projekt04.BMI_Rechner;
import java.util.Scanner;

public class BerechnungBMI {

    public static void main(String[] args){
        //Hier erzeugen wir den Scanner
        Scanner input = new Scanner(System.in);


        //Fragen Wir den Nutzer für seine Daten

        System.out.println("Geben Sie bitte Ihres Gewicht ein: ");
        double gewicht = input.nextDouble();

        System.out.println(".. und Ihre Große in Metern ein: ");
        double grosse = input.nextDouble();

        //hier rufen wir die Methode an
        double result = BerechnungMethode(gewicht,grosse);

        //Hier rufen wir Adipositas Methode
        Adipositas((int)result);

        
    }

    //hier ist die Berechnungmethode
    public static double BerechnungMethode(double gewichtCopy, double grosseCopy){

        double bmi = gewichtCopy / (grosseCopy * grosseCopy);

        return bmi;

    }

    //Berechnung Adipositas
    public static void Adipositas(int result){

        if (result > 30){
            System.out.println("BMI ist "+result);
            System.out.println("Du brauchst Diet!!");
        }
        else if (result >= 18.5 || result <=24.9){
            System.out.println("BMI ist "+result);
            System.out.println("Du kannst Gyros essen!!");
        }
        else if(result >=25 || result <= 29.9){
            System.out.println("BMI ist "+result);
            System.out.println("Du brauchst Diet!!");
        }
        else{
            System.out.println("False eingabe!");
        }

    }
    
}
