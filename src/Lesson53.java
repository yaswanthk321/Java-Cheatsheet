import java.util.*;
import java.util.stream.Stream;

public class Lesson53 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 3, 5, 6);

        nums.forEach(n -> System.out.println(n));

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);

        // // s3.forEach(n -> System.out.println(n));
        // int result = s3.reduce(0, (c, e) -> c + e);

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
    }
}
