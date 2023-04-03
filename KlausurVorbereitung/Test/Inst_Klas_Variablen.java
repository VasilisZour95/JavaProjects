package KlausurVorbereitung.Test;

import java.util.zip.ZipEntry;

public class Inst_Klas_Variablen {

    //instanzvariable
    private int zaehler;

    //Klassenvariable
    private static double multiplikator;

    public static void main(String[] args){

        Inst_Klas_Variablen test = new Inst_Klas_Variablen();

        //Hier geben wir einen Wert
        test.zaehler = 20;
        multiplikator = 20.20;

        // Hier geben wir die Variablen aus
        System.out.println(test.zaehler);
        System.out.println(multiplikator);

    }
}
