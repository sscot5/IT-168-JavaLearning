
//  //import java.util.Scanner;

//  public class ClassWork {
//    //  private static Scanner scanner = new Scanner(System.in);
//      public static void main(String[] args) {
// // //         double classAverage = 90;
// // //         double examAverage = 76;

// // //         if (classAverage >= 90 && examAverage >85){
// // //             System.out.println('A');
// // //         } else if (classAverage >= 80 && examAverage >=75){
// // //             System.out.println('B');
// // //         } else if (classAverage >= 70 && examAverage >= 65){
// // //             System.out.println('C');
// // //         } else if (classAverage >= 60){
// // //             System.out.println('D');
// // //         } else {
// // //             System.out.println('F');
// // //         }

// // //         double deskCost = 200;
// // //         double surface = 800;
// // //         double surfaceCost = 50;
// // //         int woodCode = 1; //"Mahogany"; //add $100, "Oak"; //add $75"Pine"; // no charge
// // //         int woodCodeCost = 50;
// // //         double cost;
// // //         if (surface > 750){
// // //             cost = deskCost + surfaceCost;
// // //         }
// // //         if (woodCode == 1){
// // //             cost = deskCost + woodCodeCost;
// // //         } else if (woodCode == 2){
// // //             cost = deskCost + woodCodeCost;
// // //         } else {
// // //             cost = deskCost;
// // //         }
// // //         System.out.println(cost);

// // //         System.out.print("Enter a number: ");
// // //         int num = scanner.nextInt();
// // //         switch (num)
// // //         {
// // //           case 1:
// // //               System.out.print("One");
// // //               break;
// // //           case 2:
// // //               System.out.print("Two");
// // //           case 3:
// // //               System.out.print("Three");
// // //               break;
// // //           default:
// // //               System.out.print("More");
// // //         }
// // //         System.out.print("Enter the code: ");
// // //         int code = scanner.nextInt();
// // //         double discount;
// // //         switch (code) {
// // //             case 1:
// // //                 discount = 0;
// // //                 break;
// // //             case 3:
// // //                 discount = 0.15;
// // //                 break;
// // //             case 7: 
// // //                 discount = 0.1;
// // //                 break;
// // //             case 8:
// // //                 discount = 0.3;
// // //                 break;
// // //             case 12:
// // //                 discount = 0.4;
// // //                 break;
// // //             default:
// // //                 System.out.println("This is not a valid code.");
// // //                 break;
// // //         }
// // //         System.out.print("Enter your name: ");
// // //         String name = scanner.nextLine();
// // //         System.out.print("Please enter your tax code: ");
// // //         String tax = scanner.next();
// // //         System.out.print("Enter the purchase amount: ");
// // //         double purchase = scanner.nextDouble();
        
// // //         String taxCode = tax.toUpperCase();
// // //         double total;
// // //         double salesTax = 0;
// // //         double saleTaxAmount;

// // //         switch (taxCode) {
// // //             case "A": 
// // //             break;

// // //             case "B":
// // //             salesTax = 0.03;
// // //             saleTaxAmount = purchase * salesTax;
// // //             break;

// // //             case "C":
// // //             salesTax = 0.05;
// // //             saleTaxAmount = purchase * salesTax;
// // //             break; 

// // //             case "H":
// // //             salesTax = 0.07;
// // //             saleTaxAmount = purchase * salesTax;
// // //             break;

// // //             default:
// // //             System.out.println("Error in tax code");
// // //             purchase = 0;
// // //         }
// // //         //System.out.println("Name: " + name + " Purchase amount: " + purchase + " Sales tax: " + salesTax + "Sales tax total: " + saleTaxAmount +  " Total: " + total);
// // //     
// //         int counter = 1;
// //         System.out.print("Enter how many values: ");
// //         int numValues = scanner.nextInt();
// //         System.out.print("Enter first number: ");
// //         int smallest = scanner.nextInt();

// //         while (counter < numValues) {
// //             System.out.print("Enter next number: ");
// //             int number = scanner.nextInt();
// //                 if (smallest > number) {
// //                     smallest = number;
// //                 } 
// //             counter++;
// //         }
// //         System.out.println("The smallest number is " + smallest);
// //     }

//     // final int SENTINAL = -99;
//     // System.out.print("Enter payroll amounts or -99 to stop: ");
//     // int payrollAmounts = scanner.nextInt();
//     // int total = 0;
//     // while (payrollAmounts != SENTINAL) {
//     //     total = total + payrollAmounts; 
//     //     System.out.print("Enter next payroll amount or -99 to stop: ");
//     //     payrollAmounts = scanner.nextInt();
//     // }
//     // scanner.close();
//     // System.out.println("The total amount for payroll is: " + total);

//     int i = 1;
//     int total = 0;
//     while (i <= 10){
//         total = total + i;
//         i++;
//     }
//   }
// }
