/**
 * Author: Stephanie Scott
 * 
 * Name: CalArea
 * 
 * Date: 7/13/21
 * 
 */

public class FifthProgram 
{
    public static void main(String[] args)
    {
        double radius = 3.5;
        double area = calculateArea(radius);
        logArea(radius, area);
        
        radius = 5;
        area = calculateArea(radius);
        logArea(radius, area);

        radius = 7;
        area = calculateArea(radius);
        logArea(radius, area);

        System.exit(0);
    }

    public static double calculateArea(double radius)
    {
        final double PI = 3.14;
        double area = PI * radius * radius;
        return area;
    }

    public static void logArea(double radius, double area)
    {
        System.out.println("The area for a circle with a radius of " + radius + " is " + area);
    }
}
