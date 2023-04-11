package JavaProjects.SkriptAufgaben.Aufg08b;

public class TestKinosaal {

    public static void main(String[] args){

        // Objekt Erzeugung
        Kinosaal kino1 = new Kinosaal();
        kino1.setAnzahlSitzplaetzeSaal(50);
        

        Kinosaal kino2 = new Kinosaal();
        kino2.setAnzahlSitzplaetzeSaal(100);
        
       System.out.println("Anzahl Kinosäle: "+Kinosaal.getAnzahlKinosaele());
       System.out.println("Anzahl Sitzplätze im Kino: "+Kinosaal.getAnzahlSitzplaetzeKino());
       System.out.println("Anzahl Sitzplätze im ersten Kinosaal: "+kino1.getAnzahlSitzplaetzeSaal());
       System.out.println("Anzahl Sitzplätze im zweiten Kinosall: "+kino2.getAnzahlSitzplaetzeSaal());

       kino1.setAnzahlSitzplaetzeSaal(70);
       System.out.println("Anzahl Sitzplätze im ertsten knosaal nach Änderung: "+kino1.getAnzahlSitzplaetzeSaal());
    }
}