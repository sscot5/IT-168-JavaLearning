/**
 * Author: Stephanie Scott
 *
 * Description: 
 *
 * Date: 7/30/21
 *
 *Write a program that reads three integer values from the keyboard 
 *representing respectively, a number of quarters, dimes, and nickels.
 *Convert the total coin amount to dollars and output the result with
 *dollar notation.
 */

 //import

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyConversion {
    //properties of class
    private static Scanner scanner = new Scanner (System.in);
    private static DecimalFormat percentPattern = new DecimalFormat("0.0#%");
    private static DecimalFormat pricePattern = new DecimalFormat("$0.00");

    public static void main(String[] args) {
        try{

        }

        catch(Exception nope){
            log("Inncorrect input. Please try again.");
        }
    }
}
