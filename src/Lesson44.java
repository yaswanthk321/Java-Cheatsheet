class IjException extends Exception {

    public IjException(String s) {
        super(s);
    }
}

public class Lesson44 {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {

            j = 18 / i;

            if (j == 0) {
                throw new IjException("i dont want zero");
            }

        } catch (IjException e) {
            j = 18 / 1;
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
}
