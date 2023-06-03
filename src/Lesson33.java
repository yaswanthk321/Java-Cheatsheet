/*
 * final - makes variable constant , method   cannot override, class cannot inherit
 */

final class A {

    public final int a = 1;

    public final void name() {

        // a = 5; // cannot modify final value
        System.out.println("from A");

    }
}

// error cannot extends final class
class B // extends A
{
    // error cannot override final method
    public void name() {
        System.out.println("from B");
    }

}

public class Lesson33 {
    public static void main(String[] args) {

    }
}
