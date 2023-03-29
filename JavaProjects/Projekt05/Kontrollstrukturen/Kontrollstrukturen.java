package Projekt05.Kontrollstrukturen;

public class Kontrollstrukturen {

    public static void main(String[] args){

        String text1 = "teilbar durch 3";
        String text2 = "teilbar durch 4";
        String text3 = "sowohl 3 als auch 4";
        
        
        for (int i = 1; i <= 100; i++){

            System.out.println(i);
            
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i+" "+text3);
            }
            else if(i % 4 == 0){
                System.out.println(i + "" +text2);
            }
            else if(i % 3 == 0){
                System.out.println(i + " "+text1);
            }
        }
    }
    
}
