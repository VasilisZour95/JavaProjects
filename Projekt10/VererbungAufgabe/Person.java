package Projekt10.VererbungAufgabe;

public class Person {

    private String firstName;
    private String lastName;

    // Getter und Setter

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Methode

    public Person(String fn, String ln){
        System.out.println("Firstname: "+fn);
        System.out.println("Lastname: "+ln);
    }

    public Person(){

    }



    
}