/*
 * Author: Stephanie Scott
 * Date: 9/16/21
 */

/**
 * Description: A program that takes an order from a menu and calculates the cost of the order.
 */

 // imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class LoopCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat pricePattern = new DecimalFormat("$0.00");

        String menu = "\tC Cheeseburger: $7.49";
                menu += "\n\tH Hot dog: $6.99";
                menu += "\n\tL Lemonade: $2.50";
                menu += "\n\tT Iced tea: $2.75";
        
        double orderCost = 0;

        System.out.println("Welcome to Bonnie's Burgers. \n Select from our menu.");
        System.out.println(menu);
        System.out.print("Order an item or \"S\" to stop: ");
        char option = scanner.next().charAt(0);
        scanner.close();

        while (option != 'S' && option != 's') {
            switch (option) {
                case 'c':
                case 'C':
                    System.out.print("Cheeseburger ordered.");
                    orderCost += 7.49;
                    break;
                case 'h':
                case 'H':
                    System.out.print("Hot dog ordered.");
                    orderCost += 6.99;
                    break;
                case 'l':
                case 'L':
                    System.out.print("Lemonade ordered.");
                    orderCost += 2.50;
                    break;
                case 't':
                case 'T':
                    System.out.print("Iced tea ordered.");
                    orderCost += 2.75;
                    break;
                default:
                    System.out.println("Unrecongnized menu item.");
            }
            System.out.println("\nSubtotal: " + pricePattern.format(orderCost));
            System.out.print("\nOrder another item or \"S\" to stop: ");
            option = scanner.next().charAt(0);
        }
        System.out.println("\nTotal order cost is: " + pricePattern.format(orderCost));
    }    
}
