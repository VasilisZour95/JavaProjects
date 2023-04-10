package SkriptAufgaben.Aufg04;

public class StringBufferCode {

    public static void main(String[] args){

        StringBuffer sb1 = new StringBuffer("Super Java");
        StringBuffer sb2 = new StringBuffer("30");
        StringBuffer sb3 = new StringBuffer(sb1);

        System.out.println(sb3);

        int summe = 20 + Integer.parseInt(sb2.toString());

        System.out.println(summe);

        sb2 = new StringBuffer(sb2.toString()+" Grag warmes Wasser");
        sb3 = new StringBuffer(sb2);

        System.out.println(sb3);


    }
    
}
