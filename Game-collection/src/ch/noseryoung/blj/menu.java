package ch.noseryoung.blj;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class menu {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choiceI = 0;
        boolean finished = false;
        do {

            System.out.println("\n" +
                    " .----------------.  .----------------.  .-----------------. .----------------. \n" +
                    "| .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                    "| | ____    ____ | || |  _________   | || | ____  _____  | || | _____  _____ | |\n" +
                    "| ||_   \\  /   _|| || | |_   ___  |  | || ||_   \\|_   _| | || ||_   _||_   _|| |\n" +
                    "| |  |   \\/   |  | || |   | |_  \\_|  | || |  |   \\ | |   | || |  | |    | |  | |\n" +
                    "| |  | |\\  /| |  | || |   |  _|  _   | || |  | |\\ \\| |   | || |  | '    ' |  | |\n" +
                    "| | _| |_\\/_| |_ | || |  _| |___/ |  | || | _| |_\\   |_  | || |   \\ `--' /   | |\n" +
                    "| ||_____||_____|| || | |_________|  | || ||_____|\\____| | || |    `.__.'    | |\n" +
                    "| |              | || |              | || |              | || |              | |\n" +
                    "| '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                    " '----------------'  '----------------'  '----------------'  '----------------' \n");
            System.out.println("+--------------------------------+");
            System.out.println("|\t[1] - Rock Paper Scissors \t |");
            System.out.println("|\t[2] - Hangman \t\t\t\t |");
            System.out.println("|\t[3] - Number guessing game \t |");
            System.out.println("|\t[4] - Exit programm \t\t |");
            System.out.println("+--------------------------------+");
            choiceI = 0;
            choiceI = GetAnInteger();

            if (choiceI == 1) {
                //Rock Paper
                rockPaper.rockPaperScissors();
                choiceI = 0;
            } else if (choiceI == 2) {
                //hangman
                hangman.hangmangame();
                choiceI = 0;
            } else if (choiceI == 3) {
                //number
                numberGuessing.numberGuessingGame();
                choiceI = 0;
            } else if (choiceI == 4) {
                System.out.println("Good bye!!");
                finished = true;
            } else {
                System.out.println("Invalid input");
                choiceI = 0;
            }
            choiceI = 0;

        } while (!finished);
        myScanner.close();

    }

    public static int GetAnInteger() {
        while (true) {
            try {
                return myScanner.nextInt();
            } catch (InputMismatchException e) {
                myScanner.next();
                System.out.println("Invalid input");
            }
        }
    }
}



