/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schrinermodule9program2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * Jason Schriner
 * Module 9 project 2
 * 2/16/25
 */
public class SchrinerModule9program2 {

    public static void main(String[] args) {
        
        // Random number generator
        Random random = new Random();
        
        CreateFile(); // Creates file
        
        WriteToDataFile(random); // Pass the random object to the method
        
        ReadFile();  // Calls the ReadFile method
    }

    // Method to create a file
    public static void CreateFile() {
        try {
            File file = new File("data.file");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }
    }

    // Method to write 10 random numbers to the file
    public static void WriteToDataFile(Random random) {
        try {
            // Object to write data to the file
            FileWriter myWriter = new FileWriter("data.file");
            
            // Generate 10 random numbers and write them to the file
            for (int i = 0; i < 10; i++) {
                int randomint = random.nextInt(101);  // Generate a random number between 0 and 100
                myWriter.write(randomint + " ");      // Write the number to the file
            }
            
            myWriter.close();  // Close the file after writing all numbers
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }

    // Method to read the file and print its contents
    public static void ReadFile() {
        try {
            File file = new File("data.file");
            Scanner myReader = new Scanner(file); // Scanner to read from the file
            // Loop that reads from the file until it reaches the last line
            while (myReader.hasNext()) {  // Use hasNext() to read all numbers in the file
                String fileContents = myReader.next(); // Read the next token (number)
                System.out.print(fileContents + " ");  // Print numbers on the same line
            }
            myReader.close();  // Close the file after reading
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
