public class Lesson6 {
    public static void main(String[] args) {
        int a = 7;
        // int b = 8;
        // int result = a + b;
        a += 2; // 9
        a -= 2; // 7
        a *= 2; // 14
        a++; // 15 - post increment
        ++a; // 16 - pre ncrement
        a--; // 15

        // int b = ++a; // 16 here increment happen first and then assignment will
        // happen
        int b = a++; // assign the value first and then do increment
        System.out.println(a);
        System.out.println(b);
    }
}
