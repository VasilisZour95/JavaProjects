package Projekt09.DerKonsolenwanderer;

import java.util.Scanner;

public class MainProgramm {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Field spielBereich = new Field();

        spielBereich.buildField();
        spielBereich.printField();

        Player p1 = new Player(spielBereich);
        spielBereich.printField();
    
    }
    
}
