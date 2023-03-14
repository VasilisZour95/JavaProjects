package Projekt06.Array;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Wie viele Zahlen möchten Sie haben?");
        int anzahl = input.nextInt();

        int[] myArray = new int[anzahl];

        System.out.println("Fügen Sie Array mit Zahlen: ");
        int num;

        for (int i = 0; i < myArray.length; i++){
            num = input.nextInt();
            myArray[i] =  num;
        }

        //Hier geben wir die Tabelle aus!
        System.out.println("ihre nummer sind: ");

        for (int j = 0; j < myArray.length; j++){
            System.out.print(myArray[j]+", ");
        }
    }
    
}
