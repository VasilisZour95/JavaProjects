package SkriptAufgaben.Aufg03c;

public class Durchschnittsalter {

    public static void main(String[] args){

        int anzahl1 = 4;
        int alter1 = 18;
        int anzahl2 = 2;
        int alter2 = 22;
        int anzahl3 = 3;
        int alter3 = 27;
        int anzahl4 = 1;
        int alter4 = 38;
        int anzahl5 = 1;
        int alter5 = 16;
        int anzahl6 = 7;
        int alter6 = 33;
        

        int summeAnzal = anzahl1+anzahl2+anzahl3+anzahl4+anzahl5+anzahl6;
        int summeAlter = (anzahl1 * alter1) + (anzahl2 * alter2) + (anzahl3 * alter3) + (anzahl4 * alter4) + (anzahl5 * alter5) + (anzahl6 * alter6);

        double avg = (double) summeAlter/summeAnzal;

        System.out.println(avg);
    }
}