/**
 * Jason Schriner
 * Module 5 Arrays
 * 2/1/25
 */
public class Schriner_Mod5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

public static int[] locateLargest(double[][] arrayParam) {
    int[] location = new int[2]; // An index for the column and row
    double largest = arrayParam[0][0]; // Initialize the largest variable with the first element
    
    //Loop to itterate through all of the elements of the array
    //.length determines size of array
    for (int i = 0; i < arrayParam.length; i++) { 
        for (int j = 0; j < arrayParam[i].length; j++) {
           //if an element is greater than the current element the variable largest is reassigned to this element
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                location[0] = i; // Row index
                location[1] = j; // Column index
            }
        }
    }
    
    return location;
}

/**
 * Basically created one method and just modified it for the int and double
 * then just changed the it to find the smallest instead of the largest
 * 
 */

public static int[] locateLargest(int[][] arrayParam) {
    int[] location = new int[2]; // An index for the column and row
    int largest = arrayParam[0][0]; // Initialize the largest variable with the first element
    
    
    //Loop to itterate through elements
    //.length determines size of array
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            //if an element is greater than the current element the variable smallest is reassigned to this element
            if (arrayParam[i][j] > largest) {
                largest = arrayParam[i][j];
                location[0] = i; // Row index
                location[1] = j; // Column index
            }
        }
    }
    
    return location;
}

public static int[] locateSmallest(double[][] arrayParam) {
    int[] location = new int[2]; // An index for the column and row
    double smallest = arrayParam[0][0]; // Initialize the smallest variable with the first element
    
    //Loop to itterate through elements
    //.length determines size of array
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            //if an element is smaller than the current element the variable smallest is reassigned to this element
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                location[0] = i; // Row index
                location[1] = j; // Column index
            }
        }
    }
    
    return location;
}

public static int[] locateSmallest(int[][] arrayParam) {
    int[] location = new int[2]; // An index for the column and row
    int smallest = arrayParam[0][0]; // Initialize the smallest variable with the first element
    
    //Loop to itterate through elements
    //.length determines size of array
    for (int i = 0; i < arrayParam.length; i++) {
        for (int j = 0; j < arrayParam[i].length; j++) {
            //if an element is greater than the current element the variable largest is reassigned to this element
            if (arrayParam[i][j] < smallest) {
                smallest = arrayParam[i][j];
                location[0] = i; // Row index
                location[1] = j; // Column index
            }
        }
    }
    
    return location;
}

}   

/**
 * This program is a variation of examples provided by
 * Professor Darrel Payne
 * Bellevue University
 * https://bellevue.mediaspace.kaltura.com/media/Arrays+Symmetrical/1_50q3hf9c 
 */
