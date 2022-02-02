package ch.noseryoung.blj;
import java.util.Scanner;
public class hangman {

    /*variablen festgelegt*/
    private static String[] words = {"methoden", "java", "klasse", "datentypen", "github", "array", "gitlab", "schleifen", "ferien", "objektorientierung", "public", "privat"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    public static void hangmangame() {

        /* neuer Scanner*/
        Scanner sc = new Scanner(System.in);
        /* wie lange das Programm läuft*/
        while (count < 7 && asterisk.contains("*")) {
            /* output*/
            System.out.println("Errate einen Buchstaben aus dem Wort");
            System.out.println(asterisk);
            /* eingabe einscannen*/
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
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
            System.out.println("DU HAST GEWONNEN !!!!");
            System.out.println("Das Wort war:" + word);
        }
    }
    public static void hangmanImage() {
        /* Hangman*/
        if (count == 1) {
            System.out.println("Der Buchstabe kommt nicht im Wort vor!");
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
            System.out.println("Der Buchstabe kommt nicht im Wort vor!");
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
            System.out.println("Der Buchstabe kommt nicht im Wort vor!");
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
            System.out.println("Der Buchstabe kommt nicht im Wort vor!");
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
            System.out.println("Der Buchstabe kommt nicht im Wort vor!");
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
            System.out.println("Der Buchstabe kommt nicht im Wort vor!");
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
            System.out.println("GAME OVER!");
            System.out.println("╔══════════╗  ");
            System.out.println("║          ║");
            System.out.println("║        (x_x) ");
            System.out.println("║        /▌▒▐ ");
            System.out.println("║         ▌▒▐ ");
            System.out.println("║          ");
            System.out.println("║          ");
            System.out.println("╚═════════════════╝");
            System.out.println("Das richtige Wort wäre " + word);
        }
    }
    }

