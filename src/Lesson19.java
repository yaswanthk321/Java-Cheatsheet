/*
 * Array
 * int num[] = {5,6,7};
 * int num[] = new int[4];
 */

public class Lesson19 {
    public static void main(String[] args) {
        // int nums[] = { 3, 4, 5, 6 };
        // nums[1] = 7;

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;
        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }
    }

}