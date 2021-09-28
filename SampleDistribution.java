/*
 * Author: Stephanie Scott
 * Date: 9/28/21
 */

/**
 * Description: A program that calculates the mean and standard deviation for the sample mean x bar.
 * mean of the sample equals the population mean
 * standard deviation of x bar equals the standard deviation of population devided by the square root of the sample size (n)
 * z equals (x bar - population mean) / standard deviation of x bar
 */

// imports
import java.util.Scanner;

public class SampleDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sample size: ");
        double n = scanner.nextDouble();
        System.out.print("Enter the population mean: ");
        double populationMean = scanner.nextDouble();
        System.out.print("Enter the population standard deviation: ");
        double populationStanDeviation = scanner.nextDouble();
        
        double xBarMean = populationMean;
        double sampleStanDeviation = populationStanDeviation / (Math.sqrt(n));
        
        System.out.println("The sample mean is " + xBarMean + "\nThe sample standard deviation is " + sampleStanDeviation);
        
        
        // System.out.print("What is the lower bound: ");
        // double lowerBound = scanner.nextDouble();
        // System.out.print("What is the upper bound: ");
        // double upperBound = scanner.nextDouble();
        // double z = (upperBound - lowerBound) / sampleStanDeviation; 
        scanner.close();

        //System.out.println("The value of z is " + z);



    }
}
