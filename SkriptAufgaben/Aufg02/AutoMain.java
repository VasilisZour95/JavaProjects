package SkriptAufgaben.Aufg02;

public class AutoMain {

    static int anzahl;
    public static void main(String[] args){

        Auto auto1 = new Auto();
        anzahl++;
        Auto auto2 = new Auto();
        anzahl++;

        auto1.hersteller = "BMW";
        auto1.ps = 350;

        auto2.hersteller = "Audi";
        auto2.ps = 450;

        System.out.println("Auto nummer 1: "+auto1.hersteller+", "+auto1.ps);
        System.out.println("Auto nummer 2: "+auto2.hersteller+", "+auto2.ps);
        System.out.println("Anzahl von Objekten: "+anzahl);

    }
    
}
