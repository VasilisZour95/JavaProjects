package Projekt11.Aufgabe15;

public class Programm {
    
    public static void main(String[] args){
        //Instanz Banken

        DeutscheBank deutscheBank = new DeutscheBank(1000);
        UniCredit uniCredit = new UniCredit(2000);
        KfW kfW = new KfW(3000);
        Commerzbank commerzbank = new Commerzbank(4000);
    }
}
