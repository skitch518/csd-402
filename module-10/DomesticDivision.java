/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schriner_mod10;

/**
 *
 * @author jason
 */

public class DomesticDivision extends Division {
    // Field specific to DomesticDivision
    private String state;

    // Constructor to initialize all fields
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber); // Calls superclass constructor
        this.state = state;
    }

    // Implement the display() method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName + ", Account: " + accountNumber + 
                           ", State: " + state);
    }
}
