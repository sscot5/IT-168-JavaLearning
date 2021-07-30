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

//import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyConversion
{
    //properties of class
    private static Scanner scanner = new Scanner (System.in);
    //private static DecimalFormat pricePattern = new DecimalFormat("$0.00");

    public static void main(String[] args) 
    {
        try 
        {
            //prompt the user for an integer representing how many
            //quarters, dimes, nickles, and pennies they have (4 integers total)
            double amountOfQuarters = getAmountOfQuarters();
            double amountOfDimes = getAmountOfDimes();
            double amountOfNickles = getAmountOfNickles();
            double amountOfPennies = getAmountOfPennies();

            //convert coin amounts to dollars
            printAmountOfMoney(amountOfQuarters, amountOfDimes, amountOfNickles, amountOfPennies);

            //output in dollar notation

            //prompt for monetary amount user has

            //convert to quarters, dimes, nickles, pennies

        }

        catch(Exception nope)
        {
            log("Inncorrect input. Please try again.");
        }
    }

    public static double getAmountOfQuarters()
    {
        log("How many quarters do you have?");
        double amountOfQuarters = scanner.nextInt();
        double quarterAmount = 0.25 x amountOfQuarters;
        return quarterAmount;
    }

    public static double getAmountOfDimes()
    {
        log("How many dimes do you have?");
        double amountOfDimes = scanner.nextInt();
        return amountOfDimes;
    }

    public static double getAmountOfNickles()
    {
        log("How many nickles do you have?");
        double amountOfNickles = scanner.nextInt();
        return amountOfNickles;
    }

    public static double getAmountOfPennies()
    {
        log("How many pennies do you have?");
        double amountOfPennies = scanner.nextInt();
        return amountOfPennies;
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
