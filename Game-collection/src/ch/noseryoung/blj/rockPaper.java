package ch.noseryoung.blj;
import java.util.Scanner;

public class rockPaper {

        public static void rockPaperScissors() {
            int scissors = 1;
            int stone = 2;
            int paper = 3;
            int jack = 0;
            int user = 0;
            double jackchoice;
            int userchoice;

            Scanner aScanner = new Scanner (System.in);
            System.out.println("██████   ██████   ██████ ██   ██        ██████   █████  ██████  ███████ ██████         ███████  ██████ ██ ███████ ███████  ██████  ██████  ███████ \n" +
                    "██   ██ ██    ██ ██      ██  ██         ██   ██ ██   ██ ██   ██ ██      ██   ██        ██      ██      ██ ██      ██      ██    ██ ██   ██ ██      \n" +
                    "██████  ██    ██ ██      █████          ██████  ███████ ██████  █████   ██████         ███████ ██      ██ ███████ ███████ ██    ██ ██████  ███████ \n" +
                    "██   ██ ██    ██ ██      ██  ██         ██      ██   ██ ██      ██      ██   ██             ██ ██      ██      ██      ██ ██    ██ ██   ██      ██ \n" +
                    "██   ██  ██████   ██████ ██   ██ ▄█     ██      ██   ██ ██      ███████ ██   ██ ▄█     ███████  ██████ ██ ███████ ███████  ██████  ██   ██ ███████ \n" +
                    "                                                                                                                                                   \n" +
                    "                                                                                                                                                  ");

            do
            {
                jackchoice = (int) (Math.random()*3);

                System.out.println("Jacke has now made a choice");
                System.out.println("Now it is your turn to choose one \n " +
                        "1 = scissors \n" +
                        "    _______\n" +
                        "---'   ____)____\n" +
                        "          ______)\n" +
                        "       __________)\n" +
                        "      (____)\n" +
                        "---.__(___)\n" +
                        "" +
                        "2 = stone \n" +
                        "    _______\n" +
                        "---'   ____)\n" +
                        "      (_____)\n" +
                        "      (_____)\n" +
                        "      (____)\n" +
                        "---.__(___)\n" +
                        "" +
                        "3 = paper \n" +
                        "     _______\n" +
                        "---'    ____)____\n" +
                        "           ______)\n" +
                        "          _______)\n" +
                        "         _______)\n" +
                        "---.__________)\n" +
                        "");

                userchoice = aScanner.nextInt();

                if ( userchoice == scissors)
                {
                    if (userchoice == jackchoice )
                    {
                        System.out.println(" You have the same choice as Jack.");
                    }
                    else if (jackchoice == stone)
                    {
                        jack++;
                        System.out.println("The Jack won!");
                    }
                    else
                    {
                        user++;
                        System.out.println(" You have won!");
                    }

                }

                else if (userchoice == stone)
                {
                    if (userchoice == jackchoice )
                    {
                        System.out.println("You have the same choice as Jack.");
                    }
                    else if (jackchoice == paper)
                    {
                        jack++;
                        System.out.println("The Jack won!");
                    }
                    else
                    {
                        user++;
                        System.out.println("You have won!");
                    }
                }

                else if (userchoice == paper)
                {
                    if (userchoice == jackchoice )
                    {
                        System.out.println("You have the same choice as the Jack.");
                    }
                    else if (jackchoice == scissors)
                    {
                        jack++;
                        System.out.println("The Jack won!");
                    }
                    else
                    {
                        user++;
                        System.out.println("You have won!");
                    }
                }

                System.out.println("You have " + user + " points "+"Jack has " + jack + " points \n");
            }
            while ( (user != 3) && (jack != 3) );


        }

    }