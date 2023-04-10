package SkriptAufgaben.Aufg03;

public class arrayDeklaration {

    public static void main(String[] args){
        byte[] myArray = new byte[3];

        myArray[0] = 1;
        myArray[1] = 40;
        myArray[2] = 23;


        for(int i = 0; i < myArray.length; i++){
            System.out.println((i+1)+"= "+myArray[i]);
        }

    }

    
    
}
