/*
 * static variable is common for all the objects
 * we can call the static variables with class name itself
 * static variables are shared by objs
 */

class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Lesson25 {
    public static void main(String[] args) {

        Mobile.name = "Phone";
        Mobile obj1 = new Mobile();

        obj1.brand = "Oneplus";
        obj1.price = 50000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Iphone";
        obj2.price = 100000;

        obj1.show(); // Oneplus : 50000 : Phone
        obj2.show(); // Iphone : 100000 : Phone

    }
}
