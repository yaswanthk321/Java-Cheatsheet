
/*
 * String buffer is thread safe , but string builder in not thread safe
 * 
 * Thread we will discuss later
 */

public class Lesson24 {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity()); // default 16

        StringBuffer sb = new StringBuffer("Ij");
        // System.out.println(sb.capacity()); // 18

        sb.append(" Siva");
        // System.out.println(sb); // Ij Siva

        String str = sb.toString();
        System.out.println(str);// Ij Siva
    }
}
