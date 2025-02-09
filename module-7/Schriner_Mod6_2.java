/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schriner_mod6_2;
import java.util.ArrayList;
/**
 *
 * Jason Schriner
 * Mod 7.2
 * 2/9/25
 */
public class Schriner_Mod6_2 {

    public static void main(String[] args) {
        
        System.out.println("Using toString method to print fans");

        // Instance 1 using Default Constructor
        Fan fan1 = new Fan();
        // Call toString Method to print results
        System.out.println(fan1.toString()); 

        // Instance 2 using setters and getters
        Fan fan2 = new Fan(Fan.Medium, true, 8.0, "Pink");
        // Call toString Method to print results
        System.out.println(fan2.toString());
                
        // Create an instance of UseFans to manage the collection of fans
        UseFans useFans = new UseFans();
        
        System.out.println();
        System.out.println("Using UseFans method to print collection of fans");
        // Test prints all fans in the UseFans collection
        useFans.printFanCollection();
        
        System.out.println();
        System.out.println("Using UseFans method to print single instance of fans");
        // Test prints a single fan in the UseFans collection (example fan1)
        useFans.printFan(fan1);
    }

    public static class Fan {

        // Constants for fan speeds
        public static final int Stopped = 0;
        public static final int Slow = 1;
        public static final int Medium = 2;
        public static final int Fast = 3;

        private int speed;
        private boolean On;
        private double radius;
        private String color;

        // No-argument constructor
        public Fan() {
            this.On = false;
            this.speed = Stopped;  // Default speed is STOPPED
            this.radius = 6.0;     // Default radius is 6.0
            this.color = "White";  // Default color is white
        }

        // Constructor with arguments to set specific values
        public Fan(int speed, boolean On, double radius, String color) {
            this.speed = speed;
            this.On = On;
            this.radius = radius;
            this.color = color;
        }

        // Getter and setter for speed
        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        // Getter and setter for On
        public boolean getOn() {
            return On;
        }

        public void setOn(boolean On) {
            this.On = On;
        }

        // Getter and setter for radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Getter and setter for color
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        // toString() method to describe the fan's state
        public String toString() {
            String speedDescription;
            if (speed == Slow) {
                speedDescription = "Slow";
            } else if (speed == Medium) {
                speedDescription = "Medium";
            } else if (speed == Fast) {
                speedDescription = "Fast";
            } else {
                speedDescription = "Stopped";
            }

            return "Fan Speed: " + speedDescription +
                   ", Status: " + (On ? "On" : "Off") +
                   ", Color: " + color + 
                   ", Radius: " + radius + " inches";
        }
    }

    public static class UseFans {

        private ArrayList<Fan> fans = new ArrayList<>();

        // Constructor to initialize the collection of fans
        public UseFans() {
            fans.add(new Fan());
            fans.add(new Fan(Fan.Slow, true, 6.0, "Yellow"));
            fans.add(new Fan(Fan.Slow, true, 6.0, "Red"));
            fans.add(new Fan(Fan.Fast, true, 10.0, "Orange"));
            fans.add(new Fan(Fan.Medium, true, 8.0, "Blue"));
            fans.add(new Fan(Fan.Fast, true, 10.0, "Green"));
            fans.add(new Fan(Fan.Medium, true, 8.0, "Black"));
        }

        // Method to display a single fan instance without using toString
        public void printFan(Fan fan) {
            // Needed to convert the speed from an int to a speed variable
            String speedDescription;
            if (fan.getSpeed() == Fan.Slow) {
                speedDescription = "Slow";
            } else if (fan.getSpeed() == Fan.Medium) {
                speedDescription = "Medium";
            } else if (fan.getSpeed() == Fan.Fast) {
                speedDescription = "Fast";
            } else {
                speedDescription = "Stopped";
            }

            // Print the fan details
            System.out.println("Fan Speed: " + speedDescription +
                               ", Status: " + (fan.getOn() ? "On" : "Off") +
                               ", Color: " + fan.getColor() +
                               ", Radius: " + fan.getRadius() + " inches");
        }

        // Method to display all fans in the collection
        public void printFanCollection() {
            // For loop will iterate through the collection of fans
            // Calling the printFan method to print each instance
            for (Fan fan : fans) {
                printFan(fan);
            }
        }
    }
}

