package SkriptAufgaben.Aufg03a;

public class Programm {

    public static void main(String[] args){

        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Auto a3 = new Auto();

        Auto[] myArray = new Auto[3];


        a1.setHerstellernamen("BMW");
        a1.setPs(250);

        a2.setHerstellernamen("Audi");
        a2.setPs(333);

        a3.setHerstellernamen("Mercedes");
        a3.setPs(450);

        myArray[0] = a1;
        myArray[1] = a2;
        myArray[2] = a3;

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Objekt nummer "+(i+1)+" name = "+myArray[i].getHerstellernamen()+", "+" PS = "+myArray[i].getPs());
        }
    } 
}