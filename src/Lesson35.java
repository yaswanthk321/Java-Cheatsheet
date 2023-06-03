
/*
 * upcasting and downcasting
 */

class A {

    public void name1() {
        System.out.println(" in A");
    }

}

class B extends A {

    public void name() {
        System.out.println(" in B");
    }

}

public class Lesson35 {

    public static void main(String[] args) {

        // upcasting
        A ref = (A) new B(); // if you not declare (A) it will happen implicitely
        ref.name1();

        // downcasting
        B ref2 = (B) ref;
        ref2.name();

    }
}
