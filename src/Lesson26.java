/*
 * static block is called once , whether the object is called many times
 * 
 * if we cannt create object for class , then class will not be loaded .
 * 
 * for loading class without creating object , we can use
 *  Class.forName("Mobile") for loading classs
 */

class Mobile {

    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 10000;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Lesson26 {
    public static void main(String[] args) throws ClassNotFoundException {

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Oneplus";
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Iphone";

        // obj1.show();
        // obj2.show();

        // Oneplus : 10000 : Phone
        // Iphone : 10000 : Phone

        Class.forName("Mobile");
    }
}
