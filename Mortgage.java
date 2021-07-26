/**
 * Author: Stephanie Scott
 *
 * Name: Program to calculate a monthly mortgage payment
 * assuming that the intrest rate is compounded monthly
 *
 * Date: 7/26/21
 *
 * calculate the monthly payment using the following formulas:
 * Monthly payment = (mIR * M) / (1 - (1 / (1 + mIR)^12*nOY));
 * where mIR = monthly interest rate = annual interest rate / 12
 * nOY= number of years
 * M = mortgage amount
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mortgage 
{
    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat percentPattern = new DecimalFormat("0.0#%");
    public static DecimalFormat pricePattern = new DecimalFormat("$0,000.00");
    
    public static void main(String[] args)
    {
        try {
            
            //prompt the user for a double representing the annual interest rate. For example, 3.5% would be entered as .035
            double annualIntrestRate = getAnnualIntrestRate();
            
            //prompt the user for the number of years the mortgage will be held (typical input here is 10, 15, or 30)
            double yearsOfMortgage = getYearsOfMortgage();
            
            //prompt the user for a number representing the mortgage amount borrowed from the bank
            double amountBorrowed = getAmountBorrowed();
            
            //print the annual interest rate in percent notation
            printIntrestRate(annualIntrestRate);
            
            //print the mortgage amount in dollars
            printMortgageAmount(amountBorrowed);
            
            double mIR = annualIntrestRate / 12;
            double nOY = yearsOfMortgage;
            double m = amountBorrowed;
            double x = 1 + mIR;
            double y = 12 * nOY;
            double z = Math.pow(x, y);
            double monthlyPayment = (mIR * m) / (1 - (1 / (z)));
            
            //print the monthly payment in dollars, with only two significant digits after the decimal point
            printMonthlyPayment(monthlyPayment);
            
            //print the total payment over the years, with only two significant digits after the decimal point
            double total = (monthlyPayment * 12) * nOY;
            printTotal(total);

            //print the overpayment, i.e., the difference between the total payment over the years and the mortgage amount
            //with only two significant digits after the decimal point
            double overPayment = total - m;
            printOverPayment(overPayment);

            //print the overpayment as a percentage (in percent notation) of the mortgage amount
            double percentOver = overPayment / m;
            printPercentOverPayment(percentOver);
        }
        catch(Exception nope){
            log("Nope. Try again.");
        }
    }   
    
    public static double getAnnualIntrestRate(){
        log("What is your annual intrest rate as a decimal?");
        double annualInrestRate = scanner.nextDouble();
        return annualInrestRate;
    }

    public static void printIntrestRate(double intrestRate){
        log("Your annual interest rate is " + percentPattern.format(intrestRate));
    }

    public static double getYearsOfMortgage(){
        log("Is your mortgage a 10, 15, or 30 year mortgage?");
        double yearsOfMortgage = scanner.nextDouble();
        return yearsOfMortgage;
    }

    public static double getAmountBorrowed(){
        log("What is the loan amount?");
        double amountBorrowed = scanner.nextDouble();
        return amountBorrowed;
    }

    public static void printMortgageAmount(double amountBorrowed){
        log("Your mortgage amount is " + pricePattern.format(amountBorrowed));
    }

    public static void printMonthlyPayment(double monthlyPayment){
        log("Your monthly mortgage payment is " + pricePattern.format(monthlyPayment));
    }

    public static void printTotal(double total){
        log("Your total mortage is " + pricePattern.format(total));
    }

    public static void printOverPayment(double overPayment){
        log("Your overpayment is " + pricePattern.format(overPayment));
    }

    public static void printPercentOverPayment(double percentOver){
        log("Your payment is " + percentPattern.format(percentOver) + " over your principle investment.");
    }
    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
