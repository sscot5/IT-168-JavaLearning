/*
 * Author: Stephanie Scott
 * Date: 9/13/21
 */

/**
 * Description: A program that to compute the commission for a salesperson’s sales given the number of items sold and the total sales amount
 * 
 * If the sales amount is less than $5000, the salesperson receives a 5% commission
 * If the sales amount is at least $5000, the salesperson receives a 7.5% commission.
 * If the number of items sold was at least 5 and the amount of the sale minus the commission 
 *      is at least $20000, the salesperson receives bonus of $500.
 * All sales amounts are in whole dollars, though commissions are not.
 * The program is to print the total commission. If there was a bonus received, it also prints information about the bonus.
*/

// imports
import java.text.DecimalFormat;
import java.util.Scanner;

public class SaleCommission{
    private static DecimalFormat decimalFormat = new DecimalFormat("$#0.00"); 
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    
    // constants
    final double BASE_COMMISSION = 0.05;
    final double INCREASE_COMMISSION = 0.075;
    final int BONUS = 500;

    // get number of items sold and total sales amount
    System.out.print("Enter number of items sold: ");
    int numSold = scanner.nextInt();
    System.out.print("Enter total sales amount: ");
    int totalSales = scanner.nextInt();

    // calculate commission
    double commission;
    if (totalSales >= 5000){
        commission = totalSales * INCREASE_COMMISSION;
    } else {
        commission = totalSales * BASE_COMMISSION;
    }

    // print results
    System.out.println("Number of items sold: " + numSold);
    System.out.println("Total sales amount: " + totalSales);
    System.out.println("Base commission: " + decimalFormat.format(commission));
    
    // calculate bonus
    double totalSaleCommission = totalSales - commission;
    System.out.println("Total sale commission: " + decimalFormat.format(totalSaleCommission));
    
    double commissionWithBonus;
    if (numSold >= 5 && totalSaleCommission >= 20000){
        commissionWithBonus = commission + BONUS;
        boolean bonus = true;
        System.out.println("Recieved bonus: " + bonus);
        System.out.println("Total commission: " + decimalFormat.format(commissionWithBonus));
    } else {
        commissionWithBonus = commission;
        boolean bonus = false;
        System.out.println("Recieved bonus: " + bonus);
        System.out.println("Total commission: " + decimalFormat.format(commissionWithBonus));
    }
    }
}