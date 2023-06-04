
class A {

    public void show() throws ClassNotFoundException {
        Class.forName("Ij");
    }
}

public class Lesson45 {
    public static void main(String[] args) {

        A ref = new A();

        try {
            ref.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}
