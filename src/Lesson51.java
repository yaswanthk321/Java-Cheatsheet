import java.util.*;

public class Lesson51 {
    public static void main(String[] args) {
        // HashMap is not syncronized but HashTable is
        Map<String, Integer> students = new HashMap<>();

        students.put("ij", 100);
        students.put("siva", 100);
        students.put("kavya", 66);
        students.put("harini", 77);
        students.put("siva", 97);

        // will give array of keys
        System.out.println(students.keySet());

        for (String val : students.keySet()) {
            System.out.println(students.get(val));
        }
    }
}
