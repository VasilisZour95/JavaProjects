package Projekt11.Aufgabe15;


public class Person {
    private String fn;
    private String ln;
    private double money;
    private Bank myBank;


    public Person(String firstName, String lastName, double money){
        this.fn = firstName;
        this.ln = lastName;
        this.money = money;
    }

    public String getFn(){
        return fn;
    }

    public void setFn(String fn){
        this.fn = fn;
    }

    public String getLn(){
        return ln;
    }

    public void setLn(String ln){
        this.ln = ln;
    }

    public double getMoney(){
        return money;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public Bank getMyBank(){
        return myBank;
    }

    public void setCreditLimit(Bank myBank){
        this.myBank = myBank;
    }

}
