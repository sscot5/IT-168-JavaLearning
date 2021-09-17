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
        // final int DOLLAR = 100;
        // final int QUARTER = 25;
        // final int DIME = 10;
        // final int NICKEL = 5;

        // Get the price of the item from the vending machine
        System.out.println("Item price must be 25 cents to a dollar, in 5-cent increments.");
        System.out.print("Enter item price: ");
        int itemPrice = scanner.nextInt();

        // they always give a dollar
        // calculate change
        //int change = DOLLAR - itemPrice;

        if (itemPrice == 25) {
            System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar" + "\nYour change is \n3 quarters");
        } else if (itemPrice == 30) {
            System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar" + "\nYour change is \n2 quarters \n2 dimes");
        } else if (itemPrice == 35) {
            System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar" + "\nYour change is \n2 quarters \n1 dime \n1 nickel");
        } else if (itemPrice == 40) {
            System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar" + "\nYour change is 2 quarters \n1 dime");
        } else if (itemPrice == 45) {
            System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar" + "\nYour change is \n2 quarters \n1 nickel");
        } else if (itemPrice == 50) {
            System.out.println("You bought an item for " + itemPrice + " cents and gave me a dollar" + "\nYour change is \n2 quarters");
        }

        // remAfterQuarters / dimes = # of dimes
        // remAfterQuarters % dimes = remAfterDimes

        // If more than one coin is returned, the word should be plural with an “s” at the end.  
        // If only one coin is returned, the word should not have an “s” at the end.


        // display separate error messages for any of the following invalid inputs:  
        // a cost under 25 cents, 
        // a cost that is not an integer multiple of 5, 
        // and a cost that is more than a dollar.
    
    }
}
