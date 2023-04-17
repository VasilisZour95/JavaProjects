package SkriptAufgaben.Vererbung;

public class Animals {

    private String name;
    private String farbe;
    private double groesse;
    private double gewicht;

    Hund cavalier = new Hund(); 
    Katze chiaouaoua = new Katze();
    
    public void setInfoHund(String name, String farbe, double groesse, double gewicht){

        this.name = name;
        this.farbe = farbe;
        this.groesse = groesse;
        this.gewicht = gewicht;
        
    }

    public void setInfoKatze(String name, String farbe, double groesse, double gewicht){
        this.name = name;
        this.farbe = farbe;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }


    public Hund getHundInfos(){
        return cavalier;
    }

    public Katze getKatzeInfos(){
        return chiaouaoua;
    }

}
