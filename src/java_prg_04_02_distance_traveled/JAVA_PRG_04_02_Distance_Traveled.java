/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_02_distance_traveled;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * The distance a vehicle travels can be calculated as follows:
 * 
 *      Distance = Speed * Time
 * 
 * For example, if a train travels 40 miles-per-hour for three hours, the
 * distance traveled is 120 miles. Write a program that asks for the speed of a
 * vehicle (in miles-per-hour) and the number of hours it has traveled. It
 * should use a loop to display the distance a vehicle has traveled for each
 * hour of a time period specified by the user. For example, if a vehicle is
 * traveling at 40 mph for a three-hour time period, it should display a report
 * similar to the one that follows:
 * 
 *      Hour            Distance Traveled
 *      ---------------------------------
 *      1                   40 
 *      2                   80
 *      3                  120
 * 
 * Input validation: Do not accept a negative number for speed and do not
 * accept any value less than 1 for time traveled.
 */
public class JAVA_PRG_04_02_Distance_Traveled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare ints for holding time, speed, and calculated distance
        int intTime;
        int intSpeed;
        int intDistance;
        
        // Create a new keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Use a loop on data input while user inputs
        // are invalid (less than 0 and greater than a 
        // reasonable number (1000))
        do {
            System.out.print("Please enter a time in hours\n" +
                    "that your vehicle will travel: ");
            intTime = scrKeyboard.nextInt();
        } while(intTime <= 0 || intTime >= 1000);

        // Similar loop on speed input for validation
        do {
            System.out.print("Please enter the speed of\n" +
                    "your vehicle in miles-per-hour: ");
            intSpeed = scrKeyboard.nextInt();
        } while(intSpeed <= 0 || intSpeed >= 10000);
        
        // Header for the table that will be printed by loop
        System.out.println("\n\nTime\t\tDistance Traveled");
        
        // Loop through once for each hour of time
        // entered above and print out the hour and 
        // calculated distance value
        for(int i = 1 ; i <= intTime ; i++)
        {
            intDistance = i * intSpeed;
            System.out.println(i + "\t\t" + intDistance);
        }
    }
    
}
