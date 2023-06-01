
/**
 * Method overloading
 */
class InnerLesson18 {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}

public class Lesson18 {
    public static void main(String[] args) {
        InnerLesson18 obj = new InnerLesson18();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1, 2, 3));
    }
}
