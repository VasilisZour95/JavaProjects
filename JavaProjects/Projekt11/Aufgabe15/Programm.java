package Projekt11.Aufgabe15;

public class Programm {
    
    public static void main(String[] args){
        
        
        //Instanz Banken
        DeutscheBank deutscheBank = new DeutscheBank(1000);
        UniCredit uniCredit = new UniCredit(2000);
        KfW kfW = new KfW(3000);
        Commerzbank commerzbank = new Commerzbank(4000);


        //Instanzen Person
        Person p1 = new Person("Vasilis", "Zour", 2300);
        Person p2 = new Person("Antonis", "Kanakis", 7000);
        Person p3 = new Person("Andrea", "Sivkovic", 70);

        deutscheBank.openBankAccount(p1);
        kfW.openBankAccount(p2);
        commerzbank.openBankAccount(p3);
        uniCredit.openBankAccount(p1);
    }
}
