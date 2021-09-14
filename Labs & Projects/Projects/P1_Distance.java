/*
 * Author: Stephanie Scott
 * Date: 9/3/21
 * 
 */

/**
 * Description: A program that calculates the distance between two points
 * 
 * Given formula: distance = square root of ((x2-x1)^2 + (y2-y1)^2)
 * 
 * Math class methods needed:
 * pow(double a, double b) --> Returns the value of the first argument raised to the power of the second argument.
 * sqrt(double a) --> Returns the correctly rounded positive square root of a double value.
 * 
*/

// imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class P1_Distance {
    private static Scanner scanner = new Scanner(System.in);
    private static DecimalFormat decimalFormat = new DecimalFormat("#0.00");
    public static void main(String[] args) {
    
    // Prompt the user for two x integer values and two y integer values
    System.out.print("Enter the first x value: ");
    int x1 = scanner.nextInt();
    
    System.out.print("Enter the first y value: ");
    int y1 = scanner.nextInt();
    
    System.out.print("Enter the second x value: ");
    int x2 = scanner.nextInt();

    System.out.print("Enter the second y value: ");
    int y2 = scanner.nextInt();

    // calculate distance
    final int SQUARED_EXPONATE = 2;
    int dX = (x2 - x1);
    int dY = (y2 - y1);
    double dXSquared = Math.pow(dX, SQUARED_EXPONATE);
    double dYSquared = Math.pow(dY, SQUARED_EXPONATE);
    double distance = Math.sqrt(dXSquared + dYSquared);

    // display the distance formatted with only two decimal spaces
    System.out.println("The distance of (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + decimalFormat.format(distance) + ".");
    }
}
