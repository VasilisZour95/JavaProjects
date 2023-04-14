package SkriptAufgaben.TryCatch;

public class Programm {

    public static void main(String[] args){


        int[] myArray = new int[5];

        for(int i = 0; i < 10; i++){

            try{
                myArray[i] = i;
                System.out.println((i+1)+" = "+myArray[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println((i+1)+ " : eeeeeeee du bist weg! ");
            }
        }
    }
    
}
