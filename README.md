# Java Cheatsheet

<br/>

> Table of Contents
1. [Lesson 1  : How Java works?](#1-how-java-works)
2. [Lesson 2  : Variables](#2-variables)
3. [Lesson 3  : Data types](#3-data-types)
4. [Lesson 4  : literals](#4-literals)
5. [Lesson 5  : type conversion and casting]()
6. [Lesson 6  : Assignment operator]()
7. [Lesson 7  : Relational operator]()
8. [Lesson 8  : logical operator]()
9. [Lesson 9  : conditional operator if-else]()
10. [Lesson 10 : conditional operator if-elseif-else]()
11. [Lesson 11 : ternary operator]()
12. [Lesson 12 : Switch case]()
13. [Lesson 13 : while loops]()
14. [Lesson 14 : do while]()
15. [Lesson 15 : for loop]()
16. [Lesson 16 : Classes and object]()
17. [Lesson 17 : Method]()
18. [Lesson 18 : Method overloading]()
19. [Lesson 19 : Array]()
20. [Lesson 20 : Multi dimentional array]()
21. [Lesson 21 : Jagged and 3D Array]()
22. [Lesson 22 : Array of Objects]()
23. [Lesson 23 : Strings]()
24. [Lesson 24 : StringBuffer & StringBuilder]()
25. [Lesson 25 : static variable]()
26. [Lesson 26 : static block]()
27. [Lesson 27 : static method]()
28. [Lesson 28 : Encapsulation , getters & setters , this keyword , Constructor , default & parametrized constructor]()
29. [Lesson 29 : super() , this() and anonymous object]()
30. [Lesson 30 : Inheritance , single inheritance, multilevel inheritance , method overriding]()
31. [Lesson 31 : Packages]() , [access modifier](https://www.geeksforgeeks.org/access-modifiers-java/)
32. [Lesson 32 : Polymorphism & dynamic method dispatch]()
33. [Lesson 33 : final keyword]()
34. [Lesson 34 : Object class - equals(), toString() , hashCode()]()
35. [Lesson 35 : Upcasting & Downcasting]()
36. [Lesson 36 : Wrapper class , autoboxing, unboxing]()
37. [Lesson 37 : abstract class and methods]()
38. [Lesson 38 : Inner class & anonymous inner class]()
39. [Lesson 39 : Anonymous and abstract inner class]()
40. [Lesson 40 : interface]()
41. [Lesson 41 : enum if else and switch]()
42. [Lesson 42 : Anotations , Functional interface and lambda expression with return type]()
43. [Lesson 43 : Exceptions , try catch blocks]()
44. [Lesson 44 : throw ]()
45. [Lesson 45 : throws]()
46. [Lesson 46 : BufferedReader and Scanner , try with resources]()
47. [Lesson 47 : Thread class]()
48. [Lesson 48 : Runnable interface]()
49. [Lesson 49 : race condition]()
50. [Lesson 50 : Collection , List - ArrayList , Set - HashSet]()
51. [Lesson 51 : Map - HashMap, HashTable]()
52. [Lesson 52 : Comparator & Comparable]() 
53. [Lesson 53 : stream api , forEach , map , filter , reduce]()

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

    ```javascript
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

# 2. Variables:-
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

    ```javascript
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