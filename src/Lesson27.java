/*
 * we cannot use instance variable inside static method
 */
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Lesson27 {
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
        Mobile.show1(obj1); // Oneplus : 50000 : Phone
    }
}
