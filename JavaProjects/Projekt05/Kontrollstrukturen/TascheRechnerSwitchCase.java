package Projekt05.Kontrollstrukturen;
import java.util.Scanner;


public class TascheRechnerSwitchCase {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int zahl1;
        int zahl2;
        int button;
        int auswahl;
        boolean replay;

        do{

            System.out.println("Geben Sie zwei zahlen ein: ");

            zahl1 = input.nextInt();
            zahl2 = input.nextInt();

            System.out.println("Welche Berechnung möchten Sie?");
            System.out.println("Für addieren drücken die 1");
            System.out.println("Für substrahieren drücken  die 2");
            System.out.println("Für ültipliezieren drücken die 3");
            System.out.println("Für dividieren drücken die 4");

            button = input.nextInt();

            while (button < 1 || button > 4){
                System.out.println("False eingabe!!");
                System.out.println("Welche Berechnung möchten Sie?");
                System.out.println("Für addieren drücken die 1");
                System.out.println("Für substrahieren drücken  die 2");
                System.out.println("Für ültipliezieren drücken die 3");
                System.out.println("Für dividieren drücken die 4");

                button = input.nextInt();
            }

            SwitchCaseMethode(zahl1, zahl2, button);

            System.out.println();
        

            System.out.println("Möchten Sie nochman den Programm ausführen?");
            System.out.println("Wenn 'Ja' drüchen Sie die 1: ");
            System.out.println("Wenn 'Nein' drüchen Sie die 0: ");

            auswahl = input.nextInt();

            if (auswahl == 1){
                replay = true;
            }
            else if (auswahl == 0 ){
                System.out.println("Ende des Programms!");
                replay = false;
            }
            else{
                System.out.println("False eingabe! Abruch des Programms!!!");
                replay = false;
            }
            
        }while(replay == true);


    }


    public static void SwitchCaseMethode(int z1, int z2, int b){
        
        switch(b){
            case 1:
                System.out.println(z1 +" + " + z2 + " = " + (z1+z2));
                break;
            case 2:
                System.out.println(z1 +" - " + z2 + " = " + (z1-z2));
                break;
            case 3:
                System.out.println(z1 +" * " + z2 + " = " + (z1*z2));
                break;
            case 4:
                System.out.println(z1 +" / " + z2 + " = " + (z1/z2));
                break;        
        }
    }
}
