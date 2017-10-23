package Util;

/**
 * Created by Cypher on 10/13/2017.
 */

/**
 * La classe qui permet de faire les traitements sur les vecteurs
 */
public class VectorHelper {

    /**
     * La méthode qui permet de trier un vecteur {@code int[] array} dans un ordre croissant et renvoie le résultat en retour
     * <p>Il est à noter que cette méthode utilise le tri par bulle</p>
     * @param   array   Le paramètre vecteur qu'il faut trier
     * @return  Un vecteur contenant le resultat du tri du paramètre {@code array}
     */
    public static int[] sort(int[] array) {
        int temp; // Une variable temporaire pour effecuter des permutations.
        int[] result = array.clone(); // Une copie du vecteur.
        boolean permut = true;
        while (permut) {
            permut = false;
            for (int i = 0; i < array.length - 1; i++) { // Le parcours du vecteur
                if (result[i] > result[i + 1]) {
                    temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                    permut = true;
                }
            }
        }

        return result;
    }

    /**
     * La méthode qui permet de sommer deux vecteurs {@code int[] arr1} et {@code int[] arr2} et renvoie le résultat en retour
     * @param   arr1    Un vecteur
     * @param   arr2    Un autre vecteur
     * @return  Un vecteur contenant la somme des deux paramètres {@code arr1} et {@code arr2}
     * @throws  DifferentLengthException dans le cas ou les deux paramètres {@code arr1} et {@code arr2}
     *                                  ont des tailles différentes
     */
    public static int[] sum(int[] arr1, int[] arr2) throws DifferentLengthException{
        if (arr1.length != arr2.length) {
            throw new DifferentLengthException(); // Lancer une exception dans le cas ou les tailles sont différentes
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    /**
     * La méthode qui inverse les éléments d'un vecteur {@code int[] arr} et renvoie le résultat en retour
     * @param   arr Un veteur
     * @return  Un vecteur {@code int[]} contenant les éléments inversés du paramètre {@code arr}
     */
    public static int[] reverse(int[] arr) {
        int length = arr.length; // Sauvegarder la taille du vecteur
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arr[length - i - 1];
        }
        return result;
    }

    /**
     * La méthode qui renvoie le minimum et le maximum dans un vecteur {@code int[] arr}
     * <p> Le premier élément est le min, le 2ème est le max</p>
     * @param   arr Un vecteur
     * @return  Un tableau {@code int[]} à deux éléments, le 1er est le Min, le 2ème est le Max
     */
    public static int[] minMax(int[] arr) {
        int[] result = new int[2];
        result[0] = arr[0]; // Minimum
        result[1] = arr[0]; // Maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result[0])
                result[0] = arr[i];
            if (arr[i] > result[1])
                result[1] = arr[i];
        }
        return result;
    }

    /**
     * La méthode qui permet de modifier tous les éléments du vecteur {@code int[] arr} avec leurs valeurs absolues
     * <p>Utilise la métode {@link #abs(int)}</p>
     * @param   arr Un vecteur
     */
    public static void updateVector(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = abs(arr[i]);
        }
    }

    /**
     * Une méthode qui permet de calculer la valeur absolue d'une valeur quelconque {@code int num}
     * Si le paramètre est positif, il est renvoyé en retour
     * Si le paramètre est négatif, son opposé est renvoyé en retour
     * @param   num Le paramètre à calculer sa valeur absolue
     * @return  La valeur absolue de l'argument {@code num}
     */
    public static int abs(int num) {
        return (num >= 0) ? num : -num;
    }

}