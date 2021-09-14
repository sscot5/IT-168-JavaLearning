package Classwork;
import java.util.Scanner;
public class ClassWork {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double classAverage = 90;
        double examAverage = 76;

        if (classAverage >= 90 && examAverage >85){
            System.out.println('A');
        } else if (classAverage >= 80 && examAverage >=75){
            System.out.println('B');
        } else if (classAverage >= 70 && examAverage >= 65){
            System.out.println('C');
        } else if (classAverage >= 60){
            System.out.println('D');
        } else {
            System.out.println('F');
        }

        double deskCost = 200;
        double surface = 800;
        double surfaceCost = 50;
        int woodCode = 1; //"Mahogany"; //add $100, "Oak"; //add $75"Pine"; // no charge
        int woodCodeCost = 50;
        double cost;
        if (surface > 750){
            cost = deskCost + surfaceCost;
        }
        if (woodCode == 1){
            cost = deskCost + woodCodeCost;
        } else if (woodCode == 2){
            cost = deskCost + woodCodeCost;
        } else {
            cost = deskCost;
        }
        System.out.println(cost);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        switch (num)
        {
          case 1:
              System.out.print("One");
              break;
          case 2:
              System.out.print("Two");
          case 3:
              System.out.print("Three");
              break;
          default:
              System.out.print("More");
        }
    }
}
