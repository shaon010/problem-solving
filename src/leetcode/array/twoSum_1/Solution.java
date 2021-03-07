package leetcode.array.twoSum_1;

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
        int[] indices = new int[2];
        Map<Integer, Integer> trackMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (trackMap.containsKey(secondNumber)) {
                indices[0] = trackMap.get(secondNumber);
                indices[1] = i;
                break;
            }
            else {
                trackMap.put(nums[i], i);
            }
        }
        return indices;
    }
}