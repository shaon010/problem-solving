package leetcode_practice.array.twoArrayProblem_liveperson;

import java.util.*;

//given two array list. Find out the numbers from first array which are available at most once at 2nd array.
//[1, 2, 3] , [4, 5, 1, 6, 7, 3, 9, 3] => [1, 2]

public class TwoArrayProblem {
    public List<Integer> twoArray(List<Integer> list1, List<Integer> list2) {
        List<Integer> matchedDataList = new ArrayList<>();
        List<Integer> result = new ArrayList<>(list1);
        list2.forEach(number -> {
            if (list1.contains(number)) {
                if (matchedDataList.contains(number)) {
                    result.remove(number);
                }
                matchedDataList.add(number);
            }
        });
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(new Integer[]{1, 2, 3});
        List<Integer> list2 = Arrays.asList(new Integer[]{4, 5, 1, 6, 7, 3, 9, 3});
        System.out.println(new TwoArrayProblem().twoArray(list1, list2));
    }
}
