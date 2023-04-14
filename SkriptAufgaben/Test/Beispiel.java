package SkriptAufgaben.Test;

public class Beispiel {

    //Instanzvariablen
    int myIstanzVariable;

    String myInstantStringVariable;

    //Klassenvariablen
    static double myKlassenVariable;


    public static void main(String[] args){
        Beispiel obj1 = new Beispiel();
        Beispiel obj2 = new Beispiel();


        obj1.myIstanzVariable = 20;
        

        myKlassenVariable = 2.2;


        System.out.println("Objekt 1: "+obj1.myIstanzVariable);         // 20

        System.out.println("Objekt 2: "+obj2.myInstantStringVariable);  // null

        System.out.println("Klassen Variablen: "+Beispiel.myKlassenVariable);   //2.2
        
        /*
         * Man kann auch einfach myKlassenVariable schreiben, dass funktioniert !!
         */

    }
    
}
