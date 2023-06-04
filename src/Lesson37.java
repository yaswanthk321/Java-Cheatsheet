/*
 * Abstract class
 */

// abstract class
abstract class Car {
    // abstract method
    public abstract void drive();

    // concrete method
    public void playMusic() {
        System.out.println("Playing music");
    }
}

// concrete class
class BMW extends Car {

    public void drive() {
        System.out.println("Driving");
    }

}

public class Lesson37 {
    public static void main(String[] args) {

        Car ref = new BMW();

        ref.drive(); // Driving

        ref.playMusic(); // Playing music
    }
}
