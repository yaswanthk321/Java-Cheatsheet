
abstract class A {
    public abstract void show();
}

public class Lesson39 {
    public static void main(String[] args) {

        A ref = new A() {

            public void show() {
                System.out.println(" in anonymous inner class");
            }

        };

        ref.show();
    }
}
