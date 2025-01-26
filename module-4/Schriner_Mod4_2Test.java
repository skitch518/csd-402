import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
*Jason Schriner
*1/26/25
*
*Created file w/ instructions from
*https://www.tutorialspoint.com/junit/junit_executing_tests.htm
*/


public class Schriner_Mod4_2Test {

    @Test
    public void testAverageShortArray() {
        short[] array = {2, 9, 5, 8, 11};
        short expected = 7;  // Expected average
        short actual = Schriner_Mod4_2.average(array);
        assertEquals(expected, actual, "The average of the short array should be 7");
    }

    @Test
    public void testAverageIntArray() {
        int[] array = {18, 35, 27, 16};
        int expected = 24;  // Expected average
        int actual = Schriner_Mod4_2.average(array);
        assertEquals(expected, actual, "The average of the int array should be 24");
    }

    @Test
    public void testAverageDoubleArray() {
        double[] array = {2.1, 1.9, 3.4, 4.2, 2.4, 5.5};  // Fixed the syntax error (added comma)
        double expected = 3.25;  // Expected average
        double actual = Schriner_Mod4_2.average(array);
        assertEquals(expected, actual, 0.0001, "The average of the double array should be 3.25");
    }

    @Test
    public void testAverageLongArray() {
        long[] array = {110, 280, 360};
        long expected = 250L;  // Expected average
        long actual = Schriner_Mod4_2.average(array);  // Fixed the method call
        assertEquals(expected, actual, "The average of the long array should be 250");
    }
}