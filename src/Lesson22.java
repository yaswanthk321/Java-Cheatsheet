
/**
 * InnerLesson22
 */
class Student {
    int rollno;
    String name;
    int marks;

}

public class Lesson22 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ij";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "siva";
        s2.marks = 99;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "kavya";
        s3.marks = 93;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // System.out.println(s1); // Student@4617c264
        for (Student value : students) {
            System.out.println(value.name + ": " + value.marks);
        }
    }
}
