/*
 * Polymorphism -two types
 * 1. Compile time polymorphism - method overloading
 * 2. Run time polymorphism - method overriding or dynamic method dispatch
 */

class A {
    public void show() {
        System.out.println("in A class");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B class");
    }
}

public class Lesson32 {

    public static void main(String[] args) {

        A obj = new A();
        obj.show(); // in A class

        obj = new B();

        obj.show(); // in B class

    }
}
