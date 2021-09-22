/*
 * Author: Stephanie Scott
 * Date: 9/22/21
 */

/**
 * Description: A program that determines if a number is prime.
 */

// imports
import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int num = scanner.nextInt();
    scanner.close();

    boolean prime = true;
    for (int i = 2; i < num; i++){
        if (num % i == 0){
            prime = false;
        }
    }
    if (prime && num > 1){
        System.out.println("The number " + num + " is a prime number.");
    } else {
        System.out.println("The number " + num + " is not a prime number.");
    }
    }
}