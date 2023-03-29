package Projekt13.Expeption01;


public class Programm {

    public static void main(String[] args){

        Heater test = new Heater();

        try{
            test.changeLevel(); 
        }catch(IlligalLevelException e){
            System.out.println("Heizungslevel ungültig");
        }
        
        

    }
    
}
