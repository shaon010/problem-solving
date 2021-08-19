package leetcode_tecognize.array.chapterTwo.twoSumTwo_167;

import java.util.Arrays;

/***
 * Accepted 0ms
 * Solution with two pointer
 */
class TwoPointerSolution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int currentSum = numbers[i] + numbers[j];
            if (currentSum == target) {
                indices[0] = i + 1;
                indices[1] = j + 1;
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
        int[] checkArray = {2,7,11,15};
        Arrays.stream(new TwoPointerSolution().twoSum(checkArray, 22)).forEach(System.out::println);
    }
}