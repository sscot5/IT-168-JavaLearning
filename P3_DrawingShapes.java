/**
 * Description: A program that 
 * @author: Stephanie Scott
 * Date: 9/24/21
 *
*/

// imports
import java.util.Scanner;

/*
 * 1 – draw a rectangle shape
 * 2 – draw an A shape
 * 0 - quit
 */

public class P3_DrawingShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int QUIT = 0;

        System.out.print("Welcome to the drawing application!");
        System.out.println("\nPlease choose one of the following: \n1 – draw a rectangle shape \n2 – draw an A shape \n0 - quit");
        System.out.println("Enter your choice: ");
        int num = scanner.nextInt();
        
        // choice 1 -- rectangle shape
        if (num == 1) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();
            System.out.print("Enter the character of your choice: ");
            //char ch = scanner;

        }
        // choice 2 -- A shape
        

        scanner.close();
    }
}
