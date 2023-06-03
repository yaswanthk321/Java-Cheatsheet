
/*
 * this refer the current object
 * 
 * each and every time you create object constructor will be called
 */

class Human {

    private String name;
    private int age;

    // default constructor
    public Human() {
        name = "ij";
        age = 25;
    }

    // parameterized constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class Lesson28 {

    public static void main(String[] args) {

        Human objRef = new Human();

        // objRef.setName("Ij");
        // objRef.setAge(25);

        Human obj1 = new Human("siva", 23);

        System.out.println(objRef.getName() + " : " + objRef.getAge()); // Ij : 25
        System.out.println(obj1.getName() + " : " + obj1.getAge()); // siva : 23
    }
}
