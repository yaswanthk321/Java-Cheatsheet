/* Data types is of two types.
first one is primitive data types 

primitive data types is four types
        1. integer -> byte , int, short , long
        2.float -> double, float
        3. character -> char
        4. boolean 

        byte -> 1 byte -> -2^7 to 2^7-1 -> -128 to 127
        short -> 2 bytes
        int -> 4 bytes
        long -> 8 bytes

        float -> 4 bytes
        double -> 8 bytes

        in java by default it is double 
        if you want to use float you have to explicitly declare float like below
        float num = 5.6f;

        char -> 2 bytes
        in java char is UNICODE
        char c = 'k'

        Boolean -> true | false
        boolean b = true;

        */

public class Lesson3 {
    public static void main(String[] args) {
        int num = 3;
        byte by = 127;
        short sh = 558;
        long l = 58541;

        float f = 5.8f;
        double d = 5.8;

        char c = 'k';
        char k = '8';
        boolean b = true;
    }
}
