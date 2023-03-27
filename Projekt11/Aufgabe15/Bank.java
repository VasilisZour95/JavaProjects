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

    //Methoden

    public void openBankAccount(Person p){
        System.out.println("Hallo Herr "+p.getLn());
        System.out.println("Sie haben Ihr Konto erfolgreich eröffnet");

        System.out.println("Name der Bank "+ this.getNameOfBank());
        System.out.println("Ihr Kontostand "+p.getMoney());
        System.out.println("Kreditlimit: "+this.getCreditLimit());
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
