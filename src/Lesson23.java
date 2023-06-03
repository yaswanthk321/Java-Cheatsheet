/*
 * if we create two variable with same value like below
 * 
 * String s1 = "Ij";
 * String s2 = "Ij";
 * it wont create two object but it will create two references of same object.
 * because inside heap area  string constant pool is there for storing string values.
 * 
 * Mutable string - changable
 * Immutable string - unchangable
 * String Builder & String Buffer are Immutable string
 */
public class Lesson23 {
    public static void main(String[] args) {

        // String name = new String("Ij");

        // System.out.println("hello " + name); // hello Ij
        // System.out.println(name.concat(" siva")); // Ij siva

        String name = "Ij";
        name = name + " siva"; // here we changing the obj address not the data
        System.out.println(name); // Ij siva

        String s1 = "Ij";
        String s2 = "Ij";
        System.out.println(s1 == s2); // true
    }
}
