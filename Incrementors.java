/**
 * Author: Stephanie Scott
 * 
 * Name: Incrementors
 * 
 * Date: 7/15/21
 * 
 * chapter 2 of text
 * ++ increments by 1
 * += increments by what you pass to it
 * -- decreases by 1
 * -= decreases by what you pass it
 * *= multiplys by what you pass it
 * /= divides by what you pass it
 */

public class Incrementors {
    public static void main(String[] args) {
        int one = 1;
        System.out.println(incrimentByOne(one));
        System.out.println(incrimentByN(one, 2));
    }
    public static int incrimentByOne(int num)
    {
        return ++num;
    }
    public static int incrimentByN(int num, int n)
    {
        return num += n;
    }
}
