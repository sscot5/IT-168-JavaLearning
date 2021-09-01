/**
 * Author: Stephanie Scott
 *
 * Description: 
 *
 * Date: 9/1/21
 *
 */

// imports
import java.util.Scanner;


public class MilesPerGallon {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //ask for the number of gallons used on trip
        System.out.print("How many gallons of gas did you use on your trip?  ");
        int gallonsGasUsed = scanner.nextInt();

        //ask for the number of miles driven on trip
        System.out.print("How many miles did you travel on your trip?  ");
        int milesTraveled = scanner.nextInt();

        //calculate miles per gallon
        double milesPerGallon = (double) milesTraveled / gallonsGasUsed;

        //print miles per gallon
        System.out.println("The miles per gallon for your trip is " + milesPerGallon);
    }
}
