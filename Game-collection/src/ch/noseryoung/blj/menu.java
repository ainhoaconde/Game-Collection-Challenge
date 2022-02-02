package ch.noseryoung.blj;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class menu {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // Make scanner obj
        String choice;
        int choiceI = 0;
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

    System.out.println("[1] - Rock Paper Scissors");
    System.out.println("[2] - Hangman");
    System.out.println("[3] - Number guessing game");
    System.out.println("[4] - Exit programm");
    if (myScanner.hasNextLine()) {
        choice = myScanner.nextLine();
        choiceI = Integer.parseInt(choice);
    }
    if (choiceI == 1) {
        //Rock Paper
        rockPaper.rockPaperScissors();
    } else if (choiceI == 2) {
        //hangman
        hangman.hangmangame();
    } else if (choiceI == 3) {
        //number
        numberGuessing.numberGuessingGame();
    }else if (choiceI == 4){

    }
    else {
        System.out.println("Invalid input");
    }

}while (choiceI != 4);
    }

}

