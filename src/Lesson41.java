
enum Laptop {
    Mac(20000), lenovo(30000), asus;

    private int price;

    private Laptop() {
        price = 40000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

enum Status {
    Running, Failed, Pending, Success;
}

public class Lesson41 {
    public static void main(String[] args) {

        Status[] ss = Status.values();

        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
            // Running : 0
            // Failed : 1
            // Pending : 2
            // Success : 3

        }

        Status s = Status.Running;

        if (s == Status.Running) {
            System.out.println("running");
        } else {
            System.out.println(" not running");
        }

        switch (s) {

            case Running:
                System.out.println(" running");
                break;

            default:
                System.out.println(" noy running");
                break;
        }

        for (Laptop lap : Laptop.values()) {

            System.out.println(lap + " : " + lap.getPrice());
        }

        // Mac : 20000
        // lenovo : 30000
        // asus : 40000
    }
}
