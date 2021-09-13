/*
 * Author: Stephanie Scott
 * Date: 9/13/21
 */

/**
 * Description: A program that to reads a website and determines what type of website it is
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
    }
}
