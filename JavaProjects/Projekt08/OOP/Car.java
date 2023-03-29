package Projekt08.OOP;

public class Car {

    //Oben stehen immer die Attribute (Eigenschaften einer klasse)
    private String carBrand;
    private int horsepower;
    private int yearOfConstruction;
    private String color;
    private int xPosition;
    private int yPosition;


    //Konstruktor
    Car(){
        xPosition = 100;
        yPosition = 100;
    }

    Car(int x, int y){
        xPosition = x;
        yPosition = y;
    }

    
    //Unten die Methode der Klasse

    public String getColor(){
        return color;
    }

    public int getHoursePower(){
        return horsepower;
    }

    public void setHorsePower(int hp){
        
        if(hp < 0){
            System.out.println("das kann nicht sein!");
            hp = 1;
        }
        else{
            horsepower = hp;
        }
    }

    public void setColor(String c){
        color = c;
    }



    public void drive(int x, int y){

        xPosition += x;
        yPosition += y;
        System.out.println("Das Auto ist gefahren!");

    }


    public void printPosition(){
        System.out.println("Aktuelle Position Auto 1: x = "+ xPosition+" y = "+yPosition);
    }

}
