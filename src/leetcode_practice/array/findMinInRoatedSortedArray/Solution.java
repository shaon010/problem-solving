package leetcode_practice.array.findMinInRoatedSortedArray;

/**
 *
 */
public class Solution {
    public int findMin(int[] nums) {
        while (true) {
            if (nums.length == 1 ) {
                return nums[0];
            } else if (nums.length == 2) {
                return Math.min(nums[0], nums[1]);
            }
            int middle = nums.length / 2;
            int middleValue = nums[middle];
            int middleNeighborMin = Math.min(nums[middle + 1], nums[middle -1]);
            if (middleValue < middleNeighborMin) {
                return middleValue;
            } else {
                int cornerMin = Math.min(nums[0], nums[nums.length -1]);
                if (middleNeighborMin < cornerMin) {

                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {0, 1, 2, 4, 5, 6, 7};
        System.out.println("nums1 min: " + solution.findMin(nums1));

        int[] nums2 = {7, 0, 1, 2, 4, 5, 6};
        System.out.println("nums2 min: " + solution.findMin(nums2));

        int[] nums3 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("nums3 min: " + solution.findMin(nums3));

        int[] nums4 = {2, 4, 5, 6, 7, 0, 1};
        System.out.println("nums4 min: " + solution.findMin(nums4));

        int[] nums5 = {8, 9, 10, 11, 12, 13, 14, 15, 0, 1, 2, 4, 5, 6, 7};
        System.out.println("nums5 min: " + solution.findMin(nums5));

        int[] nums6 = {12, 13, 14, 15, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("nums6 min: " + solution.findMin(nums6));

        int[] nums7 = {14, 15, 0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println("nums7 min: " + solution.findMin(nums7));

        int[] nums8 = {4, 5, 0, 1, 2};
        System.out.println("nums8 min: " + solution.findMin(nums8));

        //match first and last index, track minimum
        //match before and next if middle index, track minimum with step 1 minimum, take that side
    }
}
