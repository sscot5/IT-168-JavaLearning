

import java.util.Scanner;

public class L4_SecondsToHours {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // set constants
        final int ONE_MINUTE_IN_SECONDS = 60;
        final int ONE_HOUR_IN_SECONDS = 3600;

        // get total minutes
        System.out.print("What is the total seconds?  ");
        int totalSeconds = scanner.nextInt();

        // calculate seconds to minutes
         int totalMinutes = totalSeconds / ONE_MINUTE_IN_SECONDS;
         int seconds = totalSeconds % ONE_MINUTE_IN_SECONDS;

         // calculate minutes to hours
         int hours = totalSeconds / ONE_HOUR_IN_SECONDS;
         int minutes = totalMinutes % ONE_MINUTE_IN_SECONDS;

         // print hours, minutes, seconds
         System.out.println(totalSeconds + " is " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");

    }
}
