package Projekt02.Variablen_DatenTypen;

public class StringAufgabe {

    public static void main(String[] args){
        String sentence1;
        String sentence2 = "Heute scheint dei Sonne";

        //sentence1 = sentence2;
        sentence1 = String.valueOf(sentence2);

        System.out.println(sentence1);
    }
    
}
