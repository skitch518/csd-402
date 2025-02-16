/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jasonarraylisttest;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *Jason Schriner
 * Module 8
 * 2/15/25
 */
public class JasonArrayListTest {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the numbers
        ArrayList<Integer> largestNumber = new ArrayList<Integer>();
        
        int userInput;
        
        // Read user input until 0 is entered
        while (true) {
            System.out.println("Enter a number (Enter 0 to quit):");
            userInput = scanner.nextInt();
            
            // Add the number to the ArrayList
            largestNumber.add(userInput);
            
            if (userInput == 0) {
                break;
            }
        }
        
        // Calls the ArrayList method and prints results
        int maxNumber = findLargestNumber(largestNumber);
        System.out.println("The largest number entered is: " + maxNumber);
        
        scanner.close(); // Close the scanner to avoid resource leaks
        
        ArrayListTest();
        
    }
    
    // Method to find the largest number in an ArrayList
    public static int findLargestNumber(ArrayList<Integer> largestNumber) {
        int max = 0;
        
        // Iterate through the ArrayList to find the largest number
        for (int num : largestNumber) {
            if (num > max) {
                max = num; // Update max if a larger number is found
            }
        }
        
        return max;
    }
    
    public static void ArrayListTest(){
    // Create new arrayList
    ArrayList<Integer> test = new ArrayList<Integer>();
    
    //Add numbers to the array list
    test.add(3);
    test.add(5);
    test.add(2);
    test.add(1);
    test.add(6); 
    
    // Call method and print largest number to ensure it returns the correct number
    System.out.println("Array list test largest number is: " + findLargestNumber(test));
    
    // Create a test to ensure it returns zero
    ArrayList<Integer> testForZero = new ArrayList<Integer>();
    
    testForZero.add(0);
    
    // This test should print zero
    System.out.println("Array list test largest number is: " + findLargestNumber(testForZero));
    }
    
}
