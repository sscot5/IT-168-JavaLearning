/*
 * Author: Stephanie Scott
 * Date: 9/13/21
 */

/**
 * Description: A program that compares a generates a random number,
 * determines if it is even or odd. Compares two random numbers to 
 * determine which is larger.
 */

 // imports
 import java.util.Random;

public class NumberComparison {
    public static void main(String[] args) {
    
    // generate a random number between 1 and 200
    Random randomNumber = new Random();
    int start = 1;
    int end = 200;
    int num1 = randomNumber.nextInt(end - start + 1) + start;
    System.out.println("Random number: " + num1);

    if (num1 % 2 == 0){
        System.out.println("The number " + num1 + " is even.");
    } else {
        System.out.println("The number " + num1 + " is odd.");
    }

    }
}
