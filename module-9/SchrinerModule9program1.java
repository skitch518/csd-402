/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schrinermodule9program1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Jason Schriner
 * Module 9 Program 1
 * 2/16/25
 */
public class SchrinerModule9program1 {

    public static void main(String[] args) {
        
        // CreateArray List
        ArrayList<String> Quotes = new ArrayList<String>();
        
        // Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        
        // Add strings to ArrayList Quotes
        Quotes.add("Stay hungry, stay foolish. Steve Jobs");
        Quotes.add("Nothing will work unless you do.  Maya Angelou");
        Quotes.add("Work hard in silence, let your success be your noise.  Frank Ocean");
        Quotes.add("Success is not final, failure is not fatal: It is the courage to continue that counts.  Winston Churchill");
        Quotes.add("The only place where success comes before work is in the dictionary.  Vidal Sassoon");
        Quotes.add("The future depends on what we do in the present.  Mahatma Gandhi");
        Quotes.add("A day without laughter is a day wasted.  Charlie Chaplin");
        Quotes.add("Behind every great man, there is a woman rolling her eyes.  Jim Carrey");
        Quotes.add("If you can't be kind, at least be vague.  Unknown");
        Quotes.add("My wallet is like an onion. Opening it makes me cry.  Unknown");
        
        // For loop to print each element
        for (int index = 0; index < Quotes.size(); index++){
            System.out.println(Quotes.get(index));
        }
        
        // Ask user which string they would like to see
        System.out.println("Enter the number for which quote you would like to see again: ");
        
        // Takes user input as string
        String userInput = scanner.nextLine();
        Integer selectQuote = Integer.valueOf(userInput); // Converts string to Integer (Autoboxing)
        
        // Try-catch block to catch index out of bounds
        try {
            System.out.println(Quotes.get(selectQuote)); // Auto unboxes when using Integer to get value
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Out of Bounds"); // If user input is out of arrayList bounds this will print
        }
        
        scanner.close(); // close the scanner object
        
        
    }
}
