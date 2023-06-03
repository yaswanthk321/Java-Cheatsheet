/*
 * this() method executes the constructor of same class
 * super() method executes the constructor of super class
 */

class A {

    public A() {
        super();
        System.out.println("in A");
    }

    public A(int a) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("in B");
    }

    public B(int a) {
        // super(a);
        this();
        System.out.println("in B int");
    }

    public void show() {
        System.out.println("in show");
    }
}

public class Lesson29 {

    public static void main(String[] args) {
        // B obj = new B();
        // in A
        // in B

        // B ob = new B(5);
        // super
        // in A int
        // in B int

        // this
        // in A
        // in B
        // in B int

        new B().show(); // anonymous object
        // in A
        // in show
        // in B
    }

}
