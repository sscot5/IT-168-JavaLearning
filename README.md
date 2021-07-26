# Terminology

Assign
: to set the data of a variable, involves the = sign

example: assigns the value 2 to the integer var
```Java
int var = 2;
```
Algorithms
: performs tasks for which there are standard methods of processing

Binary Operators
: operators that take two operands, such as arithmetic operators

Bit
: a binary digit; either 0 or 1

Byte
: eight binary digits

Block
: starts with left curly brace, consists of 0, 1, or more statements, and ends with a right curly brace { }

Class
: enables the programmer to encapsulate data and the functions to manipulate that data into one package. A class is a template or blueprint that describes the behavior or state that the object of its type supports.

Constant
 : a value we know will not and should not change during program execution, nor is it likely to change from one execution of the program to another. When declared the data type is preceded by the keyword final and consists of all capital letters and seperated by an underscore

example:
``` Java
 final int DAYS_IN_NON_LEAP_YEAR = 365;
```
Constructor
: A special type of instance method that creates a new object. It must have the same name as their class and have no return value in their declaration. The job of the constructor is to assign inital values to the data of the class.

example: new is the keyword that references the constructor method
```Java
dateObj = new SimpleDate(); 
```

Compiler Errors
: caused by language syntax errors or misspellings

Data Type
: the data type we specify for a variable tells the compiler how much memory to allocate and the format in which to store the data

Declaration
: a statement that creates a variable, method, or class identifier and its associated attributes but doesn't necessarily allocate storage for variables or define an implementation for methods

Declaring a Variable
: every variable must be given a name and data type before it can be used
   
syntax for declaring a variable: dataType identifer
        examples: 
``` Java
int testGrade; 
char middleInital; 
boolean failed;
```

Decrementing
: subtracting 1 from a number

syntax: 
```Java
int a = 6;
a--; // is equvalant to 6 - 1
```

Explicit Typecasting 
: the programmer instructs the compiler specifically to convert the type of a variable

syntax: (dataType) (expresion)
example: 
```java
    int a = 1;
    double b = 1.9;
    double c = a + b => 2.9;
    int d = a + (int) b => 2;
```
when turning double b into an int it is truncated (meaning it cuts off anything after the decimal) to 1

Implicit Typecasting
: when calculations of mixed types are performed lower percision operads are converted to the type of the operand that has the higher precision. Implicit typecasting is where the compiler performs the promotions automatically without our specifing that the conversions should be made

Instantiate
: to allocate storage for an object in memory. Involves the keyword 'new'

Instance Variables
: also called fields; data associated with an object of a class. Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables

Incrementing
: adding 1 to a number

syntax: 
```Java
int a = 6;
a++; // is equvalant to 6 + 1
```

Looping or Iteration
: repeated execution of the same code

Logic Errors
: when a program does not produce the correct output due to incorrect program design or incorrect implementation of the design

Methods
: **mutates the data**
A method is a collection of code found within a class. It is where the logics are written, data is manipulated, and all the actions are executed. Basically the 'verbs' or action to the class 'noun'.

Parameter
: a variable or object passed into a method

Primitive
: a variable defined with a primitive data type
example: byte, short, int, long, float, double, char, or boolean

Public v. Private (preceding the method call)
: public means that any client of the class can call this method
private means only other methods of that class can call that method

Object
: an istance of a class that consists of both variables (data) and methods (functionality)

Operator
: is the 'function' that performs the operation

example 3 + 4 = 7 the operator is the '+' since its telling us how to perform the operation

Operand
: the input to a function

example 3 + 4 = 7 the operands are 3 and 4 are the inputs upon which the operation is acting

Run-time Errors
: problems using the prewritten class

Statement
: terminated with a semicolon ;

String Literal
: a sequence of characters enclosed by double quotes " ". String literals are used in output statements.

example:
```Java
System.out.println("The area of the circle is " + area);
```

Typecast
: re-establishes the class of an object. The cast associates itself with the expression to its immediate right

Variables
: named location in memory where we can store values. When we use a named variable, we need to tell the compiler which kind of data we will store in the variable; we do this by giving a data type for each variable

#Types of Classes:
Java provides more than 2,000 predefined classes that we can use to add functionality to our program. This is just a list of a few comonly used Java classes.

String
: provides a data type for character sequences along with methods for searching and manipulating strings
- String class is part of the java.lang package it is automatically available to any Java program and we do not need to use the import statement

String class constructors:
int length( ) --> returns the length of the String
```Java
String greeting = "Hello";
int length = gretting.length(); 
//length will be assigned 5
```
String toUpperCase( ) --> returns a copy of the String in all uppercase 
```Java
String greeting = "Hello";
String greetingUpper = greeting.toUpperCase();
System.out.println(greeting + "converted to upper case is " + greetingUpper);
//Print out: Hello converted to upper case is HELLO
```
String toLowerCase( ) --> returns a copy of the String in all lowercase
```Java
String greeting = "Hello";
String greetingLower = greeting.toLowerCase();
System.out.println(greeting + "converted to lower case is " + greetingLower);
//Print out: Hello converted to lower case is hello
```
char charAt(int index) --> returns the character at the position specified by index
```Java
String greeting = "Hello";
char firstChar = greeting.charAt(0);
char lastChar = greeting.charAt(greeting.length() - 1);
System.out.println("The first and last characters of " + greeting + " are " + firstChar + " and " + lastChar);
///Print out: The first and last characters of Hello are H and o
```
int indexOf(String searchString) --> returns the index of the beginning of the first occurrence of searchString or -1 if searchString is not found
```Java
String greeting = "Hello";
int indexOfEl = greeting.indexOf("el"); 
//"el" double quote becase it is a string
System.out.println("The index of el is " + indexOfEl);
//Print out: The index of el is 1
```

int indexOf(char searchChar) --> returns the index of the first occurrence of searchChar in the String or -1 if searchChar is not found
```Java
String greeting = "Hello";
int indexOfL = greeting.indexOf('l');
//'l' in single quote because it is a char
System.out.println("The index of l is " + indexOfL);
//it prints the index of the first l in hello at index 2
```

String substring(int startIndex, int endIndex) --> returns a substring of the String object beginning at the character at index startIndex and ending at the character at index endIndex -1
```Java
String greeting = "Hello";
//want the substing "ell"
String middleOfHello = greeting.substring(1, 4);
System.out.println("The middle three characters of Hello are " + middleOfHello);

//Could also simplify it as
//System.out.println("The middle three characters of Hello are " + greeting.substring(1, 4));
```

String substring(int startIndex) --> returns a substring of the String object beginning at the character at index startIndex and continuing to the end of the String
```Java
String greeting = "Hello";
//want the substring "lo"
System.out.println("The last two characters of Hello are " + greeting.substring(3));
```

Random
: generates random numbers
- To use the *Random* class it must be imported using the following statement
```Java
import java.util.Random;
```
example:
```Java
//generate a random number betwwn 20 and 200
int start = 20, end = 200;
int number = random.nextInt(end - start + 1) + start;
System.out.println("The random number between " + start + " and " + end + " is " + number);
```
Scanner
: provides methods for reading input from the keyboard
- To use the *Scanner* class it must be imported using the following statement
```Java
import java.util.Scanner;
```
example:
```Java
Scanner scan = new Scanner(System.in);
System.out.print("Enter your first name > ");
String firstName = scan.next();
System.out.println("Your name is " + firstName);
```

System and PrintStream
: provide data members and methods for printing data on the Java console

DecimalFormat and NumberFormat
: allows us to format numbers for output
- The *DecimalFormat* class allows us to specify the number of digits to display after the decimal point and to add dollar signs, commas, and percentage signs to our output
- To use the *DecimalFormat* class it must be imported using the following statement
```Java
import java.text.DecimalFormat;
```
examples:
```Java
//For Currency
DecimalFormat pricePattern = new DecimalFormat($0.00);
//For Percentages
DecimalFormat percentPattern = new DecimalFormat(0.0#%);
//For Time
DecimalFormat timePattern = new DecimalFormat(00);
```

Math
: provides methods for performing mathematical operations
- Math class is part of the java.lang package it is automatically available to any Java program and we do not need to use the import statement
- All the methods of the *Math* class are *static* so they are called using the class name, *Math*, and the dot notation as follows:
```Java
Math.abs(-5);
```
examples:
[See all Math Methods:](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

```Java
public class MathMethods
{
    public static void main(String [] args)
    {
        //returns the natural logarithm in base e
        double n1 = Math.log(5); 
        System.out.println("The log of 5 is " + n1)
        
        //returns the square root
        double n2 = Math.sqrt(9);
        System.out.println("The square root of 9 is " + n2);
        
        //returns the value of base raised to the exp power
        double fourCubed = Math.pow(4, 3);
        System.out.println("4 to the power 3 is " + fourCubed);
        
        //using the round method
        System.out.println("23.6 rounded is " + Math.round(23.6)); //23.6 rounded is 24
        
        //truncates decimal passed a double returns an int
        double num = 8.78
        System.out.println("The floor of " + num " is " + Math.floor(num)); //returns 8
        
        //returns the minimum
        int smaller = Math.min(8, 2);
        System.out.println("The smaller of 8 and 2 is " + smaller);
        
        //returns the maximum
        int larger = Math.max(8, 2);
        System.out.println("The larger of 8 and 2 is " + larger);
        
        //how to compare more than two int
        int a = 8, b = 5, c = 12;
        int firstSmaller = Math.min(a, b); //finds smaller of a = 8 and b = 5 so firstSmaller = 5
        int smallest = Math.min(firstSmaller, c);
        System.out.println("The smallest of " + a ", " + b + ", and " + c + " is " + smallest);



    }
}
```

Object wrappers
: provides an object equivalent to primitive data types so they can be used in our program as if they were objects
- Wrappers are part of the java.lang package it is automatically available to any Java program so we do not need to use the import statement
- Java provides special support for converting between a primitive numeric type and its wrapper class. For example, we can simply assign an *int* variable to an *Integer* object reference. Java will automatically provide the conversion for us. This conversion is called **autoboxing**.
- Similarly, when an *Integer* object is used as an *int*, Java also provides this conversion, which is called **unboxing**. 

#Types of Methods:

Getters
: "get" methods are formally called accessor methods. They enable the clients to access the value of the instance variables of an object

Setters
: "set" methods are formally called mutator methods. They enable the client to change the value of the instance variable of an object

examples:
```Java
public class Person 
{
  private String name; // private = restricted access

  public Person(String n1) // Constructor
  {
      this.name = n1;
  } 

  // Getter
  public String getName()
  {
    return name;
  }

  // Setter
  public void setName(String newName)
  {
    this.name = newName;
  }
}
//example of using this class in another class
Person p = new Person("Jim");
String name = p.getName;
p.setName("Bob")
```
examples explained:

The get method returns the value of the variable name.

The set method takes a parameter (newName) and assigns it to the name variable. The *this* keyword is used to refer to the current object.
