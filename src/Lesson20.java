/*
 * multi dimentional array
 * 
 * int nums[][] = new int[3][4];
 * [[1,2,3,4],
 *  [1,3,5,6],
 *  [1,3,7,8]]
 */

public class Lesson20 {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums.length; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // enhanced for loop
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
