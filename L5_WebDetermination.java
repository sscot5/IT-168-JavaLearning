/*
 * Author: Stephanie Scott
 * Date: 9/16/21
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

public class L5_WebDetermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the website: ");
        String website = scanner.nextLine();
        scanner.close();

        int lastDotIndex = website.lastIndexOf('.');
        String endOfWebsite = website.substring(lastDotIndex + 1);
        System.out.println(endOfWebsite);
        String type;
        if (endOfWebsite.equals("gov")) {
            type = "government";
        } else if (endOfWebsite.equals("edu")) {
            type = "university";
        } else if (endOfWebsite.equals("com")) {
            type = "business";
        } else if (endOfWebsite.equals("org")) {
            type = "organization";
        } else {
            type = "another entity";
        }
        System.out.println("The web address " + website + " is a " + type + " web address.");
    }
}
