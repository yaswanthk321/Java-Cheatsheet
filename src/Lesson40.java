/*
 * class - class -> extends
 * interface - class -> implements
 * interface - interface -> extends
 */
interface A {

    int age = 25; // default final and static

    void show(); // default public and abstract
}

interface C {
    void run();
}

interface D extends C {

}

class B implements A, D {

    public void show() {
        System.out.println(" in show");
    }

    public void run() {
        System.out.println(" in run");
    }

}

public class Lesson40 {

    public static void main(String[] args) {

        A ref = new B();

        ref.show();
    }

}
