
/*
 * Wrapper class - auto boxing & auto unboxing
 * 
 */

public class Lesson36 {

    public static void main(String[] args) {

        int a = 7;

        Integer n = a; // autoboxing

        int b = n; // auto unboxing

        System.out.println(b); // 7

        String str = "12";

        int c = Integer.parseInt(str);
        System.out.println(c * 1); // 12
    }
}
