/**
 * Author: Stephanie Scott
 *
 * Name: Program to calculate a monthly mortgage payment
 * assuming that the intrest rate is compounded monthly
 *
 * Date: 7/26/21
 *
 * 
 */

 import java.text.DecimalFormat;
 import java.util.Scanner;
 import java.text.NumberFormat;

public class Mortgage 
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
//prompt the user for a double representing the annual interest rate. For example, 3.5% would be entered as .035
        double annualIntrestRate = getAnnualIntrestRate();
        double mIR = annualIntrestRate / 12;

        //need to use decimal conversion

//prompt the user for the number of years the mortgage will be held (typical input here is 10, 15, or 30)
        double yearsOfMortgage = getYearsOfMortgage();
        double nOY = yearsOfMortgage;

//prompt the user for a number representing the mortgage amount borrowed from the bank
        double amountBorrowed = getAmountBorrowed();
        double m = amountBorrowed;
        double x = 1 + mIR;
        double y = 12 * nOY;
        double z = Math.pow(x, y);
        double monthlyPayment = (mIR * m) / (1 - (1 / (z)));
        log("Your monthly payment is " + monthlyPayment);

//calculate the monthly payment using the following formulas:
//Monthly payment = (mIR * M) / (1 - (1 / (1 + mIR)^12*nOY));
//where mIR = monthly interest rate = annual interest rate / 12
//nOY= number of years
//M = mortgage amount

//output a summary of the mortgage problem as follows:
//the annual interest rate in percent notation
//the mortgage amount in dollars
//the monthly payment in dollars, with only two significant digits after the decimal point
//the total payment over the years, with only two significant digits after the decimal point
//the overpayment, i.e., the difference between the total payment over the years and the mortgage amount, with only two significant digits after the decimal point
//the overpayment as a percentage (in percent notation) of the mortgage amount
    }   
    
    public static double getAnnualIntrestRate(){
        log("What is your annual intrest rate as a decimal?");
        double annualInrestRate = scanner.nextDouble();
        return annualInrestRate;
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

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
