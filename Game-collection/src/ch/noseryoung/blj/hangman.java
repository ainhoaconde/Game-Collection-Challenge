package ch.noseryoung.blj;
import java.util.Scanner;
public class hangman {

    /*variablen festgelegt*/
    private static String[] words = { "oper", "hund", "klasse", "mond", "yeti", "array", "mars", "auto", "zebra", "venus", "finanzdienstleistungsunternehmen", "wasserverschmutzung", "babypuppe", "quizshow", "puzzle", "brillant",
            "inn"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    public static void hangmangame() {
        System.out.println("██   ██  █████  ███    ██  ██████  ███    ███  █████  ███    ██ \n" +
                "██   ██ ██   ██ ████   ██ ██       ████  ████ ██   ██ ████   ██ \n" +
                "███████ ███████ ██ ██  ██ ██   ███ ██ ████ ██ ███████ ██ ██  ██ \n" +
                "██   ██ ██   ██ ██  ██ ██ ██    ██ ██  ██  ██ ██   ██ ██  ██ ██ \n" +
                "██   ██ ██   ██ ██   ████  ██████  ██      ██ ██   ██ ██   ████ \n" +
                "                                                               ");

        /* neuer Scanner*/
        Scanner sc = new Scanner(System.in);
        /* wie lange das Programm läuft*/
        while (count < 7 && asterisk.contains("*")) {
            /* output*/
            System.out.println("Guess a letter from the word");
            System.out.println(asterisk);
            /* eingabe einscannen*/
            String guess = sc.next();
            hang(guess);
        }

    }
    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }
        if (asterisk.equals(newasterisk)) {
            /* Entstehung Hangman*/
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        /* Wenn User gewonnen hat*/
        if (asterisk.equals(word)) {
            System.out.println("██    ██  ██████  ██    ██     ██     ██ ██ ███    ██ ██ ██ \n" +
                    " ██  ██  ██    ██ ██    ██     ██     ██ ██ ████   ██ ██ ██ \n" +
                    "  ████   ██    ██ ██    ██     ██  █  ██ ██ ██ ██  ██ ██ ██ \n" +
                    "   ██    ██    ██ ██    ██     ██ ███ ██ ██ ██  ██ ██       \n" +
                    "   ██     ██████   ██████       ███ ███  ██ ██   ████ ██ ██ \n" +
                    "                                                            \n" +
                    "                                                          ");
            System.out.println("The word was:" + word);
        }
    }
    public static void hangmanImage() {
        /* Hangman*/
        if (count == 1) {
            System.out.println("The letter does not appear in the word!");
            System.out.println("  ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("╚═════════════════╝");
        }
        if (count == 2) {
            System.out.println("The letter does not appear in the word!");
            System.out.println("  ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("╚═════════════════╝");
        }
        if (count == 3) {
            System.out.println("The letter does not appear in the word!");
            System.out.println("  ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("╚═════════════════╝");
        }
        if (count == 4) {
            System.out.println("The letter does not appear in the word!");
            System.out.println("╔══════════╗  ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("║    ");
            System.out.println("╚═════════════════╝");
        }
        if (count == 5) {
            System.out.println("The letter does not appear in the word!");
            System.out.println("╔══════════╗  ");
            System.out.println("║          ║");
            System.out.println("║        (◕_◕) ");
            System.out.println("║          ▇ ");
            System.out.println("║          ");
            System.out.println("║          ");
            System.out.println("║          ");
            System.out.println("╚═════════════════╝");
        }
        if (count == 6) {
            System.out.println("The letter does not appear in the word!");
            System.out.println("╔══════════╗  ");
            System.out.println("║          ║");
            System.out.println("║        (◕_◕) ");
            System.out.println("║        /▌▒▐ ");
            System.out.println("║          ");
            System.out.println("║          ");
            System.out.println("║          ");
            System.out.println("╚═════════════════╝");
        }
        if (count == 7) {
            System.out.println(" ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  ██ \n" +
                    "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ ██ \n" +
                    "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  ██ \n" +
                    "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██    \n" +
                    " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ ██ \n" +
                    "                                                                             \n" +
                    "                                                                             !");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▄▄▄▄░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒▒▒▒▄██████▒▒▒▒▒▄▄▄█▄▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒▒▄██▀░░▀██▄▒▒▒▒████████▄▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒▒███░░░░░░██▒▒▒▒▒▒█▀▀▀▀▀██▄▄▒▒▒\n" +
                    "▒▒▒▒▒▄██▌░░░░░░░██▒▒▒▒▐▌▒▒▒▒▒▒▒▒▀█▄▒\n" +
                    "▒▒▒▒▒███░░▐█░█▌░██▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▀▌\n" +
                    "▒▒▒▒████░▐█▌░▐█▌██▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▐████░▐░░░░░▌██▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒████░░░▄█░░░██▒▒▐█▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒████░░░██░░██▌▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒████▌░▐█░░███▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▐████░░▌░███▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒▒▒████░░░███▒▒▒▒█▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▒▒██████▌░████▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒▐████████████▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "▒█████████████▄████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "█████████████████▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "█████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                    "████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");

            System.out.println("the right word would be: " + word);
        }
    }
    }

