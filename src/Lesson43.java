
/*
 * error
 * 
 * compile time,
 * runtime  - > exceptions
 * logical 
 */

public class Lesson43 {

    public static void main(String[] args) {

        int i = 0; // normal statement
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {

            j = 18 / i; // critical statement
            System.out.println(nums[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {

            System.out.println(" cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(" stay in your limits");

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println(" bye");

    }
}
