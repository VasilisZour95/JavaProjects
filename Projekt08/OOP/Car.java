package Projekt08.OOP;

public class Car {

    String carBrand;
    int horsepower;
    int yearOfConstruction;
    String color;

    int xPosition;
    int yPosition;

    public void drive(int x, int y){

        xPosition += x;
        yPosition += y;

    }

}
