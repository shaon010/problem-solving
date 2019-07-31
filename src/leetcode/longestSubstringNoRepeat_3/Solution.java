package leetcode.longestSubstringNoRepeat_3;

import java.util.ArrayList;
import java.util.List;

/***
 * Accepted solution
 * BruitForce
 * Runtime: 200 ms -_-
 */
class Solution {
    int maxSize = 0;

    public int lengthOfLongestSubstring(String s) {
        int currentSize = 0;
        List<Character> charList = new ArrayList<>();
        for (char c: s.toCharArray()) {
            if (charList.contains(c)) {
                maxSize =  currentSize > maxSize ? currentSize : maxSize;
                lengthOfLongestSubstring(s.substring(s.indexOf(c) + 1));
                break;
            }
            else {
                charList.add(c);
            }
            currentSize = charList.size();
        }
        maxSize =  currentSize > maxSize ? currentSize : maxSize;
        return maxSize;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new Solution().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new Solution().lengthOfLongestSubstring(""));
        System.out.println(new Solution().lengthOfLongestSubstring(" "));
        System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
        System.out.println(new Solution().lengthOfLongestSubstring("babcdb"));
    }
}
