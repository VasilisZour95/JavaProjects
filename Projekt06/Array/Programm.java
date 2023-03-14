package Projekt06.Array;

public class Programm {

    public static void main(String[] args){
        //Spielfeld 3 x 3 => jedes Feld kann mit 1 mit 2 oder mit 3 belegt werden

        int[][] field = {{1,2,3},
                         {1,2,3},
                         {1,1,1}};

        boolean result = isSpecialArray(field);

        System.out.println("Enthält das Array in einer Zeile 3 gleiche Zahlen?\n" + result);

    }

    public static boolean isSpecialArray(int[][] field){
        int temp = 0;
        for(int i = 0; i < field.length; i++){
            if(field[i][0] == field[i][1] && field[i][0] == field[i][2]){
                temp++;
            }
        }

        if(temp > 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
