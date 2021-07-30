
/**
 * Author: Stephanie Scott
 *
 * Description: Converts amount of change to dollar notation
 *
 * Date: 7/30/21
 */

import java.util.Scanner;

public class ConvertToChange {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    try {
      double amountOfMoney = getAmountOfMoney();

      amountOfMoney = printQuartersAndReturnsRemainingAmount(amountOfMoney);
      amountOfMoney = printDimesAndReturnsRemainingAmount(amountOfMoney);

      log("End for test");

    } catch (Exception nope) {
      log("Incorrect input. Please try again.");
    }
  }

  public static double getAmountOfMoney() {
    log("How much money do you have?");
    double amountOfMoney = scanner.nextDouble();
    return amountOfMoney;
  }

  public static double printQuartersAndReturnsRemainingAmount(double amountOfMoney) {
    int numberOfQuarters = (int) (amountOfMoney / 0.25);
    log("You have " + numberOfQuarters + " quarters");
    // .87 => 3q, 1d, 2p
    // we only care about the remaining .12
    return amountOfMoney % 0.25;
  }

  public static double printDimesAndReturnsRemainingAmount(double amountOfMoney) {
    int numberOfDimes = (int) (amountOfMoney / 0.1);
    log("you have " + numberOfDimes + "dimes");
    return amountOfMoney % 0.1;
  }

  public static void log(String msg) {
    System.out.println(msg);
  }
}