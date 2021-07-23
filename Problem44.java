/**
 * Author: Stephanie Scott
 *
 * Write a program that calculates and outputs the
 * square of each integer from 1-9
 *
 * Date: 7/19/21
 *
 */


 // for loop is used because we know we need to do 10 iterations
public class Problem44 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 9; i++)
        {
            int result = i * i;
            System.out.println(result);
        }

        // Example with using a while loop with a known iteration
        // int count = 1;
        // while (count <= 9)
        // {
        //   // code goes here
        //   count++;
        // }
    }
}
