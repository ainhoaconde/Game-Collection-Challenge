package ch.noseryoung.blj;

import java.util.Scanner;


public class menu {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in); // Make scanner obj

        System.out.println("\n" +
                " '/¯¯¯¯|  |¯¯¯¯\\‚   |¯¯¯¯¯¯¯¯|   '/¯¯¯¯|   /¯¯¯¯|    |\\¯¯¯\\  |\\¯¯¯\\ °\n" +
                " |        '\\/         |‚  |       ____|   |        '\\ '|       /|‘   | |     '|°| |     '|' \n" +
                " |'\\     '|\\   /|     /'|'‚ |       ¯¯¯| |   |'\\     |\\  \\|      '|''|° °'/     '/  '/     /|‘ \n" +
                " | '|   °'| '\\/ '|    '|°|'‚ |       ¯¯¯¯|   | '|   °|  \\       °|/    |       \\'/      | |' \n" +
                " ''/___'\\  | /___'\\/'  |________|   ''/___|\\ /____¸|°    |\\_____/|__¸\\'  \n" +
                " '|       |'\\|/|       |   |              |   '|      | '\\|        |     | |       '| |     |  \n" +
                " '|____|  °|____|   |________|   '|__¸¸'|  '|____''|    °'\\|____'|/|___|‘ \n");

        System.out.println("[1] - Rock Paper Scissors");
        System.out.println("[2] - Hangman");
        System.out.println("[3] - Number guessing game");

        int choice = myScanner.nextInt();

        if (choice == 1) {
            //Rock Paper
            rockPaper.rockPaperScissors();
        }
        else if (choice == 2){
            //hangman
            hangman.hangmangame();
        }
        else if (choice == 3) {
            //number
            numberGuessing.numberGuessingGame();
        }
        else{
            System.out.println("Invalid input");
        }


    }

}

