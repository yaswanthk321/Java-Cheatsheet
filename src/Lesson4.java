/*
 * literals are the values we have assigned to the variables
 * 
 */

public class Lesson4 {
    public static void main(String[] args) {
        int num = 544;
        int num2 = 0b101; // binary
        int num3 = 0x7E; // hexadecimal
        int num4 = 1_00_00_000; // for diffrentiate zeros
        double num5 = 56; // if we assign integer to double
        double num6 = 12e10;
        // boolean b = 1; will give error only true | false
        char c = 'a';
        System.out.println(num); // 544
        System.out.println(num2); // 5
        System.out.println(num3); // 126
        System.out.println(num4); // 10000000
        System.out.println(num5); // 56.0
        System.out.println(num6); // 1.2E11
        c++;
        System.out.println(c); // b
    }
}
