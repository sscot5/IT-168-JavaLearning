/**
 * Description: A program that sums a n number of odd integers.
 * @author: Stephanie Scott
 * Date: 9/20/21
 *
*/

/*
 * Write a program in OddIntegers.java that displays the first n positive odd integers
 * and computes and displays their sum. For example if n is 4, you should print the following 
 * to the screen: 1 + 3 + 5 + 7 = 16
 * 
 * Obtain the value for n from the user. Complete this exercise using a while loop.
 */

 // imports
 import java.util.Scanner;

 public class L6_OddIntegerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of odd integers you would like to total: ");
        int n = scanner.nextInt();
        scanner.close();
        int oddSum = 0;
        int count = 0;
        int currentNumber = 1;
       
        while (count < n) {
            oddSum = oddSum + currentNumber;
            System.out.print(currentNumber);
            if (count != n - 1) {
                System.out.print(" + "); 
            } 
            currentNumber += 2;
            count++;
        }
        System.out.println(" = " + oddSum);
    }
}