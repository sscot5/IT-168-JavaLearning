package loopsCh6;
/*
 * Author: Stephanie Scott
 * Date: 9/14/21
 */

/**
 * Description: An addition calculator
 * 
 * Pseudocode for the addition calculator:
 * set total to 0
 * ask for a number
 * read a number (priming read)
 * while the number is not the sentinel value
 *      add the number to total
 *      read the next number (update read)
 * When the sentinel value is read output the total
  */

  // imports
  import java.util.Scanner;

  public class Accumulation {
      private static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
          final int SENTINEL = 0;
          int total = 0;

          System.out.println("Welcome to the addition calculator.");
          System.out.print("Enter the first number or 0 for the total: ");
          int number = scanner.nextInt();

          while (number != SENTINEL) {
            total += number;
            System.out.print("Enter the next number or 0 for the total: ");
            number = scanner.nextInt();
          }
        System.out.println("The total is " + total);
      }
  }