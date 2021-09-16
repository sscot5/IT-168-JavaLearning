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

public class L5_NumberComparison {
    public static void main(String[] args) {
    
    // generate a random number between 1 and 200
    Random randomNumber = new Random();
    final int START = 1;
    final int END = 200;
    int num1 = randomNumber.nextInt((END) + START);
    System.out.println("Random number: " + num1);
    
    Random randomNum2 = new Random();
    int num2 = randomNum2.nextInt((END) + START);

    if (num1 % 2 == 0){
        System.out.println("The number " + num1 + " is even.");
    } else {
        System.out.println("The number " + num1 + " is odd.");
    }

    if (num1 > 100){
        System.out.println("The number " + num1 + " is large.");
    } else {
        System.out.println("The number " + num1 + " is small.");
    }

    System.out.println("Second random number: " + num2);

    if (num1 > num2){
        System.out.println(num2 + " is smaller than " + num1);
    } else {
        System.out.println(num1 + " is smaller than " + num2);
    }
    }
}
