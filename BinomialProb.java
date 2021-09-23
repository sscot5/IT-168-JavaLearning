/*
 * Author: Stephanie Scott
 * Date: 9/16/21
 */

/**
 * Description: A program that calculates the mean and standard deviations for binomial probability.
 * mean = n * p
 * standard deviation = square root (n * p * (1-p))
 *
 * n is the total number of trials
 * p is the probability of success
 */

// imports
import java.util.Scanner;

public class BinomialProb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask for the total number of trials, the probability of success, and the
        // number of successes in n trials
        System.out.print("Enter the total number of trials: ");
        int n = scanner.nextInt();
        System.out.print("Enter the probability of success: ");
        double p = scanner.nextDouble();
       scanner.close();

        // calculate mean (n * p)
        double mean = n * p;
        System.out.println("The mean is: " + mean);

        // calculate the standard deviation = square root (n * p * (1-p))
        double a = n * p * (1 - p);
        double standardDeviation = Math.sqrt(a);
        System.out.println("The standard deviation is: " + standardDeviation);
    }
}
