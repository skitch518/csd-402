/**
 *
 * Jason Schriner
 * Module 3
 * 1/19/25
 * 
 */

/**
 * This program has 5 loops
 * First prints the rows going down
 * Second prints spaces before the numbers
 * Third prints the numbers in increasing order
 * Fourth prints the numbers in decreasing order
 * Fifth prints the spaces after
 */
public class Schriner_For_Loop {

    public static void main(String[] args) {
        
        
        int totalRows = 7; // Rows to be printed also the genral counter for the program
        
        // Outer loop for each row
        for (int currentRow = 1; currentRow <= totalRows; currentRow++) {
            
            // Print the spaces before the number 
            // Decrease spaces as numbers increase
            for (int spacesBeforeNumbers = 1; spacesBeforeNumbers <= (totalRows - currentRow) * 2; spacesBeforeNumbers++) {
                System.out.print(" ");
            }

            // Print the increasing powers of 2
            for (int power = 0; power < currentRow; power++) {
                //Couldn't figure this line out as simple multiplication did not give desired result
                //Used chatgpt to produce the math.pow
                System.out.print((int) Math.pow(2, power) + " "); 
            }

            // Print the decreasing powers of 2 (skip the peak, which was already printed)
            for (int power = currentRow - 2; power >= 0; power--) {
                System.out.print((int) Math.pow(2, power) + " ");
            }

            //Prints the spaces after the numbers
            for (int spacesAfterNumbers = 1; spacesAfterNumbers <= (totalRows - currentRow) * 2; spacesAfterNumbers++) {
                System.out.print(" ");
            }

            // Move to the next line after printing the current row
            System.out.println("@");
        }      
    }
}

/**
 * Did have issue with the math to allow the @ symbol to align
 * as the spaces do not seem to be even. This is as close as I was able to arrive
 */