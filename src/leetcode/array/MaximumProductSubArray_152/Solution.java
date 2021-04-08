package leetcode.array.MaximumProductSubArray_152;

/**
 * Accepted at first attempt!!
 * 1 ms
 */
public class Solution {

    public int maxProduct(int[] nums) {
        int lastMinusNumber = Integer.MIN_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        int lastProduct = Integer.MIN_VALUE;
        int currentProduct;
        for (int i = 0; i < nums.length; i++) {
            if (lastProduct == Integer.MIN_VALUE) {
                currentProduct = nums[i];
            } else {
                currentProduct = lastProduct * nums[i];
            }
            lastProduct = currentProduct;
            if (currentProduct == 0) {
                lastMinusNumber = Integer.MIN_VALUE;
                lastProduct = Integer.MIN_VALUE;
            }
            else if (currentProduct < 0) {
                if (lastMinusNumber != Integer.MIN_VALUE) {
                    currentProduct = currentProduct * lastMinusNumber;
                } else {
                    lastProduct = Integer.MIN_VALUE;
                    lastMinusNumber = currentProduct;
                }
            }
            if (currentProduct > maxNumber) {
                maxNumber = currentProduct;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("nums1 maxProduct: " + solution.maxProduct(nums1));
        int[] nums2 = {2, 3, -2, 3, -4};
        System.out.println("nums2 maxProduct: " + solution.maxProduct(nums2));
        int[] nums3 = {2, 3, -2, 0, 5, 7};
        System.out.println("nums3 maxProduct: " + solution.maxProduct(nums3));
        int[] nums4 = {2, 3, -2, 0, -5, 7};
        System.out.println("nums4 maxProduct: " + solution.maxProduct(nums4));
        int[] nums5 = {2, 3, -2, 4, 3};
        System.out.println("nums5 maxProduct: " + solution.maxProduct(nums5));
    }
}
