import java.util.*;

public class Lesson50 {
    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);

        // not sorted
        // Set<Integer> nums = new HashSet<Integer>();

        // sorted set
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(1);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(4);

        // for (int n : nums) {
        // System.out.println(n);
        // }

        // System.out.println(nums.get(2)); // 3

        Iterator<Integer> val = nums.iterator();

        while (val.hasNext()) {
            System.out.println(val.next());
        }
    }
}
