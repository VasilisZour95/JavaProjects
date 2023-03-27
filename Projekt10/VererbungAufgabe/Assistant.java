package Projekt10.VererbungAufgabe;

public class Assistant extends Employee{

    private int hoursPerWeek;


    //Getter Setter
    public int getHoursPerWeek(){
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hpw){
        this.hoursPerWeek = hpw;
    }

    //Methode
    public Assistant(String fn, String ln, long id, int hpw){
        System.out.println("Assistant Name: "+fn+" "+ln);
        System.out.println("Assistant ID: "+id);
        System.out.println("Hours per Week: "+hpw);
    }

    public Assistant(){
        
    }


    
}
