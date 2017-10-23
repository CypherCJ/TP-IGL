package Util;

/**
 * Created by Cypher on 10/19/2017.
 */

/**
 * La classe utilisée pour générer l'exception des tailles différentes.
 */
public class DifferentLengthException extends Exception {

    public DifferentLengthException() {
        super("Les vecteurs ont des tailles différentes.");
    }
}
