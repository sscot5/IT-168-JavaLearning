/*
 * Author: Stephanie Scott
 * Date: 9/15/21
 */

/**
 * Description: a program to calculate an average
 * 
 * Pseudocode:
 *  set total to 0
 *  set count to 0
 *  read a number
 *  while the number is not the sentinel value 
 *      add the number to total
 *      add 1 to the count
 *  read the next number
 *  once the sentinel value is read
 *      calculate the average (total / count)
 *  output the average
*/

  // imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileCalAverage {
   private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int total = 0;
        final int SENTINEL = -1;
        int score;

        System.out.print("Calculating a class average. \nEnter each test score. Enter -1 when finished. \nEnter the first test score: ");
        score = scanner.nextInt();

        while (score != SENTINEL){
            total += score;
            count += 1;

            System.out.print("Enter the next test score: ");
            score = scanner.nextInt();
        }

        if (count != 0){
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            System.out.println("The class average is " + decimalFormat.format((double) (total) / count));
        } else {
            System.out.println("No grades were entered.");
        }
    }
}
