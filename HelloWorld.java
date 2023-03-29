package Projekt01.Grundlage;

import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine Nummer ein:");
        int number = input.nextInt();

        while(number != 1 && number != 2){
            System.out.println("Geben Sie entweder 1 oder 2 ein:");
            number = input.nextInt(); 
        }

        ResultMethod(number);


    }

    public static void ResultMethod(int num){
        if (num == 1){
            System.out.println("Hello Hello!");
        }
        else{
            System.out.println("Go Home Please!");
        }

    }
}