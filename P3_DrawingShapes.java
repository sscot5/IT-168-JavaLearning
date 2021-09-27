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

        System.out.print("Welcome to the drawing application!");
        System.out.println("\nPlease choose one of the following: \n1 – draw a rectangle shape \n2 – draw an A shape \n0 - quit");
        System.out.print("Enter your choice: ");
        int num = scanner.nextInt();

        while (num != 0) {

            // choice 1 -- rectangle shape
            if (num == 1) {
                System.out.println("Let's draw a rectangle!");
                System.out.print("Enter the number of rows: ");
                int numRows = scanner.nextInt();
                System.out.print("Enter the number of columns: ");
                int numColumns = scanner.nextInt();
                System.out.print("Enter the character of your choice: ");
                String character = scanner.next();
                
                for (int i = 0; i < numRows; i++){
                    for (int j = 0; j < numColumns; j++) {
                        System.out.print(character);
                    }
                    System.out.println();
                }
            }

            // choice 2 -- A shape
            if (num == 2){
                System.out.println("Let's draw an A!");
                System.out.print("Enter an odd number between 11 and 23 to determine the size of A: "); // needs to be read as a string
                int oddNum = scanner.nextInt();

                if (oddNum % 2 == 0 || oddNum < 11 || oddNum > 23) { //FIXME
                    System.out.print("Please enter an odd number between 11 and 23: ");
                    oddNum = scanner.nextInt();
                } else {
                    // Draw A Shape
                }
            }  
        
            if (num != 0 || num != 1 || num != 2) {
                System.out.println("Please enter 1 to draw a rectangle, 2 to draw an A, or 0 to quit.");
                System.out.print("Enter your choice: ");
                num = scanner.nextInt();
            }
        } 
        
        scanner.close();

        if (num == 0) {
            System.out.println("Goodbye!");
        }
    }
}
