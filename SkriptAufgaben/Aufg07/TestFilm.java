package JavaProjects.SkriptAufgaben.Aufg07;

public class TestFilm {

    public static void main(String[] args){

        // Objekte Implementierung

        Film film1 = new Film("Der Herr der Ringe", "Gandalf", 2001);
        Film film2 = new Film("Star Trek", "Mr. Spock", 1979);
        Film film3 = new Film();


        film1.print();
        System.out.println("--------------------------------------");
        film2.print();
        System.out.println("--------------------------------------");
        film3.print();
    }
    
}
