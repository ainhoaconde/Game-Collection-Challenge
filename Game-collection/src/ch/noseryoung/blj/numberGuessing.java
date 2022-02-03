package ch.noseryoung.blj;

import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
    public static void numberGuessingGame() {
        int guesses = 7;
        System.out.println("\n" +
                "███    ██ ██    ██ ███    ███ ██████  ███████ ██████       ██████  ██    ██ ███████ ███████ ███████ ██ ███    ██  ██████       ██████   █████  ███    ███ ███████ \n" +
                "████   ██ ██    ██ ████  ████ ██   ██ ██      ██   ██     ██       ██    ██ ██      ██      ██      ██ ████   ██ ██           ██       ██   ██ ████  ████ ██      \n" +
                "██ ██  ██ ██    ██ ██ ████ ██ ██████  █████   ██████      ██   ███ ██    ██ █████   ███████ ███████ ██ ██ ██  ██ ██   ███     ██   ███ ███████ ██ ████ ██ █████   \n" +
                "██  ██ ██ ██    ██ ██  ██  ██ ██   ██ ██      ██   ██     ██    ██ ██    ██ ██           ██      ██ ██ ██  ██ ██ ██    ██     ██    ██ ██   ██ ██  ██  ██ ██      \n" +
                "██   ████  ██████  ██      ██ ██████  ███████ ██   ██      ██████   ██████  ███████ ███████ ███████ ██ ██   ████  ██████       ██████  ██   ██ ██      ██ ███████ \n" +
                "                                                                                                                                                                  \n" +
                "                                                                                                                                                                  \n");
        int secretNumber;
        secretNumber = (int) (Math.random() * 99 + 1);
        Scanner keyboard = new Scanner(System.in);
        int guess = 101;
        do {
            if (guesses != 0) {
                System.out.print("Enter a guess (1-100): ");
                System.out.print("You have " + guesses + " left ");
                guess = keyboard.nextInt();
                if (guess == secretNumber) {
                    System.out.println("Your guess is correct. Congratulations:)");
                    System.out.println("\n" +
                            "██    ██  ██████  ██    ██     ██     ██  ██████  ███    ██ \n" +
                            " ██  ██  ██    ██ ██    ██     ██     ██ ██    ██ ████   ██ \n" +
                            "  ████   ██    ██ ██    ██     ██  █  ██ ██    ██ ██ ██  ██ \n" +
                            "   ██    ██    ██ ██    ██     ██ ███ ██ ██    ██ ██  ██ ██ \n" +
                            "   ██     ██████   ██████       ███ ███   ██████  ██   ████ \n" +
                            "                                                            \n" +
                            "                                                            \n");
                } else if (guess < secretNumber) {
                    System.out.println("The number were looking for is bigger!");
                    guesses--;
                } else if (guess > secretNumber) {
                    System.out.println("The number were looking for is smaller!");
                    guesses--;
                }
            }
            else{
                System.out.println("You have run out of guesses... game over");
            }
        } while (guess != secretNumber);
    }
}
