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

