/**
 * Author: Stephanie Scott
 * 
 * Name: 
 * 
 * Date: 7/18/21
 * 
 * 
 */

public class Arrays 
{
    public static void main(String[] args) //arrays are contained within square brackets ==> String[] is a String array
    {
        String name = "Shawn is super rad.";
        System.out.println(name.charAt(0)); //=> S
        //name.charAt(0)--asking for the value of the first character in the String

        char[] nameArray = name.toCharArray();
        System.out.println(nameArray[1]);

        // example arrays
        // boolean[] booArr = new boolean[] { true, false };
        // int[] intArr = new int[] { 1, 2, 3 };
        // double[] doubleArr = new double[] { 1.0, 1.1, 1.2 };
        // char[] charArr = new char[] { 'a', 'b', 'c' };
        // String[] stringArr = new String[] { "this", "has", "double", "quotes" };

        // example array, only allowed 10 integers in this array
        // int[] testArr = new int[10];
    }
}
