/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schriner_mod10;


// File: UseDivision.java
public class UseDivision {
    public static void main(String[] args) {

        // Create instance of DomesticDivision
        Division domestic1 = new DomesticDivision("East Coast Division", "095", "New York");
        Division domestic2 = new DomesticDivision("West Coast Division", "518", "Oregon");

        // Create instance of InternationalDivision
        Division international1 = new InternationalDivision("Europe Division", "754", "France", "French");
        Division international2 = new InternationalDivision("Asia Division", "463", "Japan", "Japanese");

        // Call the display() method on each instance
        domestic1.display();
        domestic2.display();
        international1.display();
        international2.display();
    }
}


