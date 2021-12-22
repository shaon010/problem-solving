package leetcode_practice.array.containsDuplicate_217;

import java.util.HashSet;
import java.util.Set;

/**
 * Accepted
 * 13 ms. Bad solution. Need to improve
 *
 * Learning: converting int[] to set not possible. If convert, it add nums as a single element at 0 position.
 *
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set numSet = new HashSet<>();
        for (Integer num : nums) {
            numSet.add(num);
        }
        return numSet.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(new Solution().containsDuplicate(nums));
        int[] nums2 = {};
        System.out.println(new Solution().containsDuplicate(nums2));
        int[] nums3 = {1,2,3,4};
        System.out.println(new Solution().containsDuplicate(nums3));
    }
}