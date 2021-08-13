package leetcode_practice.array.twoSum_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/***
 * Accepted solution
 * BruitForce
 * Java 8 Stream
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        IntStream.range(0, nums.length).forEach(idx -> {
            int currentNumber = nums[idx];
            if (idx+1 <= nums.length) {
                IntStream.range((idx + 1), nums.length).forEach(indx -> {
                    if (currentNumber + nums[indx] == target) {
                        indices[0] = idx;
                        indices[1] = indx;
                    }
                });
            }
        });
        return indices;
    }

    public static void main(String[] args) {
        int[] checkArray = {2, 7, 11, 5};
        Arrays.stream(new HashMapSolution().twoSum(checkArray, 12)).forEach(System.out::println);
    }
}

/***
 * Faster solution
 * HashMap
 */
class HashMapSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (indexMap.containsKey(left)) {
                result[0] = i;
                result[1] = indexMap.get(left);
                //!!IMPORTANT give a break after getting the result
                break;
            } else {
                indexMap.put(nums[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] checkArray = {3,3};
        Arrays.stream(new HashMapSolution().twoSum(checkArray, 6)).forEach(System.out::println);
    }
}