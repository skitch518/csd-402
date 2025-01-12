/*
 * Jason Schriner
 * 1/11/2025
 * Module 1 assignment 
 *
 * copied how to use the scanner from
 * Professor Darrel Payne
 * Bellevue University
 * Example_002
 * Scanner class
 */

import java.util.Scanner;

public class WaterTemperature {

  public static void main(String[] args) {

    // Initialize variables
    int initial_temperature;
    int final_temperature;
    int water_mass;
    int q;

    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Print prompts and collect inputs
    System.out.print("Enter the current temperature of the water in celsius: ");
    initial_temperature = input.nextInt();
    System.out.print("Enter the final temperature of the water in celsius: ");
    final_temperature = input.nextInt();
    System.out.print("Enter the weight of the water in Kilograms: ");
    water_mass = input.nextInt();

    // Calculate required Energy (formula: q = m * ΔT * c, where c = 4184 J/kg°C)
    q = water_mass * (final_temperature - initial_temperature) * 4184;

    // Output Calculation Final result of program
    System.out.println("\nThe joules required to raise the water temperature is: " + q);
  }
}
