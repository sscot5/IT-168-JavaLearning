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
    //private static DecimalFormat percentPattern = new DecimalFormat("0.0#%");
    //private static DecimalFormat pricePattern = new DecimalFormat("$0.00");

    public static void main(String[] args) 
    {
        try 
        {
            //prompt the user for an integer representing how many
            //quarters, dimes, nickles, and pennies they have (4 integers total)
            int amountOfQuarters = getAmountOfQuarters();
            int amountOfDimes = getAmountOfDimes();
            int amountOfNickles = getAmountOfNickles();
            int amountOfPennies = getAmountOfPennies();

            //convert coin amounts to dollars

            //output in dollar notation

            //prompt for monetary amount user has

            //convert to quarters, dimes, nickles, pennies

        }

        catch(Exception nope)
        {
            log("Inncorrect input. Please try again.");
        }
    }

    public static int getAmountOfQuarters()
    {
        log("How many quarters do you have?");
        int amountOfQuarters = scanner.nextInt();
        return amountOfQuarters;
    }

    public static int getAmountOfDimes()
    {
        log("How many dimes do you have?");
        int amountOfDimes = scanner.nextInt();
        return amountOfDimes;
    }

    public static int getAmountOfNickles()
    {
        log("How many nickles do you have?");
        int amountOfNickles = scanner.nextInt();
        return amountOfNickles;
    }

    public static int getAmountOfPennies()
    {
        log("How many pennies do you have?");
        int amountOfPennies = scanner.nextInt();
        return amountOfPennies;
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
