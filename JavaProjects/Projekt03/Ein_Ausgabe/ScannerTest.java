package Projekt03.Ein_Ausgabe;
import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie Ihre Name ein:");
        String vorname = input.next();

        System.out.println("Geben Sie Ihre Nachname ein: ");
        String nachname = input.next();

        System.out.println("Wie Alt sind Sie?");
        int alter = input.nextInt();

        System.out.println("Sie heißen "+vorname+" "+nachname);
        System.out.println("Sie sind "+alter+" jahre alt");

    }
}
