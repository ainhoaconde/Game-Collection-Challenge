package ch.noseryoung.blj;

import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
    public static void numberGuessingGame(){
    // Getting Random Number
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    int n = rand.nextInt(11);
    String num = String.valueOf(n);
    //
    int g = 0;
    int gInput = 1;
        System.out.println("Guess " + gInput + ":");
    String i = scan.nextLine();
        while(true){
        g++;
        gInput++;
        if(g == 3){
            System.out.println("You Lost!\nIt was " + num);
            break;
        }else{
            if(i == num){
                System.out.println("You Won!");
                break;
            }else{
                System.out.println("Nope");
                System.out.println("Guess " + gInput + ":");
                i = scan.nextLine();

            }
        }
    }
    i = scan.nextLine();
}
}
