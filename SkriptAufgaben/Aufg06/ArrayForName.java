package SkriptAufgaben.Aufg06;

public class ArrayForName {

    public static void main(String[] args){

        String[] myArray = new String[]{"Vasilis", "Corina", "Polly", "Petros", "makis"};

        for (String elemente : myArray){

            if(elemente.length() > 5 || elemente.equals('e') || elemente.equals('E')){
                System.out.println(elemente);
            }
        }
    }
}