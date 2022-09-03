package ch.dennymarti.mastermind;

import java.util.Random;

/**
 * Die Klasse Code generiert einen zufälligen Code, welcher
 * später durch die Eingabe des Users im Mastermind validiert wird.
 *
 * @author Denny
 * @version 1.0
 *
 */

public class Code {

    private final static char[] COLORS = {'r', 'g', 'b', 'y', 's', 'w'};
    private char[] colorCode = new char[4];

    /**
     * Generiert einen zufälligen Code und speichert diesen
     * temporär in die Instanzvariable colorCode im Mastermind ein.
     */
    public void generateCode() {
        Random random = new Random();

        for (int i = 0; i < colorCode.length; i++) {
            colorCode[i] = COLORS[random.nextInt(COLORS.length)];
        }
    }

    /**
     * Gib den zufällig generierten Code im Mastermind zurück.
     * @return colorCode
     */
    public char[] getGeneratedCode() {
        return colorCode;
    }
}
