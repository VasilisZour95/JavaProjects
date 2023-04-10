package SkriptAufgaben.Aufg05b;

public class MethodenString {

    public static void main(String[] args){

        String pfad = "C:\\Eigene Dateien\\Javatest\\Beispiel.java";

        System.out.println("Extension: "+pfad.substring(36, 40));
        System.out.println("Dateiname: "+pfad.substring(27, 35));
        System.out.println("Verzeichnis: "+pfad.substring(0, 26));

    }
    
}
