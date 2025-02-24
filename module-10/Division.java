/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schriner_mod10;


// File: Division.java
public abstract class Division {
    // Fields
    protected String divisionName;
    protected String accountNumber;

    // Constructor to initialize division name and account number
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}

