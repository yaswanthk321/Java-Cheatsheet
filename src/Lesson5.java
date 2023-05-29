/*
 * byte b = 127;
 * int a = 12;
 * 
 *     b=a; it wont work we cant assign int to byte , because integer is bigger than byte ,
 *     a = b; it will work , because byte is smaller than integer , so we can assign.
 * 
 * byte b = 127;
 * int a = 2;
 *      what if we want to assign int to byte , we have explicitly convert into byte
 *      b = (byte)a; this explicit conversion is called  casting.
 * 
 * float f = 5.6f;
 * int a = (int)f; here we will lose values after point.
 *      
 */

public class Lesson5 {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;
        System.out.println(a); // 127

        int a1 = 2;
        // byte b2 = a1; // cannot convert from int to byte
        byte b2 = (byte) a1;
        System.out.println(b2); // 2

        int a2 = 257;
        byte b3 = (byte) a2; // here 257 mod 256 will happen
        System.out.println(b3); // 1

        float f = 5.6f;
        int a4 = (int) f;
        System.out.println(a4); // 5 -> value after point will be truncated

        // type promotion
        byte a5 = 10;
        byte b5 = 30;
        int c1 = a5 * b5; // because while multiplying value 300 range will go out of byte
        System.out.println(c1);
    }
}
