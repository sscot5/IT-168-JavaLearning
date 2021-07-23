/**
 * Author: Stephanie Scott
 * 
 * Name: Cal and log area
 * 
 * Date: 7/16/21
 * 
 * 
 */

public class CalLogArea 
{
    public static void main(String[] args)
    {
        double radius = 1;
        calcAndLogArea(radius);
    }

    public static double calculateArea(double radius)
    {
        final double PI = 3.14;
        return PI * radius * radius;
    }

    public static void logArea(double radius, double area)
    {
        System.out.println("The area for a circle with a radius of " + radius + " is " + area);
    }

    public static void calcAndLogArea(double radius)
    {
        double area = calculateArea(radius);
        logArea(radius, area);
    }
}
