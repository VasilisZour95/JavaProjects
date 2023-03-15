package Projekt08.OOP;

public class ProgrammMainTest {

    public static void main(String[] args){

        // Car Datentyp ist ein Komplexer Datentyp, weil Primitiven Datetypen enthält
        //Objekt von der Klasse Car instanziieren(erzeugt)
        CarTest car1 = new CarTest();
        car1.printPosition();
        


        car1.carBrand = "Audi";
        car1.horsepower = 300;
        car1.yearOfConstruction = 2022;
        car1.color = "Black";
        car1.xPosition = 100;
        car1.yPosition = 100;

        System.out.println("Aktuelle Position Auto 1: x = "+ car1.xPosition+" y = "+car1.yPosition);

        car1.drive(5, 5);

        car1.printPosition();

        

        CarTest car2 = new CarTest();

        car2.carBrand = "BMW";
        car2.horsepower = 320;
        car2.yearOfConstruction = 2021;
        car2.color = "Red";

        

    }
    
}
