/*
 * Author: Stephanie Scott
 * Date: 9/1/21
 */

/**
 * Description: A program to calculate cost of gas for trip
  */

  // imports
  import java.util.Scanner;
  import java.text.DecimalFormat;

public class L3_CostOfGasForTrip {
    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat pricePattern = new DecimalFormat("$0.00");
    public static void main(String[] args) {
        //ask for total miles for trip
        System.out.print("What is the total number of miles for your trip?  ");
        double totalMiles = scanner.nextDouble();

        //ask how many mpg does your car use
        System.out.print("How many miles per gallon does your vehichle average?  ");
        double mpg = scanner.nextDouble();

        //ask what is the current price of gas
        System.out.print("What is the current price of gas?  ");
        double gasPrice = scanner.nextDouble();

        //calculate cost = miles of trip / mpg * current price of gas
        double costOfGasForTrip = (totalMiles / mpg) * gasPrice;

        //print cost of trip
        System.out.println("The total cost of your trip in gas is " + pricePattern.format(costOfGasForTrip));
    }
}