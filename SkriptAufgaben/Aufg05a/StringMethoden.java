package SkriptAufgaben.Aufg05a;

public class StringMethoden {

    public static void main(String[] args){

        String[] myArray = new String[3];

        myArray[0] = "Vasilis ";
        myArray[1] = "Corina ";
        myArray[2] = "Polly";

        System.out.println(myArray[0].substring(0, 1) + ".");
        System.out.println(myArray[1].length());
        System.out.println(myArray[2].toUpperCase());

        System.out.println(myArray[0].concat(myArray[1]).concat(myArray[2]).toLowerCase());

    }
    
}
