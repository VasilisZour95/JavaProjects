package Projekt07.Methode;
import java.util.Scanner;


public class Spiel {

    public static void main(String[] args){
        int max = 1000;
		int min = 1;
		int temp;
		int numberOfAttempts = 1;
		
		Scanner sc = new Scanner(System.in);
		
		int guess = (max + min) / 2;
		
		do {
			System.out.println("Ist die gesuchte Zahl die " + guess + "?");
			
			System.out.println("Ja => Press 1");
			System.out.println("Nein, die Zahl ist kleiner => Press 2");
			System.out.println("Nein, die Zahl ist größer => Press 3");
			System.out.println("Ihre Eingabe: ");
			temp = sc.nextInt();
			
			if(temp == 1) {
				System.out.println("Yeah, du hast gewonnen!");
				System.out.println("Anzahl der benötigten Versuche: " + numberOfAttempts);
			}
			else if(temp == 2) {
				max = guess;
				guess = nextGuess(guess, max, min);
				numberOfAttempts++;
			}
			else if(temp == 3) {
				min = guess;
				guess = nextGuess(guess, max, min);
				numberOfAttempts++;
			}
			else {
				System.out.println("Falsche Eingabe");
			}
			
		} while(temp != 1);

	}
	
	
	public static int nextGuess(int guess, int max, int min) {
		guess = (max + min) / 2;
		return guess;
	}
    
}
