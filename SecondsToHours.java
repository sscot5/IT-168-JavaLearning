

import java.util.Scanner;

public class SecondsToHours {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // set constants
        final int ONE_MINUTE_IN_SECONDS = 60;
        final int ONE_HOUR_IN_MINUTES = 60;

        // get total minutes
        System.out.print("What is the total seconds?  ");
        int totalSeconds = scanner.nextInt();

        // calculate seconds to minutes
         int totalMinutes = totalSeconds / ONE_MINUTE_IN_SECONDS;
         int seconds = totalSeconds % ONE_MINUTE_IN_SECONDS;

         // calculate minutes to hours
         int hours = totalMinutes / ONE_HOUR_IN_MINUTES;
         int minutes = totalMinutes % ONE_HOUR_IN_MINUTES;

         // print hours, minutes, seconds
         System.out.println(totalSeconds + " is " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");

    }
}
