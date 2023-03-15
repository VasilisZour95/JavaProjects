package Projekt08.OOP;

public class CarTest {

    //Oben stehen immer die Attribute (Eigenschaften einer klasse)
    String carBrand;
    int horsepower;
    int yearOfConstruction;
    String color;

    int xPosition;
    int yPosition;


    //Konstruktor

    CarTest(){
        xPosition = 100;
        yPosition = 100;
    }


    //Unten die Methode der Klasse
    public void drive(int x, int y){

        xPosition += x;
        yPosition += y;

    }


    public void printPosition(){
        System.out.println("Aktuelle Position Auto 1: x = "+ xPosition+" y = "+yPosition);
    }

}
