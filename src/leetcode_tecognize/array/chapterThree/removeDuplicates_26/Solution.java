package leetcode_tecognize.array.chapterThree.removeDuplicates_26;

import java.util.Arrays;

/**
 * Runtime: 1 ms faster than 79.40% of Java
 * Memory Usage: 40.2 MB, less than 83.15% of Java
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
