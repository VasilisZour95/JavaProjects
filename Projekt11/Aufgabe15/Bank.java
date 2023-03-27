package Projekt11.Aufgabe15;

public class Bank {
    
    private String nameOfBank;
    private double creditLimit;

    public Bank(double creditLimit){
        this.creditLimit = creditLimit;
    }

    //getter Sette

    public String getNameOfBank(){
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank){
        this.nameOfBank = nameOfBank;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }
}
