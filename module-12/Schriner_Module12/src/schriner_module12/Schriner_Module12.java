/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schriner_module12;

/**
 *
 * @author jason
 */
public class Schriner_Module12 {
    
    // Method with no parameters, 
    public static double yearlyService() {
        double standardServiceCharge = 100.00; // Standard service charge
        return standardServiceCharge;
    }
    
    // Method with one parameter 
    public static double yearlyService(double oilChangeFee) {
        double standardServiceCharge = 100.00; // Standard service charge
        return standardServiceCharge + oilChangeFee;
    }
    
    // Method with two parameters 
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardServiceCharge = 100.00; // Standard service charge
        return standardServiceCharge + oilChangeFee + tireRotationFee;
    }
    
    // Method with three parameters
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDeduction) {
        double standardServiceCharge = 100.00; // Standard service charge
        return standardServiceCharge + oilChangeFee + tireRotationFee - couponDeduction;
    }
    
    public static void main(String[] args) {
        // Testing the methods
        
        // Test the method with no parameters
        System.out.println("Yearly service is $ " + yearlyService());
        System.out.println("Yearly service is $ " + yearlyService());
        
        // Test the method with one parameter
        double oilChangeFee = 30.00;
        System.out.println("Yearly service with oil change is $ " + yearlyService(oilChangeFee));
        System.out.println("Yearly service with oil change is $ " + yearlyService(oilChangeFee));
        
        // Test the method with two parameters
        double tireRotationFee = 20.00;
        System.out.println("Yearly service with oil change, tire rotation is $ " + yearlyService(oilChangeFee, tireRotationFee));
        System.out.println("Yearly service with oil change, tire rotation is $ " + yearlyService(oilChangeFee, tireRotationFee));
        
        // Test the method with three parameters
        double couponDeduction = 15.00;
        System.out.println("Yearly service with oil change, tire rotation and coupon is $" + yearlyService(oilChangeFee, tireRotationFee, couponDeduction));
        System.out.println("Yearly service with oil change, tire rotation and coupon is $" + yearlyService(oilChangeFee, tireRotationFee, couponDeduction));
    }
}
