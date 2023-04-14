package SkriptAufgaben.TryCatch01;

public class Programm {

    public static void main(String[] args){
        int zaehler = 10;
        int nenner = 0;


        try{
            int ergebnis = zaehler / nenner;
            System.out.println("Ergebnis: "+ergebnis);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
