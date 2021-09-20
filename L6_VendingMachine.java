/*
 * Author: Stephanie Scott
 * Date: 9/17/21
 */

/**
 * Description: A program that determines the change to be determined from a vending machine.
 * An item in the machine can cost between 25 cents and a dollar, in 5-cent increments
 * the machine accepts only a single dollar bill to pay for the item
 */

// imports
import java.util.Scanner;

public class L6_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // constants
        final int DOLLAR = 100;
        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;

        // Get the price of the item from the vending machine
        System.out.println("Item price must be 25 cents to a dollar, in 5-cent increments.");
        System.out.print("Enter item price: ");
        int itemPrice = scanner.nextInt();
        scanner.close();
        // they always give a dollar
        // calculate change
        int change = DOLLAR - itemPrice;

        // get amount of quarters, dimes, nickels
        int numQuarters = change / QUARTER;
        int remaining = change % QUARTER;
        int numDimes = remaining / DIME;
        remaining = remaining % DIME;
        int numNickels = remaining / NICKEL;
        if (itemPrice < 25 || itemPrice > 100) {
            System.out.println("Price is invalid. Price must be more than 25 cents and less than 100 cents");
        } else if (itemPrice % 5 != 0) {
            System.out.println("Price is invalid. Price must be evenly divisible by 5.");
        } else {
            if (numQuarters > 0) {
                if (numQuarters > 1) {
                    System.out.println(numQuarters + " quarters");
                } else {
                    System.out.println(numQuarters + " quarter");
                }
            }

            if (numDimes > 0) {
                if (numDimes > 1) {
                    System.out.println(numDimes + " dimes");
                } else {
                    System.out.println(numDimes + " dime");
                }
            }

            if (numNickels > 0) {
                System.out.println(numNickels + " nickel");
            }
        }
    }
}
