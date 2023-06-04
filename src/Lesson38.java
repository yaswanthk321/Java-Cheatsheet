
/*
 * inner class
 */

class A {

    public void show() {
        System.out.println("in class A");
    }

    class B {

        public void name() {
            System.out.println(" in class B");
        }
    }

    static class C {
        public void name1() {
            System.out.println(" in class C");
        }
    }
}

public class Lesson38 {
    public static void main(String[] args) {

        A ref = new A() {
            public void show() {
                System.out.println("in Anonymous inner class");
            }
        };

        // for normal inner class
        A.B ref1 = ref.new B();

        // for static inner class
        A.C ref2 = new A.C();

        ref.show();
        ref1.name();
        ref2.name1();
    }
}
