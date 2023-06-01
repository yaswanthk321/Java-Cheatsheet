/*
 * Object oriented programming
 * Object - properties and behaviours
 * class is needed for creating object
 * 
 * jvm create object but we should give blueprint for creating object
 */

class Calc {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Lesson16 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calc cal = new Calc();
        int result = cal.add(num1, num2);
        System.out.println(result); // 9
    }
}
