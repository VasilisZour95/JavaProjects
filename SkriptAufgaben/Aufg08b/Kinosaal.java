package JavaProjects.SkriptAufgaben.Aufg08b;

public class Kinosaal {

    //Instanzvariablen
    private int saalNummer;
    private int anzahlSitzplaetzeSaal;

    //Klassenvariablen
    private static int anzahlSitzplaetzeKino;
    private static int anzahlKinosaele;

    // Konstruktor
    public Kinosaal(){
        anzahlKinosaele++;
        saalNummer = anzahlKinosaele;
    }

    // Setter und Getter
    public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal){
        anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal - this.anzahlSitzplaetzeSaal;
        this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
        anzahlSitzplaetzeKino += anzahlSitzplaetzeSaal;
    }

    public int getAnzahlSitzplaetzeSaal(){
        return anzahlSitzplaetzeSaal;

    }

    public static int getAnzahlSitzplaetzeKino(){
        return anzahlSitzplaetzeKino;
    }


    public static int getAnzahlKinosaele(){
        return anzahlKinosaele;
    }
}