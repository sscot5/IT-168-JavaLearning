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

9/8/2021
```Java
Rectangle myRect = new Rectangle(50, 30);
myRect.draw();
```
where Rectangle is a ***Class*** and ***Type***
.draw is a ***method***
myRect is ***object***, ***variable***, and ***instance***
new Rectangle is a ***constructor***
(50, 30) is the ***argument list***

Static
: - belongs to the class as a whole not the individual object
: - how many copies do we have a class (static) variable? --> one for the class
: - how do we call a class (static) method? --> use ClassName.method
: - what data do class methods usually operate on? --> parameters

9/15/21 Chapter 6 Loops

While Loops (Event-controlled looping)
: - used when repeating a set of instructions for each input value when we don't know at the beginning how many input values there will be. 
: - process each input value, one at a time, until a signal (an event) tells us that there is no more input.
: - ***sentinel value*** is the signal for the end of the input 

***while loop syntax:***
```Java
// initialize variables
while (condition) {
    // process data -- loop body
}
// results
```

the condition is a boolean expression
: - if the condition is true the loop body is executed. This happens until the condition is false.
: - each execution of the loop body is called an ***iteration*** of the loop.
    : - example: if the loop body executes five times before the condition evaluates to false --> we say there were five iterations of the while loop.
    : - If the condition is false to start with the while loop body is never executed and there would be zero iterations of the loop.
: - Priming read --> after initializing we attempt to read the first item. This is called the priming read because we use that value to feed the condition of the while loop for the first iteration. 
: - update read --> after the priming read we read the next data item called an update read because we update the data item in preparation for feeding its value into the condition of the while loop for the next iteration. This continues until we read the sentinel value.


endless loops or infinite loops
: - a while loop whose condition never evaluates to false.
: - because the condition always evaluates to true the loop body is executed repeatedly, without end. The program will not terminate.
: - ***Loop update statement*** --> inclueded in the loop body. It appropriately changes the variable that is being tested by the loop condition to ensure that the condition eventually results in false.

9/17/21
Pseudocode with Loops
: - get number of events entered from user
: - set counter to one
: - ask for first value
: - read smallest from user
: - WHILE counter is less than number of events DO
: -     Ask for value
: -     read number from user
: -     IF  smallest is greater than number THEN
: -         set smallest to number
: - END IF
: - add one to counter
: - END WHILE
: - print the smallest number