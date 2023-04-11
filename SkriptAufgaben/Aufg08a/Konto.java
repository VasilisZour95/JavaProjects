package JavaProjects.SkriptAufgaben.Aufg08a;


public class Konto{

    private Person person;
    private double kontostand;
   
    public Konto (String name,String vorname,double kontostand){
      
        person = new Person(name, vorname);
        this.kontostand = kontostand;
    }

    public void setPersonenInfos(String name, String vorname){
        person.setName(name);
        person.setName(vorname);
    }

    public double getKontostand(){
        return kontostand;
    }

    public Person getPersonenInfos(){
        return person;
    }
   
}
