/**
 * Author: Stephanie Scott
 * 
 * Name: 
 * 
 * Date: 8/3/21
 * 
 * Ask user to provide their three favorite foods
 */

import java.util.Scanner;

public class ArrayFavFood {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        try {
            // declaring a foods variable
            String[] foods;

            // initializing an array with length 3
            int numberOfFoods = 3;
            
            foods = new String[numberOfFoods];

            //prompt user for their favorite foods
            for (int i = 0; i < numberOfFoods; i++) {
                foods[i] = getFavFoods(i);
            }

            for (String favFood : foods) {
                printFavFood(favFood);
            }


        }
        catch (Exception nope){
            log("Nope. Try again.");
        }
    }

    public static String getFavFoods(int num){
        log("What is your favorite food #" + (++num));
        String favFood = scanner.nextLine();
        return favFood;
    }

    public static void printFavFood(String favFood) {
        log("Favorite food: " + favFood);
    }

    public static void log(String msg){
        System.out.println(msg);
    }


}

