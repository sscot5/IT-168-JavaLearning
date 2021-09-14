/*
 * Author: Stephanie Scott
 * Date: 9/3/21
 */

/**
 * Description: A program that generates a username and secret 
 * code based on the user's first name, last name, and phone number.
*/

// imports
import java.util.Scanner;
import java.util.Random;

public class P1_UserSecretCode {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // ask for and print users first and last name seperately
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        // ask for phone number including dashes
        System.out.print("Enter your phone number in the format xxx-xxx-xxxx: ");
        String phoneNumber = scanner.nextLine();
        
        // generate random number between 10 to 99
        Random randomNumber = new Random();
        int start = 10;
        int end = 99;
        int number = randomNumber.nextInt(end - start + 1) + start;
        System.out.println("Random Number: " + number);

        // get the first letter of first name
        char firstNameFirstLetter = firstName.charAt(0);
        
        // get first five characters of the user's last name 
        
        // Case ONE: adding white space then trim
        // String lastNameWithWhiteSpace = lastName + "    ";
        // String lastNameSubstring = lastNameWithWhiteSpace.substring(0, 5);
        // String userName = firstNameFirstLetter + lastNameSubstring.trim();
    
        // Case TWO if else statement
        String lastNameSubstring;
        if (lastName.length() < 5) {
            lastNameSubstring= lastName;
        } else {
            lastNameSubstring = lastName.substring(0, 5);
        }
        
        // Print user name containing first letter of first name + first five letters of last name + random number
        String userName = firstNameFirstLetter + lastNameSubstring;
        System.out.println("The username is: " + userName.toLowerCase() + number);

        // Seperate the last four digits of the phone number, and the first three digits
        int lastDashIndex = phoneNumber.lastIndexOf('-'); 
        String lastFourDigits = phoneNumber.substring(lastDashIndex + 1);
        String areaCode = phoneNumber.substring(0,3);

        // generate a random number from 100 to 999
        Random randomNumber2 = new Random();
        int start2 = 100;
        int end2 = 999;
        int number2 = randomNumber2.nextInt(end2 - start2 + 1) + start2;
        System.out.println("Random Number: " + number2);

        // Create a code by taking the last four digits of the phone number, appending a random number, and then appending the area code.
        String code = lastFourDigits + number2 + areaCode;

        // replace all 6’s in the secret code with @, 
        String replace6s = code.replace('6', '@');

        // replace all 3’s with the letter E, 
        String replace3s = replace6s.replace('3', 'E');

        // replace all 5’s with the letter S
        String replace5s = replace3s.replace('5', 'S');

        // Output the code.
        System.out.println("Your secret code is: " + replace5s);
    }
}