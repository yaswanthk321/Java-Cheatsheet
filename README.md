# Java Cheatsheet

<br/>

> Table of Contents
1. [Lesson 1  : How Java works?](#1-how-java-works)
2. [Lesson 2  : Variables](#2-variables)
3. [Lesson 3  : Data types](#3-data-types)
4. [Lesson 4  : literals](#4-literals)
5. [Lesson 5  : type conversion and casting](#5-type-conversion-and-casting)
6. [Lesson 6  : Assignment operator](#6-assignment-operator)
7. [Lesson 7  : Relational operator](#7-relational-operator)
8. [Lesson 8  : logical operator](#8-logical-operator)
9. [Lesson 9  : conditional operator if-else](#9-conditional-operator-if-else)
10. [Lesson 10 : conditional operator if-elseif-else](#10-conditional-operator-if-elseif-else)
11. [Lesson 11 : ternary operator](#11-ternary-operator)
12. [Lesson 12 : Switch case](#12-switch-case)
13. [Lesson 13 : while loops](#13-while-loops)
14. [Lesson 14 : do while](#14-do-while)
15. [Lesson 15 : for loop](#15-for-loop)
16. [Lesson 16 : Classes and object](#16-classes-and-object)
17. [Lesson 17 : Method](#17-method)
18. [Lesson 18 : Method overloading](#18-method-overloading)
19. [Lesson 19 : Array](#19-array)
20. [Lesson 20 : Multi dimentional array](#20-multi-dimentional-array)
21. [Lesson 21 : Jagged and 3D Array](#21--jagged-and-3d-array)
22. [Lesson 22 : Array of Objects](#22--array-of-objects)
23. [Lesson 23 : Strings](#23--strings)
24. [Lesson 24 : StringBuffer & StringBuilder](#24-stringbuffer--stringbuilder)
25. [Lesson 25 : static variable](#25-static-variable)
26. [Lesson 26 : static block](#26-static-block)
27. [Lesson 27 : static method](#27-static-method)
28. [Lesson 28 : Encapsulation , getters & setters , this keyword , Constructor , default & parametrized constructor](#28-encapsulation--getters--setters--this-keyword--constructor--default--parametrized-constructor)
29. [Lesson 29 : super() , this() and anonymous object](#29-super--this-and-anonymous-object)
30. [Lesson 30 : Inheritance , single inheritance, multilevel inheritance , method overriding](#30-inheritance--single-inheritance-multilevel-inheritance--method-overriding)
31. [Lesson 31 : Packages](#31-packages--access-modifier) , [access modifier](https://www.geeksforgeeks.org/access-modifiers-java/)
32. [Lesson 32 : Polymorphism & dynamic method dispatch](#32-polymorphism--dynamic-method-dispatch)
33. [Lesson 33 : final keyword](#33-final-keyword)
34. [Lesson 34 : Object class - equals(), toString() , hashCode()](#34-object-class---equals-tostring--hashcode)
35. [Lesson 35 : Upcasting & Downcasting](#35-upcasting--downcasting)
36. [Lesson 36 : Wrapper class , autoboxing, unboxing](#36-wrapper-class--autoboxing-unboxing)
37. [Lesson 37 : abstract class and methods](#37-abstract-class-and-methods)
38. [Lesson 38 : Inner class & anonymous inner class](#38-inner-class--anonymous-inner-class)
39. [Lesson 39 : Anonymous and abstract inner class](#39-anonymous-and-abstract-inner-class)
40. [Lesson 40 : interface](#40-interface)
41. [Lesson 41 : enum if else and switch](#41-enum-if-else-and-switch)
42. [Lesson 42 : Anotations , Functional interface and lambda expression with return type](#24-stringbuffer--stringbuilder)
43. [Lesson 43 : Exceptions , try catch blocks](#34-object-class---equals-tostring--hashcode)
44. [Lesson 44 : throw ](#44-throw)
45. [Lesson 45 : throws](#45-throws)
46. [Lesson 46 : BufferedReader and Scanner , try with resources](#46-bufferedreader-and-scanner--try-with-resources)
47. [Lesson 47 : Thread class](#47-thread-class)
48. [Lesson 48 : Runnable interface](#48-runnable-interface)
49. [Lesson 49 : race condition](#49-race-condition)
50. [Lesson 50 : Collection , List - ArrayList , Set - HashSet](#50--collection--list---arraylist--set---hashset)
51. [Lesson 51 : Map - HashMap, HashTable](#51-map---hashmap-hashtable)
52. [Lesson 52 : Comparator & Comparable](#52-comparator--comparable) 
53. [Lesson 53 : stream api , forEach , map , filter , reduce](#53-stream-api--foreach--map--filter--reduce)

<br/>

> [Top](#java-cheatsheet)

<br/>

# 1. How java works?

> Steps to run the Java Code:-
- We required JVM to run a java code.
- The job of the JVM is to execute the java code that you have created but it does not accept the code directly.
- JVM does not accept the Java code as it only understands the Byte Code.
- Java compiler also known as javac is used to convert java code into byte code.
- The extension for the byte code is .class
- Thus, the code written by the programmer is first converted into byte code by the compiler and then that byte code goes to the JVM for further execution.
 Programmer- Java Code- Compiler- Byte Code- JVM


> Java is a platform-independent language:-

- It means you can run Java on any machine irrespective of any hardware or operating system.
The one thing that the machine requires to run a java code is a JVM.
-  JVM is platform dependent and it needs to be built for a particular OS.


> In Java, execution always starts from the main method:-
- JVM starts execution only with one first file. If you need to run multiple files you need to tell it which one is the first file through which JVM can start execution.
- The first file must contain the main method with its proper signature.
- In Java, execution always starts from the main method.
Signature of main method:

    ```java
    public static void main(String args[]) 
    ```

<br/>

> Java is an object-oriented language:-
- Object-oriented means everything should be an object.
- We always required a class to create an object.


> JRE:-
- To run the Java application, you need extra libraries and need runtime. Runtime is something where you run things.
- You use extra libraries, and you also need an environment. An additional layer is present above the OS known as JRE.
- JVM is a part of JRE. JRE includes JVM and libraries.
 JVM - Java Virutal Machine
 JRE - Java Runtime Environment
- For development purposes, you need to install JDK (Java Development Kit) which consists of JRE and JVM.
- Java is WORA that is Write Once Run Anywhere provided that JVM and JDK installed.

<br/>

> [top](#java-cheatsheet)

<br/>

# 2. Variables
- Variable is used to store the data temporarily while processing.
- Variable is a type of box in which you store data and a type is attached to it such as type can be number, text, image, etc. Thus, a box is known as a variable and a name and value are present with it.
- A variable is a container that holds the value while the Java program is executed.
- Java is a strongly-typed language as it demands the declaration of every variable with a data type.

- Syntax of creating a variable:
        
    ```java
    int num1 = 3; //  datatype variable name = value;
    ```
- Here, (=) is the assignment operator that takes the right-hand side value and assigns it to the left-hand side.

- println is used to go or print on the new line.
- In Java, every statement ends with a semicolon except blocks.

<br/>

> [top](#java-cheatsheet)

<br/>

# 3. Data types

- Datatypes are categories into primitive and non-primitive datatype.
But  we are take all concept upon primitive data type.

- There are 8 primitive datatype

        integer - byte, short, int, long
        float - float , double 
        character - char 
        boolean - boolean 

- why do we need different type of integer ?
 there are range for each type. for int - 4 bytes ,long - 8 bytes, short - 2bytes, byte - 1byte

- How to create variable of different data type?
    ```java
    int a = 10; byte b = 4 ; // dataType  variableName = value; 
    ```
- integer variable declaration
    ```java
    int a = 5; 
    long b = 600l;  // e.g 578l, 100000l represent long integer type 
    byte c = 127; 
    short s = 128; 
    ```
- float vs double 
double have more precision than float by default java support double.
declare variable of float and double type

    ```java
    double a = 5.6;
    float b = 5.6; //give error
    float b = 5.6f;
    ```
- character representation 
    ```java
    char ch = 'a'; //using single quotes on character we can declare char type of variable
    ```
- boolean representation of variable

    ```java
     boolean result = true; 
     ``` 

- there are only two value of boolean either true or false.
In other language like c and c++ -- 0 is treated as false and non zero number treated as true but it is not in java.

- {byte, short, int, long, float, double, char, Boolean }
since java is statically type or say strongly type language therefore we need 
to mention datatype for each variable for declaring variable.

    e.g 

    ```java
    int i = 5; 
    float f = 2.5f; 
    ```

- In java integer are by default for integer int type;
for real number by default double


- Range and way to declare different data type variable

    ```java
    int i = 5; // 4 bytes ---32 bytes  -- -2147483648 to 2147483647 
    short s = 5; //2 bytes -- 16 bytes -- -32768 to 32767 
    byte b = 5; //1 byte -- 8 bytes -- -128 to 127 
    long l = 5; //8 bytes -- 64 bytes -- -9223372036854775808 to 9223372036854775807 
    float f = 5.5f; //4 bytes -- 32 bytes -- 1.4e-45 to 3.4028235e+38 
    double d = 5.5; //8 bytes -- 64 bytes -- 4.9e-324 to 1.7976931348623157e+308 
    char c = 'a'; //2 bytes -- 16 bytes -- 0 to 65535
    boolean check = true; //value is either true or false
    ```
- ASCII - American Standard Code for Information Interchange

<br/>

> [Top](#java-cheatsheet)

<br/>

# 4. literals

- literal is a source code representation of a fixed value.

    e.g 2000l -- represent long type of integers, 20.5f -- represent float 


- their are many ways to represent integer using literal:

    - decimal 

        ```java
        int num = 10; 
        int num = 10004;
        ```

    - binary

        ```java
        int num = 0b1010; 
        int num = 0b101; // here literal in binary must start with 0b or 0B.
        ```
    - octal 

        ```java
        int num = 0123; // literal in octal must start with 0.
        ```
    - hexadecimal

        ```java
        int num = 0xA ; 
        int num = 0x13B; // iteral in hexadecimal must start with 0x or 0X
        ```

- Underscore use as literal to separate digit 

    ```java
    int num = 1_000_000; 
    int num = 3_45_78; 
    int num = 0b1010_1010;
    float num = 3.4_56f;  
    double num = 3.4_5; // underscore can be used between numbers to make it more readable
    ```

- different literal in real numbers

    ```java
    float num = 4.55f; // 4.5f is a float literal and f is a suffix  
    double d = 3.44e10; // meaning of 3.44e10 is 3.44x10^10 
    ```

<br/>

> [Top](#java-cheatsheet)

<br/>


# 5. type conversion and casting

- What is type conversion or type casting ?

type conversion or type casting  is the process of converting a value from one data type to another data type.

```java 
    int num = 5; 
    long l = num; 
```

- Different ways to casting 
a) Implicit type casting 

It is way to in which compiler automatically convert smaller size data type in larger.

```java
    int num = 4; 
    long l = num; //now num value converted to long 
```

b) Explicit  type casting 

manually when programmer cast one data type into other is known as explicit type casting.

```java
    float fl=4.5f;
    int num=fl; // num value become 4;
```

syntax for conversion:
type1 x = value; //higher size
type2 y = (datatype of type2) x ;


- What is effect of type casting ?

one effect is narrowing conversion

i.e Narrowing conversions can be done from a larger data type to a smaller data type, but they can result in loss of precision or data.

```java 
    float fl = 5.6f; 
    int num = fl;  // loss of 0.6 precision now value of num is 5.
```
 
Note: if you want convert 
you get error  
e.g 
```java 
    int i=5; 
    byte b=i; //give error
```
in most cases conversion of higher datatype to lower data type give error 

1. incompatible types: possible lossy conversion from long to byte
2. incompatible types: possible lossy conversion from double to int
3. incompatible types: possible lossy conversion from float to int
4. incompatible types: possible lossy conversion from double to byte
5. incompatible types: possible lossy conversion from float to byte
6. incompatible types: possible lossy conversion from double to short
7. incompatible types: possible lossy conversion from float to short
8. incompatible types: possible lossy conversion from double to long
9. incompatible types: possible lossy conversion from float to long
10. incompatible types: possible lossy conversion from double to char

these are some cases 
 

- Type promotion :-
when we do arithmetic operation on two different data types, java will promote the smaller data type to the larger data type 

int / int = int 
int / float = float
int * float = float
short * short = int
short * int = int
short * long = long
byte * byte = int

```java
    System.out.println(5.2/3);

    byte b=120; byte c=120;

    System.out.println(a*b); //14400
```

<br/>

> [Top](#java-cheatsheet)

<br/>


# 6. Assignment operator

there are many but in this lecture we discussing only some 

```java
        int num1 = 11;
        int num2 = 12;
        int result = num1 + num2;
        int result1 = num1 - num2;
        int result2 = num1 * num2;
        int result3 = num1 / num2;


        int num = 1;
        num += 1; 
        num = num + 1;
        num += 5;
        num = num + 5;


        int num2 = 2;
        num -= 1; 
        num = num - 1;
        num -= 5; 
        num = num - 5;
```

increment and decrement operator
there are two type of increment and decrement operator
 a) pre 
 b) post

post increment and decrement operator

```java
    int num=1;
    num++; 
    System.out.println(num); // 2
```

this operator is known as post increment operator

```java
    num--;
    System.out.println(num); //1
 ```

this operator is know  as post decrement operator 
pre increment and decrement operator

```java
    int num=2;
    ++num; 
    System.out.println(num);//3

    --num;
    System.out.println(num);//2
```


Difference between pre and post operator

e.g for that we take one example

```java
    int num = 5;
    System.out.println( num++ ); // 5 is print on console

    int  num1=5;
    System.out.println( ++num ); //6 is printed on screen 
```

```java

//in post 
//first assignment and then increment

    int num = 5; 
    int copy;
    copy = num++;  // in this case first num=5 assign to copy then increment the num
    //copy value is 5;

    //in pre 
    //first increment then assignment

     int num = 5;
     int copy;
     copy = ++num;
```

in this case first increment num value from 5 to 6 then assign to copy.
copy value is 6;

<br/>

> [Top](#java-cheatsheet)

<br/>

# 7. Relational operator

Relational operators are used where we need to compare things. 
We can use less than, greater than or also compare two values like they are equal or not.
In Java, equal to (=) is an assignment operator that is used to assign values.
 x=5   ( here, we are assigning the value 5 to the variable x).
Double equal to (==) is used to compare two values.
If we have to check the values are not equal, then we use not equal to an operator (!=). 

Relational Operators:-
less than 
greater than 
equal to for comparison 
not equal to 
less than equal to 
greater than equal to 

Relational operators return a boolean result after the comparison.
They are mostly used in looping and conditional statements.

<br/>

> [Top](#java-cheatsheet)

<br/>

# 8. logical operator

If we need to combine the result of two or more relational operators, then we use logical operators.
We use logical operator in between two or more results of relational operators.
AND operator (&&), OR operator (||) and Not operator (!) are logical operators.

1) In case of AND Operator:
    - If both are true - true
    - If one is true and other is false - false
    - If one is false and other is true - false
    - If both are false - false
If first condition is false then it will not check for the another one and it will increase the execution time.
Thus, because of its less time it is known as short- circuit.

2) In case of OR Operator:
    - If both are true - true
    - If one is true and other is false - true
    - If one is false and other is true - true
    - If both are false - false
    - If first condition is true then it will not check for the another one and it will increase the execution time.
Thus, because of its less time it is known as short- circuit.

3) In case of Not Operator:
    - It is basically used to reverse the things.
    It means if result is false, it will do true.
    If the result is true, it will do false.
    Not operator just do the opposite.
    - We can use as much logical operators as we want in between the relational operations.


<br/>

> [Top](#java-cheatsheet)

<br/>


# 9. conditional operator if-else

- conditional statement is a statement that can be true or false.
- suppose if ask student is pass. (answer yes or no)
- this type of statement of statement is conditional statement.
- In this part we are only discussing about if-else and 
in next lecture we are discussing if-else-if ladder, ternary operator and switch statement.
- syntax of if-else
    - condition is either true or false after evaluation 
    - remember like c and c++, we cannot use number directly as condition of if-else
    - if(5) -- not allowed in java 
    - you get Type mismatch: cannot convert from int to boolean

```java

if(condition) 
{
    //code 
    //either this part execute 
}

else
{
    //code
    //or this part execute
}

```

- if want to check a given number is even or odd then;

```java

int num=13;
if(num%2==0)
System.out.println("Even"); //here we not use  braces for single statement {}

else
System.out.println("Odd");  // here we not use braces {}

```
Note: for single statement braces is not required  but for multiple statement it is required.

<br/>

> [Top](#java-cheatsheet)

<br/>

# 10. conditional operator if-elseif-else


- if-else-if ladder is a series of if, else if or else statements that are executed based on the boolean condition.
- if else if ladder is used to test multiple conditions


- syntax of if-else-if ladder

```java
if(condition1)
{
    //block of code  
}
else if(condition2){
    //block of code
}
else if(condition3)
{
    //block of code
}
else{
    //block of code
}

```
Note: only one block is executed from all. If all condition is false then else part executed


- check greatest number from three number.

```java
      int x=8;
      int y=7;
      int z=6; 
        if(x y && x z)
        System.out.println("x is greater");
        else if(y z) 
        System.out.println("y is greater");
        else
        System.out.println("z is greater");  

```

<br/>

> [Top](#java-cheatsheet)

<br/>

# 11. ternary operator

- ternary operator is shorthand of if-else statement.

- why we need ternary operator?
  a) to reduce the code
  b) to make the code more readable
  c) to make the code more compact

- Syntax:

variable = (condition)?value1 if condition is true :value2 if condition is false

```java
boolean result  =(5 less then 6)? true :false; //result false
```
- in if-else we can check a given number is even or odd now we code this problem by 
ternary operator.

```java
int num=13;
String str=(num%2==0)?"Even":"Odd";
System.out.println(str); //output: Odd

```

<br/>

> [Top](#java-cheatsheet)

<br/>

# 12. Switch case

- switch statement is a multiway branch statement that allows a variable to be tested for equality against a list of values
each value is called a case, and the variable being switched on is checked for each switch case.

- if we have multiple test cases and we want to test for a particular value then we can use switch statement. 
At the place switch we can also use if-else-if ladder.


- suppose user enter a your date of birth and we want to check from multiple year then
in this case we can use switch case.

- what dataType we can use in switch statement?
- the switch statement can have a number of possible execution paths. A switch works with the 
byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), 
- the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer.

- Syntax of Switch and example:

```java
switch(variable){
    case x1:
    //code
    break;

    case x2:
    //code
    break;

    default:
    //code
}

```


```java
int x=9;
switch(x){
case 8:
  System.out.println("8");
  break;
case 7:
  System.out.println("7");
  break;
default:
  System.out.println("No match found");
 }

```

- Need of break 
- The break statements are necessary because without them, statements
in switch blocks fall through: All statements after the matching case label
are executed in sequence, regardless of the expression of subsequent case labels,
until a break statement is encountered. The program  shows
statements in a switch block that fall through.

```java
int x=5;
switch(x){
    case 5:
    System.out.println("five");
    case 4:
    System.out.println("six);
    default:
    System.out.println("default");
}

```
output:
five
six
default

Since, we are not using break after matching the case 5
it execute all remaining statements without check.


- Need of default:
    - The default section handles all values that are not explicitly handled by one of the case sections.

```java
int y=9;
switch(y){
    case 8:
        System.out.println("8");
        break;
    case 7:
        System.out.println("7");
        break;
    }
```

In this case you don’t get any result because no case is match and 
since no default case is available so, nothing we get.


<br/>

> [Top](#java-cheatsheet)

<br/>


# 13. while loops

While loop:-
- While loop is used with a condition. We need to provide a condition inside the while loop.
- If we will give the condition as true inside the while loop then it will infinite times.
-If we do not provide any condition inside the while loop then it is known as an empty loop.
- We require an iterator inside the loop to execute the statements.
-- We use plus opertaor(+) for concatenation. When we have to concatenate or join two things, we simply use plus operator.
- We need to put the condition inside the while loop for executing statements. We run the loop until the condition gets false.
- When the condition inside the while loops get false, then after that it will not execute the statement of the block and the iterator directly jumps out of the block.

- The while loop is used when the number of iterations is unknown but the terminating condition is known.
-  While loop is also an entry-controlled loop as the condition is checked before entering the loop. The test condition is checked first and then the control goes inside the loop.

```java
Syntax of while loop:-
 while(condition)
 {
  statements;
 }
```


Nested loops:-
- We can also use a loop inside another loop statement. A loop inside another loop is known as a nested loop.
- There can be any number of inner loops inside an outer loop.


<br/>

> [Top](#java-cheatsheet)

<br/>

# 14.  do while 

Do While Loop:-
- When you have to execute the block at least once even if the condition is false, then in such cases we use do- while loop.
- Do- while is almost similar to while loop except thst the condition is checked after evaluation after body of the loop.
- Do-while runs at least once and at most as many times the test condition evaluates to true.
- Consition is cjeckd at the end of the execution of the body in this loop.
- It is also known as exit- controlled loop.
- It is the only loop that has a semicolon(;).

```java
Syntax of do-while loop:-
 do
 {
  statement;
 }while(condition);

```

<br/>

> [Top](#java-cheatsheet)

<br/>

# 15. for loop

- In the while loop we have three things: Initialization, Condition, and then increment.
- We do these three things in different lines in a while loop.
- Sometimes we do not know about the ending point, where this loop will get end. As it may end based on some conditions.
- In the finite loop, we know about its starting and ending.
- For loop supports three different statements in one line.
- We can put initialization, condition and increment in one single line in for loop.
- It is mostly used when the number of iterations is fixed.
- Because of the binary format computer starts from 0.
- So, in general, we start from 0 and end at count-1 ie., one less than the total number of iterations.
- Loops are very useful when we have to print some pattern or want to print things repeatedly.

```java
Syntax of For Loop:-
 for(initiation; condition; incrementation or decrementation)
 {
  statements;
 }
```

- init - The init expression is used for initializing a variable, and it is executed only once.
- condition - It executes the condition statement for every iteration. If it evaluates the condition to be true, it executes the body of the loop. The loop will continue to run until the condition becomes false.
- incr/ decr - It is the increment or decrement statement applied to the variable to update the initial expression.

- First initiation and condition statement execute and then execution of statements takes place and then increment takes place at last.
- We can also skip any of the three parts as per the need.

Nested For loops:-
- We can also use nested for loops as same as while loop. Nested loops mean loop inside a loop.
- Whenever the outer loop meets the condition, the inner loop is executed completely.


<br/>

> [Top](#java-cheatsheet)

<br/>


# 16. Classes and object

Java is Object- Oriented Programming:-
- In the real world, everything is an object like a pen, mouse, glass, etc.
- Every object has two things:
  - An object knows something ( It has some properties)
 - An object does something( It has a behaviour)
- Every object has a property and behaviour. It can also have multiple properties as well as multiple behaviours.
- To create an object, first, we need to create a class.
- Class act as a blueprint that contains the designing of an object.

#2
- JVM creates objects in Java.
- JVM creates an object but it requires a blueprint.

- Thus, you create a class file that class file gets compiled to create a byte code and that byte code goes to the JVM and then JVM creates an object.

Whatever we do in Java, we do it in a class.
A class is a user-defined blueprint or prototype from which objects are created.
- In a class, we have methods and variables.
- Class will be created in the same java file.
- We can create any number of classes in a program.
- Class does not occupy memory.
Syntax of a class:-
 class classname
 {
  methods, variables
 }

#2
- Every object has two things: properties and methods.
- When an object of a class is created, the class is said to be instantiated. All the instances share the attributes and the behavior of the class. 
- Action will be done with the help of methods.
- We need to specify the access to methods. We will specify it as public if we want it to be called from anywhere else.
- If we want the method to return any value then we need to specify its return type like int for Integer type values.
- As Java is a statically typed language so you have to specify the return type in it.

Syntax of method:-
= access modifier return type method name()
 public int add()
 {
  statement;
 }

#3
- We need an object to call a method from a different class.
- Creating an object:-
 classname reference variable= new classname();
- reference variable is used to tell that this variable is made to establish a reference between a class.
- new keyword is used to tell that we have to utilise the space for an object.

- We can call a method by using the reference variable of the object. 
- We have to pass the values if we want some operations to be on them.
- We also have to accept values in a method as well if we pass some values. For this, we have to specify parameters in a method based on the type of passed values.


<br/>

> [Top](#java-cheatsheet)

<br/>


# 17. Method

#1
A method in Java or Java Method is a collection of statements that perform some specific task and return the result to the caller.
- Methods in Java allow us to reuse the code without retyping code.
- In Java, we create the components with the help of classes.
- Every class has a behavior and it is defined through the method.
- Behaviour or method is defined with the round brackets ().
- For every method, we also have to specify the type of access to it.
- Method does some tasks and it also returns something.
- We can call methods by creating an object.
- We can pass also pass values in a method.
- We can also put conditions inside the method like with the help of if..else.
- return keyword stops the execution of a method as it does not execute the further statements after it.

#2
-- void is used when we do not want a method to return something.
-- String is used to return a string value.
-- int is used to return an integer value.

- Main method is the start of execution from where the program begins. 

#3
The syntax for method:-
class Computer
{
 public void playMusic()
 {
  System.out.println("Music Playing..");
 }
}

<br/>

> [Top](#java-cheatsheet)

<br/>

# 18. Method overloading

#1
It is not compulsory that a class should have methods and variables. It will be empty also.
- The parameters that except the values in a method should be equal to the parameters that we pass in a method to call it.
- As it might create a problem if the parameters excepted by the method are not equal to the number of values passed.
- So, to overcome this problem we do overloading.
- As we can have two methods we the same name but different parameters.
- Either the number of parameters or the type of parameters should be different.
- Method with the same name and parameters but with different return types will also not work. The return type does not matter here. Method name and parameters matter only.

#2
Method overloading:- In Java, there can be more than one method with the same name but the number of parameters or type of parameters should be different.

- Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java.
- In Method overloading compared to parent argument, child argument will get the highest priority.

#3
Different ways of Method Overloading in Java:-
1. Changing the number of parameters
- Method overloading can be achieved by changing the number of parameters while passing to different methods.

2. Changing Data Types of the Arguments
- If methods have the same name but have different parameter types then also methods are considered as overloaded.

3. Changing the Order of the Parameters of Methods
- By rearranging the parameters of two or more overloaded methods.

#1
In java we are managing our managing our memory using two data structure stack and heap.
two categories to store data in memory:
1) Stack data structure
2) heap data structure

#2
Stack is data structure which follow LIFO(Last in First Out) principle.

#3
heap is data structure which is used to store data in form of object and object is a collection of data and method.

#4
class Student{
    int instVariable; //store in object and object created in heap
    public static void main(String []args){
        int localVariable=0;      //local variable store in stack frame of method in stack area.
        Student st=new Student(); //st is reference variable store address of new Student() object
    }

    public int add(int num1,int num2){
        return num1+num2;
    }
}

-- instance variable stored in object and object are in heap therefore we can say that instance variable created in heap.
-- method declaration and definition is present in object but actual implementation present in stack frame of stack.
-- local variable created in stack during call of method.
-- stack frame of called method is present in stack area.
-- st is reference variable created inside the current stack frame and it is reference variable store address of student object created in heap area.
-- new Student() create object in heap area and pointed by his reference variable.

<br/>

> [Top](#java-cheatsheet)

<br/>

# 19. Array

#1
Ways to create array in java
a)Literal notation
Literal notation: int[] arr = {1, 2, 3};
b)Object notation
Array constructor: int[] arr = new int[]{1, 2, 3}; // this is not literal notation ,this is object notation with assignment of value
Array constructor with size: int[] arr = new int[3]; arr[0] = 1; arr[1] = 2; arr[2] = 3; //in this we manually assign value but by default 0 is assign in this case 

#2
default value which store array when we create using object notation for primitive datatype.

-- When you create an array of primitive data types in Java using the object notation, the default value stored in the array depends on the data type:

 -- int arrays: default value is 0
 -- boolean arrays: default value is false
 -- char arrays: default value is '\u0000' (null character)
 -- byte, short, long arrays: default value is 0
 -- float arrays: default value is 0.0f
 -- double arrays: default value is 0.0d


code for you --
char ch[]=new char[3]; //declaration and initialization
      
for(int i=0;i less then ch.length;i++){
    System.out.println(ch[i]);
}

check result--

#4
fetching the element of array :
-- for traversing whole array, you need to know either length of array or know length property of array
-- using length property we get length of array
-- using index we can fetch all value of array

suppose we create int nums[]={2,3,4,5};
access first element then nums[0],
access second element nums[1],
access third element nums[2],
access fourth element nums[3];

-- if you match pattern for accessing the element
you get nth element is nums[n-1];
for 7th element nums[7-1]; i.e is nums[6]

-- in array position start from 0,1,2, go till n-1 if n is length of array
change value of given position

int nums[]={2,3,4,5};

for(int i=0;i less then nums.length;i++){
    System.out.println(nums[i]);
} //traversing whole array -- means fetching all elements of array

nums[0]=10;
nums[1]=11;
nums[2]=22;
nums[3]=33; 

for(int i=0;i less then nums.length;i++){
    System.out.println(nums[i]);
}

<br/>

> [Top](#java-cheatsheet)

<br/>

# 20. Multi dimentional array

what is multidimension array?
-- simple we can say it is array of array

-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------

Above is example of 2-d array which has 2 rows and 3 columns.
-- it seems to look like a bigger array consist two single dimension array.
-- just like we have 3-d array and array might be n-dimension.

#2
Why do we need multidimension array?
-- to solve some matrix problem to solve grid problem

#3
How to create multidimension in java?
-- different Ways to create array in java
  a)Literal notation
  Literal notation: int [][]arr = {{1, 2, 3},{4,5,6}};
  b)Object notation
  int [][]nums=new int[2][3];

-- general syntax for object notation:
-- dataType [][]arrayName=new dataType[rows][columns];

#4
how to access element of multidimension array element?
let we create 2d array arr
int [][]arr = {{1, 2, 3},{4,5,6}};
-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------

-- there are two rows whose index are 0,1 and columns are 0,1,2.
-- want to access 2 which are at row 0 and columns 1
-- System.out.println(arr[0][1]); //give 2 

simple if you want to access element at ith row and jth column then;
arr[i][j]; //it is value at that position

#5
How to use enhanced for loop 

for  array name arr:
-- using for loop traverse all element
-- arr.length give number of rows and arr[0].length give number of column in first row 
for(int i=0;i arr.length;i++){
    for(int j=0;j arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

using enhanced for loop:
for(int x[]: arr){
    for(int y:x){
        System.out.print(y+" ");
    }
    System.out.println();
}

general syntax for enhanced for-loop 
for(dataType singleDimension[]: twoDimension){
    for(dataType element: singleDimension){
        System.out.println(element);
    }
}


<br/>

> [Top](#java-cheatsheet)

<br/>

# 21 . Jagged and 3D Array

#1
Suppose we want to create a 2d dimensional array such that it has 
5 rows but we donot know for each row we need different size for column.
for that we go for array of array of different size

-------------
| 1 | 2 | 3 |
---------------------
| 4 | 5 | 6 | 7 | 8 |
-------------------------
| 1 | 5 | 9 | 2 | 4 | 7 |
-------------------------

in above diagram we have three rows and first row has 3 elements
second row has 5 elements and third row has 6 elements.

#2#3
jagged array concept come in java 8 
-- Jagged array is a multidimensional array where member arrays are of different size. For example, we can 
create a 2D array where first array is of 3 elements, and is of 4 elements. Following is the example demonstrating
 the concept of jagged array.

 syntax to create --

 int nums[][]=new int[3][];
 nums[0] =new int[3];
 nums[1] =new int[5];
 nums[2] =new int[6];

initalize value in array using random()method present in Math class
  for(int i=0;i nums.length;i++){
            for(int j=0;j nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }
#5
Traverse using for loop :
   for(int i=0;i nums.length;i++){
            for(int j=0;j nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
        }

Traverse using enhanced for loop:
  for(int x[]:nums){
            for(int y:x){
                System.out.println(y);
            }
        }    

Note: Just like 2-d jagged array we can create 3-d , 4-d jagged array
for cursoity:
 int num[][][]=new int[3][][];
        num[0]=new int[2][];
        num[1]=new int[3][];    
        num[2]=new int[4][];
        num[0][0]=new int[2];
        num[0][1]=new int[3];
        num[1][0]=new int[4];
        num[1][1]=new int[5];
        num[1][2]=new int[6];
        num[2][0]=new int[7];
        num[2][1]=new int[8];
        num[2][2]=new int[9];
        num[2][3]=new int[10];

Intialize the array:
for(int i=0;i num.length;i++){
    for(int j=0;j num[i].length;j++){
        for(int k=0;k num[i][j].length;k++){
            num[i][j][k]=(int)(Math.random()*10);
        }
    }
}

Traverse the element of array:
for(int i=0;i num.length;i++){
    for(int j=0;j num[i].length;j++){
        for(int k=0;k num[i][j].length;k++){
            System.out.print(num[i][j][k]+" ");
        }
    }
}

<br/>

> [Top](#java-cheatsheet)

<br/>


# 22 . Array of Objects 

-- If we create array by default value assign for each type of array
-- The new operator automatically initializes the elements of an array to their default value, which, for example, is zero for all numeric types
and null for all reference types.
-- why we should we know length of array using length property?
-- There is array out of bound exception.

How to create array of object and what does it means?
-- just like to create array for int, float, char we can create array of object 
-- when we we create array of object it means we create an array which can hold the reference of object.

e.g
class Student{

}

Student st=new Student();
we know st is reference and new Student() is object.
and st hold reference of student object.

similarly whenever we create array of object
Student sts[]=new Student[5];
it means we can create an array of Student reference type which can hold 5 different reference of
Student object.
sts[0]=new Student();
sts[1]=new Student();
sts[2]=new Student();
sts[3]=new Student();
sts[4]=new Student();


<br/>

> [Top](#java-cheatsheet)

<br/>

# 23 . Strings

#1
-- If you want to store character sequence e.g "shiva", "navin", "hyder" in 
such cases we need character array or String (non-primitive data ) .
-- But Using String object it is easy to store sequence of character.

-- String is non primitive data-type and it is also a class. 
String str="shiva";

#2
How to create String object?
-- using new operator String str=new String("shiva");
-- directly assigning String str="shiva"; put sequence of character inside a double quotes.

#3
What is hashcode?
-- hashcode is unique number for each object created in heap.
-- hashcode is used to identify object.

#4
Concatenation operator
--  + operator used to concatenate the String
String firstName="shiva";
String lastName="srivastava";
String fullName=firstName+lastName;
System.out.println(fullName); //shivasrivastava

#5
some method used in String
a) int length() --to find the length of String
b) char charAt(int index) --to find character at particular index

System.out.println(str.charAt(0));
System.out.println(str.length());

Note: In array length is property while in String length() is method.


<br/>

> [Top](#java-cheatsheet)

<br/>



# 24. StringBuffer & StringBuilder

#1
Using the new keyword, you can create multiple objects from the same character sequence.
This is useful when you want to save time   by creating multiple objects from the same data source. However, when using a string literal,
you can only create one object. String literals are read-only memory locations, so they cannot be changed and can only be used to create a
 single object. This makes string literals less flexible than the new keyword.

String name1="navin";
String name2="navin";

Since "navin" is same character sequence and created by string literal way. 
so name1 and name2 pointing same object created in string constant pool.

check--
System.out.println(name1==name2); //true 

using new --
String name3=new String("navin");
System.out.println(str1==str3); //false
Since new can create new string object which can contain navin.

#2
what is string constant pool?
-- The String constant pool is an area in the Java heap that stores immutable strings.
It is used to optimize the storage of strings in the program by providing a single location 
for string literals. When a string is created in the program, the Java Virtual Machine first
checks if the same string exists in the constant pool and if so, it is returned instead of creating
a new string. This helps to reduce the memory footprint and also improve performance since the string
comparison operation is also optimized.

#3
what happen when we assign different value to String reference variable?
suppose we create 
String str="Mathura";
now str=str+" city"; 
System.out.println(str);//here we get Mathura city

-- do you think we change in existing "Mathura" object 
then answer is no because String is immutable type which cannot further changed.
-- here reference variable str pointing to new object that  is "Mathura city";
-- and "Mathura" object ready for garbage collection because no variable pointing the "Mathura" object.

#4
What is difference between mutable and immutable String?
--Mutable and immutable strings are two different types of strings in programming.
Mutable strings are strings which can be modified once they are created. 
-- Immutable strings, on the other hand, cannot be changed after they have been created. 

String is immutable 
StringBuffer and StringBuilder are mutable in nature

StringBuffer class and StringBuilder class
--  string buffer and string builder class in java used to create mutable string 

#2
Different method
 --First Create StringBuffer object 
        StringBuffer sb = new StringBuffer("Hello");
 --Find capacity of StringBuffer 
        System.out.println(sb.capacity());
        -- default capacity is 16

--Find the length of StringBuffer Created String
        System.out.println(sb.length());
    
--To append the content in existing StringBuffer object
        sb.append(" World");

--To Convert StringBuffer Object into String Object
        String str=sb.toString();
        System.out.println(str);

-- Delete charcter of particular index
        sb.deleteCharAt(3);
        -- delete character at index 3

-- Insert "hi " at index 0 of existingStringBuffer Object
        sb.insert(0, "Hi ");
        System.out.println(sb);

#3
Difference between StringBuffer and StringBuilder
       -- StringBuffer is thread safe
       -- StringBuilder is not thread safe
Imp: We will discuss thread safe when we study multithreading



<br/>

> [Top](#java-cheatsheet)

<br/> 


# 25. static variable


#1
Use of static keyword
= when we are using static keyword with variable, block, method it become
independent of object. 
e.g class{
    static int a=5;
}
= a is not dependent on object .if we have two object obj1 and obj2 then both object able to access this 
variable.
= when we are using static it become independent to object.

#2
Four place we can use static keyword 
a) before variable declaration e.g class Calc{ static int s; }

b) before a block  class Calc{  static {System.out.println("this is static block);}}

c) during method creation class Calc{public static void add(int num1,int num2){};}

d) with concept of inner class (It is not discussed in this lecture) 
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

#3
When memory get allocated
= for that we need to know some term 
a)stack area b)heap area c)class loader system 
Step 1: when you compile the code you get .class file 
Step 2: when you are executing (java MainClass) first class loading to class loader System.
Step 3: During class loading static variable initialize, static block get executed.
Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object.

#4
Static variable vs instance variable

Class Calc{
    static int stA=100; //independent of object // we can use this by class name as well as object
    int  inB=100;  //dependent of object //we can only use this by object

public static void main(String []args){
Calc obj1=new Calc(); 
Calc obj1=new Calc();
//for static variable
System.out.println(Calc.stA); //use with class name
System.out.println(obj1.stA);  //use by object name

//for instance variable
//System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
System.out.println(obj1.inB); //used by object name reference 


// = if we can change value static or instance what happen 
obj1.inB=1000;
obj1.stA=2000;

//static 
System.out.println(obj1.stA);//output: 2000
System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 
//it also show that static variable independent of objects

//instance 
System.out.println(obj1.inB); // output: 1000
System.out.println(obj2.inB); // output: 100 no change in obj2
}
}
  

Remember one thing:
i)we can use static property, member inside non static block or method without object creation.
ii) But we cannot use non static property or method inside static block or method without object creation.

<br/>

> [Top](#java-cheatsheet)

<br/> 

# 26. static block

#1
Use of static keyword
= when we are using static keyword with variable, block, method it become
independent of object. 
e.g class{
    static int a=5;
}
= a is not dependent on object .if we have two object obj1 and obj2 then both object able to access this 
variable.
=when we are using static it become independent to object.

#2
Four place we can use static keyword 
a) before variable declaration e.g class Calc{ static int s; }

b) before a block  class Calc{  static {System.out.println("this is static block);}}

c) during method creation class Calc{public static void add(int num1,int num2){};}

d) with concept of inner class (It is not discussed in this lecture) 
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

#3
When memory get allocated
= for that we need to know some term 
a)stack area b)heap area c)class loader system 
Step 1: when you compile the code you get .class file 
Step 2: when you are executing (java MainClass) first class loading to class loader System.
Step 3: During class loading static variable initialize, static block get executed.
Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object.

#4
Static variable vs instance variable

Class Calc{
    static int stA=100; //independent of object // we can use this by class name as well as object
    int  inB=100;  //dependent of object //we can only use this by object

public static void main(String []args){
Calc obj1=new Calc(); 
Calc obj1=new Calc();
//for static variable
System.out.println(Calc.stA); //use with class name
System.out.println(obj1.stA);  //use by object name

//for instance variable
//System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
System.out.println(obj1.inB); //used by object name reference 


// = if we can change value static or instance what happen 
obj1.inB=1000;
obj1.stA=2000;

//static 
System.out.println(obj1.stA);//output: 2000
System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 
//it also show that static variable independent of objects

//instance 
System.out.println(obj1.inB); // output: 1000
System.out.println(obj2.inB); // output: 100 no change in obj2
}
}

#5
static block vs non static block
= remember static block executed before the execution of static method 
= non static block executed when you try to create the object and executed before constructor called.

class Calc{
    static{
        System.out.println("Static Block");
        System.out.println("Executed before main");
    }

    {
        //non static block
        System.out.println("Non static block executed before the execution of constructor");
    }

    public static void main(String []args){
        System.out.println("main method");
        Calc c = new Calc(); //non static block executed when we create object 
        // Help h ; -- this will not execute static block of Help class
        // Help h = new Help(); this will execute static block of Help class
        Help.wish(); //-- this will execute static block of Help class

    }
}
class Help{
    static {
        System.out.println("Static block of Help class");
    }
    static void wish(){
        System.out.println("Hello");
    }
}

/*
 PS D:\telusko\january\java-course-telusko\code  javac Calc.java
PS D:\telusko\january\java-course-telusko\code  java Calc
Static Block
Executed before main
main method
Non static block executed before the execution of constructor
Static block of Help class
Hello
 */

#6
Static method vs non static method
= remember we can call static method with object reference or class name  e.g ClassName.staticMethod() or objReference.statiMethod()
= but non static method dependent on object so it can be called only  by object reference. e.g objReference.nonStaticMethod();

Remember one thing:
i)we can use static property, member inside non static block or method without object creation.
ii) But we cannot use non static property or method inside static block or method without object creation.


<br/>

> [Top](#java-cheatsheet)

<br/> 


# 27. static method

#1
Use of static keyword
= when we are using static keyword with variable, block, method it become
independent of object. 
e.g class{
    static int a=5;
}
= a is not dependent on object .if we have two object obj1 and obj2 then both object able to access this 
variable.
= when we are using static it become independent to object.

#2
Four place we can use static keyword 
a) before variable declaration e.g class Calc{ static int s; }
b) before a block  class Calc{  static {System.out.println("this is static block);}}
c) during method creation class Calc{public static void add(int num1,int num2){};}
d) with concept of inner class (It is not discussed in this lecture) 
class OuterClass {
  int x = 10;
  static class InnerClass {
    int y = 5;
  }
}
#3
When memory get allocated
= for that we need to know some term 
a)stack area b)heap area c)class loader system 
Step 1: when you compile the code you get .class file 
Step 2: when you are executing (java MainClass) first class loading to class loader System.
Step 3: During class loading static variable initialize, static block get executed.
Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object.

#4
Static variable vs instance variable

Class Calc{
    static int stA=100; //independent of object // we can use this by class name as well as object
    int  inB=100;  //dependent of object //we can only use this by object

public static void main(String []args){
Calc obj1=new Calc(); 
Calc obj1=new Calc();
//for static variable
System.out.println(Calc.stA); //use with class name
System.out.println(obj1.stA);  //use by object name

//for instance variable
//System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
System.out.println(obj1.inB); //used by object name reference 

obj1.inB=1000;
obj1.stA=2000;

//static 
System.out.println(obj1.stA);//output: 2000
System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 


//instance 
System.out.println(obj1.inB); // output: 1000
System.out.println(obj2.inB); // output: 100 no change in obj2
}
}

#5
static block vs non static block
= remember static block executed before the execution of static method 
= non static block executed when you try to create the object and executed before constructor called.

class Calc{
    static{
        System.out.println("Static Block");
        System.out.println("Executed before main");
    }

    {
        //non static block
        System.out.println("Non static block executed before the execution of constructor");
    }

    public static void main(String []args){
        System.out.println("main method");
        Calc c = new Calc(); //non static block executed when we create object 
        // Help h ; -- this will not execute static block of Help class
        // Help h = new Help(); this will execute static block of Help class
        Help.wish(); //-- this will execute static block of Help class

    }
}

class Help{
    static {
        System.out.println("Static block of Help class");
    }
    static void wish(){
        System.out.println("Hello");
    }
}

/*
 PS D:\telusko\january\java-course-telusko\code javac Calc.java
PS D:\telusko\january\java-course-telusko\code java Calc
Static Block
Executed before main
main method
Non static block executed before the execution of constructor
Static block of Help class
Hello
 */

#6
Static method vs non static method
= remember we can call static method with object reference or class name  e.g ClassName.staticMethod() or objReference.statiMethod()
= but non static method dependent on object so it can be called only  by object reference. e.g objReference.nonStaticMethod();

Remember one thing:
i)we can use static property, member inside non static block or method without object creation.
ii) But we cannot use non static property or method inside static block or method without object creation.



<br/>

> [Top](#java-cheatsheet)

<br/> 


# 28.  Encapsulation , getters & setters , this keyword , Constructor , default & parametrized constructor


#1
What is encapsulation?
= binding data with method to make your program secure is known as encapsulation.
Consider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.
e.g
class A{ private int a;  
public void setA(int num){a=num;} 
public int getA(){return a;}
} 
//here you can see that we can bind data with method inside a curly braces, it seems look like a capsule inside everything is present.

#2
how to achieve encapsulation?
-- through access specifiers private,protected,public,default . We can achieve 
encapsulation.

#3
Benefit of encapsulation
 i)Helpful in to achieve abstraction 
 ii)for security point of view it is most beneficial.
 iii)you can maintain log file through method when you bind your data with method.

#4
how to use private data?
-- using setters and getters method we can set and get the value of variable.
-- private int num;
public int getNum( )
{
return num;
}

public void setNum(int num)
{
this.num=num;
}

 Note:
 Always make variable as private and method as public to achieve  security in program.

 Shortcut for writing getters and setters in Eclipse:-

- The name of a method should define the objective of the model.
- For every variable, we have two things: Setters and Getters methods inside a class in Java programming. 
- Getter and Setter are methods used to protect your data and make your code more secure.
- Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
- In both getter and setter, the first letter of the variable should be capitalised.

Getters:-
- If you want to get the value of a method, we use getters.
= public int getAge();

Setters:-
- To set the value in a method, we use overloading.
= public void setAge()

- There is no complusion that there should be all methods and variables inside the class.

Shortcut for writing getters setters in Eclipse:-
= Right-click on the editor - source action or insert code - Generate getters and setters.

#1
Instance variable:- These variables are declared within a class but outside a method.
- These variables are created when we create an object and are destroyed when the object is destroyed.

Local variable:- These variables are declared within a method but do not get any default value.
- They are created when we enter a method or constructor and get destroyed when the call returns from the method.

#2
In Java, it is not allowed to declare two or more variables having the same name inside a scope either in class scope or method scope.
- The preference is always given to the local variable.
- Creating an object is not a good idea to solve the issue of conflicting names of instance and local variables.
- We can differentiate between local and instance variables by passing an object itself.
- Instead of writing and passing an object, we can simply use this keyword.

#3
This keyword:-
This keyword represents the current object.
- Current object is an object which is calling the method.
- This keyword is used to invoke the current class constructor.
- Using the 'this' keyword, we can return the current class instance.
-  This keyword can be used as an argument in the constructor call.


#1
- When you create an object then in the heap memory, it will just create a blank object.
- If you do not assign values than the default values will be assigned like:
 0 for int,
 NULL for string
- We can also define values at the time of the creation of an object by giving our default values.

#2
Properties of a constructor:
- Constructor is almost similar to a method it has a name and it also has round brackets.
- The change in the constructor with respect to the method is that in the constructor we do not specify the return type.
- The name of a constructor must be the same as the class name.
- There is no need to call a constructor. It gets called automatically at the time of the creation of an object.
-  At the time of calling the constructor, memory for the object is allocated in the memory.
- Constructors are called only once at the time of object creation. While method(s) can be called any number of times.

#3
Syntax of a constructor:
class human {
 public Human()
 {
  statements;
 }
}


A constructor in Java is a special method that is used to initialize objects. 

Parameterized Constructor:-
- A constructor that takes some parameters is known as parameterized constructor.
- The parameterized constructor is used to provide different values to different objects.

Default Constructor:-
- A normal constructor is known as the default constructor.
- If you do not create any constructor, then java creates a default constructor. That constructor will be blank with no parameters.
- The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

- The default constructor can change into the parameterized constructor. But Parameterized constructor can’t change into the default constructor.

<br/>

> [Top](#java-cheatsheet)

<br/> 

# 29. super() , this() and anonymous object

#1
- Whenever you call an object, it will create a constructor of a class.
- When we create an object of a class that it calls the constructor of a sub-class as well as a constructor of a superclass.
- If you do not pass any value in an object, then it will call the default constructor of a class.
- But if you pass the value in an object, then it will call the parameterised constructor of that class.

#2
Super() method:-
- Every constructor in Java has a method, even if you do not mention it.
- By default, the first statement in every constructor is a method called a super() method.
- Super() method means calls the constructor of a superclass.
- If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
- If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
- To call the parameterised constructor of a parent class, we need to explicitly call the super method.

#3
Object class:-
- Every class in Java extends the Object class, even if you do not mention it.
- Object is a class in Java that contains a lot of methods.
- So, the super method of a superclass calls the constructor of an object class.
- There is multi-level inheritance in this concept.

#4
This() method:-
- this() method calls the constructor of the same class.
- If you do not pass any parameter in this method, then it will call the default constructor of the same class.
-  If you pass any parameter in this method, then it will call the parameterised constructor of the same class.

#5 
Similarities in between this() and super() method:-
- We can use both this and super method anywhere except the static area.
- Both this and super method can be used any number of times in a code.
But both can be used only one time inside a constructor.
- Both are non-static keywords.



#1
In JVM, we have both stack memory and heap memory.
- Object is created in the heap memory that contains  variable and methods, it also have some address.
- A obj=new A();
  obj.show();
here, A is the classname.
         obj refers to the address say 101
    show() is a method that is called using reference variable obj.
- Every time you call an object, it will call the constructor as well.
- Object creation can be done in two ways:
 1. Declare an object  - creating a reference
 2. Creating an object  - and assigning the value to it
e,g.,  A obj;
  obj=new A();
 *new A() shows that you are creating an object.
- Reference of an object is created in the stack.


#2
Anonymous Objects:- 
Anonymous objects are simply created by using the new keyword.
- It does not have any reference for an anonymous object.
e.g., new A();
- A method can directly be called using this object.
  new A().show();
- We can't use the same anonymous object again. It will be use only for one time.

<br/>

> [Top](#java-cheatsheet)

<br/> 

# 30.  Inheritance , single inheritance, multilevel inheritance , method overriding

#1
For every class that we create in a code, there will be a class file.
- Inheritance helps to add more features by inheriting the class.
- For inheritance, we only required the class file. There is no need for a java file.
- extends keyword is used in inheritance to inherit properties of a parent class.

#2
- The main aim of inheritance is to implement the concept of reusability, saving our time and resources and also creating better connections between different classes, and achieving method overriding. 

#3
Points related to inheritance in Java:-
- The superclass of every class is an Object class.
In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.
-   A superclass can have any number of subclasses but a subclass can have only one superclass.
- Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- A subclass does not inherit the private members of its parent class. 

Single Inheritance:-
- In single inheritance, subclasses inherit the features of one superclass. 
- Only one parent class exists in single inheritance.
- It is when there are only two classes.
e.g., 
Calc class inherits the properties of AdvCalc class.
Here, Calc - child class
     AdvCalc - parent class


Multi-level inheritance:-
- In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
- More than one parent class exists in multilevel inheritance.
- It is when we have multiple layers in between the classes.
e.g.,
Calc class inherits the properties of AdvCalc and further AdvCalc inherits the properties of VeryAdvCalc.
Here, Calc - child class
     AdvCalc - parent class of Calc & child class of VeryAdvCalc
     VeryAdvCalc - parent class of both other classes

     #1
Multiple inheritance
If a particular class inheriting multiple class then this type of inheritance is called multiple inheritance.
like c++ language there are multiple inheritance like that :
class A
{ 
... .. ... 
};
class B
{
... .. ...
};
class C: public A,public B
{
... ... ...
}; 

But Java not allowed  we have alternate option for that is implementing multiple interface not we will discussing in upcoming lecture.
#2
why java not support multiple inheritance?
=Because of the Ambiguity problem, Java does not support multiple inheritances directly.

#3
Why it is ambiguous?
suppose we have some class A, B and c
class A
{ 
... .. ... 
show(){

}
};
class B
{
... .. ...
show(){

}
};
class  C extends A,B //assume for some instance java support multiple inheritence
{
... ... ...
show(); 
//here we get ambiguity since if we allowed multiple inheritance and same two property or method belong to class A and Class B 
//then how C class use show() method there is ambiguity of choice...
//that’s why java exclude the concept of multiple inheritance

}; 


What is method Overriding?
It is way to override the parent class method in child class .

class Parent{
int a;
public void show{System.out.println("this is parent");}
}
class Child extends Parents{
    int a=10; //override a 
    public void show(){System.out.println("this is child method");} //method override by child class
}
class Main{
    public static void main(String []args){
        Child c=new Child();
        c.show(); //call the child class override method
           }   
}
 -- method overriding is run time polymorphism
 -- it is use to increase the reusability of code 

#2
for a method to be overridden, the following conditions must be met:

 -- The method in the subclass must have the same signature (name, number and type of parameters) as the method in the superclass.
 
 -- The method in the subclass must have the same return type (or a subtype) as the method in the superclass.

 -- The method in the subclass must have the same access level (public, protected, or private) as the method in the superclass.

 -- The method in the subclass must not be static, while the method in the superclass must be marked as non-final.

 -- The overridden method must be visible from the subclass it means you can change access modifiers but there is condition for 
    -- you need to increase visibility but you cannot reduced it , you can do it using access modifiers.
    -- you can change access modifiers in this manner 
       private -default -protected -public (in upcoming lecture access modifiers has been discussed)

for knowing about access modifiers wait for access modifiers lecture in this playlist
class A{
     void show(){ // -- by default access modifier is default
        System.out.println("A");
    }
    int a=5;
}

class B extends A{
     protected void show(){ //-- access modifier is protected --we can increase visibilty
        System.out.println("B");
     }

}    

 what is package ?

-- you are using music, documents, video and you need to store in a different folder as per their use 
to avoid confusion (Similarly in java for storing class, enum , annotations, sub package  we are using  concept of package).

-- in song folder you have multiple songs folder e.g sad songs, romantic songs, rocking song for that we can create sub
 folders inside folders of songs ,in package also we can create package inside package
  (Syntax java.util  here java is package and util is subpackage).

-- you can structure in which we put similar types of codes in one folder, this concept in java is known as package.

-- for creating a package we can use a keyword called package at a top of code and code file is in that package.
-- suppose we have AdvCalc.java and Calc.java in one folder tools  then then we can say that AdvCalc.java and Calc.java in tools package.

-- if we create database code then you can write it in separate package i.e db package
-- if two java file in different package then you need to import class of one package to different package.

suppose that tools package has two files
a)AdvCal.java b)Calc.java

and db package has two files
a)Demo.java b)Multiply.java

suppose in Demo.java we want to use AdvCal object 
for that we need to import AdvCal class from tools package

package db;  //Demo in db folder so that we need to mention
import tools.AdvCal;  // without importing we can get error in creating object

class Demo{
    public static void main(String []args){
        AdvCal obj =new AdvCal(); 
    }
}

--  there are many package provided by oracle. 
    e.g import java.util.ArrayList -- it means we are importing ArrayList class from java.util package here 
    java is main package and util is sub package inside main package and from this we can import ArrayList class.
    java is package and util is subpackage of java then from util package we can import ArrayLis.t 
   
-- by default we import java.lang.*; in every java file

-- when you create library then you need to create package and package should be unique name.
-- go to mvn repository
-- one way to building library reversing the domain name 
--  for google if i making package then com.google

<br/>

> [Top](#java-cheatsheet)

<br/> 

# 31. Packages , access modifier

#1
What is Access Modifiers ? Types of access Specifiers
-- Access Modifiers are keywords that determine the visibility and access level of a class,
method, or data member. 

-- There are four types of access specifiers in Java: 

    i) public: A public class, method, or data member is visible to all classes. 
    ii) protected: A protected class, method, or data member can be accessed by classes within the same
    package, and any subclasses which extend the class. 
    iii) default: A default class, method, or data member is visible only to classes
    within the same package. 
    iv) private: A private class, method, or data member is only visible to the class it is declared in, 
    and not to any subclasses.

#2

package flder1.folder1;
// import flder1.folder2.B; --The type flder1.folder2.B is not visible because class is not public
import flder1.folder2.C;
public class A {
    
public static  void main(String []args){
// B obj=new B(); -- we was not making class B as public -- so we get error
C obj =new C();  //since, Class C is public so we can use outside the package of folder2
//for class visibility  only public is legal modifiers  has been used and if you not mention anything by default class is default.
   
//  System.out.println(obj.def); -- The field C.def is not visible because we want to access from different package but we have not visibility in current package because access specifier is default
//  System.out.println(obj.prot); not visible because access specifier is protected -- it is only visible in same package or visible in other package if  class is subclass of that class.
//protected visible to inherited class of different package also.

Child ch =new Child();
// ch.a; -- not visible in anywhere. Since a is visible only in same class because it is private.
    }
}

class Child extends C{
    private int a=9;
public void natureProtected(){
    System.out.println(prot); //here we can use protected variable becuase it is visible to inherited class in different package also
}
}
 
/*
step 1:  create a folder  flder1
Step 2:  create two sub folder inside flder1 i) folder1 ii)folder2 
step 3:   create A.java file in folder1
step 4:  create B.java, C.java in folder2

package flder1.folder2;
 class B { 
}
package flder1.folder2;
public class C {
    int def=5;
   protected int prot=6;
    public int pub=7;
    private int pvt=8;
}
 */

Note : Remember visibility decrease  in order
public--protected--default(but this keyword not mentioned like public and private)--private

<br/>

> [Top](#java-cheatsheet)

<br/> 

# 32.  Polymorphism & dynamic method dispatch


-- two types of polymorphism 
-- compile time polymorphism and Run time polymorphism
-- when you compile the file and you will know what things get executed this behaviour is knows as compile time polymorphism.
-- when behaviour decide at run time this is known as run time polymorphism.
-- add(int, int) , add(int, int, int) decided at compile time 
- class A extends B  -- A class  has add(int, int) and B has add(int,int ) out of this two we can decide which can execute at run time then this is called run time polymorphism example.

-- suppose we have some class A , B and C
-- class B and C extends A 
-- in All three class we have show() method 
-- main() method of Demo we create object of A, B and C but we create only reference of A which can hold
object of A, B and C .
class A{
public void show(){
    Systeem.out.println("in show A");
}
}
class B extends A{
public void show(){
    Systeem.out.println("in show B");
}
}

class C extends A{
public void show(){
    Systeem.out.println("in show C");
}
}

public class Demo{
    public static void main(String []args){
        A obj =new A();  
        obj.show();  //Output: in show A

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new B();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

 
    }
}

Note: during compile time we donot which show() method is called from which class.
    -- we can know during run time which show method is called this is known as run time polymorphism.
    -- all this concept is class dynamic method dispatch


<br/>

> [Top](#java-cheatsheet)

<br/> 


# 33. final keyword 

-- final keyword use with variable , methods and class
-- if make a variable final then variable become constant
final int a=5;
//you cannot reassign a value to a
-- final class 
class A{
public void show(){
System.out.println("In Calc show);
}

public void add(int a,int b){
    System.out.println(a+b);
}
}

Suppose someone want to extend your class , but we want to stop inheritance then we need to make final
-- if you make class final then no one can inherite your class
-- but you can use the final class by making object of final class

class A{
    public final void show(){
        System.out.print("IN A");
    }
}

class B extends A{
    // but you inherit class but you cannot override show() method  if your method is final
    //since show method is final
}

-- if you make method as final no one can override your method.


<br/>

> [Top](#java-cheatsheet)

<br/> 

# 34. Object class - equals(), toString() , hashCode()

-- every class in java inherit object class
-- in this lecture we see some member method of object class

  public native int hashCode();
  public boolean equals( Object);
  public  String toString();

1)hashCode() method:
In Java, the hashCode () method is a method that is defined in the Object class, 
which is the parent class of all classes in Java. It returns an integer value that 
represents the unique hash code of an object.

2)equals(Object) method:
equals(Object obj) is the method of Object class. This method is used to compare 
the given objects. It is suggested to override equals(Object obj) method to get our own equality condition on Objects.

3)toString() method:
We typically generally do use the toString() method to get the string representation of an object. It is very important 
and readers should be aware that whenever we try to print the object reference then internally toString() method is invoked. 
If we did not define the toString() method in your class then the Object class toString() method is invoked otherwise our 
implemented or overridden toString() method will be called.

case 1: class which not override object class toString(), hashCode(), equals() method
class Mobile{
    String model;
    int price;
}

class Main{
    public static void main(String []args){
        Mobile mb1=new Mobile();
        mb1.model="Apple";
        mb1.price=100000;

        Mobile mb2=new Mobile();
        mb2.model="Apple";
        mb2.price=100000;

   
        System.out.println(mb1); //Internally mb1.toString() is called and print Mobile@4617c264
        System.out.println(mb2); // Internally mb2.toString() is called and print Mobile@36baf30c
 

        //use of equals() method to compare to object
        boolean result =mb1.equals(mb2); //right now it give false result because by default implementation of equals() method compare reference of two objects
        System.out.println(result); //false 

        //use of hashCode()
       System.out.println(mb1.hashCode()); //1175962212
       System.out.println(mb2.hashCode());  //918221580 , provide some unique value 
    }
}

case 2: class can override object class hashCode(), toString(), equals()
class Mobile{
    String model;
    int price;

    @Override
    public String toString(){
        return "Model: "+model+" and price: "+price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mobile other = (Mobile) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
 
}

class Main{
    public static void main(String []args){
        Mobile mb1=new Mobile();
        mb1.model="Apple";
        mb1.price=100000;

        Mobile mb2=new Mobile();
        mb2.model="Apple";
        mb2.price=100000;

        //use of toString() method,  overrides method 
        System.out.println(mb1); //Internally mb1.toString() is called and print Model: Apple and price: 100000
        System.out.println(mb2); // Internally mb2.toString() is called and print Model: Apple and price: 100000
 
        //use of equals() method to compare two object, overrides method
        boolean result =mb1.equals(mb2); //right now it give true result because we override equals() method
        System.out.println(result); //true

        //use of hashCode()
       System.out.println(mb1.hashCode()); //1967873639 due to overrides hashcode method
       System.out.println(mb2.hashCode());  //1967873639  

       System.out.println(mb1==mb2); 
    }
}

Note: it is not mandatory to override every member method of object class but it is advice able 
to override toString() and equals() method to compare and print own object.

<br/>

> [top](#java-cheatsheet)

<br/>


# 35. Upcasting & Downcasting

typecasting is way to converting one primitive data type into other data type using implicit or explicit type
conversion.
double d=4.5;
int i=(int)d; //explicit typecasting 

int i1=5;
double d1=i1; //implicit type conversion

When we are talking about non -primitive data type we have concept of upcasting and downcasting
condition for upcasting and downcasting:
-- for that two class should have some parents child  relationship 
-- if non-primitive data type have no any relationship so, upcasting and downcasting is not possible.

class A{
    public void show1(){
        System.out.println("In show A)
    }
}

class B extends A{
    public void show2(){
        System.out.println("In show B");
    }
}

class Demo{
    public static void main(String []args){
        A obj =(A) new B(); //upcasting 
        obj.show1();
       
    A obj1 =new B(); // upcasting 
   // obj1.show2(); // you get error and you are not able to call show2() because with parennts reference specialised method of child is not visible
    here we downcastig to use show2() method
    ((B)obj).show2(); //downcasting
    }
}

Note:
the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects. 
So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.


<br/>

> [top](#java-cheatsheet)

<br/>


# 36. Wrapper class , autoboxing, unboxing


In this lecture we are discussing about wrapper class:
if you want to store integer value you store in int
java provide primitive data type 
thats why java is 99.9 % object oriented programming
primitive data types helps us to improve the performance 
but certain feature are work only when we work with objects
for collection framework -- we need non primitive type data as input 

byte -Byte
int - Integer 
long -Long
char- Character
double -Double
float -Float 
boolean -Boolean

Boxing:It is manual method to convert primitive type data into non-primitive type .
e.g 
int num=7;
Integer num1=new Integer(8); //boxing

UnBoxing: It is manual method to convert non-primitive data type to primitive type.
e.g
int num2=num1.intValue(); //unboxing

AutoBoxing:It is automatic conversion of primitive type data into non-primitive data type.
int num3=5;
Integer num4=num3; //autoboxing

AutoUnBoxing:It is automatic conversion of non primitive type data into primitive data type.
int num5=num4; //autounboxing

int num=7;
how to store data as Object
Integer num1=new Integer(8); //this syntax is depreciated 
Integer num1=Integer.valueOf(8); //Now we use this syntax
Integer num1=8; //autoboxing 
int num2=num1.intValue();//unboxing 
int num3=num1; //autounboxing 

--convert string into int type using parseInt
String str="12";
int num4=Integer.parseInt(str); 

--Convert number into String 
String str1=Integer.toString(23); //convert number into string


<br/>

> [top](#java-cheatsheet)

<br/>


# 37. abstract class and methods

#1
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

#2
Abstract method:-
- Instead of defining the method, we can declare the method.
- If we put a semicolon at the end of a method, it means that you only declare the method like:
 public void drive();
- This method does not contain any features and you will not be able to create an object of it.
- You need to add an abstract keyword to only declare a method.

#3
Abstract class:-
- Abstract methods can only be defined in an abstract class.
- We need to add an abstract keyword before a class to make it an abstract class.
- Objects of an abstract class can not be created.
- If you are extending an abstract class, then it is compulsory to define all abstract methods.
- It is not necessary that an abstract class should have an abstract method.
- Abstract class can have an abstract or a normal method or both.
- An abstract class can have more than one abstract method.

#4
Concrete class: A class other than an abstract class is known as a concrete class.
- An object of a concrete class can be created.


<br/>

> [top](#java-cheatsheet)

<br/>


# 38. Inner class & anonymous inner class

#1
Inner Class:-
- We can also create a class inside another class.
 class A
 { 
  class B
  {
  }
 }
- You can call the method of class B by using the dot operator in between both classes A and B.
 A.B obj= new B();
-  A dollar sign will be introduced in a class name that has an inner class indicating two different classes.
 A$B. class
- You also need to create an object of the outer class, to call the methods of an inner class.

#2
Static Inner Class:-
- An inner class can also be declared as static.
- When an inner class is declared as static, then you do not need to create an object for it.
- But an outer class can not be made static.

#3
Advantage of inner class:-
- Nested classes represent a particular type of relationship that is it can access all the members of the outer class, including private.
- Nested classes make the code more readable and maintainable.
- It makes the code more optimize.

- Anonymous means something that does not have a name.
- In overriding, to provide a new implementation of a method, we need to create a new class and extend it with the parent class. After extending the class, we override the method.
- We can avoid the overriding and do not need to create a new class for this particular task.
- We can use the inner class concept to give a new implementation of a method.

#2
- We can create a new anonymous inner class after creating an object of a class that contains the method.
- We do not need to use a class keyword with an anonymous inner class.
- It just starts with braces and contains the method and its new implementation.
- Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.
e.g., A obj=new A()
  {
   public void show()
   {
    new statement;
   }
  };

#3
- Anonymous class used in the interface, functional interface, lambda expressions.
- Anonymous inner class can implement only one interface at s time.
- It can either extend a class or implement an interface at a time.
- We do not write a constructor for an anonymous inner class because it does not have any class name.
- An anonymous class has access to the members of its enclosing class.

<br/>

> [top](#java-cheatsheet)

<br/>


# 39. Anonymous and abstract inner class

When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
- You can also provide the implementation for multiple methods in an anonymous inner class.
- Anonymous inner class can implement only one interface at s time.
- Anonymous inner class can either extend a class or implement an interface at a time.
- We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.
e.g.,
abstract class A
{
 public abstract void show();
}

In main methid:
A obj=new A()
{
 public void shoe()
 {
  statement;
 }
};

<br/>

> [top](#java-cheatsheet)

<br/>

# 40. interface

Interface:-
In an abstract class, we can have both abstract methods as well as normal or concrete methods.
- If your class has only abstract methods then instead of using class, you can simply use an interface in place of it.
- Interface is not any class.
- Every method in an interface is public and abstract by default.
- Even if you do not use two keywords (public and abstract) with methods then also it will not give an error in an interface. By default, it will consider all methods as public and abstract.
- We cannot instantiate an interface.
- Interface only shows the design and it does not provide any implementation.
- To provide an implementation of methods, you need to create a class and instantiate it also.
e.g,
 interface A
 {
  methods()----
 }

#2
implements keyword:-
To implement an interface, we use the keyword - implements.
- If you use the implements keyword with class, then it is compulsory to give an implementation of all the methods that are defined in an interface.
- If you do not give an implementation of all methods then it will make your class an abstract class by default.
- So, to make a concrete class, you have to give the implementation of all methods present in an interface.
e.g., 
 class B implements A
 {
  methods() {
   statement;
  }
  ------
 }

#3
Variables in an interface:-
- We can call the methods of an interface by creating an object of the class that implements an interface.
- We can also declare variables in an interface.
- All the variables in an interface are final and static by default.
- So, we first have to initialize the variables in an interface.
- As a variable is static in an interface, then you do not need to create an object for it. You can directly call the variable by using the interface name.
e.g., A.area;    (here, area is a variable initialized in an interface)
- As the variable is final, you can not change the value of that variable after initializing it once.

-Interface does not have its own memory in the heap.

<br/>

> [top](#java-cheatsheet)

<br/>

# 41. enum if else and switch

- We can compare the status or values of an enum by using the if- else condition.
- Switch supports string, integer etc, and it also support enum.
- In switch() you need to pass an object reference variable as a parameter.
e.g., 
enum Status{
 Running, Failed, Pending, Success;
}
if(s==Status.Running)
      System.out.println("All Good");
     else if(s==Status.Failed)
      System.out.println("Try Again");
     else if ( s==Status.Pending)
      System.out.println("Please Wait");
     else
      System.out.println("Done");
     

-  In switch case, we do not have to pass the object refernce variable again and again. We have to only pass the constant itself.
e.g., 
Status s=Status.Pending;     
     switch(s)
     {
      case Running:
       System.out.println("All Good");
       break;
       
      case Failed:
       System.out.println("Try Again");
       break;
       
      case Pending:
       System.out.println("Please Wait");
       break;
      
      default:
       System.out.println("Done");
       break;
     }

     #1
- We can not extend the enum with any other class.
- We can define constructors and methods in an enum. Creation of our constructors and variables is also possible in an enum.
- We can also define our data types through enum that are known as Enumerated Data Types.
- In Java, enum extends the enum class and we get all other methods present inside an enum through the enum class only.
- If we print the superclass of an enum class, then it will also return an enum.
 Status s= Status.Success;
 System.out.println(s.getClass().getSuperclass());
- In an enum, every enum constant represents an object of type enum.

#2 
Enum and Constructor:
- enum contains a constructor and it is executed separately for each enum constant at the time of enum class loading.
- We can create a constructor in an enum that can take any parameter, and that value of a parameter might be different in every object of an enum.
- Instance variables in an enum are private and we can access them in another class by using getters and setters.
- We can print the value of all objects of an enum through a loop and .values() method is used to iterating over all objects.
- If any parameterized constructor is present inside an enum, then the default constructor will not be considered.
- We create private variables and private constructors in an enum because we use them or create an object for constructors in the same class only.
- The constructor in an enum will be called the number of times as much the number of objects created.

<br/>

> [top](#java-cheatsheet)

<br/>
# 42. Anotations , Functional interface and lambda expression with return type

What is Annotations?
-- annotation is type of comment which is used to provide meta data to the compiler and JVM about the program.

Basic difference between comment and annotations
-- annotation is used to provide meta data to the compiler and JVM about the program but comment is used to provide information to the programmer.

2)
What does annotations provide to program and what does for program?
-- Annotations are used to provide supplemental information about a program. 
-- Annotations start with ‘@’.
-- Annotations do not change the action of a compiled program.
-- Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
-- Annotations are not pure comments as they can change the way a program is treated by the compiler. See below code for example.

3)
How annotation prevent us from logical error?
class A{
        public void show(){
            System.out.println("In A");
        }

        public void display(){
            System.out.println("In A");
        }
  }

  class B extends A{
        @Override
        public void show(){
            System.out.println("In B");
        }
      /*   @Override
        public void displayData(){
            System.out.println("In B");
        }
  */

    //here you get error because you are not overriding the method of parent class but you are using @Override annotation 
   // if you are thinking I can override display() method but you should defined new method but whenever you mention @override compiler throw error that you are not override the parent class method 
    //it helps to avoid the logical error in the program because logical error is more difficult to find when you use annotation it helps to find the logical error
    //because solving problem at compile time error  is easy than solving problem at runtime 

 
  }



  In this lecture, we are discussing functional interface:
#1 what is functional Interface?
 --functional interface is an interface with only one abstract method 
 
#2
The properties of a functional interface in Java are as follows:

Single Abstract Method: A functional interface has only one abstract method. 
This method is the signature of the interface and defines the behaviour that will be implemented in the lambda expression or with simple class.

Functional Method: The abstract method of a functional interface is called the functional method. 
It is the method that provides the functional behaviour of the interface.

@FunctionalInterface Annotation: A functional interface is annotated with the @FunctionalInterface annotation.
This annotation is optional, but it provides a compile-time check that the interface has only one abstract method.

Compatible with Lambda Expressions: A functional interface is compatible with lambda expressions. 
A lambda expression is a concise way of implementing the functional method of a functional interface.
(This will discuss in next lecture of lambda expression).

Functional interfaces are a key component of functional programming in Java, 
and they are used extensively in the Java 8 Streams API and other Java libraries.


#3 Example
class Main{
    public static void  main(String []args){
A obj = new B();
obj.show();

//another way to implement functional interface
A obj1 = new A(){
    @Override
    public void show(){
        System.out.println("Hello");
 }
    };
obj1.show();

}
}

//one way to implement functional interface
class B implements A{
    @Override
    public void show(){
        System.out.println("Hello");
    }
}

//specify it is functional interface
@FunctionalInterface //we use this annotation to specify it is functional interface
interface A{
    void show();
    //void run(); //this will give error as it is a functional interface you cannot write two abstract method in this
}


#1 what is lambda expression in java?
-- In Java, a lambda expression is a concise way to implement a functional interface. 
   A functional interface is an interface that has only one abstract method, and it can be implemented using a lambda expression.
-- In the previous lecture we see that we are making a class or inner class to implement the functional interface 
   but using lambda expression we do not need of new class and inner class to implement.

#2 Properties of the lambda expression
Concise syntax: Lambda expressions provide a concise and expressive syntax for defining functional interfaces. 
They allow you to define the behaviour of a functional interface in a single line of code.

Functional programming: Lambda expressions are a key component of functional programming in Java. 
They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.

No need for anonymous inner classes: Lambda expressions provide an alternative to anonymous inner classes, which are often 
used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner classes.

#3 example:

class Main{
    public static void  main(String []args){
A obj = new B();
obj.show();

//another way to implement functional interface
A obj1 = new A(){
    @Override
    public void show(){
        System.out.println("Hello");
    }
};
obj1.show();

//now we can use a lambda expression to implement the functional interface
//you can remove new A() and public void show() and replace it with () -grater then System.out.println("Hello"); 
//if you have single statements you need not mention curly braces and return keyword

A obj2 = () - grater then System.out.println("Hello");
obj2.show();

//here you can use lambda expression to implement interface C
C obj3= i-grater then System.out.println(i);
obj3.show(5);
 
}
}
//one way to implement functional interface
class B implements A{
    @Override
    public void show(){
        System.out.println("Hello");
    }
}

//specify it is functional interface
@FunctionalInterface //we use this annotation to specify it is functional interface
interface A{
    void show();
    //void run(); //this will give error as it is not functional interface
} 

interface C{
  public void show(int i);
}


#1
 -- if we have a functional interface 
  interface A{
   int add(int i, int j);
  }
in this case, we return int type from add a method for that we can write a lambda expression 
in different ways.
-- if we have a single statement you do not need of curly braces
A obj1 =(i,j)- return i+j;

-- if we want to return something in a single statement, no need to mention the return keyword
A obj2 =(i,j)-i+j;

#2 
Example:
 class Main{
    public static void main(String[] args){
        // Anonymous class with lambda expression 
        //if you have single statement and want to return something then you need not to write return keyword and curly braces
       A obj= (i,j)- i+j;
         System.out.println(obj.add(5,6));
//lambada expression works with functional interface
    }
 }

 interface A{
    public int add(int i,int j);
 }


<br/>

> [top](#java-cheatsheet)

<br/>
 # 43.  Exceptions , try catch blocks

 In this lecture we are discussing about Exception:
-- In java three types of errors that can occur during the execution of a program
   i) compile time error
   ii)logical error
   iii) run time error -- this can be called as Exception
i)
Compile-time errors:
Compile-time errors are errors that occur during the compilation of the Java code. 
These errors are caused by syntax errors, missing semicolons, or incorrect variable names, 
among other things. If there are compile-time errors in your Java program, it cannot be compiled into bytecode, 
and it cannot be executed.

ii)
Logical errors:
Logical errors are errors that occur when the program runs correctly, but it does not produce the expected output. 
These errors occur because of a mistake in the program's logic. For example, if a program is supposed to add two numbers 
but instead multiplies them, it will produce the wrong output. Logical errors are more difficult to detect than compile-time 
errors because the program runs without any error messages.

Exceptions(Runtime error)
Exceptions are errors that occur during the execution of the Java program. 
Exceptions occur when something unexpected happens, such as trying to read from a file that does not exist or dividing by zero. 
When an exception occurs, the program will terminate unless the exception is handled by an exception handler.

In Exception we have Checked and Unchecked Exception this topic is discussed in Exception hierarachy:
a)
Checked Exception:
Checked exceptions are exceptions that the Java compiler requires you to handle or declare. 
These exceptions are checked at compile time, and you must either handle the exception with a try-catch block or declare it with a throws clause. 
If you do not handle or declare a checked exception, the code will not compile. Checked exceptions are typically related to input/output operations, 
such as file handling or network communication.

b)
Unchecked Exception:
unchecked exceptions are exceptions that are not checked at compile time. These exceptions are typically caused by programming errors, 
such as null pointer exceptions, array index out of bounds exceptions, and class cast exceptions. Unchecked exceptions are not required 
to be handled or declared, but they can still occur during runtime.

Important:
both checked and unchecked exceptions can occur during runtime, but checked exceptions are checked at compile time and require handling 
or declaring, while unchecked exceptions are not checked at compile time and do not require handling or declaring.
  
  In this lecture we are discussing how to handle exception using try-catch:
-- Exception handling is a mechanism in Java that allows developers to handle 
and recover from errors and exceptional conditions that may occur during the execution of a program. 
-- One way to handle exceptions in Java is by using the try-catch block.

General Syntax of try -catch to handle exception:
try {
    // code that may throw an exception
} catch (ExceptionType1 e1) {
    // code to handle the exception of type ExceptionType1
} catch (ExceptionType2 e2) {
    // code to handle the exception of type ExceptionType2
} finally {
    // optional block of code that is executed regardless of whether an exception was thrown or not
}

we will discussing about everything try, catch ,finally and ExceptionType one by one
-- in this lecture we are only deal with single catch statement with try


//  try to handle the exception 
class Main{
      public static void main(String[] args) {
         int i=4; //normal statement
         try{
               int a = 10/0; //critical statement
               /*Not handling excpetion then
               if you not handle the exception then it will be thrown to the JVM
               and JVM will terminate the program abnormally
               and it will not execute the remaining statements
               */
            
                 /*
                 if you handle the exception then it will not be thrown to the JVM
                 and JVM will not terminate the program abnormally
                 and it will execute the remaining statements
                 */

         }catch(Exception e){
               System.out.println("Some exception occured");
         }
         System.out.println("We are coming out of the try catch block successfully");


      }
   
}
-- In the above code, the try block contains the code that may throw an exception. 
The catch block catches the exception of a specific type and handles it. 


-- statemtns of two types
 i)normal statements
 Normal Statements:
Normal statements are statements that do not require any special handling, and they are executed in a normal sequence.  
e.g Variable declarations and assignments: These statements are used to declare and assign values to variables.

 ii)critical statements
Critical statements are statements that can cause an exception or error, and they require special handling.  
Handle using :
throw statements: These statements are used to throw an exception.
try-catch statements: These statements are used to handle exceptions.
finally statements: These statements are used to specify a block of code that is always executed, whether an exception is thrown or not.

In this lecture we are discussing about try with multiple catch:
 --In Java, the try-catch block is used to handle exceptions. It allows you to write code that handles exceptions that may be thrown during the execution of your program. 
 we can also handle different types of exceptions with multiple catch blocks.

 -- suppose we write few lines of code and we donot know which line can generate exception but 
 we know donot which types of exception can be generated. In this case we can use try with multiple catch 
 e.g

 int num=4;
 int arr[]={3,4,5};
 try{
   int result=40/num; //we donot know what does user pass the value of num then we put inside try 
   System.out.println(arr[result]); //we donot know what the value of result but we know index of array allowed is 0 to 2 therefore we put this statement also in try 
 }
 catch(ArithmeticException ae){
   System.out.println(ae);
 }

 catch(ArrayIndexOutOfBoundsException aio){
   System.out.println(aio);
 }

#
Handling parents and child Exception both
-- when catching both child and parent exceptions in a try-catch block, it is generally recommended to catch the child 
   exceptions before the parent exception.

-- The reason for this is that if you catch the parent exception before the child exception, the catch block for the parent exception will also catch any child exceptions that are subclasses of the parent exception. 
This can make it more difficult to handle the child exceptions separately.

e.g 
int a = 10;
int arr[]={3,4,5};
try{
   int b = 3/a;
   System.out.println(arr[b]);
}
catch(Exception e){
   System.out.print("parent class of every exception");
}
catch(ArithmeticException e){
 }

-- this will give compile time error i.e error: exception ArithmeticException has already been caught by Exception class

Right way:
first child Exception then parents Exception  
int a = 10;
int arr[]={3,4,5};
try{
   int b = 3/a;
   System.out.println(arr[b]);
}
catch(ArithmeticException e){
 }
catch(Exception e){
   System.out.print("parent class of every exception");
}


In this lecture we are discussing about hierarachy of exception:
-- In Java, exceptions are objects that represent exceptional situations that can occur during program execution. 
The Java language provides a hierarchy of exception classes that are used to represent different types of errors and exceptional situations.

#Important points
-- Every class extends Object class so, Throwable class by default extends Object
-- The top-level class in the Java exception hierarchy is the Throwable class. All exception classes in Java are subclasses of the Throwable class.
-- The Throwable class has two subclasses: Error and Exception. 
-- The Error class represents serious errors that cannot be handled by the program, such as OutOfMemoryError or StackOverflowError.
-- The Exception class represents exceptions that can be caught and handled by the program.
-- The Exception class has many subclasses that represent specific types of exceptions. Some common subclasses of Exception include RuntimeException, IOException, SQLException, and NullPointerException.
-- Exception classes in Java can be either checked or unchecked.

Checked Exception:
Checked exceptions are those that are checked at compile-time, meaning the compiler ensures that the programmer handles the exception by either catching or declaring it in the method signature using the throws keyword. 
Examples of checked exceptions include IOException, SQLException, and ClassNotFoundException.

UnChecked Exception:
unchecked exceptions are not checked at compile-time, and the compiler does not force the programmer to handle them. Examples of unchecked exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and
ArithmeticException.

hierrachry of exception
      Object class
            |
        Throwable
---------       ---------
|                       |
Error               Exception 
             -----------    ----------------------------------------------
            |                                   |                        |
        RuntimeEception(uncheked)          SQLException(checked)       IOException(checked)
            ArithmeticException
            NullPointerException
            ArrayIndexOutOfBoundsException 

<br/>

> [top](#java-cheatsheet)

<br/>


# 44.  throw


#1 
-- throw keyword in Java is used to explicitly throw an exception. 
When an exception is thrown using the throw keyword, the execution of the current method is stopped.

syntax-
throw new NullPointerException("Object is null");

e.g
public void divide(int a, int b) {
  if (b == 0) {
    throw new ArithmeticException("Cannot divide by zero");
  }
  int result = a / b;
  System.out.println(result);
}

#2
-- throw keyword is used to throw exceptions, not to catch them. To catch exceptions, you need to use a try-catch block.
-- if you do not use try-catch then the control is passed, where the method is called.
-- when you want to pass message to an exception 
then you should use the parametrized constructor instead non parameterized constructor 
e.g
class Main{
   public static void main(String []args){
      int a=0;
      try{
         if(a==0)
throw new ArithmeticException("a should not be zero"); // throw new ArithmeticException() is non parametrized constructor
      }
      catch(ArithmeticException e){
         System.out.println("Exception caught: "+e);
      }
    
   }
}

Output: Exception caught: java.lang.ArithmeticException: a should not be zero


class Main{
   public static void main(String[] args){
      int j=30;
      int i=1;
     try{
      j=18/i;
      //handle the exception using throw
      if(j==0)
         throw new ArithmeticException("i donot want to print 0"); //try to create an exception 
     }
     catch(ArithmeticException e){//here catch is catching the exception
        System.out.println("ArithmeticException caught");
        System.out.println(e.getMessage()); //getMessage() method use to get the message
     }
       catch(Exception e){
          System.out.println("Exception caught");
       }
     
   }
}

#1
How to create custom exception in java?

class MyException extends Exception{
   // this class is own exception class defined by according to our need
}

-- MyException is a custom exception class that extends the Exception class.

#2
Now we want to pass some message 
-- we need a constructor that takes a String message, which is passed to the parent constructor using the super keyword.
e.g -
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

Note: we can add additional properties and methods to your custom exception class as needed, just like you would with any other Java class.

#3
As per need we can throw custom Exception
e.g
public class Main{
   public static void main(String []args){
      try{
         throw new NavinException("This is my exception");
      }catch(NavinException e){
         System.out.println(e.getMessage());
      }
   }
 }

 class NavinException extends Exception{
   public NavinException(String s) {
      super(s);
   }
}

Important Notes:
-- we can create a custom exception by extending the Throwable class in Java 
-- we can create a custom exception by extending the Exception class in Java
-- we can create a custom exception by extending  the Exception class or one of its subclasses, such as RuntimeException.

Recommended:
-- Generally recommended to create custom exceptions by extending the Exception class or one of its subclasses, such as RuntimeException. 
This makes it easier to handle your exception in a specific way and ensures that it behaves like other exceptions in the Java platform.

-- it is not recommended create custom exception using Throwable, the Throwable class is typically used to create other types of exceptions, 
such as errors and checked exceptions, rather than custom exceptions.


<br/>

> [top](#java-cheatsheet)

<br/>

# 45. throws


#1 
-- throws is not plural of throw 
-- throws keyword is used in method signatures to indicate that the method may throw certain types of exceptions.
but does not handle them directly
-- the caller of the method is responsible for catching and handling the exception.

#2
Best case to use the throws keyword instead of handling with try and catch:
-- throws keyword can be an appropriate way to handle exceptions in certain cases, such as when a method is part of a larger 
program and the exception handling is being handled at a higher level. It can also be useful when creating reusable code that may 
be used in a variety of contexts, where it's not clear how the exceptions should be handled.

e.g 
suppose you have three methods c , b and a and both have same Arithmetic Exception and b and a method call from c method.
in this case you can duck the exceptions and handle in the c methods.

void c(){
try{
a();
b();
}
catch(ArithmeticException e){
}
}

void a() throws ArithmeticException{}
void b() throws ArithmeticException{}

-- ducking exception most recommended for checked exception than unchecked exception
-- throws keyword in Java is typically used to declare that a method may throw one or more 
checked exceptions. Checked exceptions are exceptions that must be either caught or declared in the method 
signature using the throws keyword. Examples of checked exceptions in Java include IOException, SQLException, 
and ClassNotFoundException.


Syntax to throws one or more Exception:

public void myMethod() throws IOException, SQLException {
  // Method code that may throw either an IOException or a SQLException
}

 
 Important: it's best to handle exceptions at the lowest possible level of the code where 

suppose we have main() method inside main method we call c() method and inside c method we call a() method and in 
a() method exception originate and we cannot handle with try and catch then propagate to c() method and if not handled propagate to 
main method and if not handled in main method then the default exception handler handles the exception and abnormally terminate the program.


#3 
In java how exceptions propagate
In Java, when an exception is thrown but not handled by the current method, the exception is propagated up 
the call stack until it is either caught and handled by a try-catch block, or it reaches the top level of 
the program and the program terminates.

The order of transferring unhandled exceptions in Java is as follows:

The current method throws an exception.
i)If there is a try-catch block within the current method that can handle the exception, 
the exception is caught and handled within that block. Control then passes to the code 
following the catch block.

ii)If there is no try-catch block within the current method that can handle the exception, 
the exception is propagated up to the calling method.

iii)Steps 2 and 3 repeat until either the exception is caught and handled by a try-catch block, 
or it reaches the top level of the program.

iv)If the exception reaches the top level of the program without being caught and handled,

v)in this case 
If an exception is not handled by any method in the call stack, and there is no catch block that can handle the exception, 
then the default exception handler in Java is called to handle the exception.

-- default exception handler in Java is part of the JVM (Java Virtual Machine) and is responsible for printing the exception 
information to the console or to a log file, and terminating the program.

-- the default exception handler is called, it prints a stack trace that shows the sequence of method calls that led up to the exception, 
as well as any other relevant information about the exception

<br/>

> [top](#java-cheatsheet)

<br/>

#  46.  BufferedReader and Scanner , try with resources


How to take input in java?
#1
using System.in.read()
-- using System.in.read() we can take single character input only, if we provide multiplecharacterr
 itconsidersr the firstcharacterr of enter sequence.

-- if we want to show result of multiple character we can use loop (not in video lecture forcuriosityy)
e.g 
 class Main{
public static void main(String[] args) throws Exception{
   int i =System.in.read(); // read a byte from the keyboard
   System.out.println(i); // print the byte value
   /*
    input: a
      output: 97
   input: A
      output: 65
   input: 345 /considere 3 digit from number
      output: 51
   input: 3456 //consider 3 digit from number
      output: 51
   input: 3
      output: 51

return ascii value of the input
    */
   // to get actual number 
   // 1. convert ascii value to char
System.out.println((char)i); // print the char value

  // 2. subtract 48 from the ascii value
System.out.println(i-48); // print the actual number 
//but it is only for single digit number 

// formultiple-digittnumbersr we have to use loop
// 3. use loop
int n=0;
while(i!=13){ // 13 is ascii value of enter key
   n=n*10+(i-48);
   i=System.in.read();
}
System.out.println(n);

   }
 }
using InputStreamReader class:
In Java, the InputStreamReader class is used to read data from an input stream and convert it into characters. 
It is often used with the BufferedReader class, which provides a buffered way to read characters from an input stream.
e.g 
class Main{
public static void main(String[] args) {
        BufferedReader br = null;
        try {
            // create a new InputStreamReader to read from System.in
            InputStreamReader isr = new InputStreamReader(System.in);
            // create a new BufferedReader to read from the InputStreamReader
            br = new BufferedReader(isr);

            System.out.println("Enter your name:");
            // read a line of text from the BufferedReader
            String name = br.readLine();

            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        finally{
            if(br!=null){
              try{
            br.close();
         }
         catch(IOException e){
            System.out.println("There might some problem to closing the resource");
         }
            }
        }
    }
}
Note: if open the resource then close is important 

Use of Scanner Class : 
To make programmer life easy 
Scanner class was introduced in Java 1.5 as part of the Java API  to provide an easy way 
to read user input from various sources such as the keyboard.

a) Reading input through keyboard:
-- import java.util.Scanner;  need to import in java file 

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");

-- Scanner object using the System.in input stream, which represents the keyboard. 
We then use the nextLine() method to read a line of text entered by the user.

Important: From here this part is not in video, for your cursoity we are put only in this description.

b) read through file 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

File file = new File("input.txt");
try {
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
}
we create a Scanner object using a File object that represents the input file. 
We then use the hasNextLine() and nextLine() methods to read each line of text from the file.

c) Read input though String
import java.util.Scanner;

String input = "156 2 3 4 5";
Scanner scanner = new Scanner(input);
while (scanner.hasNextInt()) {
    int number = scanner.nextInt();
    System.out.println(number);
}
-- Scanner object using a String object that contains the input. We then use the hasNextInt() and nextInt() methods to read each integer from the string.


In this lecture we are discussing about try with resources:
-- first question in mind is what is try with resources
-- answer to close the resource 
-- ok, second question - can we close resources without try with resource 
-- then, we come to use try with resources 

#1 use of try with finally without catch (it is possible to use try with finally without catch)
-- try statement can be used along with the finally clause to ensure that a resource is properly closed or released, 
regardless of whether an exception is thrown or not.

BufferedReader br = null;
           try {
               // create a new InputStreamReader to read from System.in
               InputStreamReader isr = new InputStreamReader(System.in);
               // create a new BufferedReader to read from the InputStreamReader
               br = new BufferedReader(isr);
   
               System.out.println("Enter your name:");
               // read a line of text from the BufferedReader
               String name = br.readLine();
   
               System.out.println("Hello, " + name + "!");
           }  
        finally{  
            if(br!=null)
             br.close();   //finally used to close the resources  regardless Excpetion occur or not  
}

Note : finally always execute either exception occured or not  so that it is  used to close the resources.

#2
try with resource 
try-with-resources statement, we can simplify this code and avoid the need for a finally block:

e.g
BufferedReader br = null;
           try(br = new BufferedReader(new InputStreamReader(System.in))) {
               System.out.println("Enter your name:");
               // read a line of text from the BufferedReader
               String name = br.readLine();
   
               System.out.println("Hello, " + name + "!");
           }  
    catch(IOException e){
        // write code that you need
    }
        
}

Important: this portion are not in the video, it is for those who are curious to learn more about exception handling
#3 try with with multiple resource 
-- In Java, you can use the try-with-resources statement to close multiple resources automatically. 
   The try-with-resources statement is a feature introduced in Java 7 that allows you to declare resources 
   within a try block and ensure that they are closed automatically when the block is exited, whether normally 
   or due to an exception.

e.g
try (Resource1 res1 = new Resource1();
     Resource2 res2 = new Resource2()) {
    // code that uses the resources
} catch (Exception e) {
    // exception handling code
}

-- Resource1 and Resource2 are classes that implement the AutoCloseable interface, 
which allows them to be used in the try-with-resources statement. 

-- The code within the try block uses these resources, and they are automatically closed when the block is exited, 
either normally or due to an exception. If an exception is thrown, the catch block can handle it as necessary.

-- Resource1 and Resource2 are declared and instantiated within the try-with-resources statement. If the resources are 
already instantiated before the try block, we can simply pass them as arguments to the statement.

-- the resources are closed automatically when the try block is exited, 
and there's no need to explicitly call their close() methods.

In multiple statement inside try, order of closing resources:
-- Resources declared within a try-with-resources statement are closed in 
the reverse order of their declaration, from right to left. 


-- Resource1 is declared first, followed by Resource2, and then Resource3. 
When the try block is exited, the resources will be closed in the following order:

Resource3
Resource2
Resource1

-- order is reversed from the order of declaration, with the resource declared last (Resource3) being closed first, 
and the resource declared first (Resource1) being closed last.

Important: 
It's important to note that the order of resource declaration matters when using try-with-resources, 
especially if the resources are dependent on each other. For example, if Resource2 depends on Resource1 and 
Resource3 depends on both Resource1 and Resource2, then they should be declared in the correct order to avoid any 
potential issues during closing.


<br/>

> [top](#java-cheatsheet)

<br/>


# 47. Thread class
    #1
- When you run an application, the software that you have written will be running on an OS( Operating System).
- Below the OS, a layer is present that is known as Hardware.
- Software will always run on hardware.
- Hardware consists of:
 RAM - acts as a temporary memory for processing
 CPU - that executes something (processing done here)
- OS supports multiple software working at the same time and it means it supports Multitasking.
- Multitasking:
Multitasking is the ability of the CPU to perform multiple tasks simultaneously. There will be continuous context switching of the CPU between the tasks.
- CPU has a concept of time sharing which means each process runs for some short period of time one by one. The software runs parallelly by sharing the time in the CPU. 

#2
- We can also divide our tasks into small units.
- In the same task or a program, we can have multiple threads running at the same time.
- Thread is light-weight and it is the smallest unit of a task. 
- Multithreading:-
Multithreading is a system in which many threads are created from a process through which the computer power is increased. 

#1
When you build an application, we use certain frameworks and behind the scene, these frameworks will create threads.
- Every statement runs in a sequence in the main method.
- If you want to execute two behaviours to execute at the same time, then we can use threads.
- We can not execute normal objects in multiple threads or normal objects can not be executed simultaneously.

#2
- Java provides a Thread class to achieve thread programming. The thread class provides constructors and methods to create and perform operations on a thread.
- A thread can be created by extending the thread class. The thread class can be extended through the Thread keyword.
- By using the Thread keyword with class, it will not create a new thread.

#3
- We have to use the start() method in the main to start the execution of a new thread.
 - start() is a method that is present inside the thread class. start() method only calls the run method.
- Start() invokes the run() method on the Thread object.
- run method should be present inside every thread to start a new thread.
- run() method is used to do an action for a thread.

#4
- All threads cannot run at the same time, so threads go for the time sharing.
-In this time-sharing Operating system, many processes are allocated with computer resources in respective time slots. 
- Scheduler is responsible to allow which thread to execute at what time.

#1
- We cannot control the schedular, we can only give suggestions to it to give priority.
- getPriority() is a method that gives the current priority of a thread.
- The range of priority goes from 1 to 10. One is the least priority whereas ten is the maximum priority.
- 5 is the default priority or normal priority. By default, every thread has a normal priority which is 5.
- We can also change the priority by using the setPriority().
- Different schedulers have different algorithms to work upon so by giving priority, we can only give suggestions to it. 
- It might be possible that the scheduler gives the highest priority to the process that will execute in less time at the running phase.

#2
- We can also make a thread to wait for some time and then execute the statement further.
- Thread will wait by using the sleep() method.
- In the sleep() method, we have the pass value for how much time we want a thread to wait. The time will be in milliseconds.
- Sleep() method will throw an interrupted exception. So, we can handle an exception by using the try-catch block.
- When we use sleep(), then the thread goes into the waiting state.

- As a programmer, we can not control a thread, we can only optimise it.


<br/>

> [top](#java-cheatsheet)

<br/>



# 48. Runnable interface

#1
Multiple Inheritance is not supported by Java. So, extending a thread is not a good practice to follow.
- Thread is a class that implements Runnable and Runnable contains a method known as the run() method.
- Instead of extending a thread, we can also implement it through an interface called Runnable.
 class A implements Runnable
 {
  public void run()
  {
   statements;
  }
 }

#2
- In the Runnabe method, the start() method is not present so we can not use it by implementing Runnable simply.
- Thread has multiple constructors and one of the constructors takes a runnable object.
- We cannot create an object of a thread by using a class name.
- Objects for a thread will be created by using a Runnable keyword. So, we create a reference of an interface and an object of a class
e.g., Runnable obj= new A();
- We have to pass a reference to an object in the thread class.
- After creating a reference of the Runnable class, we can use the start() method with the thread.

#3
- We can create a thread by using two methods:
 1. Extend a thread class
 2. Implement a Runnable interface
The runnable interface does not have thread methods, in that case, we need to create a separate thread object to use features.

#4 
- We can also instantiate a runnable interface by using an anonymous class.
- Runnable is a functional interface so we also use lambda expression with it.

<br/>

> [top](#java-cheatsheet)

<br/>


# 49. race condition

#1 
Threads and Mutations:
- Threads are useful when you want to execute multiple things at the same time.
- Most of the time, threads are created by the framework itself.
- Threads are used when you want to make things faster.

- Mutations simply mean that you can change something.
- Primitive type variables and primitive type objects are mutations as their value can be changed.
- Strings are immutable as we cannot change their value of it.
- Use of threads and mutations at the same time is not good, as it creates instability in the code.


#2 
Thread Safe:
Thread safe means that only one thread will work at one point.
- When a thread is already working on an object and preventing another thread from working on the same object, this process is called Thread-Safety.
- If we have two threads and each thread is calling increment thousand times, then increment will be called two thousand times.
- For the above case, every time you run the code you will get a different output for this.
- This happens because the main method prints the value of the count at any moment of time, it does not wait for threads to execute completely and come back to the main method.
- If the main method waits for threads to execute and to come back after completion, then it gives nearby correct output.

#3 
join method and synchronized keyword:
- join() is a method that allows the main method to wait for the other threads to come back and join.
- join through an exception so we have to handle it by using throws Interruption.
- If both threads go to the method at the same time then it might be possible that they will be lost some of the values in between.
- The above problem will be resolved by using the synchronized keyword.
- By using the synchronized, java ensures that the method will be called by only one method at a time to handle instability in code.
- So, if a thread is working with the synchronized method, then the other thread has to wait to work with that method until the first thread gets completed.
- Synchronization in java is the capability to control the access of multiple threads to any shared resource. 

#4 
Race condition:
- Synchronization helps to prevent the race condition.
- Race condition is a condition in which the critical section (a part of the program where shared memory is accessed) is concurrently executed by two or more threads. It leads to incorrect behaviour of a program.

#1
- Every time you create a new thread that goes into a new state.
- When you start a thread, it goes into the Runnable state.
When the thread is executing and then it is waiting for the schedular, it is in a runnable state.
- When the thread is actually running on a CPU, it is in a Running state.
The thread executes with the help of the run() method in a running state.
A thread goes in the running state only when it gets informed by the schedular to get executed.
- The thread can be held with the help of the sleep() or wait() method, then will go into the waiting state.
- With the use of notify() method, the thread goes to the Runnable state from the waiting state.
- You can stop the execution of a thread by using a stop() method, and then it will go into the Dead State.
When the work of a thread gets over, then it will go into the dead state automatically.


#2
  start()    notify()
New -----------} Runnable  {------------
    | |         |  
    | |run()        |
    | |         |
    |Runnning ----------}Waiting
    | |  sleep() or wait()
    | |
    | |__stop()____Dead
    |_______________|
      stop()

<br/>

> [top](#java-cheatsheet)

<br/>


#  50 . Collection , List - ArrayList , Set - HashSet

In Java, collection consists of:
1. Collection API  -- concept
2. Collection  -- Interface
3. Collections -- Class

- A framework is a set of classes and interfaces which provide a ready-made architecture.
- Any group of individual objects which are represented as a single unit is known as the collection of the objects.
- Collection is used to store multiple values.
- Array is also used to store multiple values but it is not used in dynamic programming.
- We use data structures to store and fetch the data.
- Collection API is used in the java 1.2 version where you can work with all data structures by using some in-built classes.

#2
- We can use an array, where the length will be fixed. We cannot expand the size of an array.
- Wherever we have a specific requirement for different algorithms and structures, we can use collection API.

#1
The collection interface belongs to java.util.Collection package. All classes and methods of collection interface belong to this java.util package.
- API means a library or some features that we can use directly, we do not need to define an implementation for it.
- Collections List, Queue, Map and Set simply extend the Collection interface and this collection interface must have its own class implementation.
- we can also convert a collection into an array.
- ArrayList is used like:
 Collection nums=new ArrayList(); 
 nums.add(6);
- We can add values in a collection by using the add() method.
-- We do not have indexing for the collection API.
- In the array, we need to specify its type of it. While Collection API works with objects.
- All the data types classes like integer and float extend an object class and thus collection API directly use an object.

#2
- To define the data types in collection API, we use Generics.
- You can define the type of an object to which data type class it belongs in angular brackets like:
 Collection(Integer) nums= new ArrayList Integer ();
- Here, we use Integer as it is a class, while int is a primitive data type.
- If we do not specify the datatype of a collection object, then it will give a run-time error.

#3
- ArrayList is a class that implements a list. The list does not have a method called get because it list works with an index in the values.
-  It uses a dynamic array to store the duplicate element of different data types. 
- The ArrayList class maintains the insertion order and is non-synchronized. 
- The elements stored in the ArrayList class can be randomly accessed. 
- The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. 
- If you want to use and fetch values from an ArrayList, then you can use Collection.
 Collection Integer nums= new ArrayList Integer ();
- If you want to work with an index value, you should use List as it supports index values.
 List Integer  nums= new ArrayList Integer ();

#4 Advantages of Collection Framework:
- Consistent API
- Reduces programming efforts
- Increases program speed and quality

#1
The collection interface is also extended by the set interface.
- List in the collection supports repeated values. The set is an interface in Collection that supports only unique values.
- Package set in the collection is java.util.Set;
- Set extends collection but the class which implements set is different and the class name is HashSet.
- We can define its datatype through generics as well such as greater then bracket  Integer less then bracket

#2
- Set also uses the add() method to insert the values in a set.
- Set does not print the repeated values. It prints the same value only one time.
- Set does not maintain the sequence, it gives values in any random order. The set does not sort the values
- Set also does not support an index for values.

#3
- Instead of using the class HashSet, if we will use the TreeSet, it will give values in sorted order.
 
- All the elements in a TreeSet are sorted as it extends AbstractSet and implements NavigableSet and further NavigableSet extends Sorted Set.


#4
- Collection interface extends an Iterable interface through which we can iterate between the elements by using enhanced for loop, etc.
- Iterable interface contains a method called iterator().
- Iterator returns an iterator object that got all the values from a set. It can be in place of loops.

- It has also a method called next() that gives the values of the next element.
-  It has a method hasNext() that helps the loop to know that the set contains a value of the next element.
 while(values.hasNext())
  System.out.println(values.next());


<br/>

> [top](#java-cheatsheet)

<br/>

# 51. Map - HashMap, HashTable

#1
- Map is not an implementation or it does not extend the collection interface. But it is a part of the collection concept.
 - Map is a collection of key-value pairs. in this, for every value of an element, a key is associated with it.
- Map itself is in an interface that supports key-value pairs. A class that implements it is called HashMap.

#2
- We can add elements in a map using the put() method that accepts both the key and value of it.
- We can get the value of an element by specifying its key of it in the get() method.
- Keys are unique but values can be repeated. The value of a key can also be updated.
- In a map, keys are in a set while values are in a list.
- We can get all the keys by using the method keySet().
- We can get the value of a key by using the method get() and pass a parameter as a key in the method.
- remove() method is used to delete a particular element or an entity from a map.

#3
- We can also use a HashTable instead of using a HashMap.
- The difference between HashMap and HashTable is that HashTable is synchronized while HashMap is normal.
- If you are working with multiple threads at a time, then it is better to use a HashTable to make it synchronized.

<br/>

> [top](#java-cheatsheet)

<br/>

# 52. Comparator & Comparable
#1
- From the Java 1.7 version, it is not compulsory to mention the generic type on the right-hand side if you have already mentioned it on the left-hand side.
 
- A collection class has lots of methods. The collection class belongs to the util package.
- We can sort a list or an ArrayList by using the method sort of collection class
 Collections.sort();
- If we want to apply our own logic in sorting, then we have to use a comparator with sorting in collections.
- Comparator is also an interface.
- We have a method called compare() in the comparator interface.
- We can use an interface by implementing a class or through an anonymous class.
- Compare method works on an algorithm where it compares two values and then swaps them.
 Comparator Integer com= new Comparator Integer()
 {
  public int compare(Integer i, Integer j)
  {
   statements;
  }
 };
- So, a comparator is an interface through which you can specify your own concept of sorting.

#2
- Integer class implements a Comparable interface. So by default, sort works for Integer.
- If you want to do natural sorting on any other non-defined class, you can implement something called the Comparable.
- Comparable is present in the lang package.
- Comparable has a method known as compareTo(). 
- You have to define the method comapreTo() in a class, that is implementing Comparable.
 class Student implements Comparable Student
 {
  public int compareTo( Student that){
   statements;
  }
 }
Here, that is a variable.
- We can also override the logic by using Comparator even if we have implements the Comparable interface.
- Lambda expression can also be used with Comparator as it is a functional interface.

 #3
Difference between Comparable & Comparator:
- Comparable provides a single sorting sequence while the Comparator provides multiple sorting sequences.
- In Comparable, actual gets modified while in Comparator, the original class does not get affected.
- Comparable gives the compareTo() method for sorting while Comparator gives the compare() method to sort elements.

<br/>

> [top](#java-cheatsheet)

<br/>

# 53. stream api , forEach , map , filter , reduce

- What is a stream?
- Methods present inside the stream interface
- Filter, Map and Reduce methods of stream
- Use of methods in Big Data

#1
- Stream is an interface, it contains a stream() method.
- Stream method return an object of type stream.
- Any operation can be performed inside the stream method.
- Any changes done inside the stream can be reflected on the actual list.
- Once we work with a stream, we can't reuse it. We can work with a stream only once.

#2
- Stream provides a lot of methods to work upon.
- filter() method returns a new Stream that contains the value which satisfies the given condition. The filter method is used to select elements as per the Predicate passed as an argument.
- map() takes each value and performs operations on it. It returns a stream consisting of the results of applying the given function to the elements of this stream.
- reduce() method does not return the stream but it gives the value of a type that you defined in the stream. It is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.

#3
- If you want to use Big Data, then first you have to apply a filter on it to separate useful data.
- After applying a filter, you need to transform it into the required data with the help of a map.
- And the graph of it, can be made with the help of the reduce method.
- We can reduce the code by applying methods one after the other.

#1
- forEach method got introduced in Java 1.8 version.
- The forEach() method of ArrayList is used to perform a certain operation for each element in ArrayList.
- forEach traverses each element of the Iterable until all the elements have been processed.
- Collection classes that extend the Iterable interface can use forEach loop to iterate elements.

#2
- forEach method takes an object of the consumer.
- Consumer is an interface that belongs to the java.util.function package.
- Consumer is a functional interface so lambda expression will also be applicable to it.
- Consumer has a method accept(), that takes a value of the same type of which object is created.

- forEach needs an object and we will pass an object of a consumer in it.
- forEach gives a value at a time and that value gets passed to the consumer object and taken by the accept method.
- We can do operations in this accept method.

<br/>

> [top](#java-cheatsheet)

<br/>