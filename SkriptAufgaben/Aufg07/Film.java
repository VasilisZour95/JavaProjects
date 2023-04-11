package JavaProjects.SkriptAufgaben.Aufg07;

public class Film {

    private String titel;
    private String figur;
    private int jahr;

    //Konstruktoren

    public Film(String titel, String figur, int jahr){
        this.titel = titel;
        this.figur = figur;
        this.jahr = jahr;
    }

    public Film(){
        this.titel = "kein Titel";
        this.figur = "kein Figur";
        this.jahr = 0;
    }

    //Print Methode
    
    public void print(){
        System.out.println("Titel: "+this.titel);
        System.out.println("Figur: "+this.figur);
        System.out.println("Jahr: "+this.jahr);
    }
}