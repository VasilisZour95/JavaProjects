package Projekt10.VererbungAufgabe;

public class Manager extends Employee{

    private int numberOfEmployees;

    //Getter und Setter

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int noe){
        this.numberOfEmployees = noe;
    }


    //Methoden/Konstruktoren
    public Manager(){
        numberOfEmployees++;
    }

    public void Print(String fn, String ls, ){
        System.out.println("First name: "+fn);
        System.out.println("Last Name: "+ln);
        System.out.println("Number of Employee :"+noe++);
    }

    /*public Manager(){
        
    }*/

}
