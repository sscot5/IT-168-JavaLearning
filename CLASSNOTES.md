#Class Notes IT168

Wednesday: 8/18/21

CPU - where the computer actually get stuff done

Friday 8/20/21
#Code Order
Package statements
Import statements (example: Scanner)
Class
Main Method

```Java 
public class HelloWorld //Class
{
    public static void main(String [arg]) //main method
    {
        //Write Code Here
    } 
}
```
Monday 8/23/21

Algorithm
: - has zero or more well-defined inputs
: - has one or more well-defined outputs
: - is unambiguous
: - ends (is finite)
: - is language-independent

Pseudocode
: - a way to express algorithms
: - uses English
: - structured the way we structure code
: - can use math symbols, but the way we use them in English

Division in Java
: - what are the two different kinds of division in Java?
: -- int division
: -- float point division

** Remember in Java Arithmetic **
: - ( ) first
: - division, multiplication, remainder left to right
: - then addition and subtraction left to right
: - everything on left of assingment operator is done first example:
```Java
int num = 3;
num *= 3 + 2;
// this is num = num * (3 + 2);
```

8/25/21
Three ways to creat comment in java 
 - /* */ multiline comment
 - /** */ javadoc comment (beginning of class)
 - // comments single line comment

class is a templete for the object

declaration v initialization

Declaration
: - declaration example int highTemp; just need the type and variable name

Assignment
: - highTemp = 78; gives the variable a value

Declaration-initialization
: - both declare it and put a value in it example int highTemp = 78;

8/27/2021

Object declaration
: - class name variable name
: - instantances of a class

example
```Java
SavingsAcct myAcct;
SimpleDate myDate;
```

Constructor
: - 
: - default constructor - empty ( ), do not need to provide any information

```Java
      //declaration
    Student stu1

        //instantiation
    Student stu1 = new Student();
    Monster theEnemy = new Monster();
    Employee john = new Employee();
    
        //declarazation initialization (declare and create)
    Student stu2 = new Student("Anne Hawkins");
```

8/30/2021

```Java
Student stu1 = new Student("John Doe", 15);

void updateHours(int semHoursCompleted);

stu1.updateHours(12);

String stuName = stu1.getName();
```
Signature
: - name
: - what does the method return
: - how many arguements it takes

9/1/2021

Algorithm Practice:
: - The restaurant sales tax is 6.25%
: - You tip 20%
: - Write a program that asks for the amount of a restaurant bill before tax and computes the total payment including tax and tip
: - the tip should be based on the total after tax
: - print the original amount, the tax, the tip, and the total with labels.

How to right this algorithm in psedocode:

set TAX_RATE to 0.0625
set TIP_PERCENT to 0.2
ask for bill amount
read billAmount from keyboard
set taxAmount to billAmount * TAX_RATE
set tipAmount to TIP_PERCENT * (billAmount + taxAmount)
set total to billAmount + taxAmount + tipAmount
print billAmount, taxAmount, tipAmount, and total with labels

9/3/2021

must use nextLine( ) when reading a string from the scanner

issue could run into when asking for anything other than a string from input then trying to ask for an input in a string format 

it doesn't read the input so we must use input.nextLine( ) example below

```Java
int num = input.nextInt();
input.nextLine();
String name = input.nextLine();
```
Random
: - default constructor
: - returns a random number in the range 0 to bound -1
```Java
Random random = new Random();
        int start = 1;
        int end = 20;
        int number = random.nextInt (end - start + 1) + start;
```

In number formating or decial formating
: - a 0 means a number must be there a # means it is optional

