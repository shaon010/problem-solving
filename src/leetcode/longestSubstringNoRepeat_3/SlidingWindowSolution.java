package leetcode.longestSubstringNoRepeat_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * Accepted solution
 * Sliding Window :: leetcode solution practice
 * Runtime: 11 ms
 * */
class SlidingWindowSolution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; int j = 0;
        int max = 0; int length = s.length();
        Set charSet = new HashSet();
        if (length > 0) {
            while (j < length && i <= j) {
                if (!charSet.contains(s.charAt(j))) {
                    charSet.add(s.charAt(j++));
                    max = Math.max(max, charSet.size());
                } else {
                    charSet.remove(s.charAt(i++));
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        SlidingWindowSolution slidingWindowSolution = new SlidingWindowSolution();
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring("abcabcbb"));//3
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring("bbbbb"));//1
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring("pwwkew"));//3
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring(""));//0
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring(" "));//1
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring("dvdf"));//3
        System.out.println(slidingWindowSolution.lengthOfLongestSubstring("babcdb"));//4
    }
}
