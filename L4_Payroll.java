/**Created on 9/9/2020
 * 
 * Using the given Employee class and creating a payroll from it
 */

//imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class L4_Payroll {
    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat pricePattern = new DecimalFormat("$0.00");
    public static void main(String[] args) {
       //Employee employee1 = new Employee("Smith", "John", 15); //instance of the Employee class
        // yellow Employee is an object

        System.out.print("Enter employee's first name: ");
        String fName = scanner.nextLine();
        System.out.print("Enter employee's last name: ");
        String lName = scanner.nextLine();
        System.out.print("Enter the employee's pay rate: ");
       // double rate = scanner.nextDouble();

       // Employee employee2 = new Employee(lName, fName, rate);

       // employee1.print();
       // employee2.print();

        //System.out.println(employee1.getName() + " recieved " + pricePattern.format(employee1.calculatePay(42)));
        //System.out.println(employee2.getName() + " recieved " + pricePattern.format(employee2.calculatePay(40)));

        //System.out.print("What precentage raise does " + employee1.getName + "get? ");
        //double percentRaise1 = scanner.nextDouble();
        System.out.print("What precentage raise does " + fName + " " + lName + "get? ");
        //double percentRaise2 = scanner.nextDouble();

        //employee1.giveRaise(percentRaise1);
        //employee2.giveRaise(percentRaise2);

        //employee1.printPayrollLine(42);
        //employee2.printPayrollLine(40);

        //employee1.print();
        //employee2.print();
    }
}
