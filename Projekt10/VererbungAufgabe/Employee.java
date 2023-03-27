package Projekt10.VererbungAufgabe;

public class Employee extends Person{

    private long employeeID;


    //Getter und Setter
    public long getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(long eID){
        this.employeeID = eID;
    }

    //Methode

    public Employee(String fn, String ln,long eID){
        super(fn,ln);
        this.employeeID = eID;
    }

    public Employee(){
        
    }
    
}
