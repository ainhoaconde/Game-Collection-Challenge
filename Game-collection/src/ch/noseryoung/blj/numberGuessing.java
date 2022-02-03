package ch.noseryoung.blj;

import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
    public static void numberGuessingGame() {
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
        int guess;
        do {
            System.out.print("Enter a guess (1-100): ");
            guess = keyboard.nextInt();
            if (guess == secretNumber)
                System.out.println("Your guess is correct. Congratulations:)");
            else if (guess < secretNumber)
                System.out
                        .println("Your guess is smaller than the  number.");
            else if (guess > secretNumber)
                System.out
                        .println("Your guess is bigger than the number.");
        } while (guess != secretNumber);
    }
}
