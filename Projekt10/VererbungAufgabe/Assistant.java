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
    public Assistant(String fn, String ln, long eID, int hpw){
        super(fn,ln,eID);
        this.hoursPerWeek = hpw;
    }

    public Assistant(){
        
    }


    
}
