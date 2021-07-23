public class ExplicitTypeCasting 
{
    public static void main(String[] args) 
    {
        int a = 1;
        System.out.println(a); // => 1
        
        double b = 1.9;
        System.out.println(b); // => 1.9

        // Can go from int to double
        double c = a + b;
        System.out.println(c); // => 2.9

        // Can not go from double to int without type casting
        int d = a + (int)b; // 1.0 -> 1 decimal value is truncated
        System.out.println(d); // => 2

        // arithmetic without using double, assuming it is double
        double test = 2.0 * 3.0 / 4.0;
        System.out.println(test); // => 1.5
    }    
}
