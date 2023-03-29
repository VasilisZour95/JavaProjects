package Projekt13.Expeption01;
import java.util.Scanner;


public class Heater {

    private int stufe;


    public void changeLevel() throws IlligalLevelException{

        System.out.println("Welche Stufe möchten Sie?");
        Scanner sc = new Scanner(System.in);

        stufe = sc.nextInt();


        if(stufe < 0){
            throw new IlligalLevelException();
        }
        else if(stufe > 5){
            throw new IlligalLevelException();
        }
        else{
            System.out.println("Die Heizung ist auf Stufe "+this.stufe+" Eingestellt.");
        }
        

        
    }
    
}
