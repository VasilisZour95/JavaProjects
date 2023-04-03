package KlausurVorbereitung.Aufgabe8;

public class UeberladenVonMehtoden {


    public static void main(String[] args) {
        
        //Methoden Überladen
        Methoden(10,10);
        Methoden("Hallo", " World!");

        //ein Objekt erstellen

        UeberladenVonMehtoden objekt1 = new UeberladenVonMehtoden();

        objekt1.MethodeOhneStatic(400, 400);
        
    }


    //Methoden Arithmentic
    public static void Methoden(int z1, int z2){
        System.out.println("Result: " + (z1*z2));
    }

    //Methode Zeichenkette
    public static void Methoden(String s1, String s2){
        System.out.println("Result: "+ s1.concat(s2));
    }

    //Wenn ich keine Static schreibe muss ich in main ein Objekt erstellen
    public void MethodeOhneStatic(int n1, int n2){
        System.out.println("Result: "+ (n1 + n2));
    }
    
}
