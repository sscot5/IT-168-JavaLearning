

 import java.text.DecimalFormat;
 import java.util.Scanner;
 import java.util.Random;

public class WhileLoop 
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        String firstName = getFirstName();
        sayHello(firstName);
        log("Your name has " + countCharsInString(firstName) + " letters in it.");

        String yearBorn = getYearBorn();
        final int CURRENT_YEAR = 2021;
        int age = getAge(yearBorn, CURRENT_YEAR);
        log("You are " + age + " years old.");

        final double LIFE_EXPECTANCY = 78.94;
        log("You have lived " + getPrecentLived(age, LIFE_EXPECTANCY) + " of your life.");

        final int SECRET_NUMBER = generateSecretNumber();

        boolean guessing = true;
        while (guessing) 
        {
            int guessedNumber = askForGuess();
            guessing = !checkGuess(guessedNumber, SECRET_NUMBER);
            
            if (guessing)
            {
                int diff = getDiff(guessedNumber, SECRET_NUMBER);
                log("Sorry you guessed in correctly");
                log("Your answer was " + diff + " from the secret number");
            } else {
                log("YOU GOT IT RIGHT!");
            }
        }
    }
    
    public static String getFirstName() 
    {
        log("What is your first name?");
        String firstName = scanner.nextLine();
        return firstName;   
    }

    public static void sayHello(String name) 
    {
        log("Hello " + name + "!");
    }

    public static int countCharsInString(String response)
    {
        return response.length();
    }

    public static String getYearBorn() 
    {
        log("What year were you born?");
        String yearBorn = scanner.nextLine();
        return yearBorn;
    }

    public static int getAge(String yearBornString, int currentYear) 
    {
        int yearBorn = Integer.parseInt(yearBornString);
        int age = currentYear - yearBorn;
        return age;
    }

    public static String getPrecentLived(int age, double lifeExpectancy) 
    {
        DecimalFormat percentPattern = new DecimalFormat("0.#%");
        return percentPattern.format(age / lifeExpectancy);
    }

    public static int generateSecretNumber() 
    {
        Random random = new Random();
        int start = 1;
        int end = 20;
        int number = random.nextInt (end - start + 1) + start;

        return number;
    }

    public static int askForGuess()
    {
        log("Guess a number between 1 and 20.");
        String guessedNumber = scanner.nextLine();
        return Integer.parseInt(guessedNumber);
    }

    public static boolean checkGuess(int guessedNumber, int secretNumber) 
    {
        return guessedNumber == secretNumber;
    }

    public static int getDiff(int guessedNumber, int secretNumber)
    {
        return Math.abs(guessedNumber - secretNumber);
    }

    public static void log(String msg)
    {
        System.out.println(msg);
    }
}
