package Test;

import Util.DifferentLengthException;
import static Util.VectorHelper.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * La classe utilisée pour effectuer des tests unitaires sur les méthodes de la classe VectorHelper
 */
public class VectorHelperTest {

    /**
     * La méthode utilisée pour tester la méthode {@code int[] sort}
     */
    @Test
    public void testSort() {
        assertArrayEquals(new int[] {0, 1, 5, 25, 100, 100}, sort(new int[] {100, 25, 100, 0, 5, 1}));
    }

    /**
     * La méthode utilisée pour tester la méthode {@code int[] sum}
     */
    @Test
    public void testSum(){
        try {
            assertArrayEquals(new int[] {6, 8, 10, 12}, sum(new int[] {1, 2, 3, 4}, new int[] {5, 6, 7, 8}));
        }
        catch (DifferentLengthException e) {
            fail("Les tailles des tableaux sont différentes");
        }
    }

    /**
     * La méthode utilisée pour tester la méthode {@code int[] reverse}
     */
    @Test
    public void testReverse() {
        assertArrayEquals(new int[] {118, 36, 15, 25}, reverse(new int[] {25, 15, 36, 118}));
    }

    /**
     * La méthode utilisée pour tester la méthode {@code int[] minMax}
     */
    @Test
    public void testMinMax() {
        assertArrayEquals(new int[] {0, 100}, minMax(new int[] {0, 43, 100, 25, 5}));
    }

    /**
     * La méthode utilisée pour tester la méthode {@code void updateVector}
     */
    @Test
    public void testUpdateVector() {
        int[] test = new int[] {-5, 0, 1, 22, -48, -1};
        updateVector(test);
        assertArrayEquals(new int[] {5, 0, 1, 22, 48, 1}, test);
    }

    /**
     * La méthode utilisée pour tester la méthode {@code int abs}
     */
    @Test
    public void testAbs() {
        assertEquals(11, abs(-11));
    }

}
