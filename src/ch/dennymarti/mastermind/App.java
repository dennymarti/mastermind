package ch.dennymarti.mastermind;

import java.util.Arrays;

/**
 * Die Klasse App generiert einen zufälligen Code
 * und validiert diesen durch die Eingabe des Users.
 * Am Schluss gibt es das Resultat im Mastermind aus.
 *
 * @author Denny
 * @version 1.0
 */

public class App {

    /**
     * Das Programm wird gestartet und erwartet eine Eingabe
     * vom User, welcher danach durch den bereits generierten Code
     * überprüft wird und danach das Resulatat im Mastermind ausgibt.
     */
    public static void main(String[] args) {
        System.out.println("Geben Sie einen Versuchscode mit vier Buchstaben aus der Menge { r, g, b, y, s, w } ein:");

        // Einen zufälligen Code generieren
        Code code = new Code();
        code.generateCode();

        // Eingabe des Users lesen und mit dem generierten Code überprüfen
        Reader reader = new Reader();
        reader.readInput();
        reader.checkInput(code.getGeneratedCode());

        // Resultat ausgeben
        System.out.println("Die Lösung war: " + Arrays.toString(code.getGeneratedCode()));
        System.out.println("Deine Eingabe: " + Arrays.toString(reader.getInput()));
        System.out.println(reader.getCorrectChars() + " Zeichen deiner Eingabe, überstimmten mit der Lösung ein.");
    }
}
