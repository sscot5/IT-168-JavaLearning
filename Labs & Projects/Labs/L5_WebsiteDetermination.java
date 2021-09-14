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

public class L5_WebsiteDetermination {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.print("Enter the website: ");
    String website = scanner.nextLine();
    
    int lastDotIndex = website.lastIndexOf('.');
    String endOfWebsite = website.substring(lastDotIndex + 1);
    System.out.println(endOfWebsite);

    String type;
    switch(endOfWebsite){
        case "gov":
            type = "government";
            break;

        case "edu":
            type = "university";
            break;

        case "com":
            type = "business";
            break;

        case "org":
            type = "organization";
            break;
        default:
            type = "another entity";
    }

    System.out.println("The web address " + website + " is a " + type + " web address.");
    }
}
