/**
 * Author: Stephanie Scott
 * 
 * Name: Calculations
 * 
 * Date: 7/9/21
 * 
 * double is number with a decimal
 * 
 * final is written before double because the number PI will not change
 * type identifer = value ex:(double radius = 3.5;) 
 * 
 * page 56 of text: a constant is a value we know will not and should not change during program execution,
 * nor is likely to change from one execution of the program to another ==> final is written before 
 * they type identifer to define it as a constant
 * 
 * constant identifiers are conventionally written in all caps and seperated by an underscore
 *          ex: final dataType CONSTANT_IDENTIFIER = assignedValue;
 * 
 *      so double is the type, radius is the identifer, and 3.5 is the value
 * we name identifer anything we want it to be
 * page 45 of the text "When we use a named variable, we need to tell the compiler which kind
 * of data we will store in the variable. We do this by giving a data type for each variable."
 * 
 * Java supports 8 primitive data types: byte, short, int, long, float, double, char, and boolean
 * 
 * The data type we specify for a variable tells the compiler how much memory to allocate and the 
 * formate in which to store the data.
 * 
 * 
 */

public class CalArea 
{
    public static void main(String[] args)
    {
        final double PI = 3.14; //PI is in all caps because it is a constant variable
        double radius = 3.5;
        double area = PI * radius * radius;

        log("The area is " + area);
        System.exit(0);
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
