package ch.dennymarti.mastermind;

import java.util.Scanner;

/**
 * Die Klasse Reader liest die Eingabe des Users
 * und überprüft sie mit dem generierten Code im Mastermind.
 *
 * @author denny
 * @version 1.0
 *
 */

public class Reader {

    private char[] eingabe = new char[4];
    private Integer correctChars;

    /**
     * Liest und speichert die Eingabe des Users im Mastermind
     * in eine Instanzvariable.
     */
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            eingabe = input.toCharArray();
            scanner.close();
        } catch (Exception exception) {
            System.out.println("Die Eingabe konnte nicht gelesen werden: " + exception.getMessage());
        }
    }

    /**
     * Überprüft die Eingabe des Users im Mastermind und gibt die Lösung, Eingabe
     * und wie viel davon richtig war aus.
     * @param generatedCode muss für die Überprüfung als Parameter übergeben werden.
     */
    public void checkInput(char[] generatedCode) {
        correctChars = 0;
        for (int i = 0; i < eingabe.length; i++) {
            if (generatedCode[i] == eingabe[i]) {
                correctChars++;
            }
        }
    }

    /**
     * Gibt die Eingabe in Chars zurück, welcher
     * der User im Mastermind eingeben hat.
     * @return eingabe
     */
    public char[] getInput() {
        return eingabe;
    }

    /**
     * Gibt die Anzahl Zeichen zurück, welcher
     * der User eingegeben hat und mit der generierten
     * Version übereinstimmten.
     * @return correctChars
     */
    public Integer getCorrectChars() {
        return correctChars;
    }
}
