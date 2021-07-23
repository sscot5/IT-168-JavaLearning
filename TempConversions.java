/**
 * Author: Stephanie Scott
 *
 * Name: Program to convert Fahrenheit to Celsius
 * chapter two of text page 76-77
 *
 * Date: 7/19/21
 *
 */


 //Known Celsius = 5/9 (Farenheit - 32)
public class TempConversions 
{
    public static void main(String[] args) 
    {
        int Farenheit = 98;
        double Celsius = (5.0 * ((double)Farenheit - 32.0)) / 9.0;

        log("There temperature " + Farenheit + " in Farenheit is " + Celsius + " in Celsius.");

        System.exit(0);
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
