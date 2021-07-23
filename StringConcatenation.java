/**
 * Author: Stephanie Scott
 * 
 * Name: String concatenation (joining of two strings, printing one number right after the other)
 * 
 * Date: 7/12/21
 * 
 * This program was written the same time as CalSum to show the difference
 * between adding two int and the concatenation of two strings
 * 
 * this program prints 1 + 2 as 12 instead of 1 + 2 as 3
 */

public class StringConcatenation 
{
    public static void main(String[] args)
    {
        String letter1 = "1";
        String letter2 = "2";
        String testString = letter1 + letter2;

        System.out.println("The sum is " + testString);
        System.exit(0);

    }    
}
