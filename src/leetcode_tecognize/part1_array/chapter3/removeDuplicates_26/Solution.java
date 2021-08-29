package leetcode_tecognize.part1_array.chapter3.removeDuplicates_26;

import java.util.Arrays;

/**
 * Runtime: 1 ms faster than 79.40% of Java
 * Memory Usage: 40.2 MB, less than 83.15% of Java
 *
 * It took 50 minutes to solve this easy problem!
 * I crack the solution fasts. In 10 minutes.
 * But there is a bug in the code.
 * I should think in the first debug view instead of
 * debugging many times.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int totalUniquesNumber = 0;
        int currentNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (currentNum == nums[i]) {
                nums[i] = Integer.MIN_VALUE;
            } else {
                currentNum = nums[i];
                nums[totalUniquesNumber] = currentNum;
                if (totalUniquesNumber < i) {
                    nums[i] = Integer.MIN_VALUE;
                }
                totalUniquesNumber++;
            }
        }
        return totalUniquesNumber;
    }

    /**
     * Accepted solution. Not sure why it is 2MS
     */
    public int removeDuplicates2ms(int[] nums) {
        int totalUniquesNumber = 0;
        int currentNum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (currentNum == nums[i]) {
                nums[i] = Integer.MIN_VALUE;
            } else {
                currentNum = nums[i];
                nums[totalUniquesNumber] = currentNum;
                totalUniquesNumber++;
            }
        }
        return totalUniquesNumber;
    }

    /**
     * https://leetcode.com/problems/remove-duplicates-from-sorted-array/discuss/1424519/Simple-Java-Solution
     * Almost same as mine
     */
    public int removeDuplicatesOms(int[] nums) {
        if (nums.length == 0) return 0; // Check for empty array

        int current = 0, next = 0; // Current position, Next position

        while(next < nums.length) {
            if (nums[current] == nums[next]) {
                next++;
            } else {
                // increase current position by 1 and set the current value to the value of next and increase next position
                nums[++current] = nums[next++];
            }
        }
        return current + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("K: " + new Solution().removeDuplicates(nums));
        Arrays.stream(nums).forEach(System.out::print);

        System.out.println();

        int[] nums2 = {1,1,2};
        System.out.println("K: " + new Solution().removeDuplicates(nums2));
        Arrays.stream(nums2).forEach(System.out::print);
    }
}
