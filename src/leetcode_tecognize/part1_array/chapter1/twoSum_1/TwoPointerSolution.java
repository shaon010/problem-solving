package leetcode_tecognize.part1_array.chapter1.twoSum_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Accepted 5ms
 * Solution with two pointer
 */
class TwoPointerSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        List list = new ArrayList();
        Arrays.stream(nums).forEach(list::add);
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int currentSum = nums[i] + nums[j];
            if (currentSum == target) {
                indices[0] = list.indexOf(nums[i]);
                indices[1] = list.lastIndexOf(nums[j]);
                break;
            } else if (currentSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] checkArray = {2, 7, 11, 5};
        Arrays.stream(new TwoPointerSolution().twoSum(checkArray, 12)).forEach(System.out::println);
    }
}