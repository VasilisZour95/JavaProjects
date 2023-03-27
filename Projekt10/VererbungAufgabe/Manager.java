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
    public Manager(String fn, String ls,long eID, int noe){
        super(fn,ln,eID);
        this.numberOfEmployees = noe;
    }

    public Manager(){
        
    }

}
