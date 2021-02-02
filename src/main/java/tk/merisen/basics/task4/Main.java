package tk.merisen.basics.task4;

/**
 * Removing from an array
 * <p>
 * An array of integers and one more integer are given.
 * Remove all occurrences of this number from the array (there should be no gaps).
 * <p>
 * Result:
 * [0, 1, 2, 2, 0, 4, 2]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] test_array = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(Arrays.toString(removeElement(test_array, 3)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
