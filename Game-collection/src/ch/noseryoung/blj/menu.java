package ch.noseryoung.blj;
import java.util.Scanner;

import static ch.noseryoung.blj.numberGuessing.numberGuessingGame;

public class menu {
    public static void main(String[] args) {
        numberGuessingGame();
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

