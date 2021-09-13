/*
 * Author: Stephanie Scott
 * Date: 9/13/21
 */

/**
 * Description: A program that to reads a web address and determines what class of website
 * end with gov --> government web address
 * end with edu --> university web address
 * end with com --> business web address
 * end with org --> organization web address
 * other another entity
 */

 // imports
 import java.util.Scanner;

public class WebsiteDetermination {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.print("Enter the website: ");
    String website = scanner.nextLine();
    
    int lastDotIndex = website.lastIndexOf('.');
    String endOfWebsite = website.substring(lastDotIndex + 1);
    System.out.println(endOfWebsite);

    switch(endOfWebsite){
        case "gov":
            System.out.println("The web address " + website + " is a government web address.");
            break;

        case "edu":
            System.out.println("The web address " + website + " is a university web address.");
            break;

        case "com":
             System.out.println("The web address " + website + " is a business web address.");
            break;

        case "org":
            System.out.println("The web address " + website + " is a organization web address.");
            break;
        default:
            System.out.println("The web address " + website + " is another entity.");
    }
    }
}
