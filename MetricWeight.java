/**
 * Author: Stephanie Scott
 *
 * Name: Program to convert kilograms to pounds
 * chapter two of text page 86 problem 48
 *
 * Date: 7/26/21
 *
 */

// 1lb = 0.454kg

public class MetricWeight {
    public static void main(String[] args){
        final double KG_PER_POUND = 0.454;
        double kg = 50;
        double lb = kg / KG_PER_POUND;
        
        System.out.println("There are " + lb + " pounds in " + kg + " kilograms.");
    }

}