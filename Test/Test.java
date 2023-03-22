package Test;

public class Test {
    public static void main(String[] args){
        int i,j;

        String[][] myArray = new String[10][10];

        for(i = 0; i < myArray.length; i++){
            for(j = myArray.length-1; j > 0; j--){
                
                myArray[i][j] = ".";
                System.out.print(myArray[i][j]);
            }
            System.out.println("");
        }
    }
}
