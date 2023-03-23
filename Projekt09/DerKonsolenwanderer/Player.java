package Projekt09.DerKonsolenwanderer;

public class Player {

    private char[] playerSign;
    private int currentRow;
    private int currentColumn;
    private int counter;


    Player(Field field){
        playerSign = new char[4];
        playerSign[0] = '^';
        playerSign[1] = '>';        
        playerSign[2] = 'v';
        playerSign[3] = '<';

        currentColumn = 3;
        currentRow = 3;
        counter = 0;

        field.getField()[currentRow][currentColumn] = playerSign[counter];

    }

    //Rotation Right

    public void rotateRight(Field field){

        if(counter == 0){
            counter = 1;
        }
        else if(counter == 1){
            counter = 2;
        }
        else if(counter == 2){
            counter = 3;
        }
        else if(counter == 3){
            counter = 0;
        }
        else{
            System.out.println("Fehler bei der Drehung nach rechts...");
        }

        field.getField()[currentRow][currentColumn] = playerSign[counter];
        field.printField();

    }

    //Rotation Left

    public void ratateLeft(Field field){
        if(counter == 0){
            counter = 3;
        }
        else if(counter == 1){
            counter = 0;
        }
        else if(counter == 2){
            counter = 1;
        }
        else if(counter == 3){
            counter = 2;
        }
        else{
            System.out.println("Fehler bei der Drehung nach links...");
        }

        field.getField()[currentRow][currentColumn] = playerSign[counter];
        field.printField();
    }


    public void goForward(Field field){

        field.getField()[currentRow][currentColumn] = ' ';
        
        if(counter == 0 && field.getField()[currentRow - 1][currentColumn] != '#' ){
            field.getField()[currentRow - 1][currentColumn] = playerSign[counter];
            currentRow -= 1;

        }
        else if (counter == 1 && field.getField()[currentRow][currentColumn + 1] != '#'){
            field.getField()[currentRow][currentColumn + 1] = playerSign[counter];
            currentColumn += 1;
        }
        else if (counter == 2 && field.getField()[currentRow + 1][currentColumn] != '#'){
            field.getField()[currentRow + 1][currentColumn] = playerSign[counter];
            currentRow += 1;
        }
        else if (counter == 3 && field.getField()[currentRow][currentColumn - 1] != '#'){
            field.getField()[currentRow][currentColumn - 1] = playerSign[counter];
            currentColumn -= 1;
        }
        else{
            System.out.println("Schritt nicht möglich");
            field.getField()[currentRow][currentColumn] = playerSign[counter];
        }

        field.printField();
    }
}
