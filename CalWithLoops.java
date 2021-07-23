/**
 * Author: Stephanie Scott
 * 
 * Name: Cal with Loops
 * 
 * Date: 7/14/21
 * 
 * chapter 2 page 74
 */

public class CalWithLoops 
{   
  public static double n1 = 0;
  public static double n2 = 0;

  public static void main(String[] args)  
    {
        updateNums(7, 5);
        double sum = calSum(n1, n2);
        double diff = calDiff(n1, n2);
        double product = calProduct(n1, n2);
        double quotient =calQuotient(n1, n2);
        log("Sum: " + sum + "\nDiff: " + diff + "\nProduct: " + product + "\nQuotient: " + quotient);
    }

// method used to add two numbers
    public static double calSum(double n1, double n2)
    {
        return n1 + n2;
    }

//method used to subtract two numbers   
    public static double calDiff(double n1, double n2)
    {
        return n1 - n2;
    }

//method used to divide two numbers
    public static double calProduct(double n1, double n2)
    {
        return n1 * n2;
    }

//method used to multiply two numbers
    public static double calQuotient(double n1, double n2)
    {
        return n1 / n2;
    }

//method used to define log
    public static void log(String msg)
    {
        System.out.println(msg);
    }

    public static void incrementByOne(int num)
    {
        if (num == 1)
        {
            n1 = n1 + 1;
        } 
        else if (num == 2)
        {
            n2 = n2 + 1;
        }

    }

//loops
    public static void updateNums(int num1, int num2)
    {
        while (num1 > n1) 
        {
            incrementByOne(1);
        }
        
        while (num2 > n2)
        {
            incrementByOne(2);
        }
    }
}
