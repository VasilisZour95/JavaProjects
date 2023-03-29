package Projekt09.DerKonsolenwanderer;
import java.util.Scanner;

public class MainProgramm {

    public static void main(String[] args){

        Field spielBereich = new Field();
        spielBereich.buildField();

        Player p1 = new Player(spielBereich);        
        
        String decision;
        int temp = 0;

        Scanner input = new Scanner(System.in);

        

        while (temp == 0){

            System.out.println("Führen Sie eine Aktion (g = vorwärts gehen, l = links drehen, r = rechts drehen, q = beenden) aus: ");
            decision = input.next();

            switch(decision){
                case "g":
                    p1.goForward(spielBereich);
                    break;
                case "r":
                    p1.rotateRight(spielBereich);
                    break;
                case "l":
                    p1.ratateLeft(spielBereich);
                    break;
                case "q":
                    temp = 1;
                    System.out.println("Das Programm wurde beendet!");
                    break;
                default:
                    System.out.println("sie haben eine falshe Taste gedrückt!");
                    break;
            }
        }
    }
    
}
