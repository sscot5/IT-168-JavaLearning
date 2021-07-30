
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

      // Example #1 ---------------------------

      amountOfMoney = printQuartersAndReturnsRemainingAmount(amountOfMoney);
      amountOfMoney = printDimesAndReturnsRemainingAmount(amountOfMoney);

      // Example #2 ---------------------------

      // amountOfMoney = printChangeAndReturnRemainingAmount(amountOfMoney, "Dollar");
      // amountOfMoney = printChangeAndReturnRemainingAmount(amountOfMoney,
      // "Quarter");
      // amountOfMoney = printChangeAndReturnRemainingAmount(amountOfMoney, "Dime");
      // amountOfMoney = printChangeAndReturnRemainingAmount(amountOfMoney, "Nickel");
      // amountOfMoney = printChangeAndReturnRemainingAmount(amountOfMoney, "Penny");

      // Example #3 ---------------------------

      // String[] types = { "Dollar", "Quarter", "Dime", "Nickel", "Penny" };
      // for (String type : types) {
      // amountOfMoney = printChangeAndReturnRemainingAmount(amountOfMoney, type);
      // }

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

  // public static double printChangeAndReturnRemainingAmount(double
  // amountOfMoney, String type) {
  // switch (type) {
  // case "Dollar":
  // final double DOLLAR_VAL = 1.00;
  // int dollars = (int) (amountOfMoney / DOLLAR_VAL);
  // log("Dollars: " + dollars);
  // return amountOfMoney % DOLLAR_VAL;
  // case "Quarter":
  // break;
  // case "Dime":
  // break;
  // case "Nickel":
  // break;
  // case "Penny":
  // break;
  // default:
  // throw new Exception("The type " + type + " is not supported");
  // }
  // }

  public static void log(String msg) {
    System.out.println(msg);
  }
}