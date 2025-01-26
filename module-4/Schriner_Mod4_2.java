/**
 *
 * Jason Schriner
 * Module 4.2
 * 1/26/25
 */
public class Schriner_Mod4_2 {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length); // Return average as short
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length; // Return average as int
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length; // Return average as double
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length; // Return average as long
    }

}