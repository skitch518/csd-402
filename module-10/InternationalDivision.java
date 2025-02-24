/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schriner_mod10;



public class InternationalDivision extends Division {
    // Fields specific to InternationalDivision
    private String country;
    private String language;

    // Constructor to initialize all fields
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Calls superclass constructor
        this.country = country;
        this.language = language;
    }

    // Implement the display() method
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName + ", Account: " + accountNumber +
                           ", Country: " + country + ", Language: " + language);
    }
}

