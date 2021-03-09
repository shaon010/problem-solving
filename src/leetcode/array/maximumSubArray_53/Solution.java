package leetcode.array.maximumSubArray_53;

/**
 * https://leetcode.com/problems/maximum-subarray/discuss/1098783/C%2B%2B-Java-Python-BEGINNER-FRIENDLY
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            currentSum = currentSum + n;
            if (currentSum < 0) {
                currentSum = 0;
            } else if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("nums1 maxSum: " + solution.maxSubArray(nums1));
    }
}
