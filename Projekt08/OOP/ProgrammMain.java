package Projekt08.OOP;
import java.util.Scanner;

public class ProgrammMain {

    public static void main(String[] args){

        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.println("Lesen Sie Wert x für Auto 1 ein: ");
        x = input.nextInt();

        System.out.println("Lesen Sie Wert y für Auto 1 ein: ");
        y = input.nextInt();

        Car car1 = new Car(x,y);
        car1.printPosition();

        //Saubere Programmierstil
        car1.drive(5,5);
        car1.printPosition();

        car1.setColor("rot");

        CarDealer carDealerNewYork = new CarDealer();
        boolean test = carDealerNewYork.colorSel(car1.getColor());
        System.out.println(test);
        
    }
    
}
