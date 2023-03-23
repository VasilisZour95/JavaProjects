package Projekt09.DerKonsolenwanderer;


public class Field{

    String[][] myArray = new String[10][10];

    int i,j;
    
    public void printTabelle(){

        for (i = 0; i < myArray.length; i++){
            for(j = 0; j < myArray.length; j++){
                if(i == 0 || i == myArray.length - 1 || j == 0 || j == myArray.length - 1){
                    myArray[i][j] = "#";
                }
                else{
                    myArray[i][j] = " ";
                }
            }
        }

        for (i = 0; i < myArray.length; i++){
            for(j=0; j < myArray.length; j++){
                System.out.print(myArray[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }

    
    
}
