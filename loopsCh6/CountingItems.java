package loopsCh6;
/*
 * Author: Stephanie Scott
 * Date: 9/15/21
 */

/**
 * Description: A program that reads test scores and outputs the number of students that passed
 * 
 * Pseudocode for counting items
 *  set count to 0
 *  read a test score
 *  while test score is not the sentinel value
 *      if the test score is at least 60
 *          add 1 to count
 *      read next test score
 *  when sentinel value is read print the count
  */

  // imports
  import java.util.Scanner;
  import java.text.DecimalFormat;

public class CountingItems {
    private static Scanner scanner = new Scanner(System.in);
    private static DecimalFormat decimalFormat = new DecimalFormat("0.0%");

    public static void main(String[] args) {
        final int SENTINEL = -1;
        int countPassed = 0;
        int countScores = 0;
        int score;

        System.out.println("This program counts the number of passing test scores.");
        System.out.print("Enter the first score or enter -1 to stop: ");
        score = scanner.nextInt();

        while (score != SENTINEL){
            if (score >= 60) {
                countPassed += 1;
            }
            countScores += 1;
            System.out.print("Enter the next score or -1 to stop: ");
            score = scanner.nextInt();
        }
        //FIXME
        System.out.println("You entered " + countScores + " scores.");
        System.out.println("The number of passing test scores is " + countPassed);

        //FIXME
        double percentPassed = (countPassed / countScores);
        if (countScores != 0) {
            System.out.println(decimalFormat.format(percentPassed) + " of the class passed the test.");
        }
    }
    
}
