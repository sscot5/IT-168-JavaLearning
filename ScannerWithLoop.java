/**
 * Author: Stephanie Scott
 * 
 * Name: Scanner with Loops
 * 
 * Date: 7/18/21
 * 
 * 
 */

import java.util.Scanner;

public class ScannerWithLoop
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        //boolean is true/false
        boolean isIncorrectLetter = true;
        
        //inside () needs a boolean value
        while (isIncorrectLetter)
        {
            String stringGoal = "A";
            log("Type " + stringGoal);
            String stringTyped = scanner.nextLine();
// = assigns a value; == checks equality (true statement); != is for "does not equal"
// "" is for String type '' is used for char types
            
            isIncorrectLetter = !stringGoal.equals(stringTyped);

            log("stringGoal: " + stringGoal);
            log("stringTyped: " + stringTyped);
            log("!stringGoal.equals(stringTyped): " + isIncorrectLetter);
        }

        log("You did it!");
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
