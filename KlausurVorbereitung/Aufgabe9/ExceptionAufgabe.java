package KlausurVorbereitung.Aufgabe9;

public class ExceptionAufgabe {
    
    int zaehler = 10;
    int nenner = 0;


    try{
        System.out.println("Result: "+ (zaehler/nenner));
    }catch(ArithmeticException e){
        System.err.println("Probieren Sie nochmanl!"+e.getMessage());
    }
}
