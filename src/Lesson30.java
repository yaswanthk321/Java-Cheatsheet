
/*
 * Inheritance
 * single inheritance
 * Multilevel inheritance
 *  multiple inheritance is not supported in java
 */

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// simple inheritance
class Advcalc extends Calc {

    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// multi level inheritance
class VryAdv extends Advcalc {

    // method overriding
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Lesson30 {

    public static void main(String[] args) {

        VryAdv obj = new VryAdv();

        obj.add(1, 2);
        obj.sub(1, 2);
        obj.mul(1, 2);
        obj.div(1, 2);
        obj.power(1, 2);
    }
}
