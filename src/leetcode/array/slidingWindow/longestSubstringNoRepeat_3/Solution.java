package leetcode.array.slidingWindow.longestSubstringNoRepeat_3;

import java.util.ArrayList;
import java.util.List;

/***
 * Accepted solution
 * BruitForce
 * Runtime: 199 ms -_-
 */
class Solution {
    int maxSize = 0;
    public int lengthOfLongestSubstring(String s) {
        int currentSize = 0;
        String stringLeft;
        List<Character> charList = new ArrayList<>();
        for (char c: s.toCharArray()) {
            if (charList.contains(c)) {
                maxSize = Math.max(currentSize, maxSize);
                stringLeft = s.substring(s.indexOf(c) + 1);
                if (stringLeft.length() > maxSize) {
                    lengthOfLongestSubstring(stringLeft);
                }
                break;
            }
            else {
                charList.add(c);
            }
            currentSize = charList.size();
        }
        maxSize = Math.max(currentSize, maxSize);
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
