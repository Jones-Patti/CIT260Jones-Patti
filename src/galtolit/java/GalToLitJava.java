/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolit.java;

/**
 *
 * @author kadosch2
 */
public class GalToLitJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons; // holds the number of gallons
        double liters; // holds number of liters
        
        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; // convert to liters
        
        // output result
        System.out.println(gallons + " gallons is " + liters + " liters. ");
        
    }
    
}
