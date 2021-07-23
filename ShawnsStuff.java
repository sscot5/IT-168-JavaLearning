import java.util.Scanner;

public class ShawnsStuff 
{
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        log("Whats your first number?");
        int num1 = scanner.nextInt();

        log("Whats your second number?");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        log("The sum is " + sum);
        System.exit(0);
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }


}
