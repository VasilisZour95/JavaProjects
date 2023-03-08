package Projekt02.Variablen_DatenTypen;
import java.util.Scanner;

public class Person {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String name;
        double gewicht;
        int age;

        System.out.println("Geben Sie Ihre Daten ein");
        System.err.println("Name: ");
        name = input.next();

        System.out.println("Alter: ");
        age = input.nextInt();

        System.out.println("Gewicht: ");
        gewicht = input.nextDouble();

        System.out.println("Ihre Daten sind: "+name+"-"+age+"-"+gewicht);

    }
    
}
