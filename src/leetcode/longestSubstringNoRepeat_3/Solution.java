package leetcode.longestSubstringNoRepeat_3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;

        return maxSize;
    }

    int findSubStringLength(String s) {
        int maxSize = 0;
        int currentSize = 0;
        List<Character> charList = new ArrayList<>();
        for (char c: s.toCharArray()) {
            if (charList.contains(c)) {
                return currentSize;
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
        System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
    }
}
