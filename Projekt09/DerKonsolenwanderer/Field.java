package Projekt09.DerKonsolenwanderer;


public class Field{

    String[][] myArray = new String[10][10];

    int i,j;
    
    public void printMethode(){

        for ( i = 0; i < myArray.length; i++){
            //System.out.println(i);

            if(i == 0 || i == myArray.length -1){
                for(j = 0; j < myArray.length; j++){
                    //System.out.print(j);
                    myArray[i][j] = "#";
                    System.out.print(myArray[i][j]);
                    
                }
            }
            else if (i != 0 && i != myArray.length -1){

                //kolona arxi 
                myArray[i][myArray.length-1] = "-";

                System.out.print(myArray[i][myArray.length-1]);

            }
            
            System.out.print("\n");
        }
    }

    
    
}
