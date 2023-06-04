import java.util.*;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else
            return -1;
    }
}

public class Lesson52 {
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>() {

        // public int compare(Integer i, Integer j) {

        // if (i % 10 > j % 10) {
        // return 1;
        // } else
        // return -1;
        // }

        // };

        // Comparator<Student> com = new Comparator<Student>() {

        // public int compare(Student i, Student j) {

        // if (i.age > j.age) {
        // return 1;
        // } else
        // return -1;
        // }

        // };

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(13);
        // nums.add(21);
        // nums.add(39);
        // nums.add(42);

        // Collections.sort(nums, com);

        // System.out.println(nums);

        List<Student> studs = new ArrayList<Student>();

        studs.add(new Student(25, "ij"));
        studs.add(new Student(23, "siva"));
        studs.add(new Student(20, "kavya"));
        studs.add(new Student(24, "harini"));

        for (Student s : studs) {
            System.out.println(s);
        }

        // Collections.sort(studs, com);

        Collections.sort(studs);
    }
}
