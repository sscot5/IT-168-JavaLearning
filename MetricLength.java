/**
 * Author: Stephanie Scott
 *
 * Name: Program to convert inches to cm
 * chapter two of text page 64-65
 *
 * Date: 7/19/21
 *
 */

//known 2.54 cm in an inch
//convert inches to centimeters

public class MetricLength
{
    public static void main(String[] args)
    {
        final double CM_PER_INCH = 2.54;
        double inches = 5;
        double cm = inches * CM_PER_INCH;

        log("There are " + cm + " centimeters in " + inches + " inches.");
        System.exit(0);
    }
    public static void log(String msg)
    {
        System.out.println(msg);
    }

}
