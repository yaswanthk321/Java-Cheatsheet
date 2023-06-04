
class A {
    public void name() {
        System.out.println(" name in A");
    }
}

class B extends A {

    @Override // anotation
    public void name() {
        System.out.println(" name in B");
    }

}

@FunctionalInterface
interface C {
    void show(int i);
}

@FunctionalInterface
interface D {
    int add(int i, int j);
}

// class D implements C {
// public void show() {
// System.out.println("show");
// }
// }

public class Lesson42 {

    public static void main(String[] args) {

        // C ref = new C() {
        // public void show() {
        // System.out.println(" in anonymous show");
        // }
        // };

        // lambda expression in java
        // C ref = () -> {
        // System.out.println(" in anonymous show");
        // };

        // lambda expression
        C ref = i -> System.out.println(" in anonymous show");

        // lambda expression with return type
        D ref2 = (i, j) -> i + j;
    }
}
