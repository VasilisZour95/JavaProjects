package KlausurVorbereitung.Aufgabe9;

public class ExceptionAufgabe {
   
    public static void main(String[] args){

        //Hier initialisieren wir zwei Zahlen
        int zaehler = 10;
        int nenner = 0;

        //Hier estellen wir ein try Catch Exception
        try{    
            System.out.println("Result: "+ (zaehler/nenner));   //Hier machen wir division
        }catch(ArithmeticException e){
            System.err.println("Probieren Sie nochmanl!"+e.getMessage());   //Hier geben wir eine Message aus
        }

    }

}
